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
 *
 */
public class Citas {
	
	/****VARIABLES****/
	private String estado;
	private int hora;
	private int minutos;
	private boolean periodo;
	private Review calificaciones;
	private Paciente paciente; //**************************DEBATIR SOLUCION**********************************
	
	
	
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
	public String getPeriodo() {
		
		String per;
		if (periodo)
			per = "am";
		else
			per  = "pm";
		
		return per;
	}
	public void setPeriodo(String per) {
		if(per.equals("am"))
			this.periodo = true;
		else
			this.periodo = false;	
	}
	public Review getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(Review calificaciones) {
		this.calificaciones = calificaciones;
	}
//	public String getPaciente() {
//		return paciente;
//	}
//	public void setPaciente(String paciente) {
//		this.paciente = paciente;
//	}
	

}
