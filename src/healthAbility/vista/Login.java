/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;
import healthAbility.datos.ManageXml;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author jmora 13/03/2014
 */
@SuppressWarnings("serial")
public class Login extends VentanaBase 
{
	public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 34);
	public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);

	Dimension tamTotal = HealthAbility.getTamPantalla();
	private JTextField uss;
	private JPasswordField contra;

	public Login() 
	{
		getContentPane().setLayout(null);

		JLabel tit2 = new JLabel("Bienvenido");
		tit2.setBounds(221, 231, 208, 52);
		getContentPane().add(tit2);
		tit2.setFont(new Font("Georgia", Font.PLAIN, 40));

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(147, 306, 87, 42);
		getContentPane().add(lblUsuario);
		lblUsuario.setFont(letraTexto2);

		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setBounds(147, 362, 123, 52);
		getContentPane().add(lblContrasena);
		lblContrasena.setFont(letraTexto2);

		uss = new JTextField();
		uss.setBounds(292, 305, 215, 45);
		getContentPane().add(uss);
		uss.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					VerifSesion();
				}
			}
		});
		uss.setToolTipText("Digite un usuario");
		uss.setFont(letraTexto2);
		uss.setColumns(10);

		contra = new JPasswordField();
		contra.setBounds(292, 370, 215, 45);
		getContentPane().add(contra);
		contra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					VerifSesion();
				}
			}
		});
		contra.setToolTipText("Digite una contrase\u00F1a");

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Georgia", Font.PLAIN, 18));
		btnEntrar.setBounds(422, 438, 176, 47);
		getContentPane().add(btnEntrar);
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VerifSesion();
			}
		});
		btnEntrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					VerifSesion();
				}
			}
		});
		btnEntrar.setToolTipText("Presione para iniciar sesi\u00F3n");
	}

	private void VerifSesion()
	{
		Element sesion = buscarUsuario(new String(uss.getText()), new String(contra.getPassword()));
		if(sesion != null)
		{
			HealthAbility.setSESION_USUARIO(uss.getText());
			String tipoUsr = sesion.getElementsByTagName("tipo").item(0).getTextContent();
			if(tipoUsr.equals("admin")){
				healthAbility.vista.admin.MenuPrincipal menu = new healthAbility.vista.admin.MenuPrincipal();
				menu.setVisible(true);  
			} else if(tipoUsr.equals("medico")){
				healthAbility.vista.medico.MenuPrincipal menu = new healthAbility.vista.medico.MenuPrincipal();
				menu.setVisible(true);  
			} else if(tipoUsr.equals("paciente")){
				healthAbility.vista.paciente.MenuPrincipal menu = new healthAbility.vista.paciente.MenuPrincipal();
				menu.setVisible(true);  
			}
			setVisible(false);
		} else
		{  
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private Element buscarUsuario(String usr, String pass){
		Element nodoUsr = null;
		NodeList listaPersonas = ManageXml.Buscar("usuarios", "usuario");

		for (int i = 0; i < listaPersonas.getLength(); i ++) {
			Node persona = listaPersonas.item(i);

			if (persona.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) persona;

				if(elemento.getAttribute("usuario").equals(usr) && elemento.getElementsByTagName("password").item(0).getTextContent().equals(pass)){
					nodoUsr = elemento;
					break;
				}
			}
		}

		return nodoUsr;
	}
} 