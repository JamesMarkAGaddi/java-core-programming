package org.acumen.training.codes;

public class Recipient extends Thread { // pag di mo yan nilagyan ng extends, di sya magigin thread, object lang sya

	private Mail mail;

	public Recipient() {

	}

	public Recipient(Mail mail) {
		this.mail = mail;
	}

	public Mail getMail() {

		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public void run() { // this is the unit of work kaya dpaat to ioverride
		// para maglagay ng time before magrun
		synchronized (mail) {
			System.out.println("I am waiting");
			System.out.println("Mail received");
		}

	}

}
