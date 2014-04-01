/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.Login;
import healthAbility.vista.SeleccionarClinica;
import healthAbility.vista.SeleccionarMedico;
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
 * @author jmora 13/03/2014
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
		this.setJMenuBar(new BarraMenu());
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
		JPanel usuarios = new JPanel();
		usuarios.setBounds(170, 214, 97, 115);
		usuarios.setOpaque(false);
		try {
			usuarios.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/ingresar.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				usuarios.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(usuarios);
		usuarios.setLayout(new BorderLayout(0, 0));

		JButton btnUsuarios = new JButton("");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuarios usuarios = new Usuarios();
				usuarios.setVisible(true); 
				setVisible(false);
			}
		});
		btnUsuarios.setOpaque(false);
		btnUsuarios.setContentAreaFilled(false);
		btnUsuarios.setBorderPainted(false);
		usuarios.add(btnUsuarios);

		JPanel correos = new JPanel();
		correos.setBounds(467, 214, 97, 115);
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
				//				elegirEditar = new ElegirEditar();
				//      			elegirEditar.setVisible(true); 
				//      			menu.setVisible(false);
			}
		});
		btnCorreos.setOpaque(false);
		btnCorreos.setContentAreaFilled(false);
		btnCorreos.setBorderPainted(false);
		correos.add(btnCorreos);

		JPanel citas = new JPanel();
		citas.setBounds(467, 453, 97, 115);
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
				irACitas();
			}
		});
		btnCitas.setOpaque(false);
		btnCitas.setContentAreaFilled(false);
		btnCitas.setBorderPainted(false);
		citas.add(btnCitas);
		
		JPanel padecimientos = new JPanel();
		padecimientos.setBounds(754, 453, 97, 115);
		padecimientos.setOpaque(false);
		try {
			padecimientos.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/padecimiento.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				padecimientos.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(padecimientos);
		padecimientos.setLayout(new BorderLayout(0, 0));

		JButton btnPadecimientos = new JButton("");
		btnPadecimientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RegistroPadecimientos registroPadecimientos = new RegistroPadecimientos();
				registroPadecimientos.setVisible(true); 
				setVisible(false);
				
			}
		});
		btnPadecimientos.setOpaque(false);
		btnPadecimientos.setContentAreaFilled(false);
		btnPadecimientos.setBorderPainted(false);
		padecimientos.add(btnPadecimientos);

		JPanel calificaciones = new JPanel();
		calificaciones.setBounds(754, 214, 97, 115);
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
				/*elegirVer = new ElegirVer();
      			elegirVer.setVisible(true); 
      			menu.setVisible(false);*/
			}
		});
		btncalificaciones.setOpaque(false);
		btncalificaciones.setContentAreaFilled(false);
		btncalificaciones.setBorderPainted(false);
		calificaciones.add(btncalificaciones, BorderLayout.CENTER);

		JPanel clinicas = new JPanel();
		clinicas.setBounds(170, 453, 97, 115);
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

		JLabel lblUsuario = new JLabel("Usuarios");
		lblUsuario.setForeground(new Color(0, 0, 128));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(letraTexto2);
		lblUsuario.setBounds(131, 327, 176, 23);
		getContentPane().add(lblUsuario);

		JLabel lblCorreos = new JLabel("Correos");
		lblCorreos.setForeground(new Color(0, 0, 128));
		lblCorreos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreos.setFont(letraTexto2);
		lblCorreos.setBounds(440, 331, 154, 14);
		getContentPane().add(lblCorreos);

		JLabel lblCalificaciones = new JLabel("Calificaci\u00F3n Doctor");
		lblCalificaciones.setForeground(new Color(0, 0, 128));
		lblCalificaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalificaciones.setFont(letraTexto2);
		lblCalificaciones.setBounds(722, 327, 168, 23);
		getContentPane().add(lblCalificaciones);

		JLabel lblCitas = new JLabel("Citas");
		lblCitas.setForeground(new Color(0, 0, 128));
		lblCitas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitas.setFont(letraTexto2);
		lblCitas.setBounds(440, 579, 168, 23);
		getContentPane().add(lblCitas);

		JLabel lblClinicas = new JLabel("Cl\u00EDnicas");
		lblClinicas.setForeground(new Color(0, 0, 128));
		lblClinicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblClinicas.setFont(letraTexto2);
		lblClinicas.setBounds(131, 573, 199, 23);
		getContentPane().add(lblClinicas);
		
		JLabel lblPadecimientos = new JLabel("Padecimientos");
		lblPadecimientos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPadecimientos.setForeground(new Color(0, 0, 128));
		lblPadecimientos.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblPadecimientos.setBounds(722, 579, 168, 23);
		getContentPane().add(lblPadecimientos);
	}

	private void irACitas()
	{
		SeleccionarMedico selecMed = new SeleccionarMedico(this);
		String med = "";
		while(med.equals("")){
			med = selecMed.getCodMedico();
		}
		
		System.out.println("Salio!");
		System.out.println(med);
		
		SeleccionarClinica selecClin = new SeleccionarClinica(this, med);
		String clinica = "";
		while(clinica.equals("")){
			clinica = selecClin.getClinica();
		}
		
		System.out.println("Salio de nuevo!");
		System.out.println(clinica);
		
		setVisible(false);
	}

	public void actionPerformed(ActionEvent arg0) {
		
	}
}

