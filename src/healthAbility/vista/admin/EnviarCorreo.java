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
import healthAbility.vista.Login;
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
public class EnviarCorreo extends VentanaBase /*implements ActionListener*/{
	//Parte de los campos de la pantalla "VentanaCorreo"
	private JPanel contentPane;
	private JTextField correoDestino;
	private JTextField asunto;
	JButton btnGuardar, btnRegres ;
	private JTextField correoOrigen;
	private JTextField contrasena;
	private JTextField servidor;
	private JTextArea mensaje;
	
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
		getContentPane().add(lblEscribirUnCorreo, BorderLayout.NORTH);
		
		//Destino del correo
		JLabel lblCorreo = new JLabel("Para:");
		lblCorreo.setBounds(407, 212, 83, 26);
		getContentPane().add(lblCorreo);
		correoDestino = new JTextField("cliente@gmail.com");
		lblCorreo.setFont(letra1);
		correoDestino.setBounds(501, 219, 179, 26);
		getContentPane().add(correoDestino);
		correoDestino.setColumns(10);
		
		
		
		//Asunto del correo
		JLabel lblAsunto = new JLabel("Asunto:");
		lblAsunto.setBounds(25, 286, 83, 20);
		getContentPane().add(lblAsunto);
		asunto = new JTextField("Prueba JavaMail");
		lblAsunto.setFont(letra1);
		asunto.setBounds(149, 290, 354, 26);
		getContentPane().add(asunto);
		asunto.setColumns(10);
		
		//Mensaje que se enviará
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setFont(letra1);
		lblMensaje.setBounds(24, 321, 134, 26);
		getContentPane().add(lblMensaje);
		
		mensaje = new JTextArea("Escriba el mensaje ");
		mensaje.setBorder(new LineBorder(Color.LIGHT_GRAY));
		mensaje.setBounds(149, 358, 531, 223);
		getContentPane().add(mensaje);
		
		JLabel lblOrigen = new JLabel("Origen: ");
		lblOrigen.setFont(letra1);
		lblOrigen.setBounds(24, 171, 104, 26);
		getContentPane().add(lblOrigen);
		
		//Remitente del correo
		correoOrigen = new JTextField("soporte@papayanator.com");
		correoOrigen.setColumns(10);
		correoOrigen.setBounds(149, 178, 179, 26);
		getContentPane().add(correoOrigen);
		JLabel lblContraseña = new JLabel("Constrase\u00F1a:");
		lblContraseña.setFont(letra1);
		lblContraseña.setBounds(24, 212, 134, 26);
		getContentPane().add(lblContraseña);
		contrasena = new JPasswordField("*********");
		contrasena.setColumns(10);
		contrasena.setBounds(149, 219, 179, 26);
		getContentPane().add(contrasena);
		
		
		
		//Servidor que se utilizará para enviar el correo
		JLabel labelServidor = new JLabel("Servidor:");
		labelServidor.setBounds(407, 175, 115, 26);
		labelServidor.setFont(letra1);
		getContentPane().add(labelServidor);
		servidor = new JTextField("smtp.gmail.com");
		servidor.setColumns(10);
		servidor.setBounds(501, 178, 179, 26);
		getContentPane().add(servidor);
		
		
		JPanel regresar = new JPanel();
		regresar.setBounds(75, 585, 60, 60);
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
		guardar.setBounds(818, 585, 60, 60);
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
				int confirmado = JOptionPane.showConfirmDialog(null, "El correo se enviará, ¿desea enviar el mensaje?", null, JOptionPane.YES_NO_OPTION);
	    		if(JOptionPane.YES_OPTION == confirmado){
	    		papayanatorSiEnviaCorreos();}
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true); 
				setVisible(false);
			}
		});
		btnGuardar.setOpaque(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		guardar.add(btnGuardar);
	}
	
	

	
	//Funcion para enviar el correo
	private boolean papayanatorSiEnviaCorreos(){
		try{
			
			//propiedades de la conexion
			Properties props = new Properties();
	        props.setProperty("mail.smtp.host",  "smtp.gmail.com");
	        props.setProperty("mail.smtp.starttls.enable", "true");
	        props.setProperty("mail.smtp.port", "587");
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
        message.setSubject( str_Asunto );        
        message.setText( str_Mensaje );
	    
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
		
	/*public void actionPerformed(ActionEvent e) {
    	if (e.getSource()==btnGuardar){
    		int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que desa cerrar sin enviar el correo?", null, JOptionPane.YES_NO_OPTION);
    		if(JOptionPane.YES_OPTION == confirmado)
    		papayanatorSiEnviaCorreos();
        	this.setVisible(false);
    	}
    	if (e.getSource()==btnRegres){
    		int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que desa cerrar sin enviar el correo?", null, JOptionPane.YES_NO_OPTION);
    		if (JOptionPane.YES_OPTION == confirmado)
        		this.setVisible(false);
    	}
    }*/
}