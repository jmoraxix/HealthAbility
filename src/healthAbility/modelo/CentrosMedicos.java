/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 17, 2014
 */
package healthAbility.modelo;

import java.awt.image.BufferedImage;

/**
 * @author Diego Mar 17, 2014
 *
 */

public class CentrosMedicos {
	
	/****VARIABLES****/
	private String nombre;
	private Direccion ubicacion;
	private Citas[] citas;
	private BufferedImage foto;
	
	
	/*****GETTERS AND SETTERS*****/
	
	public Citas[] getCitas() {
		return citas;
	}
	public void setCitas(Citas[] citas) {
		this.citas = citas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BufferedImage getFoto() {
		return foto;
	}
	public void setFoto(BufferedImage foto) {
		this.foto = foto;
	}
	public void setUbicacion(Direccion ubicacion) {
		this.ubicacion = ubicacion;
	}

}
