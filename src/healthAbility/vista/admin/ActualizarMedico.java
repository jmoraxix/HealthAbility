/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 27, 2014
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
import java.awt.Choice;
import javax.swing.JTextPane;

/**
 * @author Diego Mar 27, 2014
 *
 */
public class ActualizarMedico extends VentanaBase {
	
	private JTextField txtNombrePaciente;
	private JTextField txtPrimerApMedico;
	private JTextField txtSegundoApMedico;
	private JTextField txtCedulaMedico;
	private JTextField txtCorreoMedico;
	private JTextField txtEspecialidad;
	private JTextField txtTelefonoMedico;
	private JTextField txtOtroIdioma;
	private JTextField txtSlogan;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public ActualizarMedico() {
		
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
				Usuarios usuario = new Usuarios();
				usuario.setVisible(true); 
				setVisible(false);
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);
		
		JPanel guardar = new JPanel();
		guardar.setBounds(818, 574, 60, 60);
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
		
		JLabel lblActualizarMedico = new JLabel("Modificar m\u00E9dico");
		lblActualizarMedico.setBounds(75, 174, 256, 44);
		lblActualizarMedico.setFont(letraTitulo);
		getContentPane().add(lblActualizarMedico);
		
		JLabel lblNombre = new JLabel("Nombre*:");
		lblNombre.setBounds(75, 289, 170, 32);
		lblNombre.setFont(letra1);
		getContentPane().add(lblNombre);
		
		txtNombrePaciente = new JTextField();
		txtNombrePaciente.setBounds(268, 286, 245, 32);
		getContentPane().add(txtNombrePaciente);
		txtNombrePaciente.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido*:");
		lblPrimerApellido.setBounds(75, 332, 175, 32);
		lblPrimerApellido.setFont(letra1);
		getContentPane().add(lblPrimerApellido);
		
		txtPrimerApMedico = new JTextField();
		txtPrimerApMedico.setBounds(268, 329, 245, 32);
		getContentPane().add(txtPrimerApMedico);
		txtPrimerApMedico.setColumns(10);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido*:");
		lblSegundoApellido.setBounds(75, 372, 209, 32);
		lblSegundoApellido.setFont(letra1);
		getContentPane().add(lblSegundoApellido);
		
		txtSegundoApMedico = new JTextField();
		txtSegundoApMedico.setBounds(268, 372, 245, 32);
		getContentPane().add(txtSegundoApMedico);
		txtSegundoApMedico.setColumns(10);
		
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
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(268, 501, 245, 32);
		getContentPane().add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
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
		panelFotoMedico.setBounds(768, 218, 110, 146);
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
		lblSlogan.setBounds(551, 370, 72, 37);
		getContentPane().add(lblSlogan);
		
		txtSlogan = new JTextField();
		txtSlogan.setColumns(10);
		txtSlogan.setBounds(633, 376, 245, 32);
		getContentPane().add(txtSlogan);
		
		JLabel lblAfiliaciones = new JLabel("Afiliaciones:");
		lblAfiliaciones.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblAfiliaciones.setBounds(551, 413, 139, 37);
		getContentPane().add(lblAfiliaciones);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 597, 183, 37);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(713, 597, 95, 37);
		getContentPane().add(lblGuardar);
		
		JTextPane txtAfiliaciones = new JTextPane();
		txtAfiliaciones.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtAfiliaciones.setBounds(633, 458, 245, 105);
		getContentPane().add(txtAfiliaciones);
	}

}
