package org.acumen.training.codes.test;

import org.acumen.training.codes.ArrDataConversion;

public class TestArrDataConversion {

	public static void main(String[] args) {
		ArrDataConversion adc = new ArrDataConversion();

		adc.processArrData(97, 90, 82, 0);
		adc.processArrData(102, 105, 109, 0);
		adc.processArrData(120, 99, 101, 0);
		adc.processArrData(49, 105, 116, 0);
		adc.processArrData(104, 12, 48, 108);

	}
}
