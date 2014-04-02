/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.medico;

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
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

/**
 * @author JoséDavid 26/03/2014
 */
public class AgregarMedico extends VentanaBase {
	private JTextField txtNomMedico;
	private JTextField txtPrimerApMedico;
	private JTextField txtSegApMedico;
	private JTextField txtCedulaMedico;
	private JTextField txtCorreoMedico;
	private JTextField txtEspecialidadMedico;
	private JTextField txtTelefonoMedico;
	private JTextField txtOtroIdioma;
	private JTextField txtSlogan;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public AgregarMedico() {
		
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
		
		JLabel lblAgregarMedico = new JLabel("Agregar m\u00E9dico");
		lblAgregarMedico.setBounds(75, 173, 343, 44);
		lblAgregarMedico.setFont(letraTitulo);
		getContentPane().add(lblAgregarMedico);
		
		JLabel lblNombreMedico = new JLabel("Nombre*:");
		lblNombreMedico.setBounds(75, 289, 170, 32);
		lblNombreMedico.setFont(letra1);
		getContentPane().add(lblNombreMedico);
		
		txtNomMedico = new JTextField();
		txtNomMedico.setBounds(268, 286, 245, 32);
		getContentPane().add(txtNomMedico);
		txtNomMedico.setColumns(10);
		
		JLabel lblPrimerApellidoMedico = new JLabel("Primer apellido*:");
		lblPrimerApellidoMedico.setBounds(75, 332, 175, 32);
		lblPrimerApellidoMedico.setFont(letra1);
		getContentPane().add(lblPrimerApellidoMedico);
		
		txtPrimerApMedico = new JTextField();
		txtPrimerApMedico.setBounds(268, 329, 245, 32);
		getContentPane().add(txtPrimerApMedico);
		txtPrimerApMedico.setColumns(10);
		
		JLabel lblSegundoApellidoMedico = new JLabel("Segundo apellido*:");
		lblSegundoApellidoMedico.setBounds(75, 372, 209, 32);
		lblSegundoApellidoMedico.setFont(letra1);
		getContentPane().add(lblSegundoApellidoMedico);
		
		txtSegApMedico = new JTextField();
		txtSegApMedico.setBounds(268, 372, 245, 32);
		getContentPane().add(txtSegApMedico);
		txtSegApMedico.setColumns(10);
		
		JLabel lblCedula = new JLabel("C\u00E9dula*:");
		lblCedula.setBounds(75, 243, 183, 32);
		lblCedula.setFont(letra1);
		getContentPane().add(lblCedula);
		
		txtCedulaMedico = new JTextField();
		txtCedulaMedico.setBounds(268, 243, 245, 32);
		getContentPane().add(txtCedulaMedico);
		txtCedulaMedico.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(75, 415, 175, 32);
		lblCorreo.setFont(letra1);
		getContentPane().add(lblCorreo);
		
		txtCorreoMedico = new JTextField();
		txtCorreoMedico.setBounds(268, 415, 245, 32);
		getContentPane().add(txtCorreoMedico);
		txtCorreoMedico.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(75, 496, 183, 37);
		lblEspecialidad.setFont(letra1);
		getContentPane().add(lblEspecialidad);
		
		txtEspecialidadMedico = new JTextField();
		txtEspecialidadMedico.setBounds(268, 501, 245, 32);
		getContentPane().add(txtEspecialidadMedico);
		txtEspecialidadMedico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(75, 450, 183, 40);
		lblTelefono.setFont(letra1);
		getContentPane().add(lblTelefono);
		
		txtTelefonoMedico = new JTextField();
		txtTelefonoMedico.setBounds(268, 458, 245, 32);
		getContentPane().add(txtTelefonoMedico);
		txtTelefonoMedico.setColumns(10);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFoto.setBounds(551, 241, 183, 37);
		getContentPane().add(lblFoto);
		
		JButton btnAgregarFotoMedico = new JButton("Examinar...");
		btnAgregarFotoMedico.setBounds(551, 286, 122, 32);
		getContentPane().add(btnAgregarFotoMedico);
		
		JPanel panelFotoMedico = new JPanel();
		panelFotoMedico.setBounds(745, 218, 133, 161);
		getContentPane().add(panelFotoMedico);
		
		JLabel lblIdiomas = new JLabel("Idiomas:");
		lblIdiomas.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblIdiomas.setBounds(75, 549, 183, 37);
		getContentPane().add(lblIdiomas);
		
		JCheckBox ckBoxEspanol = new JCheckBox("Espa\u00F1ol");
		ckBoxEspanol.setBounds(268, 555, 63, 32);
		getContentPane().add(ckBoxEspanol);
		
		JCheckBox ckBoxIngles = new JCheckBox("Ingl\u00E9s");
		ckBoxIngles.setBounds(333, 555, 55, 32);
		getContentPane().add(ckBoxIngles);
		
		JLabel lblOtroIdioma = new JLabel("Otro:");
		lblOtroIdioma.setBounds(394, 564, 46, 14);
		getContentPane().add(lblOtroIdioma);
		
		txtOtroIdioma = new JTextField();
		txtOtroIdioma.setColumns(10);
		txtOtroIdioma.setBounds(418, 559, 95, 25);
		getContentPane().add(txtOtroIdioma);
		
		JLabel lblSlogan = new JLabel("Slogan:");
		lblSlogan.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblSlogan.setBounds(551, 413, 72, 37);
		getContentPane().add(lblSlogan);
		
		txtSlogan = new JTextField();
		txtSlogan.setColumns(10);
		txtSlogan.setBounds(633, 419, 245, 32);
		getContentPane().add(txtSlogan);
		
		JLabel lblAfiliaciones = new JLabel("Afiliaciones:");
		lblAfiliaciones.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblAfiliaciones.setBounds(551, 452, 139, 37);
		getContentPane().add(lblAfiliaciones);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 597, 183, 37);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(713, 608, 95, 37);
		getContentPane().add(lblGuardar);
		
		JTextPane txtAfiliaciones = new JTextPane();
		txtAfiliaciones.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtAfiliaciones.setBounds(633, 492, 245, 94);
		getContentPane().add(txtAfiliaciones);
	}
}
