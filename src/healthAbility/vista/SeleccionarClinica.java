/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author JoséDavid 25/03/2014
 */
@SuppressWarnings("serial")
public class SeleccionarClinica extends VentanaEmergente {

	Font letraTexto = HealthAbility.getLetraTexto3();

	/**
	 * Create the frame.
	 */
	public SeleccionarClinica(String nomMedico) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblSeleccioneDoctor = new JLabel("Seleccione un centro m\u00E9dico:");
		lblSeleccioneDoctor.setBounds(42, 63, 224, 26);
		lblSeleccioneDoctor.setFont(letraTexto);
		getContentPane().add(lblSeleccioneDoctor);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(73, 106, 193, 32);
		getContentPane().add(comboBox);

		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnSeguir.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSeguir.setBounds(191, 159, 112, 32);
		getContentPane().add(btnSeguir);
	}

}
