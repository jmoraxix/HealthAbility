/**
 * Primer Proyecto POO
 * José David Mora Loría
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 */
package healthAbility.vista;

import healthAbility.HealthAbility;
import healthAbility.vista.base.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author jmora 13/03/2014
 */
@SuppressWarnings("serial")
public class MenuPrincipal extends VentanaBase implements ActionListener
{
	public static final Dimension tamTotal = HealthAbility.getTamPantalla();
	
    public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 22);
    public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 18);
    public Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);

    boolean estadoIngres = false, estadoVer = false, estadoAct = false, estadoElim = false, estadoDesc = false, estadoImprim = false;
    JPanel unoIngres, variosIngres, unoVer, variosVer, unoElim, variosElim, unoAct, variosAct, unoImprim, variosImprim, unoDesc, variosDesc, descEntrev;
    JLabel lblUnoIngres, lblVariosIngres, lblUnoVer, lblVariosVer, lblUnoElim, lblVariosElim, lblUnoAct, lblVariosAct, lblUnoImprim, lblVariosImprim, 
    	lblUnoDesc, lblVariosDesc, lblDescEntrev; 	

	public MenuPrincipal() 
	{
        //Salir
		JPanel regresar = new JPanel();
		regresar.setBounds(43, 149, 60, 60);
		regresar.setOpaque(false);
		try {
        	regresar.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/regresar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                regresar.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(regresar);
		regresar.setLayout(new BorderLayout(0, 0));
		getContentPane().add(regresar);
		
		JButton btnRegres = new JButton("");
		btnRegres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login login = HealthAbility.getVentanaLogin();
				login = new Login();
      			login.setVisible(true); 
      			HealthAbility.getVentanaMenu().setVisible(false);
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);
		
  	//Opciones del Menu
		JPanel ingres = new JPanel();
		ingres.setBounds(170, 214, 97, 115);
		ingres.setOpaque(false);
		try {
        	ingres.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/ingresar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                ingres.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(ingres);
		ingres.setLayout(new BorderLayout(0, 0));
		
		JButton btnIngresar = new JButton("");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				agregar = new AgregarUno();
//      			agregar.setVisible(true); 
//      			menu.setVisible(false);
			}
		});
		btnIngresar.setOpaque(false);
		btnIngresar.setContentAreaFilled(false);
		btnIngresar.setBorderPainted(false);
		ingres.add(btnIngresar);
		
		JPanel editar = new JPanel();
		editar.setBounds(467, 214, 97, 115);
		editar.setOpaque(false);
		try {
        	editar.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                editar.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(editar);
		editar.setLayout(new BorderLayout(0, 0));
		
		JButton btnEditar = new JButton("");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				elegirEditar = new ElegirEditar();
//      			elegirEditar.setVisible(true); 
//      			menu.setVisible(false);
			}
		});
		btnEditar.setOpaque(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setBorderPainted(false);
		editar.add(btnEditar);
		
		JPanel elim = new JPanel();
		elim.setBounds(791, 214, 97, 115);
		elim.setOpaque(false);
		try {
        	elim.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                elim.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(elim);
		elim.setLayout(new BorderLayout(0, 0));
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*elegirVer = new ElegirVer();
      			elegirVer.setVisible(true); 
      			menu.setVisible(false);*/
			}
		});
		btnEliminar.setOpaque(false);
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorderPainted(false);
		elim.add(btnEliminar);
		
		JPanel descarg = new JPanel();
		descarg.setBounds(933, 453, 97, 115);
		descarg.setOpaque(false);
		try {
			descarg.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/descargar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                descarg.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(descarg);
		descarg.setLayout(new BorderLayout(0, 0));
		
		JButton btnDescargas = new JButton("");
		btnDescargas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*elegirVer = new ElegirVer();
      			elegirVer.setVisible(true); 
      			menu.setVisible(false);*/
			}
		});
		btnDescargas.setOpaque(false);
		btnDescargas.setContentAreaFilled(false);
		btnDescargas.setBorderPainted(false);
		descarg.add(btnDescargas);
		
		JPanel fechas = new JPanel();
		fechas.setBounds(616, 453, 97, 115);
		fechas.setOpaque(false);
		try {
			fechas.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/fechas.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                fechas.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(fechas);
		fechas.setLayout(new BorderLayout(0, 0));
		
		JButton btnFechas = new JButton("");
		btnFechas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*elegirVer = new ElegirVer();
      			elegirVer.setVisible(true); 
      			menu.setVisible(false);*/
			}
		});
		btnFechas.setOpaque(false);
		btnFechas.setContentAreaFilled(false);
		btnFechas.setBorderPainted(false);
		fechas.add(btnFechas);
		
		JPanel cita = new JPanel();
		cita.setBounds(1063, 214, 97, 115);
		cita.setOpaque(false);
		try {
			cita.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/examen.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                cita.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(cita);
		cita.setLayout(new BorderLayout(0, 0));
		
		JButton btnExamen = new JButton("");
		btnExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				editarExamen = new Citas();
//      			editarExamen.setVisible(true); 
//      			menu.setVisible(false);
			}
		});
		btnExamen.setOpaque(false);
		btnExamen.setContentAreaFilled(false);
		btnExamen.setBorderPainted(false);
		cita.add(btnExamen);
		
		JPanel entrev = new JPanel();
		entrev.setBounds(303, 447, 97, 115);
		entrev.setOpaque(false);
		try {
        	entrev.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/entrevista.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                entrev.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(entrev);
		entrev.setLayout(new BorderLayout(0, 0));
		
		JButton btnEntrev = new JButton("");
		entrev.add(btnEntrev);
		btnEntrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				rubros = new RubrosEntrevista();
//      			rubros.setVisible(true); 
//      			menu.setVisible(false);
			}
		});
		btnEntrev.setOpaque(false);
		btnEntrev.setContentAreaFilled(false);
		btnEntrev.setBorderPainted(false);
		
		JLabel lblIngresarUsuario = new JLabel("Ingresar usuario");
		lblIngresarUsuario.setForeground(new Color(0, 0, 128));
		lblIngresarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresarUsuario.setFont(letraTexto2);
		lblIngresarUsuario.setBounds(131, 327, 176, 23);
		getContentPane().add(lblIngresarUsuario);
		
		JLabel lblEditarUsuario = new JLabel("Editar usuario");
		lblEditarUsuario.setForeground(new Color(0, 0, 128));
		lblEditarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarUsuario.setFont(letraTexto2);
		lblEditarUsuario.setBounds(440, 331, 154, 14);
		getContentPane().add(lblEditarUsuario);
		
		JLabel lblEliminarUsuario = new JLabel("Eliminar usuario");
		lblEliminarUsuario.setForeground(new Color(0, 0, 128));
		lblEliminarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarUsuario.setFont(letraTexto2);
		lblEliminarUsuario.setBounds(751, 327, 183, 23);
		getContentPane().add(lblEliminarUsuario);
		
		JLabel lblCitas = new JLabel("Citas");
		lblCitas.setForeground(new Color(0, 0, 128));
		lblCitas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCitas.setFont(letraTexto2);
		lblCitas.setBounds(1041, 327, 140, 23);
		getContentPane().add(lblCitas);
		
		JLabel lblEditarFechas = new JLabel("Editar fechas");
		lblEditarFechas.setForeground(new Color(0, 0, 128));
		lblEditarFechas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditarFechas.setFont(letraTexto2);
		lblEditarFechas.setBounds(581, 573, 168, 23);
		getContentPane().add(lblEditarFechas);
		
		JLabel lblDescargarExpediente = new JLabel("Descargar expediente");
		lblDescargarExpediente.setForeground(new Color(0, 0, 128));
		lblDescargarExpediente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescargarExpediente.setFont(letraTexto2);
		lblDescargarExpediente.setBounds(883, 573, 204, 19);
		getContentPane().add(lblDescargarExpediente);
		
		JLabel lblRubrosDeEntrevistas = new JLabel("Rubros de entrevistas");
		lblRubrosDeEntrevistas.setForeground(new Color(0, 0, 128));
		lblRubrosDeEntrevistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblRubrosDeEntrevistas.setFont(letraTexto2);
		lblRubrosDeEntrevistas.setBounds(260, 573, 199, 23);
		getContentPane().add(lblRubrosDeEntrevistas);		
  	}
      	
      	public void actionPerformed(ActionEvent e)
          {
      		
          }
}

