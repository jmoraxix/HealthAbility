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

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaEmergente extends JDialog 
{
	Dimension tamTotal = HealthAbility.getTamPantalla();
	private JPanel panel;

	public VentanaEmergente(Frame frame, String title, boolean modal) {
		super(frame, title, modal);
	    setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setLocationRelativeTo(frame);

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
