package org.acumen.training.codes;

public class MailMan extends Thread {

	private Mail mail;

	public MailMan(Mail mail) {
		this.mail = mail;
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;

	}

	@Override
	public void run() { // this is the unit of work kaya dpaat to ioverride
		// para maglagay ng time before magrun
		synchronized (mail) {
			try {
				System.out.println("Sending mail on the way.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
