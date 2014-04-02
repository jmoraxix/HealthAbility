/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 24, 2014
 */
package healthAbility.vista.medico;

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
		JPanel AgregarMedico = new JPanel();
		AgregarMedico.setBounds(170, 214, 97, 115);
		AgregarMedico.setOpaque(false);
		try {
			AgregarMedico.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar_doctor.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				AgregarMedico.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(AgregarMedico);
		AgregarMedico.setLayout(new BorderLayout(0, 0));

		JButton btnIngresarMedico = new JButton("");
		btnIngresarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarMedico agregarMedico = new AgregarMedico();
				agregarMedico.setVisible(true);
				setVisible(false);
			}
		});
		btnIngresarMedico.setOpaque(false);
		btnIngresarMedico.setContentAreaFilled(false);
		btnIngresarMedico.setBorderPainted(false);
		AgregarMedico.add(btnIngresarMedico);
		
		JPanel ActualizarMedico = new JPanel();
		ActualizarMedico.setBounds(459, 214, 97, 115);
		ActualizarMedico.setOpaque(false);
		try {
			ActualizarMedico.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar_doctor.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				ActualizarMedico.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(ActualizarMedico);
		ActualizarMedico.setLayout(new BorderLayout(0, 0));

		JButton btnActualizarMedico = new JButton("");
		btnActualizarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ActualizarMedico actualizarMedico = new ActualizarMedico();
				actualizarMedico.setVisible(true);
				setVisible(false);
			}
		});
		btnActualizarMedico.setOpaque(false);
		btnActualizarMedico.setContentAreaFilled(false);
		btnActualizarMedico.setBorderPainted(false);
		ActualizarMedico.add(btnActualizarMedico);
		

		JPanel correos = new JPanel();
		correos.setBounds(170, 425, 97, 115);
		correos.setOpaque(false);
		try {
			correos.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/correo.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				correos.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(correos);
		correos.setLayout(new BorderLayout(0, 0));

		JButton btnCorreos = new JButton("");
		btnCorreos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCorreos.setOpaque(false);
		btnCorreos.setContentAreaFilled(false);
		btnCorreos.setBorderPainted(false);
		correos.add(btnCorreos);

		JPanel citas = new JPanel();
		citas.setBounds(459, 425, 97, 115);
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
			}
		});
		btnCitas.setOpaque(false);
		btnCitas.setContentAreaFilled(false);
		btnCitas.setBorderPainted(false);
		citas.add(btnCitas);

		JPanel calificaciones = new JPanel();
		calificaciones.setBounds(742, 425, 97, 115);
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

		JPanel clinicas = new JPanel();
		clinicas.setBounds(742, 214, 97, 115);
		clinicas.setOpaque(false);
		try {
			clinicas.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/clinicas.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				clinicas.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(clinicas);
		clinicas.setLayout(new BorderLayout(0, 0));

		JButton btnClinicas = new JButton("");
		clinicas.add(btnClinicas);
		btnClinicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			RegistroClinica registroClinica = new RegistroClinica();
			registroClinica.setVisible(true);
			setVisible(false);
			}
		});
		btnClinicas.setOpaque(false);
		btnClinicas.setContentAreaFilled(false);
		btnClinicas.setBorderPainted(false);

		JLabel lblAgregarMedico = new JLabel("Agregar M\u00E9dico");
		lblAgregarMedico.setForeground(new Color(0, 0, 128));
		lblAgregarMedico.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarMedico.setFont(letraTexto2);
		lblAgregarMedico.setBounds(131, 327, 176, 23);
		getContentPane().add(lblAgregarMedico);

		JLabel lblCorreos = new JLabel("Correos");
		lblCorreos.setForeground(new Color(0, 0, 128));
		lblCorreos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreos.setFont(letraTexto2);
		lblCorreos.setBounds(144, 551, 154, 14);
		getContentPane().add(lblCorreos);

		JLabel lblCalificaciones = new JLabel("Calificaciones");
		lblCalificaciones.setForeground(new Color(0, 0, 128));
		lblCalificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificaciones.setFont(letraTexto2);
		lblCalificaciones.setBounds(707, 547, 168, 23);
		getContentPane().add(lblCalificaciones);

		JLabel lblCitas = new JLabel("Citas");
		lblCitas.setForeground(new Color(0, 0, 128));
		lblCitas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitas.setFont(letraTexto2);
		lblCitas.setBounds(427, 551, 168, 23);
		getContentPane().add(lblCitas);

		JLabel lblClinicas = new JLabel("Cl\u00EDnicas");
		lblClinicas.setForeground(new Color(0, 0, 128));
		lblClinicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblClinicas.setFont(letraTexto2);
		lblClinicas.setBounds(689, 334, 199, 23);
		getContentPane().add(lblClinicas);		

		JButton btnExamen = new JButton("");
		btnExamen.setBounds(765, 230, 97, 115);
		getContentPane().add(btnExamen);
		btnExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExamen.setOpaque(false);
		btnExamen.setContentAreaFilled(false);
		btnExamen.setBorderPainted(false);
		
		JLabel lblActualizarMedico = new JLabel("Actualizar M\u00E9dico");
		lblActualizarMedico.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualizarMedico.setForeground(new Color(0, 0, 128));
		lblActualizarMedico.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblActualizarMedico.setBounds(419, 334, 176, 23);
		getContentPane().add(lblActualizarMedico);
	}

	public void actionPerformed(ActionEvent e)
	{

	}
}

