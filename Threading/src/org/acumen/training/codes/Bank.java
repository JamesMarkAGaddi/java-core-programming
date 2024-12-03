package org.acumen.training.codes;

public class Bank {

	private Double amount;
	private String owner;

	public Bank(Double amount, String owner) {
		this.amount = amount;
		this.owner = owner;
	}

	public synchronized Double deposit(Double amount) {
		double amt = amount;
		if (amt > 0) {
			this.amount += amt;
		}

		return this.amount;
	}

	public synchronized Double withdraw(Double amount) {
		double amt = amount;
		if ((this.amount - amt) >= 0) {
			this.amount -= amt;
		}

		return this.amount;
	}
}
