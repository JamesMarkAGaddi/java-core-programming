package org.acumen.training.codes;

public class Exercise {

	public static void main(String[] args) {

		String html = "<html><body><p>Juan Luna </p><p>Maria Clara</p></body></html>";
		String oldHtml = String.format("Unfiltered html: %s", html);
		System.out.println(oldHtml);
		
		html = html.replaceAll("(\\<[a-z]*\\>)|(\\<\\/[a-z]*\\>)*", "");
		String newHtml = String.format("Filtered html: %s", html);
		System.out.println(newHtml);

		String[] words2 = html.split("\\s+");
		String[] names = new String[2];
		
		names[0] = words2[0] + " " + words2[1];
		names[1] = words2[2] + " " + words2[3];

		System.out.println("Names array:");
		for (int i = 0; i < names.length; i++) {
			System.out.println("Index " + i + ": " + names[i]);
		}
	}
}
