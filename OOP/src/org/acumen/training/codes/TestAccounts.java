package org.acumen.training.codes;

public class TestAccounts {
	
	public static void main(String[] args) {
		
		Account acct1,acct2,acct3;
		
		acct1 = new Account();
		acct1.setAccountId("101");
		acct1.setAccountName("James Mark");
		acct1.setAmount(123543.564);
		
		acct2 = new Account();
		acct2.setAccountId("102");
		acct2.setAccountName("Maria Clara");
		acct2.setAmount(76543543.564);
		
		acct3 = new Account();
		acct3.setAccountId("103");
		acct3.setAccountName("Juan Luna");
		acct3.setAmount(1765433.564);
		
		System.out.println("%s %s %f".formatted(acct1.getAccountId(), acct1.getAccountName(), acct1.getAmount()));
		System.out.println("%s %s %f".formatted(acct2.getAccountId(), acct2.getAccountName(), acct2.getAmount()));
		System.out.println("%s %s %f".formatted(acct3.getAccountId(), acct3.getAccountName(), acct3.getAmount()));



	}
}
