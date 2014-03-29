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

/**
 * @author Diego Mar 27, 2014
 *
 */
public class ActualizarPaciente extends VentanaBase {
	
	private JTextField txtNombrePaciente;
	private JTextField txtPrimerApMedico;
	private JTextField txtSegundoApMedico;
	private JTextField txtCedulaPaciente;
	private JTextField txtCorreoPaciente;
	private JTextField txtTelefonoMedico;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public ActualizarPaciente() {
		
		this.setJMenuBar(new BarraMenu());
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
		
		JLabel lblActualizarPaciente = new JLabel("Actualizar Paciente");
		lblActualizarPaciente.setBounds(75, 174, 256, 44);
		lblActualizarPaciente.setFont(letraTitulo);
		getContentPane().add(lblActualizarPaciente);
		
		JLabel lblNombrePaciente = new JLabel("Nombre*:");
		lblNombrePaciente.setBounds(75, 289, 170, 32);
		lblNombrePaciente.setFont(letra1);
		getContentPane().add(lblNombrePaciente);
		
		txtNombrePaciente = new JTextField();
		txtNombrePaciente.setBounds(268, 286, 245, 32);
		getContentPane().add(txtNombrePaciente);
		txtNombrePaciente.setColumns(10);
		
		JLabel lblPrimerApPaciente = new JLabel("Primer apellido*:");
		lblPrimerApPaciente.setBounds(75, 332, 175, 32);
		lblPrimerApPaciente.setFont(letra1);
		getContentPane().add(lblPrimerApPaciente);
		
		txtPrimerApMedico = new JTextField();
		txtPrimerApMedico.setBounds(268, 329, 245, 32);
		getContentPane().add(txtPrimerApMedico);
		txtPrimerApMedico.setColumns(10);
		
		JLabel lblSegundoApPaciente = new JLabel("Segundo apellido*:");
		lblSegundoApPaciente.setBounds(75, 372, 209, 32);
		lblSegundoApPaciente.setFont(letra1);
		getContentPane().add(lblSegundoApPaciente);
		
		txtSegundoApMedico = new JTextField();
		txtSegundoApMedico.setBounds(268, 372, 245, 32);
		getContentPane().add(txtSegundoApMedico);
		txtSegundoApMedico.setColumns(10);
		
		JLabel lblCedulaPaciente = new JLabel("C\u00E9dula*:");
		lblCedulaPaciente.setBounds(75, 243, 183, 32);
		lblCedulaPaciente.setFont(letra1);
		getContentPane().add(lblCedulaPaciente);
		
		txtCedulaPaciente = new JTextField();
		txtCedulaPaciente.setBounds(268, 243, 245, 32);
		getContentPane().add(txtCedulaPaciente);
		txtCedulaPaciente.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(75, 415, 175, 32);
		lblCorreo.setFont(letra1);
		getContentPane().add(lblCorreo);
		
		txtCorreoPaciente = new JTextField();
		txtCorreoPaciente.setBounds(268, 415, 245, 32);
		getContentPane().add(txtCorreoPaciente);
		txtCorreoPaciente.setColumns(10);
		
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
		lblFoto.setBounds(547, 241, 60, 37);
		getContentPane().add(lblFoto);
		
		JButton btnAgregarFotoMedico = new JButton("Examinar...");
		btnAgregarFotoMedico.setBounds(608, 247, 122, 32);
		getContentPane().add(btnAgregarFotoMedico);
		
		JPanel panelFotoMedico = new JPanel();
		panelFotoMedico.setBounds(620, 316, 110, 146);
		getContentPane().add(panelFotoMedico);
		
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
