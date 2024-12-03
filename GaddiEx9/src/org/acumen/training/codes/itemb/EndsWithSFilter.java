package org.acumen.training.codes.itemb;

//Filter for Strings Ending with 's'
public class EndsWithSFilter implements IFilter<CharSequence> {
	@Override
	public boolean accept(CharSequence x) {
		return x.toString().endsWith("s");
	}
}
