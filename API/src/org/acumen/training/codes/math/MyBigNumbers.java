package org.acumen.training.codes.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class MyBigNumbers {
	
	public static void main(String[] args) {
		
		BigInteger bigInt = new BigInteger("8765434428396218063323749530864210321123587654323456789876543206397532841906397532419853064123453264531235645242153645867536435264859786453425326489864534253645843524133214312476643214576453425");
		System.out.println(bigInt);
		
		BigDecimal jeffMoney = new BigDecimal("5467893214870943275943200163018302183.354323");
		System.out.println(jeffMoney);
		
		BigInteger bigInt2 = new BigInteger("10");
		bigInt = bigInt.add(bigInt2); // use same pointer kasi dun mo naman iaadd !!!
		System.out.println(bigInt);		
		
		BigDecimal bigDec2 = new BigDecimal("1213453214210.43253142");
		jeffMoney = jeffMoney.add(bigDec2); // use same pointer kasi dun mo naman iaadd !!!
		System.out.println(jeffMoney);

		//Formatting
		DecimalFormat fmt = new DecimalFormat("###,###");
		System.out.println(fmt.format(bigInt));
		
		DecimalFormat fmt2 = new DecimalFormat("###,###.000");
		fmt2.setMaximumFractionDigits(5);
		System.out.println(fmt2.format(jeffMoney));
				

	}
}
