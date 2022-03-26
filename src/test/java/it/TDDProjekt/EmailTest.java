package it.TDDProjekt;
import static org.junit.Assert.*;

import org.junit.*;
import com.dumbster.smtp.*;

public class EmailTest {
    private static final int PORT = 9999;
	private EmailService emailService;
	private SimpleSmtpServer mailServer;
    private XDate xDate;

	@Before
	public void setUp() throws Exception {
		mailServer = SimpleSmtpServer.start(PORT);
		emailService = new EmailService();
        xDate = new XDate();
	}

	@After
	public void tearDown() throws Exception {
		mailServer.stop();
		Thread.sleep(200);
	}

	@Test
	public void willSendEmailTest() throws Exception {

		emailService.sendEmail("employee_data.txt", new XDate("2022-03-24"), "localhost", PORT);
		
		assertEquals("message not sent?", 1, mailServer.getReceivedEmailSize());
		SmtpMessage message = (SmtpMessage) mailServer.getReceivedEmail().next();
		assertEquals("Mr. Nowak Jan, the subscription to movies ends tomorrow.Your account is: jan@nowak.com. Expiration date: "+ (xDate.getDay()+1)+"-0"+xDate.getMonth()+"-"+xDate.getYear(), message.getBody());
		assertEquals("End of subscription", message.getHeaderValue("Subject"));
		String[] recipients = message.getHeaderValues("To");
		assertEquals(1, recipients.length);
		assertEquals("jan@nowak.com", recipients[0].toString());
	}
}
