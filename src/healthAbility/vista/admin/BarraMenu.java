/**
 * Primer Proyecto POO
 * Jos√© David Mora Lor√≠a
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.InformacionProyecto;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 * @author jmora 12/3/14
 *
 */
@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar {

	private JMenu menu1, mUsuarios, mUsuarioAdmin, mUsuarioMedico, mUsuarioPaciente, mCitas; 	
	private JMenuItem mSalir, mCrearAdmin, mEliminarAdmin, mActualizarAdmin,mCrearMedico, mEliminarMedico, mActualizarMedico,mCrearPaciente, mEliminarPaciente, mActualizarPaciente, 
	mCitasAgregar, mCitasModificar, mCitasEliminar;

	public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
	public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
	public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);

	public static final Dimension tamTotal = HealthAbility.getTamPantalla();

	public BarraMenu(){

		menu1 = new JMenu("Archivo");
		menu1.setMnemonic('A');
		this.add(menu1);

		mSalir = new JMenuItem("Salir"); 	
		mSalir.setMnemonic('S');
		mSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});

		JMenuItem mntmAcercaDeNosotros = new JMenuItem("Acerca de...");
		mntmAcercaDeNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformacionProyecto().setVisible(true);
			}
		});
		menu1.add(mntmAcercaDeNosotros);
		menu1.add(mSalir);   

		mUsuarios = new JMenu("Usuarios");
		mUsuarios.setMnemonic('U');
		this.add(mUsuarios);


		/////////////JMENUBAR CREAR-ACTUALIZAR-ELIMINAR ADMIN///////////
		mUsuarioAdmin = new JMenu("Usuario Administrador");
		mUsuarioAdmin.setMnemonic('A');

		mCrearAdmin = new JMenuItem("Crear Administrador                         ");
		mCrearAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//HealthAbility.verifUsuario = new VerifUsuario(new CrearUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioAdmin.add(mCrearAdmin);
		mCrearAdmin.setMnemonic('C');

		mEliminarAdmin = new JMenuItem("Eliminar Administrador");
		mEliminarAdmin.setMnemonic('E');
		mEliminarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioAdmin.add(mEliminarAdmin);
		mUsuarios.add(mUsuarioAdmin);

		mActualizarAdmin = new JMenuItem("Actualizar Administrador");
		mActualizarAdmin.setMnemonic('A');
		mActualizarAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioAdmin.add(mActualizarAdmin);
		mUsuarios.add(mUsuarioAdmin);


		//////////////////CREAR ACTUALIZAR ELIMINAR DOCTOR/////////////////////

		mUsuarioMedico = new JMenu("Usuario MÈdico");
		mUsuarioMedico.setMnemonic('M');

		mCrearMedico = new JMenuItem("Crear MÈdico                         ");
		mCrearMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//HealthAbility.verifUsuario = new VerifUsuario(new CrearUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioMedico.add(mCrearMedico);
		mCrearMedico.setMnemonic('C');

		mEliminarMedico = new JMenuItem("Eliminar MÈdico");
		mEliminarMedico.setMnemonic('E');
		mEliminarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioMedico.add(mEliminarMedico);
		mUsuarios.add(mUsuarioMedico);

		mActualizarMedico = new JMenuItem("Actualizar MÈdico");
		mActualizarMedico.setMnemonic('A');
		mActualizarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioMedico.add(mActualizarMedico);
		mUsuarios.add(mUsuarioMedico);


		///////////////CREAR ELIMINAR MODIFICAR PACIENTE//////////////////

		mUsuarioPaciente = new JMenu("Usuario Paciente");
		mUsuarioPaciente.setMnemonic('P');

		mCrearPaciente = new JMenuItem("Crear Paciente                         ");
		mCrearPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//HealthAbility.verifUsuario = new VerifUsuario(new CrearUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioPaciente.add(mCrearPaciente);
		mCrearPaciente.setMnemonic('C');

		mEliminarPaciente = new JMenuItem("Eliminar Paciente");
		mEliminarPaciente.setMnemonic('E');
		mEliminarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioPaciente.add(mEliminarPaciente);
		mUsuarios.add(mUsuarioPaciente);

		mActualizarPaciente = new JMenuItem("Actualizar Paciente");
		mActualizarPaciente.setMnemonic('A');
		mActualizarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
				//HealthAbility.verifUsuario.setVisible(true); 
			}
		});
		mUsuarioPaciente.add(mActualizarPaciente);
		mUsuarios.add(mUsuarioPaciente);

		////////JMENUBAR CITAS///////////////
		mCitas = new JMenu("Citas");
		mCitas.setMnemonic('C');
		this.add(mCitas);

		mCitasAgregar = new JMenuItem("Agregar cita");
		mCitasAgregar.setMnemonic('A');
		mCitasAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mCitasModificar = new JMenuItem("Modificar cita");
		mCitasModificar.setMnemonic('M');
		mCitasModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mCitasEliminar =  new JMenuItem("Eliminar cita");
		mCitasEliminar.setMnemonic('E');
		mCitasEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mCitas.add(mCitasAgregar);
		mCitas.add(mCitasModificar);
		mCitas.add(mCitasEliminar);
	}
}
