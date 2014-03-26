/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 22, 2014
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author Diego Mar 22, 2014
 *
 */
public class Usuarios extends VentanaBase {

	Dimension tamTotal = HealthAbility.getTamPantalla();
	 public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 22);
	 public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 18);
	    
	
	public Usuarios(){
		//getContentPane().setLayout(null);
		
		this.setJMenuBar(new BarraMenu());
		JPanel agregarDoctor = new JPanel();
		agregarDoctor.setBounds(120, 200, 97, 115);
		agregarDoctor.setOpaque(false);
		try {
        	agregarDoctor.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                agregarDoctor.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(agregarDoctor);
		agregarDoctor.setLayout(new BorderLayout(0, 0));
		JButton btnAgregarDoctor = new JButton("");
		btnAgregarDoctor.setOpaque(false);
		btnAgregarDoctor.setContentAreaFilled(false);
		btnAgregarDoctor.setBorderPainted(false);
		agregarDoctor.add(btnAgregarDoctor, BorderLayout.CENTER);
		
	
		JPanel modificarDoctor = new JPanel();
		modificarDoctor.setBounds(120, 364, 97, 115);
		modificarDoctor.setOpaque(false);
		try {
        	modificarDoctor.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                modificarDoctor.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(modificarDoctor);
		modificarDoctor.setLayout(new BorderLayout(0, 0));
		JButton btnModificarDoctor = new JButton("");
		btnModificarDoctor.setOpaque(false);
		btnModificarDoctor.setContentAreaFilled(false);
		btnModificarDoctor.setBorderPainted(false);
		modificarDoctor.add(btnModificarDoctor, BorderLayout.CENTER);
		
		JPanel eliminarDoctor = new JPanel();
		eliminarDoctor.setBounds(120, 521, 97, 115);
		eliminarDoctor.setOpaque(false);
		try {
        	eliminarDoctor.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                eliminarDoctor.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		getContentPane().add(eliminarDoctor);
		eliminarDoctor.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarDoctor = new JButton("");
		btnEliminarDoctor.setOpaque(false);
		btnEliminarDoctor.setContentAreaFilled(false);
		btnEliminarDoctor.setBorderPainted(false);
		eliminarDoctor.add(btnEliminarDoctor, BorderLayout.CENTER);
		
		
		
		JPanel agregarPaciente = new JPanel();
		agregarPaciente.setBounds(437, 200, 97, 115);
		agregarPaciente.setOpaque(false);
		try {
        	agregarPaciente.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                agregarPaciente.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(agregarPaciente);
		agregarPaciente.setLayout(new BorderLayout(0, 0));
		JButton btnAgregarPaciente = new JButton("");
		btnAgregarPaciente.setOpaque(false);
		btnAgregarPaciente.setContentAreaFilled(false);
		btnAgregarPaciente.setBorderPainted(false);
		agregarPaciente.add(btnAgregarPaciente, BorderLayout.CENTER);
		
		
		
		JPanel modificarPaciente = new JPanel();
		modificarPaciente.setBounds(437, 364, 97, 115);
		modificarPaciente.setOpaque(false);
		try {
        	modificarPaciente.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                modificarPaciente.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(modificarPaciente);
		modificarPaciente.setLayout(new BorderLayout(0, 0));
		JButton btnModificarPaciente = new JButton("");
		btnModificarPaciente.setOpaque(false);
		btnModificarPaciente.setContentAreaFilled(false);
		btnModificarPaciente.setBorderPainted(false);
		modificarPaciente.add(btnModificarPaciente, BorderLayout.CENTER);
		
		
		
		JPanel eliminarPaciente = new JPanel();
		eliminarPaciente.setBounds(437, 521, 97, 115);
		eliminarPaciente.setOpaque(false);
		try {
        	eliminarPaciente.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                eliminarPaciente.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		getContentPane().add(eliminarPaciente);
		eliminarPaciente.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarPaciente = new JButton("");
		btnEliminarPaciente.setOpaque(false);
		btnEliminarPaciente.setContentAreaFilled(false);
		btnEliminarPaciente.setBorderPainted(false);
		eliminarPaciente.add(btnEliminarPaciente, BorderLayout.CENTER);
		
		JPanel agregarAdmin = new JPanel();
		agregarAdmin.setBounds(749, 200, 97, 115);
		agregarAdmin.setOpaque(false);
		try {
        	agregarAdmin.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                agregarAdmin.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		getContentPane().add(agregarAdmin);
		agregarAdmin.setLayout(new BorderLayout(0, 0));
		JButton btnAgregarAdmin = new JButton("");
		btnAgregarAdmin.setOpaque(false);
		btnAgregarAdmin.setContentAreaFilled(false);
		btnAgregarAdmin.setBorderPainted(false);
		agregarAdmin.add(btnAgregarAdmin, BorderLayout.CENTER);
		
		
		
		JPanel modificarAdmin = new JPanel();
		modificarAdmin.setBounds(749, 364, 97, 115);
		modificarAdmin.setOpaque(false);
		try {
        	modificarAdmin.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                modificarAdmin.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(modificarAdmin);
		modificarAdmin.setLayout(new BorderLayout(0, 0));
		JButton btnModifcarAdmin = new JButton("");
		btnModifcarAdmin.setOpaque(false);
		btnModifcarAdmin.setContentAreaFilled(false);
		btnModifcarAdmin.setBorderPainted(false);
		
		modificarAdmin.add(btnModifcarAdmin, BorderLayout.CENTER);
		
		JPanel eliminarAdmin = new JPanel();
		eliminarAdmin.setBounds(749, 521, 97, 115);
		eliminarAdmin.setOpaque(false);
		try {
        	eliminarAdmin.setForeground(SystemColor.controlHighlight);
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
                eliminarAdmin.setBorder(borde);
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		getContentPane().add(eliminarAdmin);
		eliminarAdmin.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarAdmin = new JButton("");
		btnEliminarAdmin.setOpaque(false);
		btnEliminarAdmin.setContentAreaFilled(false);
		btnEliminarAdmin.setBorderPainted(false);
		eliminarAdmin.add(btnEliminarAdmin, BorderLayout.CENTER);
		
		
		JLabel lblAgregarDoctor = new JLabel("Agregar");
		lblAgregarDoctor.setForeground(new Color(0, 0, 128));
		lblAgregarDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarDoctor.setFont(letraTexto2);
		lblAgregarDoctor.setBounds(120, 317, 97, 27);
		getContentPane().add(lblAgregarDoctor);
		
		JLabel lblModificarDoctor = new JLabel("Modificar");
		lblModificarDoctor.setForeground(new Color(0, 0, 128));
		lblModificarDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarDoctor.setFont(letraTexto2);
		lblModificarDoctor.setBounds(120, 487, 97, 20);
		getContentPane().add(lblModificarDoctor);
		
		JLabel lblEliminarDoctor = new JLabel("Eliminar");
		lblEliminarDoctor.setForeground(new Color(0, 0, 128));
		lblEliminarDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarDoctor.setFont(letraTexto2);
		lblEliminarDoctor.setBounds(120, 632, 97, 20);
		getContentPane().add(lblEliminarDoctor);
		
		JLabel lblAgregarPaciente = new JLabel("Agregar");
		lblAgregarPaciente.setForeground(new Color(0, 0, 128));
		lblAgregarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarPaciente.setFont(letraTexto2);
		lblAgregarPaciente.setBounds(437, 317, 97, 27);
		getContentPane().add(lblAgregarPaciente);
		
		JLabel lblModificarPaciente = new JLabel("Modificar");
		lblModificarPaciente.setForeground(new Color(0, 0, 128));
		lblModificarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarPaciente.setFont(letraTexto2);
		lblModificarPaciente.setBounds(437, 487, 97, 20);
		getContentPane().add(lblModificarPaciente);
		
		JLabel lblEliminarPaciente = new JLabel("Eliminar");
		lblEliminarPaciente.setForeground(new Color(0, 0, 128));
		lblEliminarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarPaciente.setFont(letraTexto2);
		lblEliminarPaciente.setBounds(437, 634, 97, 17);
		getContentPane().add(lblEliminarPaciente);
		
		JLabel lblAgregarAdmin = new JLabel("Agregar");
		lblAgregarAdmin.setForeground(new Color(0, 0, 128));
		lblAgregarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarAdmin.setFont(letraTexto2);
		lblAgregarAdmin.setBounds(749, 317, 97, 27);
		getContentPane().add(lblAgregarAdmin);
		
		JLabel lblModificarAdmin = new JLabel("Modificar");
		lblModificarAdmin.setForeground(new Color(0, 0, 128));
		lblModificarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarAdmin.setFont(letraTexto2);
		lblModificarAdmin.setBounds(749, 487, 97, 20);
		getContentPane().add(lblModificarAdmin);
		
		JLabel lblEliminarAdmin = new JLabel("Eliminar");
		lblEliminarAdmin.setForeground(new Color(0, 0, 128));
		lblEliminarAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarAdmin.setFont(letraTexto2);
		lblEliminarAdmin.setBounds(749, 634, 97, 17);
		getContentPane().add(lblEliminarAdmin);
		
		
	}
}
