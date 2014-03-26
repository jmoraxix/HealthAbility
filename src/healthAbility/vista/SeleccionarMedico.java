/**
 * Primer Proyecto POO
 * Jos� David Mora Lor�a
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Jos�David 25/03/2014
 */
@SuppressWarnings("serial")
public class SeleccionarMedico extends VentanaEmergente {
	
	Font letraTexto = HealthAbility.getLetraTexto2();
	JComboBox<String> comboBox;

	/**
	 * Create the frame.
	 */
	public SeleccionarMedico() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSeleccioneDoctor = new JLabel("Seleccione un m\u00E9dico:");
		lblSeleccioneDoctor.setBounds(42, 63, 224, 26);
		lblSeleccioneDoctor.setFont(letraTexto);
		getContentPane().add(lblSeleccioneDoctor);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(getMedicos()));
		comboBox.setBounds(73, 106, 193, 32);
		getContentPane().add(comboBox);
		
		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeleccionarClinica selecClinica = new SeleccionarClinica(comboBox.getSelectedItem().toString());
				selecClinica.setVisible(true);
				setVisible(false);
			}
		});
		btnSeguir.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSeguir.setBounds(191, 159, 112, 32);
		getContentPane().add(btnSeguir);
	}

	/**
	 * @return
	 */
	private String[] getMedicos() {
		return null;
	}
}
