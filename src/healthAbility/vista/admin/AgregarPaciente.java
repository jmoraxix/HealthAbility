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


/**
 * @author Diego Mar 27, 2014
 *
 */
@SuppressWarnings("serial")
public class AgregarPaciente extends VentanaBase {
	
	private JTextField txtNombrePaciente;
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	private JTextField txtPrimerApPaciente;
	private JTextField txtSegApPaciente;
	private JFormattedTextField txtCedulaPaciente;
	private JTextField txtCorreoPaciente;
	private JFormattedTextField txtTelefonoPaciente;
	
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
						if (txtNombrePaciente.getText().equals("") ||
							txtCedulaPaciente.getText().equals("")||
							txtPrimerApPaciente.getText().equals("")||
							txtSegApPaciente.getText().equals("")) 
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
				guardar.add(btnGuardar, BorderLayout.CENTER);
		
		
		JLabel lblAgregarPaciente = new JLabel("Agregar Paciente");
		lblAgregarPaciente.setBounds(75, 174, 343, 44);
		lblAgregarPaciente.setFont(letraTitulo);
		getContentPane().add(lblAgregarPaciente);
		
		JLabel lblNombrePaciente = new JLabel("Nombre*:");
		lblNombrePaciente.setBounds(75, 316, 170, 32);
		lblNombrePaciente.setFont(letra1);
		getContentPane().add(lblNombrePaciente);
		
		txtNombrePaciente = new JTextField();
		soloLetras(txtNombrePaciente);
		txtNombrePaciente.setBounds(268, 316, 245, 32);
		getContentPane().add(txtNombrePaciente);
		txtNombrePaciente.setColumns(10);
		
		JLabel lblPrimerApellPaciente = new JLabel("Primer Apellido*:");
		lblPrimerApellPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblPrimerApellPaciente.setBounds(75, 359, 183, 32);
		getContentPane().add(lblPrimerApellPaciente);
		
		txtPrimerApPaciente = new JTextField();
		soloLetras(txtPrimerApPaciente);
		txtPrimerApPaciente.setColumns(10);
		txtPrimerApPaciente.setBounds(268, 359, 245, 32);
		getContentPane().add(txtPrimerApPaciente);
		
		JLabel lblSegundoApellPaciente = new JLabel("Segundo Apellido*:");
		lblSegundoApellPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblSegundoApellPaciente.setBounds(75, 402, 189, 32);
		getContentPane().add(lblSegundoApellPaciente);
		
		txtSegApPaciente = new JTextField();
		soloLetras(txtSegApPaciente);
		txtSegApPaciente.setColumns(10);
		txtSegApPaciente.setBounds(268, 402, 245, 32);
		getContentPane().add(txtSegApPaciente);
		
		JLabel cedulaPaciente = new JLabel("C\u00E9dula*:");
		cedulaPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		cedulaPaciente.setBounds(75, 273, 170, 32);
		getContentPane().add(cedulaPaciente);
		
		MaskFormatter mascaraCedula = null;
		try {
			mascaraCedula = new MaskFormatter("#-####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JFormattedTextField txtCedulaPaciente = new JFormattedTextField(mascaraCedula);
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
		lblFotoPaciente.setBounds(558, 273, 102, 32);
		getContentPane().add(lblFotoPaciente);
		
		JButton btnAgregarFotoPaciente = new JButton("Examinar...");
		btnAgregarFotoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscarFoto();	
			}
		});
		btnAgregarFotoPaciente.setBounds(670, 277, 122, 32);
		getContentPane().add(btnAgregarFotoPaciente);
		
//		pnFotoPaciente = new JPanel();
//		pnFotoPaciente.setBounds(682, 331, 110, 146);
//		getContentPane().add(pnFotoPaciente);

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
		label.setBounds(75, 229, 122, 14);
		getContentPane().add(label);
		
		JButton btnVerFoto = new JButton("Ver foto");
		btnVerFoto.setEnabled(false);
		btnVerFoto.setBounds(670, 325, 122, 28);
		getContentPane().add(btnVerFoto);
		
		JLabel lblTelefonoPaciente = new JLabel("Tel\u00E9fono:");
		lblTelefonoPaciente.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblTelefonoPaciente.setBounds(75, 484, 189, 32);
		getContentPane().add(lblTelefonoPaciente);
		
		MaskFormatter mascaraTelefono = null;
		try {
			mascaraTelefono = new MaskFormatter("####-####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		txtTelefonoPaciente = new JFormattedTextField(mascaraTelefono);
		txtTelefonoPaciente.setColumns(10);
		txtTelefonoPaciente.setBounds(268, 484, 245, 32);
		getContentPane().add(txtTelefonoPaciente);
		
		
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
	
	private void buscarFoto(){
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getAbsolutePath());
		       try {
		    	   	BufferedImage  img = ImageIO.read(new URL(chooser.getSelectedFile().getAbsolutePath()));
		    	   
		    		
		    	   //	lblNewLabelPanel.setIcon(new ImageIcon(chooser.getSelectedFile().getAbsolutePath()));
					//pnFotoPaciente.setBorder(borde);
//					SwingUtilities.updateComponentTreeUI(this); 
//					this.validateTree();
				} catch (Exception e) {
				}
		       
		    }
	
		
		
	}
}

