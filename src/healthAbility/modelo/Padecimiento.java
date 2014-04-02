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
 * Definición de la clase Padecimiento
 */
public class Padecimiento {

	/****VARIABLES****/
	private String nombre;
	private String tipo;
	private String descripcion;
	
	/****MÉTODO CONSTRUCTOR****/
	public Padecimiento(String nom, String tip, String desc){
		this.nombre = nom;
		this.tipo = tip;
		this.descripcion = desc;
	}
	
	/*****GETTERS AND SETTERS*****/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}