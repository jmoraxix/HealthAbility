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
import healthAbility.modelo.Citas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

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
	
	private String nomMedico;
	private Citas[] citas;

	/**
	 * Create the frame.
	 */
	public SeleccionarClinica(String nomMedico) {
		
		this.nomMedico = nomMedico;
		
		JLabel lblSeleccioneDoctor = new JLabel("Seleccione un m\u00E9dico:");
		lblSeleccioneDoctor.setBounds(42, 63, 224, 26);
		lblSeleccioneDoctor.setFont(letraTexto);
		getContentPane().add(lblSeleccioneDoctor);

		comboBox = new JComboBox<String>();
		String[] clinicas = (String[]) getClinicas();
		comboBox.setModel(new DefaultComboBoxModel(clinicas));
		comboBox.setBounds(73, 106, 193, 32);
		getContentPane().add(comboBox);

		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCitas();
				setVisible(false);
			}
		});
		btnSeguir.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSeguir.setBounds(191, 159, 112, 32);
		getContentPane().add(btnSeguir);
	}
	
	private Object[] getClinicas() {
		NodeList listaPersonas = ManageXml.Buscar("clinicas", "usuario");
		ArrayList<String> clinicas = null;

		for (int i = 0; i < listaPersonas.getLength(); i ++) {
			Node persona = listaPersonas.item(i);

			if (persona.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) persona;

				if(elemento.getAttribute("usuario").equals(nomMedico)){
//					Node c = (Node) elemento.getElementsByTagName("nombre");
//					clinicas.add(nom);
				}
			}
		}
		return clinicas.toArray();
	}
	
	private void setCitas(){
		NodeList listaPersonas = ManageXml.Buscar("usuarios", "usuario");
		String usrMed = null;

		for (int i = 0; i < listaPersonas.getLength(); i ++) {
			Node persona = listaPersonas.item(i);

			if (persona.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) persona;

				if(elemento.getElementsByTagName("tipo").item(0).getTextContent().equals("medico")){
					
//					if(nom.equals(comboBox.getSelectedItem()))
//						this.codMedico = elemento.getAttribute("usuario");
				}
			}
		}
	}

}
