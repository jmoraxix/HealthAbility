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
 * Definición de la clase Cita
 */
public class Cita {

	/****VARIABLES****/
	private String estado;
	private int hora;
	private int minutos;
	private Review calificacion;
	private String paciente; 
	private String fecha;
	
	/****MÉTODO CONSTRUCTOR****/
	public Cita(int h, int m, String fecha, String pac){
		this.hora = h;
		this.minutos = m;
		this.fecha = fecha;
		this.paciente = pac;
	}

	/*****GETTERS AND SETTERS*****/
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public Review getCalificaciones() {
		return calificacion;
	}
	public void setCalificaciones(Review calific) {
		this.calificacion = calific;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
