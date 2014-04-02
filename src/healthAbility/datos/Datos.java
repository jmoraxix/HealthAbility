/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.datos;

import healthAbility.modelo.CentroMedico;
import healthAbility.modelo.Direccion;
import healthAbility.modelo.Medico;
import healthAbility.modelo.Paciente;
import healthAbility.modelo.Procedimiento;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author jmora 01/04/2014
 * Contiene todos los datos de la aplicacion generados desde esta clase.
 */
public class Datos {
	private ArrayList<Paciente> pacientes;
	private ArrayList<Medico> medicos;
	private ArrayList<CentroMedico> clinicas;
	private ArrayList<Procedimiento> procedimientos;
	
	public Datos(){
		pacientes.add(new Paciente("Don Paciente 1", "App1", "App2", "123456789", new Date(System.currentTimeMillis())));
		pacientes.add(new Paciente("Don Paciente 2", "App1", "App2", "123455789", new Date(System.currentTimeMillis())));
		pacientes.add(new Paciente("Don Paciente 3", "App1", "App2", "123365589", new Date(System.currentTimeMillis())));

		medicos.add(new Medico("Medico 1", "App1", "App2", "248536842", "Cardiología"));
		medicos.add(new Medico("Medico 2", "App1", "App2", "548613685", "Geriatría‎"));
		medicos.add(new Medico("Medico 3", "App1", "App2", "484613269", "Pediatría"));

		clinicas.add(new CentroMedico("Clinica 1", new Direccion("Del palo de mangos a la izquierda", "Desamparados", "Desamparados", "San José")));
		clinicas.add(new CentroMedico("Clinica 2", new Direccion("Desc1", "Salitrillos0", "Aserri", "San José")));
		clinicas.add(new CentroMedico("Clinica 3", new Direccion("Alacena debajo de la escalera", "Desamparados", "Desamparados", "San José")));
		clinicas.add(new CentroMedico("Clinica 4", new Direccion("Clinca CSR, 100S, 25E", "Desamparados", "Desamparados", "San José")));
	}
}
