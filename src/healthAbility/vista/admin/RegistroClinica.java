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
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

/**
 * @author Diego Mar 31, 2014
 *
 */
public class RegistroClinica extends VentanaBase {
	private JTextField txtNombreClinica;
	private JTextField txtDistrito;
	private JTextField txtCanton;
	private JTextField txtTelefonoClinica;
	private JTextField txtTelefonoMedico;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public RegistroClinica() {
		
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
		
		JLabel lblAgregarClinica = new JLabel("Agregar Cl\u00EDnica");
		lblAgregarClinica.setBounds(75, 173, 343, 44);
		lblAgregarClinica.setFont(letraTitulo);
		getContentPane().add(lblAgregarClinica);
		
		JLabel lblNombreClinica = new JLabel("Nombre*:");
		lblNombreClinica.setBounds(75, 228, 170, 32);
		lblNombreClinica.setFont(letra1);
		getContentPane().add(lblNombreClinica);
		
		txtNombreClinica = new JTextField();
		txtNombreClinica.setBounds(268, 228, 245, 32);
		getContentPane().add(txtNombreClinica);
		txtNombreClinica.setColumns(10);
		
		JLabel lblDireccionClinica = new JLabel("Direcci\u00F3n:");
		lblDireccionClinica.setBounds(268, 286, 175, 32);
		lblDireccionClinica.setFont(letra1);
		getContentPane().add(lblDireccionClinica);
		
		JLabel lblDistrito = new JLabel("Distrito*:");
		lblDistrito.setBounds(75, 400, 209, 32);
		lblDistrito.setFont(letra1);
		getContentPane().add(lblDistrito);
		
		txtDistrito = new JTextField();
		txtDistrito.setBounds(268, 404, 245, 32);
		getContentPane().add(txtDistrito);
		txtDistrito.setColumns(10);
		
		JLabel lblCanton = new JLabel("Cant\u00F3n*:");
		lblCanton.setBounds(75, 443, 175, 32);
		lblCanton.setFont(letra1);
		getContentPane().add(lblCanton);
		
		txtCanton = new JTextField();
		txtCanton.setBounds(268, 447, 245, 32);
		getContentPane().add(txtCanton);
		txtCanton.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono*:");
		lblTelefono.setBounds(75, 537, 183, 37);
		lblTelefono.setFont(letra1);
		getContentPane().add(lblTelefono);
		
		txtTelefonoClinica = new JTextField();
		txtTelefonoClinica.setBounds(268, 543, 245, 32);
		getContentPane().add(txtTelefonoClinica);
		txtTelefonoClinica.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia*:");
		lblProvincia.setBounds(75, 486, 183, 40);
		lblProvincia.setFont(letra1);
		getContentPane().add(lblProvincia);
		
		txtTelefonoMedico = new JTextField();
		txtTelefonoMedico.setBounds(268, 494, 245, 32);
		getContentPane().add(txtTelefonoMedico);
		txtTelefonoMedico.setColumns(10);
		
		JLabel lblFotoClinica = new JLabel("Foto:");
		lblFotoClinica.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFotoClinica.setBounds(557, 323, 183, 37);
		getContentPane().add(lblFotoClinica);
		
		JButton btnAgregarFotoClinica = new JButton("Examinar...");
		btnAgregarFotoClinica.setBounds(736, 329, 122, 32);
		getContentPane().add(btnAgregarFotoClinica);
		
		JPanel panelFotoMedico = new JPanel();
		panelFotoMedico.setBounds(577, 372, 281, 138);
		getContentPane().add(panelFotoMedico);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 597, 183, 37);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(713, 608, 95, 37);
		getContentPane().add(lblGuardar);
		
		JLabel lblDireccionGeneral = new JLabel("Direcci\u00F3n General*:");
		lblDireccionGeneral.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblDireccionGeneral.setBounds(75, 329, 209, 32);
		getContentPane().add(lblDireccionGeneral);
		
		JTextPane txtPaneDireccionGeneral = new JTextPane();
		txtPaneDireccionGeneral.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtPaneDireccionGeneral.setBounds(268, 329, 245, 60);
		getContentPane().add(txtPaneDireccionGeneral);
	}
}