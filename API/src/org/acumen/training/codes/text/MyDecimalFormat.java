package org.acumen.training.codes.text;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MyDecimalFormat {

	public static void main(String[] args) {

		//like a database may mnemonics, pero dito walang g/groupings, comma lang
		
		long  popSize = 8687302932453L;
		double billMoney = 9864364745695.162748536;
		
		DecimalFormat fmtx = new DecimalFormat();
		String popSizefmtx = fmtx.format(popSize);
		String billMoneyfmtx = fmtx.format(billMoney);
		
		System.out.format("%s \n%s", popSizefmtx, billMoneyfmtx); // nakagrouo na pero nakaint lahat walang decimal places na nakaoutput
		

		DecimalFormat fmt = new DecimalFormat("###,###.###");
		//# it represents a number pero kung walang number, wal asyang gagawin
		//0 it represents a number pero pag wala, ipipilit nya yun
		String popSizefmt = fmt.format(popSize);
		String billMoneyfmt = fmt.format(billMoney);		
		System.out.format("%s \n%s\n", popSizefmt, billMoneyfmt); 
		
		//DecimalFormat fmt2 = new DecimalFormat("\u20B1###,###.00000"); //U20A0.pdf basis ng unicode characters
		fmt.applyPattern("\u20B1###,###.000"); // pag ganto di mo na need mag instatntiate ulit , 
		fmt.setMaximumFractionDigits(5);
		fmt.setRoundingMode(RoundingMode.FLOOR);
		String popSizefmt2 = fmt.format(popSize);
		String billMoneyfmt2 = fmt.format(billMoney);		
		System.out.format("%s \n%s\n", popSizefmt2, billMoneyfmt2); 
		

		//percentage
		float food = 0.500F;
		float transpo = 0.30F;
		float clothing = 0.20F;
		DecimalFormat fmt3 = new DecimalFormat("#%");

		System.out.println(fmt3.format(food));
		System.out.println(fmt3.format(transpo));
		System.out.println(fmt3.format(clothing));
	}
}
