package org.acumen.training.codes.itemb;

//Filter for Strings with At Most 3 Characters
public class ShortStringFilter implements IFilter<CharSequence> {
	@Override
	public boolean accept(CharSequence x) {
		return x.length() <= 3;
	}
}
