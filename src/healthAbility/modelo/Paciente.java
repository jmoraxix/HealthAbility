/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 20, 2014
 */
package healthAbility.modelo;

import java.util.Date;

/**
 * @author Diego Mar 20, 2014
 * Definición de la clase Paciente
 */
public class Paciente {

	/****VARIABLES****/
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String cedula;
	private String correo;
	private String foto;
	private Padecimiento[] padecimientos;
	private Date nacimiento;

	/*****CONSTRUCTOR*****/
	public Paciente(String pnombre, String papellido1, String papellido2, String pcedula, Date pnacimiento ){
		this.nombre = pnombre;
		this.apellido1 = papellido1;
		this.apellido2 = papellido2;
		this.cedula = pcedula;
		this.nacimiento = pnacimiento;
	}

	/*****GETTERS AND SETTERS*****/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Padecimiento[] getPadecimientos() {
		return padecimientos;
	}
	public void setPadecimientos(Padecimiento[] padecimientos) {
		this.padecimientos = padecimientos;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
}