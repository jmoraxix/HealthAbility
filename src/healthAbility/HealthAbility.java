/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility;

import healthAbility.vista.Login;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * @author jmora 4/3/14
 *
 */
public class HealthAbility {

	private static final Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();    
	private final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 34);
	private final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 26);
	private final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 20);
	private final static Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);
	private static String SESION_USUARIO;

	public static void main(String[] args) {
		//LookAndFeel de la aplicaci�n
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e){
		}

		Login login = new Login();
		login.setBounds(0, 0, tamPantalla.width-100, tamPantalla.height-100);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setVisible(true);

	}

	public static Dimension getTamPantalla() {
		return tamPantalla;
	}

	public static Font getLetraTitulo1() {
		return letraTitulo1;
	}

	public static Font getLetraTexto1() {
		return letraTexto1;
	}

	public static Font getLetraTexto2() {
		return letraTexto2;
	}

	public static Font getLetraTexto3() {
		return letraTexto3;
	}

	public static String getSESION_USUARIO() {
		return SESION_USUARIO;
	}

	public static void setSESION_USUARIO(String sESION_USUARIO) {
		SESION_USUARIO = sESION_USUARIO;
	}

}
