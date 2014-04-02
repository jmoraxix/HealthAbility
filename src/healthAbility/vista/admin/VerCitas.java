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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JoséDavid 02/04/2014
 */
@SuppressWarnings("serial")
public class VerCitas extends VentanaBase {
	
	private Font letra1 = HealthAbility.getLetraTitulo1(), letra2 = HealthAbility.getLetraTexto2(), letra3 = HealthAbility.getLetraTexto3();
	private String codDoc, clinica;
	private JButton btnL800, btnL830, btnL900, btnL930, btnL1000, btnL1030, btnL1300, btnL1330, btnL1400, btnL1430, btnL1500, btnL1530,
		btnK800, btnK830, btnK900, btnK930, btnK1000, btnK1030, btnK1300, btnK1330, btnK1400, btnK1430, btnK1500, btnK1530,
		btnM800, btnM830, btnM900, btnM930, btnM1000, btnM1030, btnM1300, btnM1330, btnM1400, btnM1430, btnM1500, btnM1530,
		btnJ800, btnJ830, btnJ900, btnJ930, btnJ1000, btnJ1030, btnJ1300, btnJ1330, btnJ1400, btnJ1430, btnJ1500, btnJ1530,
		btnV800, btnV830, btnV900, btnV930, btnV1000, btnV1030, btnV1300, btnV1330, btnV1400, btnV1430, btnV1500, btnV1530;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	/**
	 * Create the frame.
	 */
	public VerCitas(String doc, String clin) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.codDoc = doc;
		this.clinica = clin;
		
		/**** Declaración del panel ****/
		JPanel panelBnts = new JPanel();
		panelBnts.setOpaque(false);
		panelBnts.setBounds(77, 223, 781, 374);
		getContentPane().add(panelBnts);
		GridBagLayout gbl_panelBnts = new GridBagLayout();
		gbl_panelBnts.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelBnts.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelBnts.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelBnts.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panelBnts.setLayout(gbl_panelBnts);

		JLabel lblVerCitas = new JLabel("Ver citas");
		lblVerCitas.setFont(letra1);
		lblVerCitas.setBounds(77, 152, 165, 44);
		getContentPane().add(lblVerCitas);
		
		JLabel lblSeleccioneUnDoctor = new JLabel("Doctor:");
		lblSeleccioneUnDoctor.setFont(letra2);
		lblSeleccioneUnDoctor.setBounds(534, 152, 78, 25);
		getContentPane().add(lblSeleccioneUnDoctor);
		
		JLabel lblSeleccioneUnaClnica = new JLabel("Cl\u00EDnica:");
		lblSeleccioneUnaClnica.setFont(letra2);
		lblSeleccioneUnaClnica.setBounds(534, 182, 78, 25);
		getContentPane().add(lblSeleccioneUnaClnica);
		
		/**** Declaración de etiquetas ****/
		JLabel lblLunes = new JLabel("Lunes");
		GridBagConstraints gbc_lblLunes = new GridBagConstraints();
		gbc_lblLunes.insets = new Insets(0, 0, 5, 5);
		gbc_lblLunes.gridx = 1;
		gbc_lblLunes.gridy = 0;
		panelBnts.add(lblLunes, gbc_lblLunes);
		
		JLabel lblMartes = new JLabel("Martes");
		GridBagConstraints gbc_lblMartes = new GridBagConstraints();
		gbc_lblMartes.insets = new Insets(0, 0, 5, 5);
		gbc_lblMartes.gridx = 2;
		gbc_lblMartes.gridy = 0;
		panelBnts.add(lblMartes, gbc_lblMartes);
		
		JLabel lblMiercoles = new JLabel("Mi\u00E9rcoles");
		GridBagConstraints gbc_lblMiercoles = new GridBagConstraints();
		gbc_lblMiercoles.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiercoles.gridx = 3;
		gbc_lblMiercoles.gridy = 0;
		panelBnts.add(lblMiercoles, gbc_lblMiercoles);
		
		JLabel lblJueves = new JLabel("Jueves");
		GridBagConstraints gbc_lblJueves = new GridBagConstraints();
		gbc_lblJueves.insets = new Insets(0, 0, 5, 5);
		gbc_lblJueves.gridx = 4;
		gbc_lblJueves.gridy = 0;
		panelBnts.add(lblJueves, gbc_lblJueves);
		
		JLabel lblViernes = new JLabel("Viernes");
		GridBagConstraints gbc_lblViernes = new GridBagConstraints();
		gbc_lblViernes.insets = new Insets(0, 0, 5, 0);
		gbc_lblViernes.gridx = 5;
		gbc_lblViernes.gridy = 0;
		panelBnts.add(lblViernes, gbc_lblViernes);
		
		JLabel lblAm = new JLabel("8:00 am");
		GridBagConstraints gbc_lblAm = new GridBagConstraints();
		gbc_lblAm.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm.gridx = 0;
		gbc_lblAm.gridy = 1;
		panelBnts.add(lblAm, gbc_lblAm);
		
		JLabel lblam_1 = new JLabel("8:30 am");
		GridBagConstraints gbc_lblam_1 = new GridBagConstraints();
		gbc_lblam_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblam_1.gridx = 0;
		gbc_lblam_1.gridy = 2;
		panelBnts.add(lblam_1, gbc_lblam_1);
		
		JLabel lblam = new JLabel("9:00 am");
		GridBagConstraints gbc_lblam = new GridBagConstraints();
		gbc_lblam.insets = new Insets(0, 0, 5, 5);
		gbc_lblam.gridx = 0;
		gbc_lblam.gridy = 3;
		panelBnts.add(lblam, gbc_lblam);
		
		JLabel lblAm_1 = new JLabel("9:30 am");
		GridBagConstraints gbc_lblAm_1 = new GridBagConstraints();
		gbc_lblAm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm_1.gridx = 0;
		gbc_lblAm_1.gridy = 4;
		panelBnts.add(lblAm_1, gbc_lblAm_1);
		
		JLabel lblAm_2 = new JLabel("10:00 am");
		GridBagConstraints gbc_lblAm_2 = new GridBagConstraints();
		gbc_lblAm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm_2.gridx = 0;
		gbc_lblAm_2.gridy = 5;
		panelBnts.add(lblAm_2, gbc_lblAm_2);
		
		JLabel lblAm_3 = new JLabel("10:30 am");
		GridBagConstraints gbc_lblAm_3 = new GridBagConstraints();
		gbc_lblAm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblAm_3.gridx = 0;
		gbc_lblAm_3.gridy = 6;
		panelBnts.add(lblAm_3, gbc_lblAm_3);
		
		JLabel lblPm = new JLabel("1:00 pm");
		GridBagConstraints gbc_lblPm = new GridBagConstraints();
		gbc_lblPm.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm.gridx = 0;
		gbc_lblPm.gridy = 8;
		panelBnts.add(lblPm, gbc_lblPm);
		
		JLabel lblPm_1 = new JLabel("1:30 pm");
		GridBagConstraints gbc_lblPm_1 = new GridBagConstraints();
		gbc_lblPm_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_1.gridx = 0;
		gbc_lblPm_1.gridy = 9;
		panelBnts.add(lblPm_1, gbc_lblPm_1);
		
		JLabel lblPm_2 = new JLabel("2:00 pm");
		GridBagConstraints gbc_lblPm_2 = new GridBagConstraints();
		gbc_lblPm_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_2.gridx = 0;
		gbc_lblPm_2.gridy = 10;
		panelBnts.add(lblPm_2, gbc_lblPm_2);
		
		JLabel lblpm = new JLabel("2:30 pm");
		GridBagConstraints gbc_lblpm = new GridBagConstraints();
		gbc_lblpm.insets = new Insets(0, 0, 5, 5);
		gbc_lblpm.gridx = 0;
		gbc_lblpm.gridy = 11;
		panelBnts.add(lblpm, gbc_lblpm);
		
		JLabel lblPm_3 = new JLabel("3:00 pm");
		GridBagConstraints gbc_lblPm_3 = new GridBagConstraints();
		gbc_lblPm_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblPm_3.gridx = 0;
		gbc_lblPm_3.gridy = 12;
		panelBnts.add(lblPm_3, gbc_lblPm_3);
		
		JLabel lblPm_4 = new JLabel("3:30 pm");
		GridBagConstraints gbc_lblPm_4 = new GridBagConstraints();
		gbc_lblPm_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblPm_4.gridx = 0;
		gbc_lblPm_4.gridy = 13;
		panelBnts.add(lblPm_4, gbc_lblPm_4);
		

		/**** BOTONES DE LAS CITAS ****/ 
		//Botones Lunes
		btnL800 = new JButton("");
		btnL800.setEnabled(false);
		buttonGroup.add(btnL800);
		btnL800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL800 = new GridBagConstraints();
		gbc_btnL800.fill = GridBagConstraints.BOTH;
		gbc_btnL800.insets = new Insets(0, 0, 5, 5);
		gbc_btnL800.gridx = 1;
		gbc_btnL800.gridy = 1;
		panelBnts.add(btnL800, gbc_btnL800);
		
		btnL830 = new JButton("");
		btnL830.setEnabled(false);
		buttonGroup.add(btnL830);
		btnL830.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnL830 = new GridBagConstraints();
		gbc_btnL830.fill = GridBagConstraints.BOTH;
		gbc_btnL830.insets = new Insets(0, 0, 5, 5);
		gbc_btnL830.gridx = 1;
		gbc_btnL830.gridy = 2;
		panelBnts.add(btnL830, gbc_btnL830);
		
		btnL900 = new JButton("");
		btnL900.setEnabled(false);
		buttonGroup.add(btnL900);
		btnL900.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL900 = new GridBagConstraints();
		gbc_btnL900.fill = GridBagConstraints.BOTH;
		gbc_btnL900.insets = new Insets(0, 0, 5, 5);
		gbc_btnL900.gridx = 1;
		gbc_btnL900.gridy = 3;
		panelBnts.add(btnL900, gbc_btnL900);
		
		btnL930 = new JButton("");
		btnL930.setEnabled(false);
		buttonGroup.add(btnL930);
		btnL930.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL930 = new GridBagConstraints();
		gbc_btnL930.fill = GridBagConstraints.BOTH;
		gbc_btnL930.insets = new Insets(0, 0, 5, 5);
		gbc_btnL930.gridx = 1;
		gbc_btnL930.gridy = 4;
		panelBnts.add(btnL930, gbc_btnL930);
		
		btnL1000 = new JButton("");
		btnL1000.setEnabled(false);
		buttonGroup.add(btnL1000);
		btnL1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1000 = new GridBagConstraints();
		gbc_btnL1000.fill = GridBagConstraints.BOTH;
		gbc_btnL1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1000.gridx = 1;
		gbc_btnL1000.gridy = 5;
		panelBnts.add(btnL1000, gbc_btnL1000);
		
		btnL1030 = new JButton("");
		btnL1030.setEnabled(false);
		buttonGroup.add(btnL1030);
		btnL1030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1030 = new GridBagConstraints();
		gbc_btnL1030.fill = GridBagConstraints.BOTH;
		gbc_btnL1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1030.gridx = 1;
		gbc_btnL1030.gridy = 6;
		panelBnts.add(btnL1030, gbc_btnL1030);
		
		btnL1300 = new JButton("");
		btnL1300.setEnabled(false);
		buttonGroup.add(btnL1300);
		btnL1300.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1300 = new GridBagConstraints();
		gbc_btnL1300.fill = GridBagConstraints.BOTH;
		gbc_btnL1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1300.gridx = 1;
		gbc_btnL1300.gridy = 8;
		panelBnts.add(btnL1300, gbc_btnL1300);
		
		btnL1330 = new JButton("");
		btnL1330.setEnabled(false);
		buttonGroup.add(btnL1330);
		btnL1330.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1330 = new GridBagConstraints();
		gbc_btnL1330.fill = GridBagConstraints.BOTH;
		gbc_btnL1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1330.gridx = 1;
		gbc_btnL1330.gridy = 9;
		panelBnts.add(btnL1330, gbc_btnL1330);
		
		btnL1400 = new JButton("");
		btnL1400.setEnabled(false);
		buttonGroup.add(btnL1400);
		btnL1400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1400 = new GridBagConstraints();
		gbc_btnL1400.fill = GridBagConstraints.BOTH;
		gbc_btnL1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1400.gridx = 1;
		gbc_btnL1400.gridy = 10;
		panelBnts.add(btnL1400, gbc_btnL1400);
		
		btnL1430 = new JButton("");
		btnL1430.setEnabled(false);
		buttonGroup.add(btnL1430);
		btnL1430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1430 = new GridBagConstraints();
		gbc_btnL1430.fill = GridBagConstraints.BOTH;
		gbc_btnL1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1430.gridx = 1;
		gbc_btnL1430.gridy = 11;
		panelBnts.add(btnL1430, gbc_btnL1430);
		
		btnL1500 = new JButton("");
		btnL1500.setEnabled(false);
		buttonGroup.add(btnL1500);
		btnL1500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1500 = new GridBagConstraints();
		gbc_btnL1500.fill = GridBagConstraints.BOTH;
		gbc_btnL1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnL1500.gridx = 1;
		gbc_btnL1500.gridy = 12;
		panelBnts.add(btnL1500, gbc_btnL1500);
		
		btnL1530 = new JButton("");
		btnL1530.setEnabled(false);
		buttonGroup.add(btnL1530);
		btnL1530.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnL1530 = new GridBagConstraints();
		gbc_btnL1530.fill = GridBagConstraints.BOTH;
		gbc_btnL1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnL1530.gridx = 1;
		gbc_btnL1530.gridy = 13;
		panelBnts.add(btnL1530, gbc_btnL1530);
	
		//Botones Martes
		btnK800 = new JButton("");
		btnK800.setEnabled(false);
		buttonGroup.add(btnK800);
		btnK800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK800 = new GridBagConstraints();
		gbc_btnK800.fill = GridBagConstraints.BOTH;
		gbc_btnK800.insets = new Insets(0, 0, 5, 5);
		gbc_btnK800.gridx = 2;
		gbc_btnK800.gridy = 1;
		panelBnts.add(btnK800, gbc_btnK800);
		
		btnK830 = new JButton("");
		btnK830.setEnabled(false);
		buttonGroup.add(btnK830);
		btnK830.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK830 = new GridBagConstraints();
		gbc_btnK830.fill = GridBagConstraints.BOTH;
		gbc_btnK830.insets = new Insets(0, 0, 5, 5);
		gbc_btnK830.gridx = 2;
		gbc_btnK830.gridy = 2;
		panelBnts.add(btnK830, gbc_btnK830);
		
		btnK900 = new JButton("");
		btnK900.setEnabled(false);
		buttonGroup.add(btnK900);
		btnK900.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK900 = new GridBagConstraints();
		gbc_btnK900.fill = GridBagConstraints.BOTH;
		gbc_btnK900.insets = new Insets(0, 0, 5, 5);
		gbc_btnK900.gridx = 2;
		gbc_btnK900.gridy = 3;
		panelBnts.add(btnK900, gbc_btnK900);
		
		btnK930 = new JButton("");
		btnK930.setEnabled(false);
		buttonGroup.add(btnK930);
		btnK930.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK930 = new GridBagConstraints();
		gbc_btnK930.fill = GridBagConstraints.BOTH;
		gbc_btnK930.insets = new Insets(0, 0, 5, 5);
		gbc_btnK930.gridx = 2;
		gbc_btnK930.gridy = 4;
		panelBnts.add(btnK930, gbc_btnK930);
		
		btnK1000 = new JButton("");
		btnK1000.setEnabled(false);
		buttonGroup.add(btnK1000);
		btnK1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnK1000 = new GridBagConstraints();
		gbc_btnK1000.fill = GridBagConstraints.BOTH;
		gbc_btnK1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1000.gridx = 2;
		gbc_btnK1000.gridy = 5;
		panelBnts.add(btnK1000, gbc_btnK1000);
		
		btnK1030 = new JButton("");
		btnK1030.setEnabled(false);
		buttonGroup.add(btnK1030);
		btnK1030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK1030 = new GridBagConstraints();
		gbc_btnK1030.fill = GridBagConstraints.BOTH;
		gbc_btnK1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1030.gridx = 2;
		gbc_btnK1030.gridy = 6;
		panelBnts.add(btnK1030, gbc_btnK1030);
		
		btnK1300 = new JButton("");
		btnK1300.setEnabled(false);
		buttonGroup.add(btnK1300);
		btnK1300.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK1300 = new GridBagConstraints();
		gbc_btnK1300.fill = GridBagConstraints.BOTH;
		gbc_btnK1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1300.gridx = 2;
		gbc_btnK1300.gridy = 8;
		panelBnts.add(btnK1300, gbc_btnK1300);
		
		btnK1330 = new JButton("");
		btnK1330.setEnabled(false);
		buttonGroup.add(btnK1330);
		btnK1330.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK1330 = new GridBagConstraints();
		gbc_btnK1330.fill = GridBagConstraints.BOTH;
		gbc_btnK1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1330.gridx = 2;
		gbc_btnK1330.gridy = 9;
		panelBnts.add(btnK1330, gbc_btnK1330);
		
		btnK1400 = new JButton("");
		btnK1400.setEnabled(false);
		buttonGroup.add(btnK1400);
		btnK1400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnK1400 = new GridBagConstraints();
		gbc_btnK1400.fill = GridBagConstraints.BOTH;
		gbc_btnK1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1400.gridx = 2;
		gbc_btnK1400.gridy = 10;
		panelBnts.add(btnK1400, gbc_btnK1400);
		
		btnK1430 = new JButton("");
		btnK1430.setEnabled(false);
		buttonGroup.add(btnK1430);
		btnK1430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK1430 = new GridBagConstraints();
		gbc_btnK1430.fill = GridBagConstraints.BOTH;
		gbc_btnK1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1430.gridx = 2;
		gbc_btnK1430.gridy = 11;
		panelBnts.add(btnK1430, gbc_btnK1430);
		
		btnK1500 = new JButton("");
		btnK1500.setEnabled(false);
		buttonGroup.add(btnK1500);
		btnK1500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK1500 = new GridBagConstraints();
		gbc_btnK1500.fill = GridBagConstraints.BOTH;
		gbc_btnK1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnK1500.gridx = 2;
		gbc_btnK1500.gridy = 12;
		panelBnts.add(btnK1500, gbc_btnK1500);
		
		btnK1530 = new JButton("");
		btnK1530.setEnabled(false);
		buttonGroup.add(btnK1530);
		btnK1530.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnK1530 = new GridBagConstraints();
		gbc_btnK1530.fill = GridBagConstraints.BOTH;
		gbc_btnK1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnK1530.gridx = 2;
		gbc_btnK1530.gridy = 13;
		panelBnts.add(btnK1530, gbc_btnK1530);

		//Botones Miércoles
		btnM800 = new JButton("");
		btnM800.setEnabled(false);
		buttonGroup.add(btnM800);
		btnM800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM800 = new GridBagConstraints();
		gbc_btnM800.fill = GridBagConstraints.BOTH;
		gbc_btnM800.insets = new Insets(0, 0, 5, 5);
		gbc_btnM800.gridx = 3;
		gbc_btnM800.gridy = 1;
		panelBnts.add(btnM800, gbc_btnM800);
		
		btnM830 = new JButton("");
		btnM830.setEnabled(false);
		buttonGroup.add(btnM830);
		btnM830.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM830 = new GridBagConstraints();
		gbc_btnM830.fill = GridBagConstraints.BOTH;
		gbc_btnM830.insets = new Insets(0, 0, 5, 5);
		gbc_btnM830.gridx = 3;
		gbc_btnM830.gridy = 2;
		panelBnts.add(btnM830, gbc_btnM830);
		
		btnM900 = new JButton("");
		btnM900.setEnabled(false);
		buttonGroup.add(btnM900);
		btnM900.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnM900 = new GridBagConstraints();
		gbc_btnM900.fill = GridBagConstraints.BOTH;
		gbc_btnM900.insets = new Insets(0, 0, 5, 5);
		gbc_btnM900.gridx = 3;
		gbc_btnM900.gridy = 3;
		panelBnts.add(btnM900, gbc_btnM900);
		
		btnM930 = new JButton("");
		btnM930.setEnabled(false);
		buttonGroup.add(btnM930);
		btnM930.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM930 = new GridBagConstraints();
		gbc_btnM930.fill = GridBagConstraints.BOTH;
		gbc_btnM930.insets = new Insets(0, 0, 5, 5);
		gbc_btnM930.gridx = 3;
		gbc_btnM930.gridy = 4;
		panelBnts.add(btnM930, gbc_btnM930);
		
		btnM1000 = new JButton("");
		btnM1000.setEnabled(false);
		buttonGroup.add(btnM1000);
		btnM1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1000 = new GridBagConstraints();
		gbc_btnM1000.fill = GridBagConstraints.BOTH;
		gbc_btnM1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1000.gridx = 3;
		gbc_btnM1000.gridy = 5;
		panelBnts.add(btnM1000, gbc_btnM1000);
		
		btnM1030 = new JButton("");
		btnM1030.setEnabled(false);
		buttonGroup.add(btnM1030);
		btnM1030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1030 = new GridBagConstraints();
		gbc_btnM1030.fill = GridBagConstraints.BOTH;
		gbc_btnM1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1030.gridx = 3;
		gbc_btnM1030.gridy = 6;
		panelBnts.add(btnM1030, gbc_btnM1030);
		
		btnM1300 = new JButton("");
		btnM1300.setEnabled(false);
		buttonGroup.add(btnM1300);
		btnM1300.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1300 = new GridBagConstraints();
		gbc_btnM1300.fill = GridBagConstraints.BOTH;
		gbc_btnM1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1300.gridx = 3;
		gbc_btnM1300.gridy = 8;
		panelBnts.add(btnM1300, gbc_btnM1300);
		
		btnM1330 = new JButton("");
		btnM1330.setEnabled(false);
		buttonGroup.add(btnM1330);
		btnM1330.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1330 = new GridBagConstraints();
		gbc_btnM1330.fill = GridBagConstraints.BOTH;
		gbc_btnM1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1330.gridx = 3;
		gbc_btnM1330.gridy = 9;
		panelBnts.add(btnM1330, gbc_btnM1330);
		
		btnM1400 = new JButton("");
		btnM1400.setEnabled(false);
		buttonGroup.add(btnM1400);
		btnM1400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1400 = new GridBagConstraints();
		gbc_btnM1400.fill = GridBagConstraints.BOTH;
		gbc_btnM1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1400.gridx = 3;
		gbc_btnM1400.gridy = 10;
		panelBnts.add(btnM1400, gbc_btnM1400);
		
		btnM1430 = new JButton("");
		btnM1430.setEnabled(false);
		buttonGroup.add(btnM1430);
		btnM1430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1430 = new GridBagConstraints();
		gbc_btnM1430.fill = GridBagConstraints.BOTH;
		gbc_btnM1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1430.gridx = 3;
		gbc_btnM1430.gridy = 11;
		panelBnts.add(btnM1430, gbc_btnM1430);
		
		btnM1500 = new JButton("");
		btnM1500.setEnabled(false);
		buttonGroup.add(btnM1500);
		btnM1500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1500 = new GridBagConstraints();
		gbc_btnM1500.fill = GridBagConstraints.BOTH;
		gbc_btnM1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnM1500.gridx = 3;
		gbc_btnM1500.gridy = 12;
		panelBnts.add(btnM1500, gbc_btnM1500);
		
		btnM1530 = new JButton("");
		btnM1530.setEnabled(false);
		buttonGroup.add(btnM1530);
		btnM1530.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnM1530 = new GridBagConstraints();
		gbc_btnM1530.fill = GridBagConstraints.BOTH;
		gbc_btnM1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnM1530.gridx = 3;
		gbc_btnM1530.gridy = 13;
		panelBnts.add(btnM1530, gbc_btnM1530);

		//Botones Jueves
		btnJ800 = new JButton("");
		btnJ800.setEnabled(false);
		buttonGroup.add(btnJ800);
		btnJ800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ800 = new GridBagConstraints();
		gbc_btnJ800.fill = GridBagConstraints.BOTH;
		gbc_btnJ800.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ800.gridx = 4;
		gbc_btnJ800.gridy = 1;
		panelBnts.add(btnJ800, gbc_btnJ800);
		
		btnJ830 = new JButton("");
		btnJ830.setEnabled(false);
		buttonGroup.add(btnJ830);
		btnJ830.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ830 = new GridBagConstraints();
		gbc_btnJ830.fill = GridBagConstraints.BOTH;
		gbc_btnJ830.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ830.gridx = 4;
		gbc_btnJ830.gridy = 2;
		panelBnts.add(btnJ830, gbc_btnJ830);
		
		btnJ900 = new JButton("");
		btnJ900.setEnabled(false);
		buttonGroup.add(btnJ900);
		btnJ900.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ900 = new GridBagConstraints();
		gbc_btnJ900.fill = GridBagConstraints.BOTH;
		gbc_btnJ900.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ900.gridx = 4;
		gbc_btnJ900.gridy = 3;
		panelBnts.add(btnJ900, gbc_btnJ900);
		
		btnJ930 = new JButton("");
		btnJ930.setEnabled(false);
		buttonGroup.add(btnJ930);
		btnJ930.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ930 = new GridBagConstraints();
		gbc_btnJ930.fill = GridBagConstraints.BOTH;
		gbc_btnJ930.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ930.gridx = 4;
		gbc_btnJ930.gridy = 4;
		panelBnts.add(btnJ930, gbc_btnJ930);
		
		btnJ1000 = new JButton("");
		btnJ1000.setEnabled(false);
		buttonGroup.add(btnJ1000);
		btnJ1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1000 = new GridBagConstraints();
		gbc_btnJ1000.fill = GridBagConstraints.BOTH;
		gbc_btnJ1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1000.gridx = 4;
		gbc_btnJ1000.gridy = 5;
		panelBnts.add(btnJ1000, gbc_btnJ1000);
		
		btnJ1030 = new JButton("");
		btnJ1030.setEnabled(false);
		buttonGroup.add(btnJ1030);
		btnJ1030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1030 = new GridBagConstraints();
		gbc_btnJ1030.fill = GridBagConstraints.BOTH;
		gbc_btnJ1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1030.gridx = 4;
		gbc_btnJ1030.gridy = 6;
		panelBnts.add(btnJ1030, gbc_btnJ1030);
		
		btnJ1300 = new JButton("");
		btnJ1300.setEnabled(false);
		buttonGroup.add(btnJ1300);
		btnJ1300.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1300 = new GridBagConstraints();
		gbc_btnJ1300.fill = GridBagConstraints.BOTH;
		gbc_btnJ1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1300.gridx = 4;
		gbc_btnJ1300.gridy = 8;
		panelBnts.add(btnJ1300, gbc_btnJ1300);
		
		btnJ1330 = new JButton("");
		btnJ1330.setEnabled(false);
		buttonGroup.add(btnJ1330);
		btnJ1330.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1330 = new GridBagConstraints();
		gbc_btnJ1330.fill = GridBagConstraints.BOTH;
		gbc_btnJ1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1330.gridx = 4;
		gbc_btnJ1330.gridy = 9;
		panelBnts.add(btnJ1330, gbc_btnJ1330);
		
		btnJ1400 = new JButton("");
		btnJ1400.setEnabled(false);
		buttonGroup.add(btnJ1400);
		btnJ1400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1400 = new GridBagConstraints();
		gbc_btnJ1400.fill = GridBagConstraints.BOTH;
		gbc_btnJ1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1400.gridx = 4;
		gbc_btnJ1400.gridy = 10;
		panelBnts.add(btnJ1400, gbc_btnJ1400);
		
		btnJ1430 = new JButton("");
		btnJ1430.setEnabled(false);
		buttonGroup.add(btnJ1430);
		btnJ1430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1430 = new GridBagConstraints();
		gbc_btnJ1430.fill = GridBagConstraints.BOTH;
		gbc_btnJ1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1430.gridx = 4;
		gbc_btnJ1430.gridy = 11;
		panelBnts.add(btnJ1430, gbc_btnJ1430);
		
		btnJ1500 = new JButton("");
		btnJ1500.setEnabled(false);
		buttonGroup.add(btnJ1500);
		btnJ1500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1500 = new GridBagConstraints();
		gbc_btnJ1500.fill = GridBagConstraints.BOTH;
		gbc_btnJ1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnJ1500.gridx = 4;
		gbc_btnJ1500.gridy = 12;
		panelBnts.add(btnJ1500, gbc_btnJ1500);
		
		btnJ1530 = new JButton("");
		btnJ1530.setEnabled(false);
		buttonGroup.add(btnJ1530);
		btnJ1530.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnJ1530 = new GridBagConstraints();
		gbc_btnJ1530.fill = GridBagConstraints.BOTH;
		gbc_btnJ1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnJ1530.gridx = 4;
		gbc_btnJ1530.gridy = 13;
		panelBnts.add(btnJ1530, gbc_btnJ1530);

		//Botones Viernes
		btnV800 = new JButton("");
		btnV800.setEnabled(false);
		buttonGroup.add(btnV800);
		btnV800.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnV800 = new GridBagConstraints();
		gbc_btnV800.fill = GridBagConstraints.BOTH;
		gbc_btnV800.insets = new Insets(0, 0, 5, 5);
		gbc_btnV800.gridx = 5;
		gbc_btnV800.gridy = 1;
		panelBnts.add(btnV800, gbc_btnV800);
		
		btnV830 = new JButton("");
		btnV830.setEnabled(false);
		buttonGroup.add(btnV830);
		btnV830.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV830 = new GridBagConstraints();
		gbc_btnV830.fill = GridBagConstraints.BOTH;
		gbc_btnV830.insets = new Insets(0, 0, 5, 5);
		gbc_btnV830.gridx = 5;
		gbc_btnV830.gridy = 2;
		panelBnts.add(btnV830, gbc_btnV830);
		
		btnV900 = new JButton("");
		btnV900.setEnabled(false);
		buttonGroup.add(btnV900);
		btnV900.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV900 = new GridBagConstraints();
		gbc_btnV900.fill = GridBagConstraints.BOTH;
		gbc_btnV900.insets = new Insets(0, 0, 5, 5);
		gbc_btnV900.gridx = 5;
		gbc_btnV900.gridy = 3;
		panelBnts.add(btnV900, gbc_btnV900);
		
		btnV930 = new JButton("");
		btnV930.setEnabled(false);
		buttonGroup.add(btnV930);
		btnV930.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV930 = new GridBagConstraints();
		gbc_btnV930.fill = GridBagConstraints.BOTH;
		gbc_btnV930.insets = new Insets(0, 0, 5, 5);
		gbc_btnV930.gridx = 5;
		gbc_btnV930.gridy = 4;
		panelBnts.add(btnV930, gbc_btnV930);
		
		btnV1000 = new JButton("");
		btnV1000.setEnabled(false);
		buttonGroup.add(btnV1000);
		btnV1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnV1000 = new GridBagConstraints();
		gbc_btnV1000.fill = GridBagConstraints.BOTH;
		gbc_btnV1000.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1000.gridx = 5;
		gbc_btnV1000.gridy = 5;
		panelBnts.add(btnV1000, gbc_btnV1000);
		
		btnV1030 = new JButton("");
		btnV1030.setEnabled(false);
		buttonGroup.add(btnV1030);
		btnV1030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV1030 = new GridBagConstraints();
		gbc_btnV1030.fill = GridBagConstraints.BOTH;
		gbc_btnV1030.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1030.gridx = 5;
		gbc_btnV1030.gridy = 6;
		panelBnts.add(btnV1030, gbc_btnV1030);
		
		btnV1300 = new JButton("");
		btnV1300.setEnabled(false);
		buttonGroup.add(btnV1300);
		btnV1300.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnV1300 = new GridBagConstraints();
		gbc_btnV1300.fill = GridBagConstraints.BOTH;
		gbc_btnV1300.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1300.gridx = 5;
		gbc_btnV1300.gridy = 8;
		panelBnts.add(btnV1300, gbc_btnV1300);
		
		btnV1330 = new JButton("");
		btnV1330.setEnabled(false);
		buttonGroup.add(btnV1330);
		btnV1330.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV1330 = new GridBagConstraints();
		gbc_btnV1330.fill = GridBagConstraints.BOTH;
		gbc_btnV1330.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1330.gridx = 5;
		gbc_btnV1330.gridy = 9;
		panelBnts.add(btnV1330, gbc_btnV1330);
		
		btnV1400 = new JButton("");
		btnV1400.setEnabled(false);
		buttonGroup.add(btnV1400);
		btnV1400.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV1400 = new GridBagConstraints();
		gbc_btnV1400.fill = GridBagConstraints.BOTH;
		gbc_btnV1400.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1400.gridx = 5;
		gbc_btnV1400.gridy = 10;
		panelBnts.add(btnV1400, gbc_btnV1400);
		
		btnV1430 = new JButton("");
		btnV1430.setEnabled(false);
		buttonGroup.add(btnV1430);
		btnV1430.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV1430 = new GridBagConstraints();
		gbc_btnV1430.fill = GridBagConstraints.BOTH;
		gbc_btnV1430.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1430.gridx = 5;
		gbc_btnV1430.gridy = 11;
		panelBnts.add(btnV1430, gbc_btnV1430);
		
		btnV1500 = new JButton("");
		btnV1500.setEnabled(false);
		buttonGroup.add(btnV1500);
		btnV1500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV1500 = new GridBagConstraints();
		gbc_btnV1500.fill = GridBagConstraints.BOTH;
		gbc_btnV1500.insets = new Insets(0, 0, 5, 5);
		gbc_btnV1500.gridx = 5;
		gbc_btnV1500.gridy = 12;
		panelBnts.add(btnV1500, gbc_btnV1500);
		
		btnV1530 = new JButton("");
		btnV1530.setEnabled(false);
		buttonGroup.add(btnV1530);
		btnV1530.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnV1530 = new GridBagConstraints();
		gbc_btnV1530.fill = GridBagConstraints.BOTH;
		gbc_btnV1530.insets = new Insets(0, 0, 0, 5);
		gbc_btnV1530.gridx = 5;
		gbc_btnV1530.gridy = 13;
		panelBnts.add(btnV1530, gbc_btnV1530);

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
		
		JLabel lblNomDoc = new JLabel("");
		lblNomDoc.setBounds(622, 152, 213, 25);
		getContentPane().add(lblNomDoc);
		
		JLabel lblClin = new JLabel("");
		lblClin.setBounds(622, 182, 213, 25);
		getContentPane().add(lblClin);
		
		//Habilita los botones según el horario del doctor
		habilitarBotones();
	}
	
	private void habilitarBotones(){
		
	}
}
