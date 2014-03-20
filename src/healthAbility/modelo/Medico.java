/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.modelo;

import java.awt.image.BufferedImage;

/**
 * @author Diego
 *
 */
public class Medico {

	/****VARIABLES****/
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String cedula;
	private String correo;
	private String especialidad;
	private int telefono;
	private BufferedImage foto;
	private String slogan;
	private CentrosMedicos[] centrosMedicos;
	private Procedimiento[] procedimientos;
	private String[] idiomas;
	private Educacion[] titulos;
	private String[] afiliaciones;
	private Review[] calificaciones;
	
	
	
	
	
	

	/*****CONSTRUCTOR*****/

	public Medico(String pnombre, String papellido1, String papellido2, 
			String pcedula, String pcorreo, String pespecialidad, int ptelefono ){
		
		this.nombre = pnombre;
		this.apellido1 = papellido1;
		this.apellido2 = papellido2;
		this.cedula = pcedula;
		this.correo = pcorreo;
		this.especialidad = pespecialidad;
		this.telefono = ptelefono;
		
		
	}
	
	/*****GETTERS AND SETTERS*****/
	
	public String getNombre() {
	       return nombre;
	   }
	public void setNombre(String nombre) {
	       this.nombre = nombre;
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
   public String getCedula() {
       return cedula;
   }
   public void setCedula(String cedula) {
       this.cedula = cedula;
   }
   public String getCorreo(){
		return correo;
	}
   public void setCorreo(String correo){
		this.correo = correo;
	}
   public String getEspecialidad(){
		return especialidad;
	}
   public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}
   public int getTelefono() {
       return telefono;
   }
   public void setTelefono(int telefono) {
       this.telefono = telefono;
   }
   public Procedimiento[] getProcedimientos() {
		return procedimientos;
	}
	public void setProcedimientos(Procedimiento[] procedimientos) {
		this.procedimientos = procedimientos;
	}
	public Review[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(Review[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	public BufferedImage getFoto() {
		return foto;
	}
	public void setFoto(BufferedImage foto) {
		this.foto = foto;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public CentrosMedicos[] getCentrosMedicos() {
		return centrosMedicos;
	}
	public void setCentrosMedicos(CentrosMedicos[] centrosMedicos) {
		this.centrosMedicos = centrosMedicos;
	}
	public String[] getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}
	public Educacion[] getTitulos() {
		return titulos;
	}
	public void setTitulos(Educacion[] titulos) {
		this.titulos = titulos;
	}
	public String[] getAfiliaciones() {
		return afiliaciones;
	}
	public void setAfiliaciones(String[] afiliaciones) {
		this.afiliaciones = afiliaciones;
	}
   
   /*****TO STRING*****/
   @Override
   public String toString() {
       String mensaje = "";
       mensaje += "Nombre: " + getNombre() + "\n";
       mensaje += "Apellidos: " + getApellido1() + " " + getApellido2() + "\n";
       mensaje += "Cedula: " + getCedula() + "\n";
       mensaje +="Correo "+ getCorreo()+"\n";
       mensaje += "Especialidad" + getEspecialidad() + "\n";
       mensaje += "Tel�fono: " + getTelefono() + "\n";

       return mensaje;
   }


}
