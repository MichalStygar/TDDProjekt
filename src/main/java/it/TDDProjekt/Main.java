package it.TDDProjekt;

import java.io.IOException;
import java.text.ParseException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Main {

	public static void main(String[] args) throws AddressException, IOException, ParseException, MessagingException {
		EmailService service = new EmailService();
		service.sendEmail("C:\\Users\\micha\\Documents\\TDD-Projekt\\TDDProjekt\\employee_data.txt", new XDate(), "localhost", 25);
	}

}
