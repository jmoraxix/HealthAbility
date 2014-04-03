/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.text.ParseException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

/**
 * @author JoséDavid 26/03/2014
 */
@SuppressWarnings("serial")
public class AgregarMedico extends VentanaBase {
	private JTextField txtNomMedico;
	private JTextField txtPrimerApMedico;
	private JTextField txtSegApMedico;
	private JFormattedTextField txtCedulaMedico;
	private JTextField txtCorreoMedico;
	private JTextField txtEspecialidadMedico;
	private JFormattedTextField txtTelefonoMedico;
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
				String ced = txtCedulaMedico.getText();
				
				if (!txtNomMedico.getText().equals("") &&
					!ced.equals("") &&
					!txtPrimerApMedico.getText().equals("")&&
					!txtSegApMedico.getText().equals("")) 
				{
					Usuarios usuarios = new Usuarios();
					usuarios.setVisible(true); 
					setVisible(false);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Hay un campo requerido vacio!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
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
		soloLetras(txtNomMedico);
		txtNomMedico.setBounds(268, 286, 245, 32);
		getContentPane().add(txtNomMedico);
		txtNomMedico.setColumns(10);
		
		JLabel lblPrimerApellidoMedico = new JLabel("Primer apellido*:");
		lblPrimerApellidoMedico.setBounds(75, 332, 175, 32);
		lblPrimerApellidoMedico.setFont(letra1);
		getContentPane().add(lblPrimerApellidoMedico);
		
		txtPrimerApMedico = new JTextField();
		soloLetras(txtPrimerApMedico);
		txtPrimerApMedico.setBounds(268, 329, 245, 32);
		getContentPane().add(txtPrimerApMedico);
		txtPrimerApMedico.setColumns(10);
		
		JLabel lblSegundoApellidoMedico = new JLabel("Segundo apellido*:");
		lblSegundoApellidoMedico.setBounds(75, 372, 209, 32);
		lblSegundoApellidoMedico.setFont(letra1);
		getContentPane().add(lblSegundoApellidoMedico);
		
		txtSegApMedico = new JTextField();
		soloLetras(txtSegApMedico);
		txtSegApMedico.setBounds(268, 372, 245, 32);
		getContentPane().add(txtSegApMedico);
		txtSegApMedico.setColumns(10);
		
		JLabel lblCedula = new JLabel("C\u00E9dula*:");
		lblCedula.setBounds(75, 243, 183, 32);
		lblCedula.setFont(letra1);
		getContentPane().add(lblCedula);
		
		MaskFormatter mascaraCedula = null;
		try {
			mascaraCedula = new MaskFormatter("#-####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCedulaMedico = new JFormattedTextField(mascaraCedula);
		soloNumeros(txtCedulaMedico);
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
		soloLetras(txtEspecialidadMedico);
		txtEspecialidadMedico.setBounds(268, 501, 245, 32);
		getContentPane().add(txtEspecialidadMedico);
		txtEspecialidadMedico.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(75, 450, 183, 40);
		lblTelefono.setFont(letra1);
		getContentPane().add(lblTelefono);
		
		MaskFormatter mascaraTelefono = null;
		try {
			mascaraTelefono = new MaskFormatter("####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtTelefonoMedico = new JFormattedTextField(mascaraTelefono);
		soloNumeros(txtCedulaMedico);
		txtTelefonoMedico.setBounds(268, 458, 245, 32);
		getContentPane().add(txtTelefonoMedico);
		txtTelefonoMedico.setColumns(10);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFoto.setBounds(551, 241, 183, 37);
		getContentPane().add(lblFoto);
		
		JButton btnAgregarFotoMedico = new JButton("Examinar...");
		btnAgregarFotoMedico.setBounds(623, 247, 122, 32);
		getContentPane().add(btnAgregarFotoMedico);
		
		JLabel lblIdiomas = new JLabel("Idiomas:");
		lblIdiomas.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblIdiomas.setBounds(75, 549, 183, 37);
		getContentPane().add(lblIdiomas);
		
		JCheckBox ckBoxEspanol = new JCheckBox("Espa\u00F1ol");
		ckBoxEspanol.setBounds(268, 555, 74, 32);
		getContentPane().add(ckBoxEspanol);
		
		JCheckBox ckBoxIngles = new JCheckBox("Ingl\u00E9s");
		ckBoxIngles.setBounds(344, 555, 60, 32);
		getContentPane().add(ckBoxIngles);
		
		JLabel lblOtroIdioma = new JLabel("Otro:");
		lblOtroIdioma.setBounds(405, 564, 31, 14);
		getContentPane().add(lblOtroIdioma);
		
		txtOtroIdioma = new JTextField();
		soloLetras(txtOtroIdioma);
		txtOtroIdioma.setColumns(10);
		txtOtroIdioma.setBounds(435, 559, 78, 25);
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
		
		JLabel lblContinuar = new JLabel("Continuar");
		lblContinuar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblContinuar.setBounds(705, 597, 106, 37);
		getContentPane().add(lblContinuar);
		
		JTextPane txtAfiliaciones = new JTextPane();
		txtAfiliaciones.setBorder(new LineBorder(Color.LIGHT_GRAY));
		txtAfiliaciones.setBounds(633, 492, 245, 94);
		getContentPane().add(txtAfiliaciones);
		
		JLabel lblNewLabel = new JLabel("*Campos obligatorios");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(75, 218, 122, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ver foto");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(622, 293, 122, 28);
		getContentPane().add(btnNewButton);
	}
	
	public void soloLetras(JTextField txt){
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (Character.isDigit(c)) {
					e.consume();		
				}
			}
		});
	}
	
	public void soloNumeros(JTextField txt){
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();		
				}
			}
		});
	}
	
}
