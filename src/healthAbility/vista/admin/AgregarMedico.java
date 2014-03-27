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

/**
 * @author JoséDavid 26/03/2014
 */
public class AgregarMedico extends VentanaBase {
	private JTextField txtNom;
	private JTextField txtPrimAp;
	private JTextField txtSecAp;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	private JTextField txtCedula;
	private JTextField txtCorreo;
	private JTextField txtEspecialidad;
	private JTextField textField;

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
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido*:");
		lblPrimerApellido.setBounds(75, 332, 175, 32);
		lblPrimerApellido.setFont(letra1);
		getContentPane().add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido*:");
		lblSegundoApellido.setBounds(75, 372, 209, 32);
		lblSegundoApellido.setFont(letra1);
		getContentPane().add(lblSegundoApellido);
		
		txtNom = new JTextField();
		txtNom.setBounds(268, 286, 245, 32);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPrimAp = new JTextField();
		txtPrimAp.setBounds(268, 329, 245, 32);
		getContentPane().add(txtPrimAp);
		txtPrimAp.setColumns(10);
		
		txtSecAp = new JTextField();
		txtSecAp.setBounds(268, 372, 245, 32);
		getContentPane().add(txtSecAp);
		txtSecAp.setColumns(10);
		
		JLabel lblCedula = new JLabel("C\u00E9dula*:");
		lblCedula.setBounds(75, 243, 183, 32);
		getContentPane().add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(268, 243, 245, 32);
		getContentPane().add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(75, 415, 175, 32);
		getContentPane().add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(268, 415, 245, 32);
		getContentPane().add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(75, 515, 183, 37);
		getContentPane().add(lblEspecialidad);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(268, 517, 245, 32);
		getContentPane().add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(75, 458, 183, 40);
		getContentPane().add(lblTelefono);
		
		textField = new JTextField();
		textField.setBounds(268, 458, 245, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
	}
}
