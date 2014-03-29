/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;
import healthAbility.datos.ManageXml;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author JoséDavid 25/03/2014
 */
@SuppressWarnings("serial")
public class SeleccionarClinica extends VentanaEmergente {

	Font letraTexto = HealthAbility.getLetraTexto2();
	JComboBox<String> comboBox;
	
	private String nomMedico, clinica = "";

	/**
	 * Create the frame.
	 */
	public SeleccionarClinica(JFrame frame, String nomMedico) {
		super(frame, "Seleccionar clinica", true);
		setSize(350, 200);
		
		this.nomMedico = nomMedico;
		
		JLabel lblSeleccioneDoctor = new JLabel("Seleccione una clin\u00edca:");
		lblSeleccioneDoctor.setBounds(22, 21, 224, 26);
		lblSeleccioneDoctor.setFont(letraTexto);
		getContentPane().add(lblSeleccioneDoctor);

		comboBox = new JComboBox<String>();
		String[] clinicas = (String[]) getClinicas();
		comboBox.setModel(new DefaultComboBoxModel<String>(clinicas));
		comboBox.setBounds(63, 58, 211, 32);
		getContentPane().add(comboBox);

		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex() != 0){
					clinica = comboBox.getSelectedItem().toString();
					setVisible(false);
					dispose(); 
				}
				else {
					JOptionPane.showMessageDialog(null, "Seleccione una clínica", "Alerta", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSeguir.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSeguir.setBounds(212, 101, 112, 32);
		getContentPane().add(btnSeguir);
	}

	private String[] getClinicas() {
		NodeList listaClinicas = ManageXml.Buscar("usuarios", "usuario", this.nomMedico, "clinicas");
		ArrayList<String> clinicas = new ArrayList<String>();
		clinicas.add("--Seleccione una clínica--,");

		for (int i = 0; i < listaClinicas.getLength(); i ++) {
			Node clinic = listaClinicas.item(i);

			if (clinic.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) clinic;
				clinicas.add(elemento.getAttribute("nombre") + ",");
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : clinicas)
		{
		    sb.append(s);
		}
		System.out.println(sb.toString());
		return sb.toString().split(",");
	}
	

	/**
	 * @return citas
	 */
	public String getClinica() {
		setVisible(true);
		return this.clinica;
	}
}
