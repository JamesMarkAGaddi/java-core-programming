package org.acumen.training.codes.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyRegex {

	public static void main(String[] args) {
		// to locate patterns

		// validation
		String input = "Thefoxjumpsoverthewindow";
		String rule = "[a-zA-Z0-9\\.]+";
		// Occurence rules = * isa lang, + more than 1, ? kahit ilan
		System.out.println(Pattern.matches(rule, input));

		// Splitting
		// you should use Matcher
		String input2 = "The fox jumps over the window";
		String rule2 = "[ \\.]";
		
		Pattern pat = Pattern.compile(rule2); // compiler the rule
		String[] words = pat.split(input2);
		System.out.println(Arrays.toString(words));

		rule = "\\w+";
		Pattern pat2 = Pattern.compile(rule); // compiler the rule
		Matcher matcher = pat2.matcher(input2);
		while (matcher.find()) {
			System.out.println("%s found in %d %d".formatted(matcher.group(), matcher.start(), matcher.end()));
		}

	}

}
