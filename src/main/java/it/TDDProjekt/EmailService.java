package it.TDDProjekt;
import java.io.IOException;
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {
    public void sendEmail(String fileName, XDate xDate, String smtpHost, int smtpPort) throws IOException, ParseException, AddressException, MessagingException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
		String str = "";
		str = in.readLine();
		while ((str = in.readLine()) != null) {
			String[] employeeData = str.split(", ");
			Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2], employeeData[3]);
			System.out.println(xDate.getDate());
			if(xDate.isSameDate()) {
				String recipient = employee.getEmail();
				String body = "Mr. "+employee.getSurName()+" "+employee.getName()  +", the subscription to movies ends tomorrow."
						+ "Your account is: "+employee.getEmail()+"."+" Expiration date: "+ (xDate.getDay()+1)+"-0"+xDate.getMonth()+"-"+xDate.getYear();
				String subject = "End of subscription";
				System.out.println(body);
				sendMessage(smtpHost, smtpPort, "sender@here.com", subject, body, recipient);
			}
		}
    }

    private void sendMessage(String smtpHost, int smtpPort, String sender, String subject, String body, String recipient) throws AddressException, MessagingException {
		// Create a mail session
		java.util.Properties props = new java.util.Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.port", "" + smtpPort);
		Session session = Session.getInstance(props, null);

		// Construct the message
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(sender));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
		msg.setSubject(subject);
		msg.setText(body);

		// Send the message
		Transport.send(msg);
		System.out.println("Message sent!!!");
	}
}
