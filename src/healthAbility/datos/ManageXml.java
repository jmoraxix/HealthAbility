/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.datos;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author jmora 25/03/2014
 * Busca y escribe datos en los archivos xml
 */
public class ManageXml {

	public static NodeList Buscar(String archivo, String tag){
		NodeList retorno = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File("src/healthAbility/datos/" + archivo + ".xml"));
			doc.getDocumentElement().normalize();

			retorno = doc.getElementsByTagName(tag);

		} catch (Exception e) {
			System.out.println("Error Parse xml: " + e);
		}

		return retorno;
	}
	
	public static NodeList Buscar(String archivo, String tagPadre, String id, String tagHijo){
		NodeList retorno = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File("src/healthAbility/datos/" + archivo + ".xml"));
			doc.getDocumentElement().normalize();

			NodeList tags = doc.getElementsByTagName(tagPadre);
			
			for (int i = 0; i < tags.getLength(); i ++) {
				Node persona = tags.item(i);

				if (persona.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) persona;

					if(elemento.getAttribute(tagPadre).equals(id)){
						retorno = elemento.getElementsByTagName(tagHijo);
						break;
					}
				}
			}
			retorno = doc.getElementsByTagName(tagHijo);

		} catch (Exception e) {
			System.out.println("Error Parse xml: " + e);
		}

		return retorno;
	}

}
