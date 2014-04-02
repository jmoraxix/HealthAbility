/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Apr 1, 2014
 */
package healthAbility.vista.paciente;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.Login;
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

/**
 * @author Diego Apr 1, 2014
 *
 */
public class VerCalificaciones extends VentanaBase {
	public Font letraTexto1 = new Font("Georgia", Font.PLAIN, 22);
	public Font letraTexto2 = new Font("Georgia", Font.PLAIN, 18);
	public Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);

	
	public VerCalificaciones() {
		
		JLabel lblVerCalificaciones = new JLabel("Ver Calificaciones");
		lblVerCalificaciones.setBounds(73, 155, 343, 44);
		lblVerCalificaciones.setFont(letraTitulo);
		getContentPane().add(lblVerCalificaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(73, 229, 804, 377);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setOpaque(false);
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{255, 45, 45, 30};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.5, 0.5, 0.3};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNombreMdico = new JLabel("Nombre M\u00E9dico");
		lblNombreMdico.setFont(letra1);
		GridBagConstraints gbc_lblNombreMdico = new GridBagConstraints();
		gbc_lblNombreMdico.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreMdico.gridx = 0;
		gbc_lblNombreMdico.gridy = 0;
		panel.add(lblNombreMdico, gbc_lblNombreMdico);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Georgia", Font.PLAIN, 22));
		GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
		gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidad.gridx = 1;
		gbc_lblEspecialidad.gridy = 0;
		panel.add(lblEspecialidad, gbc_lblEspecialidad);
		
		JLabel lblCalificacion = new JLabel("Calificaci\u00F3n");
		lblCalificacion.setFont(new Font("Georgia", Font.PLAIN, 22));
		GridBagConstraints gbc_lblCalificacion = new GridBagConstraints();
		gbc_lblCalificacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalificacion.gridx = 2;
		gbc_lblCalificacion.gridy = 0;
		panel.add(lblCalificacion, gbc_lblCalificacion);
		
		JComboBox comboBoxEspecialidad = new JComboBox();
		comboBoxEspecialidad.setBounds(595, 170, 144, 26);
		getContentPane().add(comboBoxEspecialidad);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(761, 170, 116, 27);
		getContentPane().add(btnBuscar);
		
		JPanel regresar = new JPanel();
		regresar.setBounds(73, 605, 60, 60);
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
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true); 
				setVisible(false);
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);
		
		JPanel guardar = new JPanel();
		guardar.setBounds(817, 605, 60, 60);
		guardar.setOpaque(false);
		try {
			guardar.setForeground(SystemColor.controlHighlight);
			try {
				URL imagen = HealthAbility.class.getResource("vista/imagenes/check.png");
				BufferedImage  img = ImageIO.read(imagen);
				BgBorder borde = new BgBorder( img );
				guardar.setBorder(borde);
			} catch (Exception e) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		getContentPane().add(guardar);
		guardar.setLayout(new BorderLayout(0, 0));
		getContentPane().add(guardar);

		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true); 
				setVisible(false);
			}
		});
		btnGuardar.setOpaque(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		guardar.add(btnGuardar);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(145, 627, 157, 26);
		getContentPane().add(lblRegresar);
		
		JLabel lblGuardar = new JLabel("Guardar");
		lblGuardar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblGuardar.setBounds(697, 627, 101, 26);
		getContentPane().add(lblGuardar);
		
	}
}
