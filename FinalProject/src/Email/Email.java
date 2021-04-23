/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Apoorva Sharma <your.name at your.org>
 */
public class Email {
    String host;  
    final String user;//change accordingly  
    final String password;//change accordingly
    
    public Email(){
        host="smtp.gmail.com";
        user="spacefinder667@gmail.com";
        password="Space@12345";
    }
    
    public void sendEmail(String to, String subject, String body){
        Properties props = new Properties();  
        props.put("mail.smtp.host",host);  
        props.put("mail.smtp.port","587"); 
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {  
            protected PasswordAuthentication getPasswordAuthentication() {  
            return new PasswordAuthentication(user,password);  
            }
        });
        
        try {  
            MimeMessage message = new MimeMessage(session);  
            message.setFrom(new InternetAddress(user));  
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
            message.setSubject(subject);  
            message.setText(body);  
       
            //send the message  
            Transport.send(message);
   
        } catch (MessagingException e) {e.printStackTrace();} 
    }
}
