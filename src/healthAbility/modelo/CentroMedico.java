/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 17, 2014
 */
package healthAbility.modelo;

import java.util.ArrayList;

/**
 * @author Diego Mar 17, 2014
 * Definición de la clase CentroMedico
 */
public class CentroMedico {

	/****VARIABLES****/
	private String nombre;
	private Direccion ubicacion;
	private ArrayList<Cita> citas;
	private String foto;

	/****MÉTODO CONSTRUCTOR****/
	public CentroMedico(String nom, Direccion dir){
		this.nombre = nom;
		this.ubicacion = dir;
	}
	
	/*****GETTERS AND SETTERS*****/
	public ArrayList<Cita> getCitas() {
		return citas;
	}
	public void agregarCita(Cita cita) {
		this.citas.add(cita);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public void setUbicacion(Direccion ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Direccion getUbicacion() {
		return ubicacion;
	}
}
