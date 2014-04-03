/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Apr 1, 2014
 */
package healthAbility.vista.admin;

import healthAbility.HealthAbility;
import healthAbility.vista.BgBorder;
import healthAbility.vista.VentanaBase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
/*
 * Librerias java mail
 */


/**
 * @author Diego Apr 1, 2014
 *
 */
@SuppressWarnings("serial")
public class EnviarCorreo extends VentanaBase implements ActionListener {
	//Parte de los campos de la pantalla "VentanaCorreo"
	private JTextField correoDestino;
	private JTextField asunto;
	JButton btnGuardar, btnRegres ;
	private JTextField correoOrigen;
	private JTextField contrasena;
	private JTextArea mensaje;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String server ="smtp.gmail.com", puerto = "587";
	private JRadioButton rdbtnGmail, rdbtnHotmail, rdbtnYahoo;
	
	Font letra1 = new Font("Georgia", Font.PLAIN, 22);
	Font letraTitulo = new Font("Georgia", Font.PLAIN, 28);


	/**
	 * Create the frame.
	 */
	public EnviarCorreo(){
		/*
		 * Creación de los componentes del Frame
		 */
		JLabel lblEscribirUnCorreo = new JLabel("Escribir un correo");
		lblEscribirUnCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblEscribirUnCorreo, BorderLayout.NORTH);
		
		//Destino del correo
		JLabel lblCorreo = new JLabel("Para:");
		lblCorreo.setBounds(384, 221, 83, 26);
		add(lblCorreo);
		correoDestino = new JTextField("@gmail.com");
		lblCorreo.setFont(letra1);
		correoDestino.setBounds(442, 216, 238, 35);
		add(correoDestino);
		correoDestino.setColumns(10);
		
		//Asunto del correo
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setBounds(44, 314, 83, 20);
		add(lblAsunto);
		asunto = new JTextField("Prueba JavaMail");
		lblAsunto.setFont(letra1);
		asunto.setBounds(149, 315, 354, 26);
		add(asunto);
		asunto.setColumns(10);
		
		//Mensaje que se enviará
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setFont(letra1);
		lblMensaje.setBounds(44, 352, 104, 26);
		add(lblMensaje);
		
		mensaje = new JTextArea();
		mensaje.setBorder(new LineBorder(Color.LIGHT_GRAY));
		mensaje.setBounds(149, 358, 531, 223);
		add(mensaje);
		
		JLabel lblOrigen = new JLabel("Origen:");
		lblOrigen.setFont(letra1);
		lblOrigen.setBounds(44, 221, 83, 26);
		add(lblOrigen);
		
		//Remitente del correo
		correoOrigen = new JTextField("@gmail.com");
		correoOrigen.setColumns(10);
		correoOrigen.setBounds(125, 216, 235, 35);
		add(correoOrigen);
		
		JLabel lblContraseña = new JLabel("Constrase\u00F1a:");
		lblContraseña.setFont(letra1);
		lblContraseña.setBounds(44, 262, 134, 26);
		add(lblContraseña);
		contrasena = new JPasswordField();
		contrasena.setColumns(10);
		contrasena.setBounds(181, 262, 179, 26);
		add(contrasena);
		
		JPanel regresar = new JPanel();
		regresar.setBounds(84, 585, 60, 60);
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
		regresar.setLayout(new BorderLayout(0, 0));
		add(regresar);

		JButton btnRegres = new JButton("");
		btnRegres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que desa cerrar sin enviar el correo?", null, JOptionPane.YES_NO_OPTION);
	    		if(JOptionPane.YES_OPTION == confirmado){
					MenuPrincipal menuPrincipal = new MenuPrincipal();
					menuPrincipal.setVisible(true); 
					setVisible(false);
	    		}
			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		regresar.add(btnRegres);
		
		JPanel guardar = new JPanel();
		guardar.setBounds(787, 585, 60, 60);
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
		add(guardar);
		guardar.setLayout(new BorderLayout(0, 0));
		add(guardar);

		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(this);
		btnGuardar.setOpaque(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		guardar.add(btnGuardar);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblRegresar.setBounds(149, 592, 104, 37);
		add(lblRegresar);
		
		JLabel lblContinuar = new JLabel("Continuar");
		lblContinuar.setFont(new Font("Georgia", Font.PLAIN, 22));
		lblContinuar.setBounds(684, 592, 115, 37);
		add(lblContinuar);
		
		JLabel lblServidor = new JLabel("Servidor:");
		lblServidor.setFont(letra1);
		lblServidor.setBounds(44, 171, 104, 31);
		add(lblServidor);
		
		rdbtnGmail = new JRadioButton("Gmail");
		rdbtnGmail.addActionListener(this);
		buttonGroup.add(rdbtnGmail);
		rdbtnGmail.setBounds(148, 179, 64, 23);
		rdbtnGmail.setSelected(true);
		rdbtnGmail.setOpaque(false);
		add(rdbtnGmail);
		
		rdbtnHotmail = new JRadioButton("Hotmail");
		rdbtnHotmail.addActionListener(this);
		buttonGroup.add(rdbtnHotmail);
		rdbtnHotmail.setBounds(214, 179, 72, 23);
		rdbtnHotmail.setOpaque(false);
		add(rdbtnHotmail);
		
		rdbtnYahoo = new JRadioButton("Yahoo");
		rdbtnYahoo.addActionListener(this);
		buttonGroup.add(rdbtnYahoo);
		rdbtnYahoo.setBounds(288, 179, 72, 23);
		rdbtnYahoo.setOpaque(false);
		add(rdbtnYahoo);
	}

	//Funcion para enviar el correo
	private boolean healthAbilitySiEnviaCorreos(){
		try{
			
			//propiedades de la conexion
			Properties props = new Properties();
	        props.setProperty("mail.smtp.host",  server);
	        props.setProperty("mail.smtp.starttls.enable", "true");
	        props.setProperty("mail.smtp.port", puerto);
	        props.setProperty("mail.smtp.auth", "true");
	        
	        //preparar sesion
	        Session session = Session.getDefaultInstance(props);
	        
	        // levantar datos
	        String str_De = correoOrigen.getText();
	        String str_PwRemitente = contrasena.getText();               
	        String str_Para = correoDestino.getText();
	        String str_Asunto = asunto.getText();
	        String str_Mensaje = mensaje.getText();
	        
	        //obtener el destino
	        
	        String destinos[] = str_Para.split(",");
	        
	        //cargar el mensaje
	        
	        MimeMessage message = new MimeMessage(session);
	         
	        message.setFrom(new InternetAddress( str_De ));
	        Address [] receptores = new Address [ destinos.length ];
	        int j = 0;
	    while(j<destinos.length){                    
	        receptores[j] = new InternetAddress ( destinos[j] ) ;                   
	        j++;                
	    }
	    
	    //receptores
	    message.addRecipients(Message.RecipientType.TO, receptores);        
        message.setSubject(str_Asunto);        
        message.setText(str_Mensaje);
	    
     // Envio del correo
        Transport t = session.getTransport("smtp");
        t.connect(str_De, str_PwRemitente);
        t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        
     // Cierre de la conexion.
        t.close();
        return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnGuardar){
			int confirmado = JOptionPane.showConfirmDialog(null, "El correo se enviará, ¿desea enviar el mensaje?", null, JOptionPane.YES_NO_OPTION);
    		if(JOptionPane.YES_OPTION == confirmado){
    			boolean enviado = healthAbilitySiEnviaCorreos();
    			if(enviado)
    				JOptionPane.showMessageDialog(this, "Correo enviado!");
    			else
    				JOptionPane.showMessageDialog(this, "Error al enviar el correo.");
    			MenuPrincipal menuPrincipal = new MenuPrincipal();
    			menuPrincipal.setVisible(true); 
    			setVisible(false);
    		}
		} else if(rdbtnGmail.isSelected()){
			server = "smtp.gmail.com";
			puerto = "587";
			correoOrigen.setText("@gmail.com");
			correoDestino.setText("@gmail.com");
		} else if(rdbtnHotmail.isSelected()){
			server = "smtp.live.com";
			puerto = "587";
			correoOrigen.setText("@hotmail.com");
			correoDestino.setText("@hotmail.com");
		} else if(rdbtnYahoo.isSelected()){
			server = "smtp.mail.yahoo.com";
			puerto = "465";
			correoOrigen.setText("@yahoo.com");
			correoDestino.setText("@yahoo.com");
		}
	}
}