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
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author jmora 12/3/14
 *
 */
@SuppressWarnings("serial")
public class VentanaBase extends JFrame {

	Dimension tamTotal = HealthAbility.getTamPantalla();

	public VentanaBase(){
		//Declaracion basica de la venta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(tamTotal.width-200, tamTotal.height-200);
		setTitle("Health Ability");
		setExtendedState(MAXIMIZED_BOTH);
//		Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("vista/imagenes/logo_principal_icono.png"));
//		setIconImage(icon);

		//Inicializar ventana
		try {
			InicializarVentana();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}

	private void InicializarVentana() throws Exception 
	{
		JPanel principal = new JPanel(); 
		principal.setForeground(SystemColor.controlHighlight);
		
		URL imagen = HealthAbility.class.getResource("vista/imagenes/fondo_principal_3.jpg");
		BufferedImage img = ImageIO.read(imagen);
		BgBorder borde = new BgBorder( img );
		principal.setBorder(borde);
		
		this.setContentPane(principal);
		principal.setLayout(null);
	}
}
