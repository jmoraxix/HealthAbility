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
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JoséDavid 02/04/2014
 */
public class VerCitas extends VentanaBase {
	
	private Font letra1 = HealthAbility.getLetraTitulo1(), letra2 = HealthAbility.getLetraTexto2(), letra3 = HealthAbility.getLetraTexto3();
	
	
	/**
	 * Create the frame.
	 */
	public VerCitas() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**** Declaración del panel ****/
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(77, 223, 781, 374);
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);

		JLabel lblVerCitas = new JLabel("Ver citas");
		lblVerCitas.setFont(letra1);
		lblVerCitas.setBounds(77, 152, 165, 44);
		getContentPane().add(lblVerCitas);
		
		JLabel lblSeleccioneUnDoctor = new JLabel("Seleccione un doctor:");
		lblSeleccioneUnDoctor.setFont(letra2);
		lblSeleccioneUnDoctor.setBounds(465, 152, 204, 25);
		getContentPane().add(lblSeleccioneUnDoctor);
		
		JLabel lblSeleccioneUnaClnica = new JLabel("Seleccione una cl\u00EDnica:");
		lblSeleccioneUnaClnica.setFont(letra2);
		lblSeleccioneUnaClnica.setBounds(465, 182, 204, 25);
		getContentPane().add(lblSeleccioneUnaClnica);
		
		JComboBox<String> comboDoctor = new JComboBox<String>();
		comboDoctor.setModel(new DefaultComboBoxModel<String>(new String[] {"-- Seleccione un doctor --"}));
		comboDoctor.setBounds(675, 152, 184, 25);
		getContentPane().add(comboDoctor);
		
		JComboBox<String> comboClinica = new JComboBox<String>();
		comboClinica.setModel(new DefaultComboBoxModel<String>(new String[] {"-- Seleccione una cl\u00EDnica --"}));
		comboClinica.setBounds(675, 184, 184, 25);
		getContentPane().add(comboClinica);
		
		/**** Declaración de etiquetas ****/
		JLabel lblLunes = new JLabel("Lunes");
		GridBagConstraints gbc_lblLunes = new GridBagConstraints();
		gbc_lblLunes.insets = new Insets(0, 0, 5, 5);
		gbc_lblLunes.gridx = 1;
		gbc_lblLunes.gridy = 0;
		panel.add(lblLunes, gbc_lblLunes);
		
		JLabel lblMartes = new JLabel("Martes");
		GridBagConstraints gbc_lblMartes = new GridBagConstraints();
		gbc_lblMartes.insets = new Insets(0, 0, 5, 5);
		gbc_lblMartes.gridx = 2;
		gbc_lblMartes.gridy = 0;
		panel.add(lblMartes, gbc_lblMartes);
		
		JLabel lblMiercoles = new JLabel("Mi\u00E9rcoles");
		GridBagConstraints gbc_lblMiercoles = new GridBagConstraints();
		gbc_lblMiercoles.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiercoles.gridx = 3;
		gbc_lblMiercoles.gridy = 0;
		panel.add(lblMiercoles, gbc_lblMiercoles);
		
		JLabel lblJueves = new JLabel("Jueves");
		GridBagConstraints gbc_lblJueves = new GridBagConstraints();
		gbc_lblJueves.insets = new Insets(0, 0, 5, 5);
		gbc_lblJueves.gridx = 4;
		gbc_lblJueves.gridy = 0;
		panel.add(lblJueves, gbc_lblJueves);
		
		JLabel lblViernes = new JLabel("Viernes");
		GridBagConstraints gbc_lblViernes = new GridBagConstraints();
		gbc_lblViernes.insets = new Insets(0, 0, 5, 0);
		gbc_lblViernes.gridx = 5;
		gbc_lblViernes.gridy = 0;
		panel.add(lblViernes, gbc_lblViernes);
		
		JLabel lblAm = new JLabel("8:00 am");
		GridBagConstraints gbc_lblAm = new GridBagConstraints();
		gbc_lblAm.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm.gridx = 0;
		gbc_lblAm.gridy = 1;
		panel.add(lblAm, gbc_lblAm);
		
		JLabel lblam_1 = new JLabel("8:30 am");
		GridBagConstraints gbc_lblam_1 = new GridBagConstraints();
		gbc_lblam_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblam_1.gridx = 0;
		gbc_lblam_1.gridy = 2;
		panel.add(lblam_1, gbc_lblam_1);
		
		JLabel lblam = new JLabel("9:00 am");
		GridBagConstraints gbc_lblam = new GridBagConstraints();
		gbc_lblam.insets = new Insets(0, 0, 5, 5);
		gbc_lblam.gridx = 0;
		gbc_lblam.gridy = 3;
		panel.add(lblam, gbc_lblam);
		
		JLabel lblAm_1 = new JLabel("9:30 am");
		GridBagConstraints gbc_lblAm_1 = new GridBagConstraints();
		gbc_lblAm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm_1.gridx = 0;
		gbc_lblAm_1.gridy = 4;
		panel.add(lblAm_1, gbc_lblAm_1);
		
		JLabel lblAm_2 = new JLabel("10:00 am");
		GridBagConstraints gbc_lblAm_2 = new GridBagConstraints();
		gbc_lblAm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm_2.gridx = 0;
		gbc_lblAm_2.gridy = 5;
		panel.add(lblAm_2, gbc_lblAm_2);
		
		JLabel lblAm_3 = new JLabel("10:30 am");
		GridBagConstraints gbc_lblAm_3 = new GridBagConstraints();
		gbc_lblAm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm_3.gridx = 0;
		gbc_lblAm_3.gridy = 6;
		panel.add(lblAm_3, gbc_lblAm_3);
		
		JLabel lblPm = new JLabel("1:00 pm");
		GridBagConstraints gbc_lblPm = new GridBagConstraints();
		gbc_lblPm.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm.gridx = 0;
		gbc_lblPm.gridy = 8;
		panel.add(lblPm, gbc_lblPm);
		
		JLabel lblPm_1 = new JLabel("1:30 pm");
		GridBagConstraints gbc_lblPm_1 = new GridBagConstraints();
		gbc_lblPm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_1.gridx = 0;
		gbc_lblPm_1.gridy = 9;
		panel.add(lblPm_1, gbc_lblPm_1);
		
		JLabel lblPm_2 = new JLabel("2:00 pm");
		GridBagConstraints gbc_lblPm_2 = new GridBagConstraints();
		gbc_lblPm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_2.gridx = 0;
		gbc_lblPm_2.gridy = 10;
		panel.add(lblPm_2, gbc_lblPm_2);
		
		JLabel lblpm = new JLabel("2:30 pm");
		GridBagConstraints gbc_lblpm = new GridBagConstraints();
		gbc_lblpm.insets = new Insets(0, 0, 5, 5);
		gbc_lblpm.gridx = 0;
		gbc_lblpm.gridy = 11;
		panel.add(lblpm, gbc_lblpm);
		
		JLabel lblPm_3 = new JLabel("3:00 pm");
		GridBagConstraints gbc_lblPm_3 = new GridBagConstraints();
		gbc_lblPm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_3.gridx = 0;
		gbc_lblPm_3.gridy = 12;
		panel.add(lblPm_3, gbc_lblPm_3);
		
		JLabel lblPm_4 = new JLabel("3:30 pm");
		GridBagConstraints gbc_lblPm_4 = new GridBagConstraints();
		gbc_lblPm_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblPm_4.gridx = 0;
		gbc_lblPm_4.gridy = 13;
		panel.add(lblPm_4, gbc_lblPm_4);
		

		/**** BOTONES DE LAS CITAS ****/ 
		//Botones Lunes
		JButton btnL800 = new JButton("");
		GridBagConstraints gbc_btnL800 = new GridBagConstraints();
		gbc_btnL800.fill = GridBagConstraints.BOTH;
		gbc_btnL800.insets = new Insets(0, 0, 5, 5);
		gbc_btnL800.gridx = 1;
		gbc_btnL800.gridy = 1;
		panel.add(btnL800, gbc_btnL800);
		
		JButton btnL830 = new JButton("");
		GridBagConstraints gbc_btnL830 = new GridBagConstraints();
		gbc_btnL830.fill = GridBagConstraints.BOTH;
		gbc_btnL830.insets = new Insets(0, 0, 5, 5);
		gbc_btnL830.gridx = 1;
		gbc_btnL830.gridy = 2;
		panel.add(btnL830, gbc_btnL830);
		
		JButton btnL900 = new JButton("");
		GridBagConstraints gbc_btnL900 = new GridBagConstraints();
		gbc_btnL900.fill = GridBagConstraints.BOTH;
		gbc_btnL900.insets = new Insets(0, 0, 5, 5);
		gbc_btnL900.gridx = 1;
		gbc_btnL900.gridy = 3;
		panel.add(btnL900, gbc_btnL900);
		
		JButton btnL930 = new JButton("");
		GridBagConstraints gbc_btnL930 = new GridBagConstraints();
		gbc_btnL930.fill = GridBagConstraints.BOTH;
		gbc_btnL930.insets = new Insets(0, 0, 5, 5);
		gbc_btnL930.gridx = 1;
		gbc_btnL930.gridy = 4;
		panel.add(btnL930, gbc_btnL930);
		
		JButton btnL1000 = new JButton("");
		GridBagConstraints gbc_btnL1000 = new GridBagConstraints();
		gbc_btnL1000.fill = GridBagConstraints.BOTH;
		gbc_btnL1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1000.gridx = 1;
		gbc_btnL1000.gridy = 5;
		panel.add(btnL1000, gbc_btnL1000);
		
		JButton btnL1030 = new JButton("");
		GridBagConstraints gbc_btnL1030 = new GridBagConstraints();
		gbc_btnL1030.fill = GridBagConstraints.BOTH;
		gbc_btnL1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1030.gridx = 1;
		gbc_btnL1030.gridy = 6;
		panel.add(btnL1030, gbc_btnL1030);
		
		JButton btnL1300 = new JButton("");
		GridBagConstraints gbc_btnL1300 = new GridBagConstraints();
		gbc_btnL1300.fill = GridBagConstraints.BOTH;
		gbc_btnL1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1300.gridx = 1;
		gbc_btnL1300.gridy = 8;
		panel.add(btnL1300, gbc_btnL1300);
		
		JButton btnL1330 = new JButton("");
		GridBagConstraints gbc_btnL1330 = new GridBagConstraints();
		gbc_btnL1330.fill = GridBagConstraints.BOTH;
		gbc_btnL1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1330.gridx = 1;
		gbc_btnL1330.gridy = 9;
		panel.add(btnL1330, gbc_btnL1330);
		
		JButton btnL1400 = new JButton("");
		GridBagConstraints gbc_btnL1400 = new GridBagConstraints();
		gbc_btnL1400.fill = GridBagConstraints.BOTH;
		gbc_btnL1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1400.gridx = 1;
		gbc_btnL1400.gridy = 10;
		panel.add(btnL1400, gbc_btnL1400);
		
		JButton btnL1430 = new JButton("");
		GridBagConstraints gbc_btnL1430 = new GridBagConstraints();
		gbc_btnL1430.fill = GridBagConstraints.BOTH;
		gbc_btnL1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1430.gridx = 1;
		gbc_btnL1430.gridy = 11;
		panel.add(btnL1430, gbc_btnL1430);
		
		JButton btnL1500 = new JButton("");
		GridBagConstraints gbc_btnL1500 = new GridBagConstraints();
		gbc_btnL1500.fill = GridBagConstraints.BOTH;
		gbc_btnL1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1500.gridx = 1;
		gbc_btnL1500.gridy = 12;
		panel.add(btnL1500, gbc_btnL1500);
		
		JButton btnL1530 = new JButton("");
		GridBagConstraints gbc_btnL1530 = new GridBagConstraints();
		gbc_btnL1530.fill = GridBagConstraints.BOTH;
		gbc_btnL1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnL1530.gridx = 1;
		gbc_btnL1530.gridy = 13;
		panel.add(btnL1530, gbc_btnL1530);
	
		//Botones Martes
		JButton btnK800 = new JButton("");
		GridBagConstraints gbc_btnK800 = new GridBagConstraints();
		gbc_btnK800.fill = GridBagConstraints.BOTH;
		gbc_btnK800.insets = new Insets(0, 0, 5, 5);
		gbc_btnK800.gridx = 2;
		gbc_btnK800.gridy = 1;
		panel.add(btnK800, gbc_btnK800);
		
		JButton btnK830 = new JButton("");
		GridBagConstraints gbc_btnK830 = new GridBagConstraints();
		gbc_btnK830.fill = GridBagConstraints.BOTH;
		gbc_btnK830.insets = new Insets(0, 0, 5, 5);
		gbc_btnK830.gridx = 2;
		gbc_btnK830.gridy = 2;
		panel.add(btnK830, gbc_btnK830);
		
		JButton btnK900 = new JButton("");
		GridBagConstraints gbc_btnK900 = new GridBagConstraints();
		gbc_btnK900.fill = GridBagConstraints.BOTH;
		gbc_btnK900.insets = new Insets(0, 0, 5, 5);
		gbc_btnK900.gridx = 2;
		gbc_btnK900.gridy = 3;
		panel.add(btnK900, gbc_btnK900);
		
		JButton btnK930 = new JButton("");
		GridBagConstraints gbc_btnK930 = new GridBagConstraints();
		gbc_btnK930.fill = GridBagConstraints.BOTH;
		gbc_btnK930.insets = new Insets(0, 0, 5, 5);
		gbc_btnK930.gridx = 2;
		gbc_btnK930.gridy = 4;
		panel.add(btnK930, gbc_btnK930);
		
		JButton btnK1000 = new JButton("");
		GridBagConstraints gbc_btnK1000 = new GridBagConstraints();
		gbc_btnK1000.fill = GridBagConstraints.BOTH;
		gbc_btnK1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1000.gridx = 2;
		gbc_btnK1000.gridy = 5;
		panel.add(btnK1000, gbc_btnK1000);
		
		JButton btnK1030 = new JButton("");
		GridBagConstraints gbc_btnK1030 = new GridBagConstraints();
		gbc_btnK1030.fill = GridBagConstraints.BOTH;
		gbc_btnK1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1030.gridx = 2;
		gbc_btnK1030.gridy = 6;
		panel.add(btnK1030, gbc_btnK1030);
		
		JButton btnK1300 = new JButton("");
		GridBagConstraints gbc_btnK1300 = new GridBagConstraints();
		gbc_btnK1300.fill = GridBagConstraints.BOTH;
		gbc_btnK1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1300.gridx = 2;
		gbc_btnK1300.gridy = 8;
		panel.add(btnK1300, gbc_btnK1300);
		
		JButton btnK1330 = new JButton("");
		GridBagConstraints gbc_btnK1330 = new GridBagConstraints();
		gbc_btnK1330.fill = GridBagConstraints.BOTH;
		gbc_btnK1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1330.gridx = 2;
		gbc_btnK1330.gridy = 9;
		panel.add(btnK1330, gbc_btnK1330);
		
		JButton btnK1400 = new JButton("");
		GridBagConstraints gbc_btnK1400 = new GridBagConstraints();
		gbc_btnK1400.fill = GridBagConstraints.BOTH;
		gbc_btnK1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1400.gridx = 2;
		gbc_btnK1400.gridy = 10;
		panel.add(btnK1400, gbc_btnK1400);
		
		JButton btnK1430 = new JButton("");
		GridBagConstraints gbc_btnK1430 = new GridBagConstraints();
		gbc_btnK1430.fill = GridBagConstraints.BOTH;
		gbc_btnK1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1430.gridx = 2;
		gbc_btnK1430.gridy = 11;
		panel.add(btnK1430, gbc_btnK1430);
		
		JButton btnK1500 = new JButton("");
		GridBagConstraints gbc_btnK1500 = new GridBagConstraints();
		gbc_btnK1500.fill = GridBagConstraints.BOTH;
		gbc_btnK1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1500.gridx = 2;
		gbc_btnK1500.gridy = 12;
		panel.add(btnK1500, gbc_btnK1500);
		
		JButton btnK1530 = new JButton("");
		GridBagConstraints gbc_btnK1530 = new GridBagConstraints();
		gbc_btnK1530.fill = GridBagConstraints.BOTH;
		gbc_btnK1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnK1530.gridx = 2;
		gbc_btnK1530.gridy = 13;
		panel.add(btnK1530, gbc_btnK1530);

		//Botones Miércoles
		JButton btnM800 = new JButton("");
		GridBagConstraints gbc_btnM800 = new GridBagConstraints();
		gbc_btnM800.fill = GridBagConstraints.BOTH;
		gbc_btnM800.insets = new Insets(0, 0, 5, 5);
		gbc_btnM800.gridx = 3;
		gbc_btnM800.gridy = 1;
		panel.add(btnM800, gbc_btnM800);
		
		JButton btnM830 = new JButton("");
		GridBagConstraints gbc_btnM830 = new GridBagConstraints();
		gbc_btnM830.fill = GridBagConstraints.BOTH;
		gbc_btnM830.insets = new Insets(0, 0, 5, 5);
		gbc_btnM830.gridx = 3;
		gbc_btnM830.gridy = 2;
		panel.add(btnM830, gbc_btnM830);
		
		JButton btnM900 = new JButton("");
		GridBagConstraints gbc_btnM900 = new GridBagConstraints();
		gbc_btnM900.fill = GridBagConstraints.BOTH;
		gbc_btnM900.insets = new Insets(0, 0, 5, 5);
		gbc_btnM900.gridx = 3;
		gbc_btnM900.gridy = 3;
		panel.add(btnM900, gbc_btnM900);
		
		JButton btnM930 = new JButton("");
		GridBagConstraints gbc_btnM930 = new GridBagConstraints();
		gbc_btnM930.fill = GridBagConstraints.BOTH;
		gbc_btnM930.insets = new Insets(0, 0, 5, 5);
		gbc_btnM930.gridx = 3;
		gbc_btnM930.gridy = 4;
		panel.add(btnM930, gbc_btnM930);
		
		JButton btnM1000 = new JButton("");
		GridBagConstraints gbc_btnM1000 = new GridBagConstraints();
		gbc_btnM1000.fill = GridBagConstraints.BOTH;
		gbc_btnM1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1000.gridx = 3;
		gbc_btnM1000.gridy = 5;
		panel.add(btnM1000, gbc_btnM1000);
		
		JButton btnM1030 = new JButton("");
		GridBagConstraints gbc_btnM1030 = new GridBagConstraints();
		gbc_btnM1030.fill = GridBagConstraints.BOTH;
		gbc_btnM1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1030.gridx = 3;
		gbc_btnM1030.gridy = 6;
		panel.add(btnM1030, gbc_btnM1030);
		
		JButton btnM1300 = new JButton("");
		GridBagConstraints gbc_btnM1300 = new GridBagConstraints();
		gbc_btnM1300.fill = GridBagConstraints.BOTH;
		gbc_btnM1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1300.gridx = 3;
		gbc_btnM1300.gridy = 8;
		panel.add(btnM1300, gbc_btnM1300);
		
		JButton btnM1330 = new JButton("");
		GridBagConstraints gbc_btnM1330 = new GridBagConstraints();
		gbc_btnM1330.fill = GridBagConstraints.BOTH;
		gbc_btnM1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1330.gridx = 3;
		gbc_btnM1330.gridy = 9;
		panel.add(btnM1330, gbc_btnM1330);
		
		JButton btnM1400 = new JButton("");
		GridBagConstraints gbc_btnM1400 = new GridBagConstraints();
		gbc_btnM1400.fill = GridBagConstraints.BOTH;
		gbc_btnM1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1400.gridx = 3;
		gbc_btnM1400.gridy = 10;
		panel.add(btnM1400, gbc_btnM1400);
		
		JButton btnM1430 = new JButton("");
		GridBagConstraints gbc_btnM1430 = new GridBagConstraints();
		gbc_btnM1430.fill = GridBagConstraints.BOTH;
		gbc_btnM1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1430.gridx = 3;
		gbc_btnM1430.gridy = 11;
		panel.add(btnM1430, gbc_btnM1430);
		
		JButton btnM1500 = new JButton("");
		GridBagConstraints gbc_btnM1500 = new GridBagConstraints();
		gbc_btnM1500.fill = GridBagConstraints.BOTH;
		gbc_btnM1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1500.gridx = 3;
		gbc_btnM1500.gridy = 12;
		panel.add(btnM1500, gbc_btnM1500);
		
		JButton btnM1530 = new JButton("");
		GridBagConstraints gbc_btnM1530 = new GridBagConstraints();
		gbc_btnM1530.fill = GridBagConstraints.BOTH;
		gbc_btnM1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnM1530.gridx = 3;
		gbc_btnM1530.gridy = 13;
		panel.add(btnM1530, gbc_btnM1530);

		//Botones Jueves
		JButton btnJ800 = new JButton("");
		GridBagConstraints gbc_btnJ800 = new GridBagConstraints();
		gbc_btnJ800.fill = GridBagConstraints.BOTH;
		gbc_btnJ800.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ800.gridx = 4;
		gbc_btnJ800.gridy = 1;
		panel.add(btnJ800, gbc_btnJ800);
		
		JButton btnJ830 = new JButton("");
		GridBagConstraints gbc_btnJ830 = new GridBagConstraints();
		gbc_btnJ830.fill = GridBagConstraints.BOTH;
		gbc_btnJ830.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ830.gridx = 4;
		gbc_btnJ830.gridy = 2;
		panel.add(btnJ830, gbc_btnJ830);
		
		JButton btnJ900 = new JButton("");
		GridBagConstraints gbc_btnJ900 = new GridBagConstraints();
		gbc_btnJ900.fill = GridBagConstraints.BOTH;
		gbc_btnJ900.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ900.gridx = 4;
		gbc_btnJ900.gridy = 3;
		panel.add(btnJ900, gbc_btnJ900);
		
		JButton btnJ930 = new JButton("");
		GridBagConstraints gbc_btnJ930 = new GridBagConstraints();
		gbc_btnJ930.fill = GridBagConstraints.BOTH;
		gbc_btnJ930.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ930.gridx = 4;
		gbc_btnJ930.gridy = 4;
		panel.add(btnJ930, gbc_btnJ930);
		
		JButton btnJ1000 = new JButton("");
		GridBagConstraints gbc_btnJ1000 = new GridBagConstraints();
		gbc_btnJ1000.fill = GridBagConstraints.BOTH;
		gbc_btnJ1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1000.gridx = 4;
		gbc_btnJ1000.gridy = 5;
		panel.add(btnJ1000, gbc_btnJ1000);
		
		JButton btnJ1030 = new JButton("");
		GridBagConstraints gbc_btnJ1030 = new GridBagConstraints();
		gbc_btnJ1030.fill = GridBagConstraints.BOTH;
		gbc_btnJ1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1030.gridx = 4;
		gbc_btnJ1030.gridy = 6;
		panel.add(btnJ1030, gbc_btnJ1030);
		
		JButton btnJ1300 = new JButton("");
		GridBagConstraints gbc_btnJ1300 = new GridBagConstraints();
		gbc_btnJ1300.fill = GridBagConstraints.BOTH;
		gbc_btnJ1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1300.gridx = 4;
		gbc_btnJ1300.gridy = 8;
		panel.add(btnJ1300, gbc_btnJ1300);
		
		JButton btnJ1330 = new JButton("");
		GridBagConstraints gbc_btnJ1330 = new GridBagConstraints();
		gbc_btnJ1330.fill = GridBagConstraints.BOTH;
		gbc_btnJ1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1330.gridx = 4;
		gbc_btnJ1330.gridy = 9;
		panel.add(btnJ1330, gbc_btnJ1330);
		
		JButton btnJ1400 = new JButton("");
		GridBagConstraints gbc_btnJ1400 = new GridBagConstraints();
		gbc_btnJ1400.fill = GridBagConstraints.BOTH;
		gbc_btnJ1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1400.gridx = 4;
		gbc_btnJ1400.gridy = 10;
		panel.add(btnJ1400, gbc_btnJ1400);
		
		JButton btnJ1430 = new JButton("");
		GridBagConstraints gbc_btnJ1430 = new GridBagConstraints();
		gbc_btnJ1430.fill = GridBagConstraints.BOTH;
		gbc_btnJ1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1430.gridx = 4;
		gbc_btnJ1430.gridy = 11;
		panel.add(btnJ1430, gbc_btnJ1430);
		
		JButton btnJ1500 = new JButton("");
		GridBagConstraints gbc_btnJ1500 = new GridBagConstraints();
		gbc_btnJ1500.fill = GridBagConstraints.BOTH;
		gbc_btnJ1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1500.gridx = 4;
		gbc_btnJ1500.gridy = 12;
		panel.add(btnJ1500, gbc_btnJ1500);
		
		JButton btnJ1530 = new JButton("");
		GridBagConstraints gbc_btnJ1530 = new GridBagConstraints();
		gbc_btnJ1530.fill = GridBagConstraints.BOTH;
		gbc_btnJ1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnJ1530.gridx = 4;
		gbc_btnJ1530.gridy = 13;
		panel.add(btnJ1530, gbc_btnJ1530);

		//Botones Viernes
		JButton btnV800 = new JButton("");
		GridBagConstraints gbc_btnV800 = new GridBagConstraints();
		gbc_btnV800.fill = GridBagConstraints.BOTH;
		gbc_btnV800.insets = new Insets(0, 0, 5, 5);
		gbc_btnV800.gridx = 5;
		gbc_btnV800.gridy = 1;
		panel.add(btnV800, gbc_btnV800);
		
		JButton btnV830 = new JButton("");
		GridBagConstraints gbc_btnV830 = new GridBagConstraints();
		gbc_btnV830.fill = GridBagConstraints.BOTH;
		gbc_btnV830.insets = new Insets(0, 0, 5, 5);
		gbc_btnV830.gridx = 5;
		gbc_btnV830.gridy = 2;
		panel.add(btnV830, gbc_btnV830);
		
		JButton btnV900 = new JButton("");
		GridBagConstraints gbc_btnV900 = new GridBagConstraints();
		gbc_btnV900.fill = GridBagConstraints.BOTH;
		gbc_btnV900.insets = new Insets(0, 0, 5, 5);
		gbc_btnV900.gridx = 5;
		gbc_btnV900.gridy = 3;
		panel.add(btnV900, gbc_btnV900);
		
		JButton btnV930 = new JButton("");
		GridBagConstraints gbc_btnV930 = new GridBagConstraints();
		gbc_btnV930.fill = GridBagConstraints.BOTH;
		gbc_btnV930.insets = new Insets(0, 0, 5, 5);
		gbc_btnV930.gridx = 5;
		gbc_btnV930.gridy = 4;
		panel.add(btnV930, gbc_btnV930);
		
		JButton btnV1000 = new JButton("");
		GridBagConstraints gbc_btnV1000 = new GridBagConstraints();
		gbc_btnV1000.fill = GridBagConstraints.BOTH;
		gbc_btnV1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1000.gridx = 5;
		gbc_btnV1000.gridy = 5;
		panel.add(btnV1000, gbc_btnV1000);
		
		JButton btnV1030 = new JButton("");
		GridBagConstraints gbc_btnV1030 = new GridBagConstraints();
		gbc_btnV1030.fill = GridBagConstraints.BOTH;
		gbc_btnV1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1030.gridx = 5;
		gbc_btnV1030.gridy = 6;
		panel.add(btnV1030, gbc_btnV1030);
		
		JButton btnV1300 = new JButton("");
		GridBagConstraints gbc_btnV1300 = new GridBagConstraints();
		gbc_btnV1300.fill = GridBagConstraints.BOTH;
		gbc_btnV1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1300.gridx = 5;
		gbc_btnV1300.gridy = 8;
		panel.add(btnV1300, gbc_btnV1300);
		
		JButton btnV1330 = new JButton("");
		GridBagConstraints gbc_btnV1330 = new GridBagConstraints();
		gbc_btnV1330.fill = GridBagConstraints.BOTH;
		gbc_btnV1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1330.gridx = 5;
		gbc_btnV1330.gridy = 9;
		panel.add(btnV1330, gbc_btnV1330);
		
		JButton btnV1400 = new JButton("");
		GridBagConstraints gbc_btnV1400 = new GridBagConstraints();
		gbc_btnV1400.fill = GridBagConstraints.BOTH;
		gbc_btnV1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1400.gridx = 5;
		gbc_btnV1400.gridy = 10;
		panel.add(btnV1400, gbc_btnV1400);
		
		JButton btnV1430 = new JButton("");
		GridBagConstraints gbc_btnV1430 = new GridBagConstraints();
		gbc_btnV1430.fill = GridBagConstraints.BOTH;
		gbc_btnV1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1430.gridx = 5;
		gbc_btnV1430.gridy = 11;
		panel.add(btnV1430, gbc_btnV1430);
		
		JButton btnV1500 = new JButton("");
		GridBagConstraints gbc_btnV1500 = new GridBagConstraints();
		gbc_btnV1500.fill = GridBagConstraints.BOTH;
		gbc_btnV1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1500.gridx = 5;
		gbc_btnV1500.gridy = 12;
		panel.add(btnV1500, gbc_btnV1500);
		
		JButton btnV1530 = new JButton("");
		GridBagConstraints gbc_btnV1530 = new GridBagConstraints();
		gbc_btnV1530.fill = GridBagConstraints.BOTH;
		gbc_btnV1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnV1530.gridx = 5;
		gbc_btnV1530.gridy = 13;
		panel.add(btnV1530, gbc_btnV1530);

		/**** BOTON REGRESAR ****/
		JPanel regresar = new JPanel();
		regresar.setOpaque(false);
		regresar.setBounds(77, 608, 71, 58);
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
		
		
		JButton btnRegresar = new JButton("");
		btnRegresar.setRequestFocusEnabled(false);
		btnRegresar.setOpaque(false);
		regresar.add(btnRegresar, BorderLayout.CENTER);
		btnRegresar.setContentAreaFilled(false);
		btnRegresar.setBorderPainted(false);
		
		
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(letra2);
		lblRegresar.setBounds(151, 620, 98, 25);
		getContentPane().add(lblRegresar);

	}
}
