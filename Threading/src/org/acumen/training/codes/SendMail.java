package org.acumen.training.codes;

public class SendMail {

	public static void main(String[] args) {

		Mail mail = new Mail();
		mail.setMessage("Kill Bill!");
//
//		//Inter-object communication ang tawag dine
//		MailMan mailer = new MailMan();
//		mailer.setMail(mail); //dito nagset ng waiting time
//
//		Recipient recipient = new Recipient();
//		recipient.setMail(mail);
//		
//		Mail mail2 = recipient.getMail(); //dito nagwawait si recepient
//		System.out.println(mail2.getMessage());

		MailMan mailMan = new MailMan(mail);
		Recipient recipient = new Recipient(mail);
		
		mailMan.start();
		recipient.start();
		
		String messageString = recipient.getMail().getMessage();
		System.out.println(messageString);
	}
}
