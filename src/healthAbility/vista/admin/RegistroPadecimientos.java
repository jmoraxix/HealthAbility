/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 31, 2014
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.Login;
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

/**
 * @author Diego Mar 31, 2014
 *
 */
@SuppressWarnings("serial")
public class RegistroPadecimientos extends VentanaBase{
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public RegistroPadecimientos() {
		
		this.setJMenuBar(new BarraMenu(this));
		//Salir
		JPanel regresar = new JPanel();
		regresar.setBounds(75, 585, 60, 60);
		regresar.setOpaque(false);
		try {
			regresar.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/regresar.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				regresar.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(regresar);
		regresar.setLayout(new BorderLayout(0, 0));
		getContentPane().add(regresar);

		JButton btnRegres = new JButton("");
		btnRegres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true); 
				setVisible(false);
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);
		
		JPanel guardar = new JPanel();
		guardar.setBounds(818, 585, 60, 60);
		guardar.setOpaque(false);
		try {
			guardar.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/check.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				guardar.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(guardar);
		guardar.setLayout(new BorderLayout(0, 0));
		getContentPane().add(guardar);

		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = new Login();
				login.setVisible(true); 
				setVisible(false);
			}
		});
		btnGuardar.setOpaque(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		guardar.add(btnGuardar);
		
		JLabel lblRegistroPadecimientos = new JLabel("Registro de Padecimientos");
		lblRegistroPadecimientos.setBounds(75, 173, 343, 44);
		lblRegistroPadecimientos.setFont(letraTitulo);
		getContentPane().add(lblRegistroPadecimientos);
		
		JLabel lblNombreClinica = new JLabel("Tipo de Padecimiento:");
		lblNombreClinica.setBounds(75, 228, 238, 32);
		lblNombreClinica.setFont(letra1);
		getContentPane().add(lblNombreClinica);
		
		JLabel lblDescripcionPadecimiento = new JLabel("Descripci\u00F3n:");
		lblDescripcionPadecimiento.setBounds(75, 400, 209, 32);
		lblDescripcionPadecimiento.setFont(letra1);
		getContentPane().add(lblDescripcionPadecimiento);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 597, 183, 37);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(713, 608, 95, 37);
		getContentPane().add(lblGuardar);
		
		JLabel lblNombrePadecimiento = new JLabel("Nombre de Padecimiento:");
		lblNombrePadecimiento.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblNombrePadecimiento.setBounds(75, 329, 265, 32);
		getContentPane().add(lblNombrePadecimiento);
		
		JTextPane txtPaneDescripcionPadecimiento = new JTextPane();
		txtPaneDescripcionPadecimiento.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtPaneDescripcionPadecimiento.setBounds(300, 413, 328, 160);
		getContentPane().add(txtPaneDescripcionPadecimiento);
		
		JComboBox comboTipoPadecimiento = new JComboBox();
		comboTipoPadecimiento.setBounds(383, 228, 245, 32);
		getContentPane().add(comboTipoPadecimiento);
		
		JComboBox comboNombrePadecimiento = new JComboBox();
		comboNombrePadecimiento.setBounds(383, 329, 245, 32);
		getContentPane().add(comboNombrePadecimiento);
	}
}
