/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 20, 2014
 */
package healthAbility.modelo;

import java.awt.image.BufferedImage;

/**
 * @author Diego Mar 20, 2014
 *
 */
public class Paciente {
	
	/****VARIABLES****/
	private String nombre;
	private String cedula;
	private String correo;
	private BufferedImage foto;
	private Padecimientos[] padecimientos;
	
	
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
	public BufferedImage getFoto() {
		return foto;
	}
	public void setFoto(BufferedImage foto) {
		this.foto = foto;
	}
	public Padecimientos[] getPadecimientos() {
		return padecimientos;
	}
	public void setPadecimientos(Padecimientos[] padecimientos) {
		this.padecimientos = padecimientos;
	}
	

}
