/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 27, 2014
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
 * @author Diego Mar 27, 2014
 *
 */
public class AgregarPaciente extends VentanaBase {
	
	private JTextField txtNombrePaciente;
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	private JTextField txtPrimerApellidoPaciente;
	private JTextField txtSegApellidoPaciente;
	private JTextField txtCedulaPaciente;
	private JTextField textField;
	
	public AgregarPaciente(){
		
		
		JLabel lblAgregarPaciente = new JLabel("Agregar Paciente");
		lblAgregarPaciente.setBounds(196, 173, 343, 44);
		lblAgregarPaciente.setFont(letraTitulo);
		getContentPane().add(lblAgregarPaciente);
		
		JLabel lblNombrePaciente = new JLabel("Nombre*:");
		lblNombrePaciente.setBounds(75, 316, 170, 32);
		lblNombrePaciente.setFont(letra1);
		getContentPane().add(lblNombrePaciente);
		
		txtNombrePaciente = new JTextField();
		txtNombrePaciente.setBounds(268, 316, 245, 32);
		getContentPane().add(txtNombrePaciente);
		txtNombrePaciente.setColumns(10);
		
		JLabel lblPrimerApellPaciente = new JLabel("Primer Apellido*:");
		lblPrimerApellPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblPrimerApellPaciente.setBounds(75, 359, 183, 32);
		getContentPane().add(lblPrimerApellPaciente);
		
		txtPrimerApellidoPaciente = new JTextField();
		txtPrimerApellidoPaciente.setColumns(10);
		txtPrimerApellidoPaciente.setBounds(268, 359, 245, 32);
		getContentPane().add(txtPrimerApellidoPaciente);
		
		JLabel lblSegundoApellPaciente = new JLabel("Segundo Apellido*:");
		lblSegundoApellPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblSegundoApellPaciente.setBounds(75, 402, 189, 32);
		getContentPane().add(lblSegundoApellPaciente);
		
		txtSegApellidoPaciente = new JTextField();
		txtSegApellidoPaciente.setColumns(10);
		txtSegApellidoPaciente.setBounds(268, 402, 245, 32);
		getContentPane().add(txtSegApellidoPaciente);
		
		JLabel cedulaPaciente = new JLabel("C\u00E9dula*:");
		cedulaPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		cedulaPaciente.setBounds(75, 273, 170, 32);
		getContentPane().add(cedulaPaciente);
		
		txtCedulaPaciente = new JTextField();
		txtCedulaPaciente.setColumns(10);
		txtCedulaPaciente.setBounds(268, 273, 245, 32);
		getContentPane().add(txtCedulaPaciente);
		
		JLabel lblCorreoPaciente = new JLabel("Correo:");
		lblCorreoPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblCorreoPaciente.setBounds(75, 441, 189, 32);
		getContentPane().add(lblCorreoPaciente);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(268, 441, 245, 32);
		getContentPane().add(textField);
		
		JLabel lblFotoPaciente = new JLabel("Foto:");
		lblFotoPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFotoPaciente.setBounds(75, 484, 189, 32);
		getContentPane().add(lblFotoPaciente);
		
		JButton btnAgregarFotoPaciente = new JButton("Examinar...");
		btnAgregarFotoPaciente.setBounds(268, 484, 122, 32);
		getContentPane().add(btnAgregarFotoPaciente);
		
		JPanel panel = new JPanel();
		panel.setBounds(400, 484, 113, 106);
		getContentPane().add(panel);
	}

}
