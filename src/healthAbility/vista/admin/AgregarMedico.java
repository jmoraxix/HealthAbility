/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.admin;

import healthAbility.vista.VentanaBase;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author JoséDavid 26/03/2014
 */
public class AgregarMedico extends VentanaBase {
	private JTextField txtNom;
	private JTextField txtPrimAp;
	private JTextField txtSecAp;

	/**
	 * Create the frame.
	 */
	public AgregarMedico() {
		
		JLabel lblAgregarMdico = new JLabel("Agregar m\u00E9dico");
		lblAgregarMdico.setBounds(122, 172, 283, 39);
		getContentPane().add(lblAgregarMdico);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(90, 246, 110, 32);
		getContentPane().add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer apellido:");
		lblPrimerApellido.setBounds(88, 289, 112, 32);
		getContentPane().add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo apellido:");
		lblSegundoApellido.setBounds(88, 332, 112, 32);
		getContentPane().add(lblSegundoApellido);
		
		txtNom = new JTextField();
		txtNom.setBounds(208, 249, 160, 26);
		getContentPane().add(txtNom);
		txtNom.setColumns(10);
		
		txtPrimAp = new JTextField();
		txtPrimAp.setBounds(210, 295, 160, 26);
		getContentPane().add(txtPrimAp);
		txtPrimAp.setColumns(10);
		
		txtSecAp = new JTextField();
		txtSecAp.setBounds(209, 338, 159, 26);
		getContentPane().add(txtSecAp);
		txtSecAp.setColumns(10);

	}
}
