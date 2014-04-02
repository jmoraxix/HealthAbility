/**
 * Primer Proyecto POO
 * Jos√© David Mora Lor√≠a
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.modelo;

/**
 * @author Diego
 * DefiniciÛn de la clase MÈdico
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
	private String foto;
	private String slogan;
	private CentroMedico[] centrosMedicos;
	private Procedimiento[] procedimientos;
	private String[] idiomas;
	private Educacion[] titulos;
	private String[] afiliaciones;

	/****M…TODO CONSTRUCTOR****/
	public Medico(String pnombre, String papellido1, String papellido2, String pcedula, String pespecialidad){
		this.nombre = pnombre;
		this.apellido1 = papellido1;
		this.apellido2 = papellido2;
		this.cedula = pcedula;
		this.especialidad = pespecialidad;
	}

	/****GETTERS AND SETTERS****/
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public CentroMedico[] getCentrosMedicos() {
		return centrosMedicos;
	}
	public void setCentrosMedicos(CentroMedico[] centrosMedicos) {
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
}