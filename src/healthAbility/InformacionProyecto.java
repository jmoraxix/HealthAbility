/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility;

import healthAbility.vista.VentanaEmergente;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @author jmora 12/3/14
 *
 */
@SuppressWarnings("serial")
public class InformacionProyecto extends VentanaEmergente 
{
	private final String VERSION = "VERSION 1.0.7 (Actualizado 25/3/14)";

	public InformacionProyecto() 
	{
		setBounds(300, 150, 817, 476);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel NomProyecto = new JLabel("Health Ability");
		NomProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		NomProyecto.setFont(new Font("Consolas", Font.BOLD, 18));
		NomProyecto.setBounds(10, 23, 763, 65);
		getContentPane().add(NomProyecto);

		JLabel Version = new JLabel(VERSION);
		Version.setHorizontalAlignment(SwingConstants.CENTER);
		Version.setFont(new Font("Consolas", Font.BOLD, 18));
		Version.setBounds(171, 70, 450, 58);
		getContentPane().add(Version);

		JLabel Tec = new JLabel("Instituto Tecnol\u00f3gico de Costa Rica");
		Tec.setHorizontalAlignment(SwingConstants.CENTER);
		Tec.setFont(new Font("Consolas", Font.BOLD, 18));
		Tec.setBounds(151, 118, 443, 50);
		getContentPane().add(Tec);

		JLabel Carrera = new JLabel("Ingenier\u00eda en Computaci\u00f3n");
		Carrera.setHorizontalAlignment(SwingConstants.CENTER);
		Carrera.setFont(new Font("Consolas", Font.BOLD, 18));
		Carrera.setBounds(151, 165, 451, 42);
		getContentPane().add(Carrera);

		JLabel Curso = new JLabel("Programaci\u00f3n Orientada a Objetos");
		Curso.setHorizontalAlignment(SwingConstants.CENTER);
		Curso.setFont(new Font("Consolas", Font.BOLD, 18));
		Curso.setBounds(151, 205, 450, 42);
		getContentPane().add(Curso);

		JLabel PrimProyecto = new JLabel("Primer Proyecto");
		PrimProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		PrimProyecto.setFont(new Font("Consolas", Font.BOLD, 18));
		PrimProyecto.setBounds(152, 246, 450, 42);
		getContentPane().add(PrimProyecto);

		JLabel lblJosDavidMora = new JLabel("Jos\u00e9 David Mora Lor\u00eda");
		lblJosDavidMora.setHorizontalAlignment(SwingConstants.CENTER);
		lblJosDavidMora.setFont(new Font("Consolas", Font.BOLD, 18));
		lblJosDavidMora.setBounds(0, 299, 450, 42);
		getContentPane().add(lblJosDavidMora);

		JLabel lblDiegoDelgado = new JLabel("Diego Delgado");
		lblDiegoDelgado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiegoDelgado.setFont(new Font("Consolas", Font.BOLD, 18));
		lblDiegoDelgado.setBounds(351, 299, 450, 42);
		getContentPane().add(lblDiegoDelgado);

		JLabel Anno = new JLabel("2014");
		Anno.setHorizontalAlignment(SwingConstants.CENTER);
		Anno.setFont(new Font("Consolas", Font.BOLD, 18));
		Anno.setBounds(161, 340, 450, 42);
		getContentPane().add(Anno);

		//		JLabel label_1 = new JLabel("2012");
		//		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		//		label_1.setFont(new Font("Consolas", Font.BOLD, 18));
		//		label_1.setBounds(171, 366, 450, 42);
		//		getContentPane().add(label_1);
	}
}