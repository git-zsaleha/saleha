package javaproject;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class SendEmail {
	      public static void main(String[] args) {
	    	  String to="zulsaleha1212@gmail.com";
	  		
	  		String from="safa78614@gmail.com";
	  		
	  		String host="8080";
	  		
	  		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	  		
	  		Properties properties = System.getProperties();
	  		
	  		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
	  		properties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	  		properties.setProperty("mail.smtp.socketFactory.fallback", "false");
	  		properties.setProperty("mail.smtp.port", "465");
	  		properties.setProperty("mail.smtp.socketFactory.port", "465");
	  		properties.put("mail.smtp.auth", "true");
	  		properties.put("mail.debug", "true");
	  		properties.put("mail.store.protocol", "pop3");
	  		properties.put("mail.transport.protocol", "smtp");
	  		final String username = "safa78614@gmail.com";
	  		final String password = "";
	  	    
	  	    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

	              protected PasswordAuthentication getPasswordAuthentication() {

	                  return new PasswordAuthentication(username,password);

	              }

	          });
	  		
	  		try {
	  			 MimeMessage message = new MimeMessage(session);
	  			 message.setFrom(new InternetAddress(from));
	  			 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	  			 message.setSubject("This is the Subject Line!");
	  			 message.setText("This is actual message");
	  			 Transport.send(message);
	  	         System.out.println("Sent message successfully....");
	  		} catch(Exception e) {
	  			e.printStackTrace();
	  		}
	   }
	}


