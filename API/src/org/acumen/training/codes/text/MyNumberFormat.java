package org.acumen.training.codes.text;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MyNumberFormat { // just about formatting ang API na to 
	
	public static void main(String[] args) {
		
		long  popSize = 8687302932453L;
		double billMoney = 98643647456982345.162748536;
		
		//comma putting comma every 3 digits para di na mano-mano ang paglalagay 
		NumberFormat format1 = NumberFormat.getNumberInstance(Locale.GERMAN);
		String popSizeFmt = format1.format(popSize);
		System.out.println(popSizeFmt);
		
		//currency
		//how to adjust decimal places 
		NumberFormat format2 = NumberFormat.getCurrencyInstance();
		format2.setMinimumFractionDigits(3);
		format2.setMaximumFractionDigits(5); //max number of decimals
		format2.setRoundingMode(RoundingMode.FLOOR);
		format2.setCurrency(Currency.getInstance("PHP"));///currency dapat
		String billMoneyFmt = format2.format(billMoney);
		System.out.println(billMoneyFmt);
		
		//percentage
		float food = 0.500F;
		float transpo = 0.30F;
		float clothing = 0.20F;
		
		System.out.println(food * 100 + "%"); //engk
		NumberFormat format3 = NumberFormat.getPercentInstance();
		String foodFmt = format3.format(food);
		System.out.println(foodFmt);
		String transpoFmt = format3.format(transpo);
		System.out.println(transpoFmt);
		String clothingFmt = format3.format(clothing);
		System.out.println(clothingFmt);
		
		//
		
		
	}
}
