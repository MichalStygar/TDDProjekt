package it.TDDProjekt;
import java.io.IOException;
import java.text.ParseException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {
    public void sendEmail(String fileName, XDate xDate, String smtpHost, int smtpPort) throws IOException, ParseException, AddressException, MessagingException {
        Employee employee = new Employee("Jan", "Nowak", "2022-01-26", "jan@nowak.com");
        String recipient = employee.getEmail();
        String body = "Mr. "+employee.getSurName()+" "+employee.getName()  +", the subscription to movies ends tomorrow."
                + "Your account is: "+employee.getEmail()+"."+" Expiration date: "+ (xDate.getDay()+1)+"-0"+xDate.getMonth()+"-"+xDate.getYear();
        String subject = "End of subscription";

        java.util.Properties props = new java.util.Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.port", "" + smtpPort);
		Session session = Session.getInstance(props, null);

		// Construct the message
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("sender@here.com"));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
		msg.setSubject(subject);
		msg.setText(body);

		// Send the message
		Transport.send(msg);
		System.out.println("Message sent!!!");
    
    }
}
