/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.admin;

import healthAbility.vista.VentanaBase;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

/**
 * @author JoséDavid 26/03/2014
 */
public class AgregarMedico extends VentanaBase {
	private JTextField txtNom;
	private JTextField txtPrimAp;
	private JTextField txtSecAp;
	private JTextField txtCedula;
	private JTextField txtCorreo;
	private JTextField txtEspecialidad;
	private JTextField txtTelefono;
	private JTextField txtOtroIdioma;
	private JTextField txtSlogan;
	private JTextField txtAfiliaciones;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public AgregarMedico() {
		
		JLabel lblAgregarMdico = new JLabel("Agregar m\u00E9dico");
		lblAgregarMdico.setBounds(196, 173, 343, 44);
		lblAgregarMdico.setFont(letraTitulo);
		getContentPane().add(lblAgregarMdico);
		
		JLabel lblNombre = new JLabel("Nombre*:");
		lblNombre.setBounds(75, 289, 170, 32);
		lblNombre.setFont(letra1);
		getContentPane().add(lblNombre);
		
		txtNom = new JTextField();
		txtNom.setBounds(268, 286, 245, 32);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido*:");
		lblPrimerApellido.setBounds(75, 332, 175, 32);
		lblPrimerApellido.setFont(letra1);
		getContentPane().add(lblPrimerApellido);
		
		txtPrimAp = new JTextField();
		txtPrimAp.setBounds(268, 329, 245, 32);
		getContentPane().add(txtPrimAp);
		txtPrimAp.setColumns(10);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido*:");
		lblSegundoApellido.setBounds(75, 372, 209, 32);
		lblSegundoApellido.setFont(letra1);
		getContentPane().add(lblSegundoApellido);
		
		txtSecAp = new JTextField();
		txtSecAp.setBounds(268, 372, 245, 32);
		getContentPane().add(txtSecAp);
		txtSecAp.setColumns(10);
		
		JLabel lblCedula = new JLabel("C\u00E9dula*:");
		lblCedula.setBounds(75, 243, 183, 32);
		lblCedula.setFont(letra1);
		getContentPane().add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(268, 243, 245, 32);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(75, 415, 175, 32);
		lblCorreo.setFont(letra1);
		getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(268, 415, 245, 32);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
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
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(268, 458, 245, 32);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFoto.setBounds(75, 544, 183, 37);
		getContentPane().add(lblFoto);
		
		JButton btnAgregarFotoMedico = new JButton("Examinar...");
		btnAgregarFotoMedico.setBounds(268, 544, 122, 32);
		getContentPane().add(btnAgregarFotoMedico);
		
		JPanel panelFotoMedico = new JPanel();
		panelFotoMedico.setBounds(400, 544, 113, 106);
		getContentPane().add(panelFotoMedico);
		
		JLabel lblIdiomas = new JLabel("Idiomas:");
		lblIdiomas.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblIdiomas.setBounds(550, 243, 183, 37);
		getContentPane().add(lblIdiomas);
		
		JCheckBox ckBoxEspanol = new JCheckBox("Espa\u00F1ol");
		ckBoxEspanol.setBounds(550, 273, 63, 32);
		getContentPane().add(ckBoxEspanol);
		
		JCheckBox ckBoxIngles = new JCheckBox("Ingl\u00E9s");
		ckBoxIngles.setBounds(615, 273, 55, 32);
		getContentPane().add(ckBoxIngles);
		
		JLabel lblOtroIdioma = new JLabel("Otro:");
		lblOtroIdioma.setBounds(676, 282, 46, 14);
		getContentPane().add(lblOtroIdioma);
		
		txtOtroIdioma = new JTextField();
		txtOtroIdioma.setColumns(10);
		txtOtroIdioma.setBounds(707, 276, 95, 25);
		getContentPane().add(txtOtroIdioma);
		
		JLabel lblSlogan = new JLabel("Slogan:");
		lblSlogan.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblSlogan.setBounds(539, 329, 72, 37);
		getContentPane().add(lblSlogan);
		
		txtSlogan = new JTextField();
		txtSlogan.setColumns(10);
		txtSlogan.setBounds(615, 332, 245, 32);
		getContentPane().add(txtSlogan);
		
		JLabel lblAfiliaciones = new JLabel("Afiliaciones:");
		lblAfiliaciones.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblAfiliaciones.setBounds(541, 372, 139, 37);
		getContentPane().add(lblAfiliaciones);
		
		txtAfiliaciones = new JTextField();
		txtAfiliaciones.setColumns(10);
		txtAfiliaciones.setBounds(615, 415, 245, 106);
		getContentPane().add(txtAfiliaciones);
	}
}
