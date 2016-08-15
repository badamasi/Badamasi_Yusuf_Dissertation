/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.*;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
public class EmailSender {
    private String user = "danyusuf2211@gmail.com";
    private String pass = "bad12345";
    EmailSender(String to, String sub, String msg){
        Properties props = new Properties();
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                return new javax.mail.PasswordAuthentication(user, pass);
            }
        });
        try{
            Message  message = new MimeMessage(session);
                message.setFrom(new InternetAddress("no-reply@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                message.setSubject(sub);
                message.setText(msg);
                
                Transport.send(message);
                JOptionPane.showMessageDialog(null, "Message sent successfully!");
                
        }catch(Exception ex){
            System.out.print(ex);
        }
        
    }
   
}
