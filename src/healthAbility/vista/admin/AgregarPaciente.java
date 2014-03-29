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
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * @author Diego Mar 27, 2014
 *
 */
public class AgregarPaciente extends VentanaBase {
	
	private JTextField txtNombrePaciente;
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	private JTextField txtPrimerApPaciente;
	private JTextField txtSegApPaciente;
	private JTextField txtCedulaPaciente;
	private JTextField txtCorreoPaciente;
	
	public AgregarPaciente(){
		
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
		
		
		JLabel lblAgregarPaciente = new JLabel("Agregar Paciente");
		lblAgregarPaciente.setBounds(75, 174, 343, 44);
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
		
		txtPrimerApPaciente = new JTextField();
		txtPrimerApPaciente.setColumns(10);
		txtPrimerApPaciente.setBounds(268, 359, 245, 32);
		getContentPane().add(txtPrimerApPaciente);
		
		JLabel lblSegundoApellPaciente = new JLabel("Segundo Apellido*:");
		lblSegundoApellPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblSegundoApellPaciente.setBounds(75, 402, 189, 32);
		getContentPane().add(lblSegundoApellPaciente);
		
		txtSegApPaciente = new JTextField();
		txtSegApPaciente.setColumns(10);
		txtSegApPaciente.setBounds(268, 402, 245, 32);
		getContentPane().add(txtSegApPaciente);
		
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
		
		txtCorreoPaciente = new JTextField();
		txtCorreoPaciente.setColumns(10);
		txtCorreoPaciente.setBounds(268, 441, 245, 32);
		getContentPane().add(txtCorreoPaciente);
		
		JLabel lblFotoPaciente = new JLabel("Foto:");
		lblFotoPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFotoPaciente.setBounds(558, 273, 189, 32);
		getContentPane().add(lblFotoPaciente);
		
		JButton btnAgregarFotoPaciente = new JButton("Examinar...");
		btnAgregarFotoPaciente.setBounds(670, 277, 122, 32);
		getContentPane().add(btnAgregarFotoPaciente);
		
		JPanel pnFotoPaciente = new JPanel();
		pnFotoPaciente.setBounds(682, 331, 110, 146);
		getContentPane().add(pnFotoPaciente);

		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 597, 183, 37);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(713, 597, 95, 37);
		getContentPane().add(lblGuardar);
	}
}
