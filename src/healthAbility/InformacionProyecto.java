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
	private final String VERSION = "VERSION 1.0.0 (Actualizado 12/3/14)";
	
	public InformacionProyecto() 
	{
		setBounds(300, 150, 817, 476);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Proyecto = new JLabel("Health Ability");
		Proyecto.setHorizontalAlignment(SwingConstants.CENTER);
		Proyecto.setFont(new Font("Consolas", Font.BOLD, 18));
		Proyecto.setBounds(10, 23, 763, 65);
		getContentPane().add(Proyecto);
		
		JLabel Version = new JLabel(VERSION);
		Version.setHorizontalAlignment(SwingConstants.CENTER);
		Version.setFont(new Font("Consolas", Font.BOLD, 18));
		Version.setBounds(171, 70, 450, 58);
		getContentPane().add(Version);
		
		JLabel Colegio = new JLabel("Instituto Tecnol�gico de Costa Rica");
		Colegio.setHorizontalAlignment(SwingConstants.CENTER);
		Colegio.setFont(new Font("Consolas", Font.BOLD, 18));
		Colegio.setBounds(151, 118, 443, 50);
		getContentPane().add(Colegio);
		
		JLabel Expo12 = new JLabel("Ingenier�a en Computaci�n");
		Expo12.setHorizontalAlignment(SwingConstants.CENTER);
		Expo12.setFont(new Font("Consolas", Font.BOLD, 18));
		Expo12.setBounds(151, 165, 451, 42);
		getContentPane().add(Expo12);
		
		JLabel Departamento = new JLabel("Programaci�n Orientada a Objetos");
		Departamento.setHorizontalAlignment(SwingConstants.CENTER);
		Departamento.setFont(new Font("Consolas", Font.BOLD, 18));
		Departamento.setBounds(151, 205, 450, 42);
		getContentPane().add(Departamento);
		
		JLabel Epecialiadad = new JLabel("Primer Proyecto");
		Epecialiadad.setHorizontalAlignment(SwingConstants.CENTER);
		Epecialiadad.setFont(new Font("Consolas", Font.BOLD, 18));
		Epecialiadad.setBounds(152, 246, 450, 42);
		getContentPane().add(Epecialiadad);
		
		JLabel lblJosDavidMora = new JLabel("Jose\u00C9 David Mora Lor\u00CDa");
		lblJosDavidMora.setHorizontalAlignment(SwingConstants.CENTER);
		lblJosDavidMora.setFont(new Font("Consolas", Font.BOLD, 18));
		lblJosDavidMora.setBounds(0, 299, 450, 42);
		getContentPane().add(lblJosDavidMora);
		
		JLabel lblDiegoSolsPearanda = new JLabel("Diego Delgado");
		lblDiegoSolsPearanda.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiegoSolsPearanda.setFont(new Font("Consolas", Font.BOLD, 18));
		lblDiegoSolsPearanda.setBounds(351, 299, 450, 42);
		getContentPane().add(lblDiegoSolsPearanda);
		
		JLabel lblSeccind = new JLabel("2014");
		lblSeccind.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeccind.setFont(new Font("Consolas", Font.BOLD, 18));
		lblSeccind.setBounds(161, 340, 450, 42);
		getContentPane().add(lblSeccind);
		
//		JLabel label_1 = new JLabel("2012");
//		label_1.setHorizontalAlignment(SwingConstants.CENTER);
//		label_1.setFont(new Font("Consolas", Font.BOLD, 18));
//		label_1.setBounds(171, 366, 450, 42);
//		getContentPane().add(label_1);
	}
}