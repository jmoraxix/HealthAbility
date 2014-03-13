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
		//Declaracion b�sica de la venta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	    setSize(tamTotal.width, tamTotal.height);
	    setTitle("Sistema de admisi�n de estudiantes");
	    setExtendedState(MAXIMIZED_BOTH);
	    Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("imgsLogo.png"));
	    setIconImage(icon);
	    
	    //Menu
        MenuAdministrador barraMenu = new MenuAdministrador();
        setJMenuBar(barraMenu);
        
      //Inicializar ventana
        try {
        	InicializarVentana();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
	}
	
	private void InicializarVentana() throws Exception 
	{
        JPanel principal_1 = new JPanel(); 
        principal_1.setForeground(SystemColor.controlHighlight);
        try {
            URL imagen = HealthAbility.class.getResource("verde2_Principal.jpg");
            BufferedImage img = ImageIO.read(imagen);
            BgBorder borde = new BgBorder( img );
            principal_1.setBorder(borde);
        } catch (Exception e) {
        }
        this.setContentPane(principal_1);
        principal_1.setLayout(null);
        
        JLabel titulo = new JLabel("Sistema de admisi�n de estudiantes");
        titulo.setForeground(SystemColor.menu);
        titulo.setFont(new Font("Georgia", titulo.getFont().getStyle() | Font.BOLD, titulo.getFont().getSize() + 34));
        getContentPane().add(titulo);
        titulo.setBounds(48, 22, 867, 72);
    }
}
