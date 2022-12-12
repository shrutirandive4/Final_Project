/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

import java.util.Properties;  
import javax.mail.Session;  
import javax.mail.internet.*;
import javax.mail.*;
import javax.mail.MessagingException;
import javax.mail.Transport;
/**
 *
 * @author Davleen Kaur Matta
 */
public class EmailFormat {
    private String to;
    private String from;
    private String textBody;
    private String host = "smtp.gmail.com";
    private String password;
    private String subject;

    public EmailFormat(String to, String message, String sub) {
        this.to = to;
        this.from = "ssdaedproj@gmail.com";
        this.textBody = message;
        this.password = "bmrdymcegupurefv";
        this.subject = sub;
        
    }
  
    public void sendEmail(){
      Properties properties = new Properties();
      properties.setProperty("mail.smtp.host", host);  
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.ssl.trust", "*");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.port", "587"); 
      Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
            return new PasswordAuthentication(from,password);  
      }  
      } );
      try {
         // default MimeMessage object.
        Message message = new MimeMessage(session);

        
         message.setFrom(new InternetAddress(from));

        
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));

       
         message.setSubject(subject);

       
         message.setContent(textBody, "text/html");

        
         Transport.send(message);
         System.out.println("Message Sent Successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }   
}
}