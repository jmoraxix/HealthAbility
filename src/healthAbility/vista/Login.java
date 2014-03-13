/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;
import healthAbility.vista.base.VentanaBase;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author jmora 13/03/2014
 */
@SuppressWarnings("serial")
public class Login extends VentanaBase 
{
    public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 34);
    public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);

	public static final Dimension tamTotal = Toolkit.getDefaultToolkit().getScreenSize();
	private JTextField uss;
	private JPasswordField contra;
	
	protected static String SESION_USUARIO;
	
	public Login() 
	{	
		JPanel panel = new JPanel();
		try {
    		panel.setForeground(Color.WHITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
		panel.setBounds(668, 235, 541, 386);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel tit2 = new JLabel("Bienvenido");
		tit2.setBounds(148, 35, 180, 42);
		panel.add(tit2);
		tit2.setFont(letraTexto1);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(81, 131, 87, 42);
		panel.add(lblUsuario);
		lblUsuario.setFont(letraTexto2);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setBounds(45, 195, 123, 52);
		panel.add(lblContrasena);
		lblContrasena.setFont(letraTexto2);
		
		uss = new JTextField();
		uss.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					VerifSesion();
		          }
			}
		});
		uss.setBounds(186, 133, 215, 45);
		panel.add(uss);
		uss.setToolTipText("Digite un usuario");
		uss.setFont(letraTexto2);
		uss.setColumns(10);
		
		contra = new JPasswordField();
		contra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					VerifSesion();
		          }
			}
		});
		contra.setBounds(186, 203, 215, 45);
		panel.add(contra);
		contra.setToolTipText("Digite una contrase\u00F1a");
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(386, 259, 134, 34);
		panel.add(btnEntrar);
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
//		boolean sesion = false;
//		sesion= ConexDB.VerifUsuario(new String(uss.getText()), new String(contra.getPassword()));
//		if(sesion== true)
//		{
//			SESION_USUARIO = uss.getText();
			MenuPrincipal menu = HealthAbility.getVentanaMenu();
  			menu = new MenuPrincipal();
  			menu.setVisible(true);  
  			HealthAbility.getVentanaLogin().setVisible(false);
//		} else
//		{  
//			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
//		}
	}
} 