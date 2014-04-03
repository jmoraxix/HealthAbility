/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 24, 2014
 */
package healthAbility.vista.paciente;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.Login;
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
 * @author Diego Mar 24, 2014
 *
 */
@SuppressWarnings("serial")
public class MenuPrincipal extends VentanaBase implements ActionListener
{
	public static final Dimension tamTotal = HealthAbility.getTamPantalla();

	public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 22);
	public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 18);
	public Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);

	boolean estadoIngres = false, estadoVer = false, estadoAct = false, estadoElim = false, estadoDesc = false, estadoImprim = false;
	JPanel unoIngres, variosIngres, unoVer, variosVer, unoElim, variosElim, unoAct, variosAct, unoImprim, variosImprim, unoDesc, variosDesc, descEntrev;
	JLabel lblUnoIngres, lblVariosIngres, lblUnoVer, lblVariosVer, lblUnoElim, lblVariosElim, lblUnoAct, lblVariosAct, lblUnoImprim, lblVariosImprim, 
	lblUnoDesc, lblVariosDesc, lblDescEntrev; 	

	public MenuPrincipal() 
	{
		this.setJMenuBar(new BarraMenu(this));
		//Salir
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
				Login login = new Login();
				login.setVisible(true); 
				setVisible(false);
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);

		//Opciones del Menu
		JPanel AgregarPaciente = new JPanel();
		AgregarPaciente.setBounds(259, 214, 97, 115);
		AgregarPaciente.setOpaque(false);
		try {
			AgregarPaciente.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar_paciente.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				AgregarPaciente.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(AgregarPaciente);
		AgregarPaciente.setLayout(new BorderLayout(0, 0));

		JButton btnIngresarPaciente = new JButton("");
		btnIngresarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarPaciente agregarPaciente = new AgregarPaciente();
				agregarPaciente.setVisible(true);
				setVisible(false);
			}
		});
		btnIngresarPaciente.setOpaque(false);
		btnIngresarPaciente.setContentAreaFilled(false);
		btnIngresarPaciente.setBorderPainted(false);
		AgregarPaciente.add(btnIngresarPaciente);
		
		JPanel ActualizarPaciente = new JPanel();
		ActualizarPaciente.setBounds(614, 214, 97, 115);
		ActualizarPaciente.setOpaque(false);
		try {
			ActualizarPaciente.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar_paciente.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				ActualizarPaciente.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(ActualizarPaciente);
		ActualizarPaciente.setLayout(new BorderLayout(0, 0));

		JButton btnActualizarPaciente = new JButton("");
		btnActualizarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActualizarPaciente actualizarPaciente = new ActualizarPaciente();
				actualizarPaciente.setVisible(true);
				setVisible(false);
			}
		});
		btnActualizarPaciente.setOpaque(false);
		btnActualizarPaciente.setContentAreaFilled(false);
		btnActualizarPaciente.setBorderPainted(false);
		ActualizarPaciente.add(btnActualizarPaciente);
		try {
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/correo.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JPanel citas = new JPanel();
		citas.setBounds(614, 425, 97, 115);
		citas.setOpaque(false);
		try {
			citas.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/fechas.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				citas.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(citas);
		citas.setLayout(new BorderLayout(0, 0));

		JButton btnCitas = new JButton("");
		btnCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ir a citas
			}
		});
		btnCitas.setOpaque(false);
		btnCitas.setContentAreaFilled(false);
		btnCitas.setBorderPainted(false);
		citas.add(btnCitas);

		JPanel calificaciones = new JPanel();
		calificaciones.setBounds(259, 425, 97, 115);
		calificaciones.setOpaque(false);
		try {
			calificaciones.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/examen.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				calificaciones.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(calificaciones);
		calificaciones.setLayout(new BorderLayout(0, 0));

		JButton btncalificaciones = new JButton("");
		btncalificaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerCalificaciones verCalificaciones = new VerCalificaciones();
				verCalificaciones.setVisible(true);
				setVisible(false);
			}
		});
		btncalificaciones.setOpaque(false);
		btncalificaciones.setContentAreaFilled(false);
		btncalificaciones.setBorderPainted(false);
		calificaciones.add(btncalificaciones, BorderLayout.CENTER);
		try {
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/clinicas.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		JLabel lblAgregarMedico = new JLabel("Agregar Paciente");
		lblAgregarMedico.setForeground(new Color(0, 0, 128));
		lblAgregarMedico.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarMedico.setFont(letraTexto2);
		lblAgregarMedico.setBounds(221, 327, 176, 23);
		getContentPane().add(lblAgregarMedico);

		JLabel lblCalificaciones = new JLabel("Calificar");
		lblCalificaciones.setForeground(new Color(0, 0, 128));
		lblCalificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificaciones.setFont(letraTexto2);
		lblCalificaciones.setBounds(221, 551, 168, 23);
		getContentPane().add(lblCalificaciones);

		JLabel lblCitas = new JLabel("Citas");
		lblCitas.setForeground(new Color(0, 0, 128));
		lblCitas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitas.setFont(letraTexto2);
		lblCitas.setBounds(573, 551, 168, 23);
		getContentPane().add(lblCitas);

		JButton btnExamen = new JButton("");
		btnExamen.setBounds(765, 230, 97, 115);
		getContentPane().add(btnExamen);
		btnExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//				editarExamen = new Citas();
				//      			editarExamen.setVisible(true); 
				//      			menu.setVisible(false);
			}
		});
		btnExamen.setOpaque(false);
		btnExamen.setContentAreaFilled(false);
		btnExamen.setBorderPainted(false);
		
		JLabel lblActualizarMedico = new JLabel("Actualizar mis datos");
		lblActualizarMedico.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualizarMedico.setForeground(new Color(0, 0, 128));
		lblActualizarMedico.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblActualizarMedico.setBounds(565, 327, 176, 23);
		getContentPane().add(lblActualizarMedico);
	}

	public void actionPerformed(ActionEvent e)
	{

	}
}
