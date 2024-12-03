package org.acumen.training.codes;

public class ContextGrammar {

	public String parseCfg(String input) {

		char[] chars = input.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < chars.length; i++) {
			char current = chars[i];

			switch (current) {
			case 'a': {
				sb.append("aa");
			}
				break;
			case 'b': {
				sb.append('b');
				if (i + 1 < chars.length && chars[i + 1] == 'b') {
					i++;
				}
			}
				break;
			case 'c': {
				if (i + 1 < chars.length && chars[i + 1] == 'c') {
					sb.append("cc");
					i++;
				}
			}
				break;
			default: {
				chars = null;
			}
				break;
			}
		}
		return sb.toString();
	}
}
