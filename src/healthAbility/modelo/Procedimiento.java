/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 17, 2014
 */
package healthAbility.modelo;

/**
 * @author Diego Mar 17, 2014
 * Definición de la clase Procedimiento
 */
public class Procedimiento {

	/****VARIABLES****/
	private String nombre;
	private float costo;

	/****MÉTODO CONSTRUCTOR****/
	public Procedimiento(String nom, float costo){
		this.nombre = nom;
		this.costo = costo;
	}
	
	/******SETTERS-GETTERS******/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
}