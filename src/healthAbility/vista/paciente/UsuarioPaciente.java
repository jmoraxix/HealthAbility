/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 25, 2014
 */
package healthAbility.vista.paciente;
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
 * @author Diego Mar 25, 2014
 *
 */
public class UsuarioPaciente extends VentanaBase {

	Dimension tamTotal = HealthAbility.getTamPantalla();
	 public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 22);
	 public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 18);
	    
	
	public UsuarioPaciente(){
		//getContentPane().setLayout(null);
		
		JPanel agregarPaciente = new JPanel();
		agregarPaciente.setBounds(120, 200, 97, 115);
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
		modificarPaciente.setBounds(120, 364, 97, 115);
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
		eliminarPaciente.setBounds(120, 521, 97, 115);
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
		try {
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try {
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try {
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try {
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/agregar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try {
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/actualizar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		try {
            try {
                URL imagen = HealthAbility.class.getResource("vista/imagenes/eliminar.png");
                BufferedImage  img = ImageIO.read(imagen);
                BgBorder borde = new BgBorder( img );
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
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
		
		
	}
}
