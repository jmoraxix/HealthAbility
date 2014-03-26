/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 24, 2014
 */
package healthAbility.vista.paciente;


import healthAbility.HealthAbility;
import healthAbility.InformacionProyecto;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;


/**
 * @author Diego 12/3/14
 *
 */
@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar {
	
	private JMenu menu1, mTema, mUsuarios, mUsuarioPaciente, mCitas; 	
    private JMenuItem mSalir, mUndo, mRedo, mCrearPaciente, mEliminarPaciente, mActualizarPaciente,
    mVerEstadis, mFase1, mFase2, mFase3, mFase4,mCitasAgregar, mCitasModificar, mCitasEliminar;
    private JRadioButtonMenuItem mTemaVer, mTemaAzu, mTemaNar;
    
    public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
    public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
    public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);

	public static final Dimension tamTotal = HealthAbility.getTamPantalla();
	
	public BarraMenu(){
	
    menu1 = new JMenu("Archivo        ");
    menu1.setMnemonic('A');
    this.add(menu1);
//    mTema = new JMenu("Cathisiar tema                   "); 	
//    mTema.setMnemonic('C');
//    mTema.addActionListener(this);
//    menu1.add(mTema);  
//    
//    mTemaVer = new JRadioButtonMenuItem("Verde", true); 
//    mTemaVer.addActionListener(this);
//    mTema.add(mTemaVer); 
//    mTemaAzu = new JRadioButtonMenuItem("Azul", false); 	
//    mTemaAzu.addActionListener(this);
//    mTema.add(mTemaAzu); 
//    mTemaNar = new JRadioButtonMenuItem("Naranja", false); 	
//    mTemaNar.addActionListener(this);
//    mTema.add(mTemaNar); 
//    
//    ButtonGroup grupo = new ButtonGroup();
//    grupo.add(mTemaVer);
//    grupo.add(mTemaAzu);
//    grupo.add(mTemaNar);
    
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
    		//new InformacionProyecto().setVisible(true);
    	}
    });
    menu1.add(mntmAcercaDeNosotros);
    menu1.add(mSalir);   
    
    mUsuarios = new JMenu("Usuarios          ");
    mUsuarios.setMnemonic('U');
    this.add(mUsuarios);
//    mUndo = new JMenuItem("Deshacer                         Ctrl+Z");
//    mEdicion.add(mUndo);
//    mRedo = new JMenuItem("Rehacer                           Ctrl+Y");
//    mEdicion.add(mRedo);
    
    
     
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
    mCitas = new JMenu("Citas         ");
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
