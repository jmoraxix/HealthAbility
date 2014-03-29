/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 22, 2014
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.SwingConstants;

/**
 * @author Diego Mar 22, 2014
 *
 */
@SuppressWarnings("serial")
public class Usuarios extends VentanaBase {

	Dimension tamTotal = HealthAbility.getTamPantalla();
	public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 22);
	public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 18);


	public Usuarios(){
		//getContentPane().setLayout(null);


		this.setJMenuBar(new BarraMenu());
		//boton de salir
		JPanel regresar = new JPanel();
		regresar.setBounds(43, 149, 60, 60);
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
				MenuPrincipal menu = new MenuPrincipal();
				menu.setVisible(true); 
				setVisible(false);
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);

		JPanel agregarDoctor = new JPanel();
		agregarDoctor.setBounds(141, 188, 97, 115);
		agregarDoctor.setOpaque(false);
		try {
			agregarDoctor.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar_doctor.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				agregarDoctor.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(agregarDoctor);
		agregarDoctor.setLayout(new BorderLayout(0, 0));
		JButton btnAgregarDoctor = new JButton("");
		btnAgregarDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarMedico agregarMedico = new AgregarMedico();
				agregarMedico.setVisible(true); 
				setVisible(false);
			}
		});
		btnAgregarDoctor.setOpaque(false);
		btnAgregarDoctor.setContentAreaFilled(false);
		btnAgregarDoctor.setBorderPainted(false);
		agregarDoctor.add(btnAgregarDoctor, BorderLayout.CENTER);


		JPanel modificarDoctor = new JPanel();
		modificarDoctor.setBounds(141, 352, 97, 115);
		modificarDoctor.setOpaque(false);
		try {
			modificarDoctor.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar_doctor.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				modificarDoctor.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(modificarDoctor);
		modificarDoctor.setLayout(new BorderLayout(0, 0));
		JButton btnModificarDoctor = new JButton("");
		btnModificarDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActualizarMedico actualizarMedico = new ActualizarMedico();
				actualizarMedico.setVisible(true); 
				setVisible(false);
			}
		});
		btnModificarDoctor.setOpaque(false);
		btnModificarDoctor.setContentAreaFilled(false);
		btnModificarDoctor.setBorderPainted(false);
		modificarDoctor.add(btnModificarDoctor, BorderLayout.CENTER);

		JPanel eliminarDoctor = new JPanel();
		eliminarDoctor.setBounds(141, 509, 97, 115);
		eliminarDoctor.setOpaque(false);
		try {
			eliminarDoctor.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar_doctor.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				eliminarDoctor.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		getContentPane().add(eliminarDoctor);
		eliminarDoctor.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarDoctor = new JButton("");
		btnEliminarDoctor.setOpaque(false);
		btnEliminarDoctor.setContentAreaFilled(false);
		btnEliminarDoctor.setBorderPainted(false);
		eliminarDoctor.add(btnEliminarDoctor, BorderLayout.CENTER);



		JPanel agregarPaciente = new JPanel();
		agregarPaciente.setBounds(458, 188, 97, 115);
		agregarPaciente.setOpaque(false);
		try {
			agregarPaciente.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar_paciente.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				agregarPaciente.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(agregarPaciente);
		agregarPaciente.setLayout(new BorderLayout(0, 0));
		JButton btnAgregarPaciente = new JButton("");
		btnAgregarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarPaciente agregarPaciente = new AgregarPaciente();
				agregarPaciente.setVisible(true); 
				setVisible(false);
			}
		});
		btnAgregarPaciente.setOpaque(false);
		btnAgregarPaciente.setContentAreaFilled(false);
		btnAgregarPaciente.setBorderPainted(false);
		agregarPaciente.add(btnAgregarPaciente, BorderLayout.CENTER);



		JPanel modificarPaciente = new JPanel();
		modificarPaciente.setBounds(458, 352, 97, 115);
		modificarPaciente.setOpaque(false);
		try {
			modificarPaciente.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar_paciente.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				modificarPaciente.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(modificarPaciente);
		modificarPaciente.setLayout(new BorderLayout(0, 0));
		JButton btnModificarPaciente = new JButton("");
		btnModificarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActualizarPaciente actualizarPaciente = new ActualizarPaciente();
				actualizarPaciente.setVisible(true); 
				setVisible(false);
			}
		});
		btnModificarPaciente.setOpaque(false);
		btnModificarPaciente.setContentAreaFilled(false);
		btnModificarPaciente.setBorderPainted(false);
		modificarPaciente.add(btnModificarPaciente, BorderLayout.CENTER);



		JPanel eliminarPaciente = new JPanel();
		eliminarPaciente.setBounds(458, 509, 97, 115);
		eliminarPaciente.setOpaque(false);
		try {
			eliminarPaciente.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar_paciente.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				eliminarPaciente.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		getContentPane().add(eliminarPaciente);
		eliminarPaciente.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarPaciente = new JButton("");
		btnEliminarPaciente.setOpaque(false);
		btnEliminarPaciente.setContentAreaFilled(false);
		btnEliminarPaciente.setBorderPainted(false);
		eliminarPaciente.add(btnEliminarPaciente, BorderLayout.CENTER);

		JPanel agregarAdmin = new JPanel();
		agregarAdmin.setBounds(770, 188, 97, 115);
		agregarAdmin.setOpaque(false);
		try {
			agregarAdmin.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar_admin.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				agregarAdmin.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		getContentPane().add(agregarAdmin);
		agregarAdmin.setLayout(new BorderLayout(0, 0));
		JButton btnAgregarAdmin = new JButton("");
		btnAgregarAdmin.setOpaque(false);
		btnAgregarAdmin.setContentAreaFilled(false);
		btnAgregarAdmin.setBorderPainted(false);
		agregarAdmin.add(btnAgregarAdmin, BorderLayout.CENTER);



		JPanel modificarAdmin = new JPanel();
		modificarAdmin.setBounds(770, 352, 97, 115);
		modificarAdmin.setOpaque(false);
		try {
			modificarAdmin.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar_admin.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				modificarAdmin.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(modificarAdmin);
		modificarAdmin.setLayout(new BorderLayout(0, 0));
		JButton btnModifcarAdmin = new JButton("");
		btnModifcarAdmin.setOpaque(false);
		btnModifcarAdmin.setContentAreaFilled(false);
		btnModifcarAdmin.setBorderPainted(false);

		modificarAdmin.add(btnModifcarAdmin, BorderLayout.CENTER);

		JPanel eliminarAdmin = new JPanel();
		eliminarAdmin.setBounds(770, 509, 97, 115);
		eliminarAdmin.setOpaque(false);
		try {
			eliminarAdmin.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar_admin.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				eliminarAdmin.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(eliminarAdmin);
		eliminarAdmin.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarAdmin = new JButton("");
		btnEliminarAdmin.setOpaque(false);
		btnEliminarAdmin.setContentAreaFilled(false);
		btnEliminarAdmin.setBorderPainted(false);
		eliminarAdmin.add(btnEliminarAdmin, BorderLayout.CENTER);


		JLabel lblAgregarDoctor = new JLabel("Agregar médico");
		lblAgregarDoctor.setForeground(new Color(0, 0, 128));
		lblAgregarDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarDoctor.setFont(letraTexto2);
		lblAgregarDoctor.setBounds(126, 305, 133, 27);
		getContentPane().add(lblAgregarDoctor);

		JLabel lblModificarDoctor = new JLabel("Modificar médico");
		lblModificarDoctor.setForeground(new Color(0, 0, 128));
		lblModificarDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarDoctor.setFont(letraTexto2);
		lblModificarDoctor.setBounds(113, 475, 148, 20);
		getContentPane().add(lblModificarDoctor);

		JLabel lblEliminarDoctor = new JLabel("Eliminar médico");
		lblEliminarDoctor.setForeground(new Color(0, 0, 128));
		lblEliminarDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarDoctor.setFont(letraTexto2);
		lblEliminarDoctor.setBounds(126, 620, 133, 20);
		getContentPane().add(lblEliminarDoctor);

		JLabel lblAgregarPaciente = new JLabel("Agregar paciente");
		lblAgregarPaciente.setForeground(new Color(0, 0, 128));
		lblAgregarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarPaciente.setFont(letraTexto2);
		lblAgregarPaciente.setBounds(437, 305, 141, 27);
		getContentPane().add(lblAgregarPaciente);

		JLabel lblModificarPaciente = new JLabel("Modificar paciente");
		lblModificarPaciente.setForeground(new Color(0, 0, 128));
		lblModificarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarPaciente.setFont(letraTexto2);
		lblModificarPaciente.setBounds(424, 475, 156, 20);
		getContentPane().add(lblModificarPaciente);

		JLabel lblEliminarPaciente = new JLabel("Eliminar paciente");
		lblEliminarPaciente.setForeground(new Color(0, 0, 128));
		lblEliminarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarPaciente.setFont(letraTexto2);
		lblEliminarPaciente.setBounds(424, 622, 154, 17);
		getContentPane().add(lblEliminarPaciente);

		JLabel lblAgregarAdmin = new JLabel("Agregar administrador");
		lblAgregarAdmin.setForeground(new Color(0, 0, 128));
		lblAgregarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarAdmin.setFont(letraTexto2);
		lblAgregarAdmin.setBounds(725, 305, 179, 27);
		getContentPane().add(lblAgregarAdmin);

		JLabel lblModificarAdmin = new JLabel("Modificar administrador");
		lblModificarAdmin.setForeground(new Color(0, 0, 128));
		lblModificarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarAdmin.setFont(letraTexto2);
		lblModificarAdmin.setBounds(711, 475, 208, 20);
		getContentPane().add(lblModificarAdmin);

		JLabel lblEliminarAdmin = new JLabel("Eliminar administrador");
		lblEliminarAdmin.setForeground(new Color(0, 0, 128));
		lblEliminarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarAdmin.setFont(letraTexto2);
		lblEliminarAdmin.setBounds(711, 622, 208, 17);
		getContentPane().add(lblEliminarAdmin);


	}
}
