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

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author JoséDavid 25/03/2014
 */
@SuppressWarnings("serial")
public class SeleccionarMedico extends VentanaEmergente {

	Font letraTexto = HealthAbility.getLetraTexto2();
	JComboBox<String> comboBox;

	private String codMedico = null;
	
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
		String[] meds = (String[]) getMedicos();
		comboBox.setModel(new DefaultComboBoxModel(meds));
		comboBox.setBounds(73, 106, 193, 32);
		getContentPane().add(comboBox);

		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setCodMedico();
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
	private Object[] getMedicos() {
		NodeList listaPersonas = ManageXml.Buscar("usuarios", "usuario");
		ArrayList<String> meds = null;

		for (int i = 0; i < listaPersonas.getLength(); i ++) {
			Node persona = listaPersonas.item(i);

			if (persona.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) persona;

				if(elemento.getElementsByTagName("tipo").item(0).getTextContent().equals("medico")){
					String nom = elemento.getElementsByTagName("nombre").item(0).getTextContent() + " " +
							elemento.getElementsByTagName("apellido1").item(0).getTextContent() + " " +
							elemento.getElementsByTagName("apellido2").item(0).getTextContent();
					meds.add(nom);
				}
			}
		}
		return meds.toArray();
	}
	
	private void setCodMedico(){
		NodeList listaPersonas = ManageXml.Buscar("usuarios", "usuario");
		String usrMed = null;

		for (int i = 0; i < listaPersonas.getLength(); i ++) {
			Node persona = listaPersonas.item(i);

			if (persona.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) persona;

				if(elemento.getElementsByTagName("tipo").item(0).getTextContent().equals("medico")){
					String nom = elemento.getElementsByTagName("nombre").item(0).getTextContent() + " " +
							elemento.getElementsByTagName("apellido1").item(0).getTextContent() + " " +
							elemento.getElementsByTagName("apellido2").item(0).getTextContent();
					if(nom.equals(comboBox.getSelectedItem()))
						this.codMedico = elemento.getAttribute("usuario");
				}
			}
		}
	}
	
	/**
	 * @return codMedico
	 */
	public String getCodMedico() {
		return codMedico;
	}
}
