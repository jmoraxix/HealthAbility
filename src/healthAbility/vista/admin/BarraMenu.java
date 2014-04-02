/**
 * Primer Proyecto POO
 * JosÃ© David Mora LorÃ­a
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

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 * @author jmora 12/3/14
 *
 */
@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar {

	private JMenu menu1, mUsuarios, mUsuarioAdmin, mUsuarioMedico, mUsuarioPaciente, mCitas,mBusquedas; 	
	private JMenuItem mSalir, mCrearAdmin, mEliminarAdmin, mActualizarAdmin,mCrearMedico, mEliminarMedico, mActualizarMedico,mCrearPaciente, mEliminarPaciente, mActualizarPaciente, 
	mCitasAgregar, mCitasModificar, mCitasEliminar,mBuscarPaciente, mBuscarDoctor, mBuscarClinicas;

	public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
	public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
	public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);
	private JFrame frame;
	public static final Dimension tamTotal = HealthAbility.getTamPantalla();

		
	public BarraMenu(final JFrame frame){
		this.frame = frame;
		
		menu1 = new JMenu("Archivo                         ");
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

		mUsuarios = new JMenu("Usuarios                         ");
		mUsuarios.setMnemonic('U');
		this.add(mUsuarios);


		/////////////JMENUBAR CREAR-ACTUALIZAR-ELIMINAR ADMIN///////////
		mUsuarioAdmin = new JMenu("Usuario Administrador");
		mUsuarioAdmin.setMnemonic('A');

		mCrearAdmin = new JMenuItem("Crear Administrador                         ");
		mCrearAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//////PopUp crear admin////
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
				/////PopUp actualizar admin
			}
		});
		mUsuarioAdmin.add(mActualizarAdmin);
		mUsuarios.add(mUsuarioAdmin);


		//////////////////CREAR ACTUALIZAR ELIMINAR DOCTOR/////////////////////

		mUsuarioMedico = new JMenu("Usuario Médico                         ");
		mUsuarioMedico.setMnemonic('M');

		mCrearMedico = new JMenuItem("Crear Médico                         ");
		mCrearMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarMedico agregarMedico = new AgregarMedico();
				agregarMedico.setVisible(true); 
				frame.setVisible(false); 
			}
		});
		mUsuarioMedico.add(mCrearMedico);
		mCrearMedico.setMnemonic('C');

		mEliminarMedico = new JMenuItem("Eliminar Médico");
		mEliminarMedico.setMnemonic('E');
		mEliminarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////PopUp eliminar Medico.
			}
		});
		mUsuarioMedico.add(mEliminarMedico);
		mUsuarios.add(mUsuarioMedico);

		mActualizarMedico = new JMenuItem("Actualizar Médico");
		mActualizarMedico.setMnemonic('A');
		mActualizarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActualizarMedico actualizarMedico = new ActualizarMedico();
				actualizarMedico.setVisible(true); 
				frame.setVisible(false);
			}
		});
		mUsuarioMedico.add(mActualizarMedico);
		mUsuarios.add(mUsuarioMedico);


		///////////////CREAR ELIMINAR MODIFICAR PACIENTE//////////////////

		mUsuarioPaciente = new JMenu("Usuario Paciente                         ");
		mUsuarioPaciente.setMnemonic('P');

		mCrearPaciente = new JMenuItem("Crear Paciente                         ");
		mCrearPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarPaciente agregarPaciente = new AgregarPaciente();
				agregarPaciente.setVisible(true); 
				frame.setVisible(false);
			}
		});
		mUsuarioPaciente.add(mCrearPaciente);
		mCrearPaciente.setMnemonic('C');

		mEliminarPaciente = new JMenuItem("Eliminar Paciente");
		mEliminarPaciente.setMnemonic('E');
		mEliminarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///PopUp eliminar paciente
			}
		});
		mUsuarioPaciente.add(mEliminarPaciente);
		mUsuarios.add(mUsuarioPaciente);

		mActualizarPaciente = new JMenuItem("Actualizar Paciente");
		mActualizarPaciente.setMnemonic('A');
		mActualizarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActualizarPaciente actualizarPaciente = new ActualizarPaciente();
				actualizarPaciente.setVisible(true); 
				frame.setVisible(false);
			}
		});
		mUsuarioPaciente.add(mActualizarPaciente);
		mUsuarios.add(mUsuarioPaciente);

		////////JMENUBAR CITAS///////////////
		mCitas = new JMenu("Citas                         ");
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
		
		mBusquedas = new JMenu("Búsquedas");
		mBusquedas.setMnemonic('B');
		this.add(mBusquedas);
		
		
		mBuscarDoctor = new JMenuItem("Buscar Doctor");
		mBuscarDoctor.setMnemonic('D');
		mBusquedas.add(mBuscarDoctor);
		mBuscarDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		

		mBuscarPaciente = new JMenuItem("Buscar Paciente");
		mBuscarPaciente.setMnemonic('P');
		mBusquedas.add(mBuscarPaciente);
		mBuscarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		mBuscarClinicas = new JMenuItem("Buscar Clínica");
		mBuscarClinicas.setMnemonic('C');
		mBusquedas.add(mBuscarClinicas);
		mBuscarClinicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}
}
