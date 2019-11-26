/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maildetection;

/**
 *
 * @author Saurabh
 */

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMessageAuth {
    
    
    static String fromemail="gmail.com";
    static String frompassw="Password";
    static String toemail="";
    static String topassw="";
    
    public SendMessageAuth()
    {
        
    }

private static final String SMTP_HOST_NAME = "smtp.gmail.com";
private static final String SMTP_PORT = "465";
private static final String SSL_FACTORY =
"javax.net.ssl.SSLSocketFactory";

public void sendSSLMessage1(String recipient1, String subject,
String message) throws MessagingException 
{

Properties props = new Properties();
props.put("mail.smtp.host", SMTP_HOST_NAME);
props.put("mail.smtp.auth", "true");
props.put("mail.debug", "true");
props.put("mail.smtp.port", SMTP_PORT);
props.put("mail.smtp.socketFactory.port", SMTP_PORT);
props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
props.put("mail.smtp.socketFactory.fallback", "false");

Session session = Session.getDefaultInstance(props,
new javax.mail.Authenticator() {

protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(fromemail, frompassw);
}
});



MimeMessage message1 =new MimeMessage(session);
message1.setFrom(new InternetAddress(fromemail));

message1.addRecipient(Message.RecipientType.TO,new InternetAddress(recipient1));

message1.setSubject(subject);

// create the message part
MimeBodyPart messageBodyPart =new MimeBodyPart();

//fill message
messageBodyPart.setText(message);

Multipart multipart = new MimeMultipart();
multipart.addBodyPart(messageBodyPart);

message1.setContent(multipart);

Transport.send( message1 );
}

} 
