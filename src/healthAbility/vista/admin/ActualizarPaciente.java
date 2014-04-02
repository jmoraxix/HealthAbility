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
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Diego Mar 27, 2014
 *
 */
@SuppressWarnings("serial")
public class ActualizarPaciente extends VentanaBase {
	
	private JTextField txtNombrePaciente;
	private JTextField txtPrimerApPaciente;
	private JTextField txtSegundoApPaciente;
	private JFormattedTextField txtCedulaPaciente;
	private JTextField txtCorreoPaciente;
	private JFormattedTextField txtTelefonoMedico;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	

	/**
	 * Create the frame.
	 */
	public ActualizarPaciente() {
		
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
				if (txtNombrePaciente.getText().equals("") ||
						txtCedulaPaciente.getText().equals("")||
						txtPrimerApPaciente.getText().equals("")||
						txtSegundoApPaciente.getText().equals("")) 
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
		
		JLabel lblActualizarPaciente = new JLabel("Modificar Paciente");
		lblActualizarPaciente.setBounds(75, 174, 256, 44);
		lblActualizarPaciente.setFont(letraTitulo);
		getContentPane().add(lblActualizarPaciente);
		
		JLabel lblNombrePaciente = new JLabel("Nombre*:");
		lblNombrePaciente.setBounds(75, 311, 170, 32);
		lblNombrePaciente.setFont(letra1);
		getContentPane().add(lblNombrePaciente);
		
		txtNombrePaciente = new JTextField();
		soloLetras(txtNombrePaciente);
		txtNombrePaciente.setBounds(268, 311, 245, 32);
		getContentPane().add(txtNombrePaciente);
		txtNombrePaciente.setColumns(10);
		
		JLabel lblPrimerApPaciente = new JLabel("Primer apellido*:");
		lblPrimerApPaciente.setBounds(75, 354, 175, 32);
		lblPrimerApPaciente.setFont(letra1);
		getContentPane().add(lblPrimerApPaciente);
		
		txtPrimerApPaciente = new JTextField();
		soloLetras(txtPrimerApPaciente);
		txtPrimerApPaciente.setBounds(268, 354, 245, 32);
		getContentPane().add(txtPrimerApPaciente);
		txtPrimerApPaciente.setColumns(10);
		
		JLabel lblSegundoApPaciente = new JLabel("Segundo apellido*:");
		lblSegundoApPaciente.setBounds(75, 397, 209, 32);
		lblSegundoApPaciente.setFont(letra1);
		getContentPane().add(lblSegundoApPaciente);
		
		txtSegundoApPaciente = new JTextField();
		soloLetras(txtSegundoApPaciente);
		txtSegundoApPaciente.setBounds(268, 397, 245, 32);
		getContentPane().add(txtSegundoApPaciente);
		txtSegundoApPaciente.setColumns(10);
		
		JLabel lblCedulaPaciente = new JLabel("C\u00E9dula*:");
		lblCedulaPaciente.setBounds(75, 268, 183, 32);
		lblCedulaPaciente.setFont(letra1);
		getContentPane().add(lblCedulaPaciente);
		
		MaskFormatter mascaraCedula = null;
		try {
			mascaraCedula = new MaskFormatter("#-####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		JFormattedTextField txtCedulaPaciente = new JFormattedTextField(mascaraCedula);
		txtCedulaPaciente.setBounds(268, 268, 245, 32);
		getContentPane().add(txtCedulaPaciente);
		txtCedulaPaciente.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(75, 440, 175, 32);
		lblCorreo.setFont(letra1);
		getContentPane().add(lblCorreo);
		
		txtCorreoPaciente = new JTextField();
		txtCorreoPaciente.setBounds(268, 440, 245, 32);
		getContentPane().add(txtCorreoPaciente);
		txtCorreoPaciente.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(75, 476, 183, 40);
		lblTelefono.setFont(letra1);
		getContentPane().add(lblTelefono);
		
		MaskFormatter mascaraTelefono = null;
		try {
			mascaraTelefono = new MaskFormatter("####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JFormattedTextField txtTelefonoMedico = new JFormattedTextField(mascaraTelefono);
		txtTelefonoMedico.setBounds(268, 484, 245, 32);
		getContentPane().add(txtTelefonoMedico);
		txtTelefonoMedico.setColumns(10);
		
		JLabel lblFoto = new JLabel("Foto:");
		lblFoto.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblFoto.setBounds(547, 241, 60, 37);
		getContentPane().add(lblFoto);
		
		JButton btnAgregarFotoMedico = new JButton("Examinar...");
		btnAgregarFotoMedico.setBounds(608, 247, 122, 32);
		getContentPane().add(btnAgregarFotoMedico);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 597, 183, 37);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(713, 597, 95, 37);
		getContentPane().add(lblGuardar);
		
		JLabel label = new JLabel("*Campos obligatorios");
		label.setForeground(Color.RED);
		label.setBounds(75, 218, 122, 14);
		getContentPane().add(label);
		
		JButton btnVerFoto = new JButton("Ver foto");
		btnVerFoto.setEnabled(false);
		btnVerFoto.setBounds(608, 299, 122, 28);
		getContentPane().add(btnVerFoto);
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
