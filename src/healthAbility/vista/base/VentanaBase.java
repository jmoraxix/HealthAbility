/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.base;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	    setSize(tamTotal.width, tamTotal.height);
	    setTitle("Health Ability");
	    setExtendedState(MAXIMIZED_BOTH);
	    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../vista/imagenes/logo_principal_icono.png"));
	    setIconImage(icon);
	    
//	    //Menu
//        MenuAdministrador barraMenu = new MenuAdministrador();
//        setJMenuBar(barraMenu);
        
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
        try {
            URL imagen = HealthAbility.class.getResource("vista/imagenes/verde2_Principal.jpg");
            BufferedImage img = ImageIO.read(imagen);
            BgBorder borde = new BgBorder( img );
            principal.setBorder(borde);
        } catch (Exception e) {
        }
        this.setContentPane(principal);
        principal.setLayout(null);
        
        JLabel titulo = new JLabel("Health Ability");
        titulo.setForeground(SystemColor.menu);
        titulo.setFont(new Font("Georgia", titulo.getFont().getStyle() | Font.BOLD, titulo.getFont().getSize() + 34));
        getContentPane().add(titulo);
        titulo.setBounds(48, 22, 867, 72);
    }
}
