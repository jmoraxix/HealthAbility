/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista.base;

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
 * @author jmora 12/3/14
 *
 */
@SuppressWarnings("serial")
public class MenuAdministrador extends JMenuBar {
	
	private JMenu menu1, mTema, mEdicion, mUsuario, mFases, mVerFases; 	
    private JMenuItem mSalir, mUndo, mRedo, mCrearUss, mEliminarUss, mVerEstadis, mFase1, mFase2, mFase3, mFase4;
    private JRadioButtonMenuItem mTemaVer, mTemaAzu, mTemaNar;
    
    public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
    public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
    public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);

	public static final Dimension tamTotal = HealthAbility.getTamPantalla();
	
	public MenuAdministrador(){
	
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
    
    mEdicion = new JMenu("Edici\u00F3n          ");
    mEdicion.setMnemonic('E');
    this.add(mEdicion);
//    mUndo = new JMenuItem("Deshacer                         Ctrl+Z");
//    mEdicion.add(mUndo);
//    mRedo = new JMenuItem("Rehacer                           Ctrl+Y");
//    mEdicion.add(mRedo);
    mUsuario = new JMenu("Usuario");
    mUsuario.setMnemonic('U');
    mCrearUss = new JMenuItem("Crear Usuario                         ");
    mCrearUss.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		//HealthAbility.verifUsuario = new VerifUsuario(new CrearUsuario());
  			//HealthAbility.verifUsuario.setVisible(true); 
    	}
    });
    mUsuario.add(mCrearUss);
    mEliminarUss = new JMenuItem("Eliminar Usuario");
    mEliminarUss.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		//HealthAbility.verifUsuario = new VerifUsuario(new EliminarUsuario());
  			//HealthAbility.verifUsuario.setVisible(true); 
    	}
    });
    mUsuario.add(mEliminarUss);
    mEdicion.add(mUsuario);
    
    mFases = new JMenu("Fases         ");
    mFases.setMnemonic('F');
    this.add(mFases);
    mVerFases = new JMenu("Ver Fases");
    mVerFases.setMnemonic('V');
    mFase1 = new JMenuItem("Fase 1");
    mVerFases.add(mFase1);
    mFase2 = new JMenuItem("Fase 2");
    mVerFases.add(mFase2);
    mFase3 = new JMenuItem("Fase 3");
    mVerFases.add(mFase3);
    mFase4 = new JMenuItem("Fase 4");
    mVerFases.add(mFase4);
    mFases.add(mVerFases);
    mVerEstadis = new JMenuItem("Ver Estadisticas");
    mFases.add(mVerEstadis);
	}
}
