package org.acumen.training.codes;
//tis is an example of encapsulation

//ganto mga API

public class Account {// java bean

	private String accountId;
	private String accountName;
	private Double amount;

	// reference>source>generate getter setter

	// getter - accessor
	// get has no local param
	// public return type
	// pwede is kapag bool
	// get and setter partnership dapat

	// setter-mutator
	// setters isa lang ang local param
	// setters always public void
	// role is to update the vaue of the field

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
