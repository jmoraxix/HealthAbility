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

}
