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
 * Definici�n de la clase Review
 */
public class Review {

	/****VARIABLES****/
	private int calificacion;
	private String comentario;
	private String usuario;

	/****M�TODO CONSTRUCTOR****/
	public Review(int calif, String coment, String usr){
		this.calificacion = calif;
		this.comentario = coment;
		this.usuario = usr;
	}

	/*****GETTERS AND SETTERS*****/
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}