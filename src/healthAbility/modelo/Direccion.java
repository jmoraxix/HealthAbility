/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 20, 2014
 */
package healthAbility.modelo;

/**
 * @author Diego Mar 20, 2014
 * Definici�n de la clase Direcci�n
 */
public class Direccion {
	
	/****VARIABLES****/
	private String direccion_general;
	private String distrito;
	private String canton;
	private String provincia;

	/****M�TODO CONSTRUCTOR****/
	public Direccion(String dir, String dist, String cant, String prov){
		this.direccion_general = dir;
		this.distrito = dist;
		this.canton = cant;
		this.provincia = prov;
	}
	
	/*****GETTERS AND SETTERS*****/
	public String getDireccion_general() {
		return direccion_general;
	}
	public void setDireccion_general(String direccion_general) {
		this.direccion_general = direccion_general;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCanton() {
		return canton;
	}
	public void setCanton(String canton) {
		this.canton = canton;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
