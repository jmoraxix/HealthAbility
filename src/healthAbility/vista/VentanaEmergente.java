/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

/**
 * @author jmora 12/3/141
 *
 */
import healthAbility.HealthAbility;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaEmergente extends JFrame 
{
	Dimension tamTotal = HealthAbility.getTamPantalla();
	private JPanel panel;

	public VentanaEmergente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((tamTotal.width/2)-250, (tamTotal.height/2)-175, 500, 350);
		panel = new JPanel();
		setContentPane(panel);

		//Inicializar ventana
		panel.setForeground(SystemColor.controlHighlight);
		try {
			URL imagen = HealthAbility.class.getResource("vista/imagenes/fondo_emergente.png");
			BufferedImage  img = ImageIO.read(imagen);
			BgBorder borde = new BgBorder( img );
			panel.setBorder(borde);
		} catch (Exception e) {
		}
		panel.setLayout(null);
	}
}
