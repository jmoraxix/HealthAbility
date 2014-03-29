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
public class SeleccionarMedico extends VentanaEmergente {

	Font letraTexto = HealthAbility.getLetraTexto2();
	JComboBox<String> comboBox;

	private String codMedico = "";
	
	/**
	 * Create the frame.
	 */
	public SeleccionarMedico(JFrame frame) {
		super(frame, "Seleccionar medico", true);
		setSize(350, 200);
		
		JLabel lblSeleccioneDoctor = new JLabel("Seleccione un m\u00E9dico:");
		lblSeleccioneDoctor.setBounds(22, 21, 224, 26);
		lblSeleccioneDoctor.setFont(letraTexto);
		getContentPane().add(lblSeleccioneDoctor);

		comboBox = new JComboBox<String>();
		String[] meds = getMedicos();
		comboBox.setModel(new DefaultComboBoxModel<String>(meds));
		comboBox.setBounds(63, 58, 211, 32);
		getContentPane().add(comboBox);

		JButton btnSeguir = new JButton("Seguir");
		btnSeguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex() != 0){
					setCodMedico();
					setVisible(false);
					dispose(); 
				}
				else {
					JOptionPane.showMessageDialog(null, "Seleccione un médico", "Alerta", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSeguir.setFont(new Font("Georgia", Font.PLAIN, 14));
		btnSeguir.setBounds(212, 101, 112, 32);
		getContentPane().add(btnSeguir);
		
	}

	private String[] getMedicos() {
		NodeList listaPersonas = ManageXml.Buscar("usuarios", "usuario");
		ArrayList<String> meds = new ArrayList<String>();
		meds.add("--Seleccione un médico--,");
		
		for (int i = 0; i < listaPersonas.getLength(); i ++) {
			Node persona = listaPersonas.item(i);

			if (persona.getNodeType() == Node.ELEMENT_NODE) {
				Element elemento = (Element) persona;

				if(elemento.getElementsByTagName("tipo").item(0).getTextContent().equals("medico")){
					String nom = elemento.getElementsByTagName("nombre").item(0).getTextContent() + " " +
							elemento.getElementsByTagName("apellido1").item(0).getTextContent() + " " +
							elemento.getElementsByTagName("apellido2").item(0).getTextContent();
					if(i<listaPersonas.getLength()-1)
						nom +=",";
					
					meds.add(nom);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : meds)
		{
		    sb.append(s);
		}
		
		System.out.println(sb.toString());
		return sb.toString().split(",");
	}
	
	private void setCodMedico(){
		NodeList listaPersonas = ManageXml.Buscar("usuarios", "usuario");

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
		setVisible(true);
		return codMedico;
	}
}
