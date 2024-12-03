package org.acumen.training.codes;

public class MathLib<E extends Number> {
	
	public E oper1;
	public E oper2;
	//@SuppressWarnings("unchecked")
	//public E[] arrOpers = (E[]) new Object[0];
	public E[] arrOpers;
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public long subtract(long x, long y) {
		return x - y;
	}
	
	public double subtract(double x, double y) {
		return x - y;
	}
	
	public int subtract(E x, E y) { // String, StringBuilder, Character, Float
		/*
		if (x instanceof String && y instanceof String) {
			String xStr = (String) x;
			String yStr = (String) y;
			return xStr.compareTo(yStr);
		} else if (x instanceof StringBuilder && y instanceof StringBuilder) {
			StringBuilder xSb = (StringBuilder) x;
			StringBuilder ySb = (StringBuilder) x;
			return xSb.compareTo(ySb);
		} else if (x instanceof Character && y instanceof Character) {
			Character bigX = (Character) x;
			Character bigY = (Character) y;
			return bigX.compareTo(bigY);
		} else */
		
		if (x instanceof Float && y instanceof Float){
			Float xFlt = (Float) x;
			Float yFlt = (Float) y;
			//float xprim = xFlt; // auto-unboxing
			//float yprim = yFlt;
			return xFlt.compareTo(yFlt); 
		}
		return -1;
	}
	
	

}
