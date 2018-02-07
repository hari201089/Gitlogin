package email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Sendemailoutlook {

	public static void main(String[] args) throws EmailException {
		System.out.println("----------Starting the test-----------");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp-mail.outlook.com");
		email.setSmtpPort(465); //587 for tls
		email.setAuthenticator(new DefaultAuthenticator("hariharan.shankar@wipro.com", "Dec@2017"));
		//email.setStartTLSEnabled(true);
		email.setSSLOnConnect(true);
		email.setFrom("hariharan.shankar@wipro.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("jayalakshmi.r59@wipro.com");
		email.send();
		
		System.out.println("----------Mail sent successfully-----------");

	}

}
