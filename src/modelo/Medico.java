/**
 * 
 */
package modelo;

/**
 * @author Diego & Jose
 *
 */
public class Medico {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String cedula;
	private String correo;
	private String especialidad;
	private int telefono;

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

   @Override
   public String toString() {
       String mensaje = "";
       mensaje += "Nombre: " + getNombre() + "\n";
       mensaje += "Apellidos: " + getApellido1() + " " + getApellido2() + "\n";
       mensaje += "Cedula: " + getCedula() + "\n";
       mensaje +="Correo "+ getCorreo()+"\n";
       mensaje += "Especialidad" + getEspecialidad() + "\n";
       mensaje += "Teléfono: " + getTelefono() + "\n";

       return mensaje;
   }
}
