/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
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

	protected static String SESION_USUARIO;

	public Login() 
	{
		getContentPane().setLayout(null);

		JLabel tit2 = new JLabel("Bienvenido");
		tit2.setBounds(221, 231, 208, 52);
		getContentPane().add(tit2);
		tit2.setFont(new Font("Georgia", Font.PLAIN, 40));

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(183, 306, 87, 42);
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
		Node sesion= buscarUsuario(new String(uss.getText()), new String(contra.getPassword()));
		if(sesion != null)
		{
			SESION_USUARIO = uss.getText();
//		MenuPrincipal menu = HealthAbility.getVentanaMenu();
//		menu = new MenuPrincipal();
//		menu.setVisible(true);  
//		HealthAbility.getVentanaLogin().setVisible(false);
		} else
		{  
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private Node buscarUsuario(String usr, String pass){
		Node nodoUsr = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File("../healthAbility/datos/usuario.xml"));
			doc.getDocumentElement().normalize();

			NodeList listaPersonas = doc.getElementsByTagName("usr");
			
			for (int i = 0; i < listaPersonas.getLength(); i ++) {
				Node persona = listaPersonas.item(i);

				if (persona.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) persona;
	
					if(getTagValue("usuario", elemento).equals(usr) || getTagValue("password", elemento).equals(pass)){
						nodoUsr = elemento;
						break;
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error Parse xml: " + e);
		}
		
		return nodoUsr;
	}
	
	 private static String getTagValue(String sTag, Element eElement)
	 {
		  NodeList nlList= eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		  Node nValue = (Node) nlList.item(0);

		  return nValue.getNodeValue();

	 }
} 