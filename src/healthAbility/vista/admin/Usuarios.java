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
		
		
		JLabel lblAgregar = new JLabel("Agregar");
		lblAgregar.setForeground(new Color(0, 0, 128));
		lblAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar.setFont(letraTexto2);
		lblAgregar.setBounds(120, 317, 97, 27);
		getContentPane().add(lblAgregar);
		
		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setForeground(new Color(0, 0, 128));
		lblModificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificar.setFont(letraTexto2);
		lblModificar.setBounds(120, 487, 97, 20);
		getContentPane().add(lblModificar);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setForeground(new Color(0, 0, 128));
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setFont(letraTexto2);
		lblEliminar.setBounds(120, 632, 97, 20);
		getContentPane().add(lblEliminar);
		
		JLabel lblAgregar_1 = new JLabel("Agregar");
		lblAgregar_1.setForeground(new Color(0, 0, 128));
		lblAgregar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_1.setFont(letraTexto2);
		lblAgregar_1.setBounds(437, 317, 97, 27);
		getContentPane().add(lblAgregar_1);
		
		JLabel lblModificar_1 = new JLabel("Modificar");
		lblModificar_1.setForeground(new Color(0, 0, 128));
		lblModificar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificar_1.setFont(letraTexto2);
		lblModificar_1.setBounds(437, 487, 97, 20);
		getContentPane().add(lblModificar_1);
		
		JLabel lblEliminar_1 = new JLabel("Eliminar");
		lblEliminar_1.setForeground(new Color(0, 0, 128));
		lblEliminar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar_1.setFont(letraTexto2);
		lblEliminar_1.setBounds(437, 634, 97, 17);
		getContentPane().add(lblEliminar_1);
		
		JLabel lblAgregar_2 = new JLabel("Agregar");
		lblAgregar_2.setForeground(new Color(0, 0, 128));
		lblAgregar_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_2.setFont(letraTexto2);
		lblAgregar_2.setBounds(749, 317, 97, 27);
		getContentPane().add(lblAgregar_2);
		
		JLabel lblModificar_2 = new JLabel("Modificar");
		lblModificar_2.setForeground(new Color(0, 0, 128));
		lblModificar_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificar_2.setFont(letraTexto2);
		lblModificar_2.setBounds(749, 487, 97, 20);
		getContentPane().add(lblModificar_2);
		
		JLabel lblEliminar_2 = new JLabel("Eliminar");
		lblEliminar_2.setForeground(new Color(0, 0, 128));
		lblEliminar_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar_2.setFont(letraTexto2);
		lblEliminar_2.setBounds(749, 634, 97, 17);
		getContentPane().add(lblEliminar_2);
		
		
	}
}
