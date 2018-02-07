package email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Sendemail {

	public static void main(String[] args) throws EmailException {
		System.out.println("----------Starting the test-----------");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("hariharan.shankar201089@gmail.com", "ashwin201089"));
		email.setSSLOnConnect(true);
		email.setFrom("hariharan.shankar201089@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("selenium.batchone@gmail.com");
		email.send();
		
		System.out.println("----------Mail sent successfully-----------");

	}

}
