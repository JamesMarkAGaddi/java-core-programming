package org.acumen.training.codes;

public class MyStringBuilder { // single-threaded

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("This is a stringbuilder.");// asign agad sa constructor

		// append
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" A char sequence.");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// you can add more values but the address won't change in stringbuilder unlike
		// string
		// unless you instantiate again

		// INsert anything
		sb.insert(0, 'S');
		System.out.println(sb);
		sb.insert(24, " object");
		System.out.println(sb);

		// update
		// replace a character
		sb.setCharAt(0, 'V');
		System.out.println(sb);
		sb.replace(0, 5, "There");
		System.out.println(sb);

		// delete
		sb.deleteCharAt(sb.length() - 5);
		System.out.println(sb);
		sb.delete(31, sb.length() - 1);
		System.out.println(sb);

		// reverse
		sb.reverse();
		System.out.println(sb);

		// resize
		sb.setLength(0); // empty
		System.out.println(sb.hashCode());

		String str = sb.toString();
		System.out.println(str);

		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		sb2.append("ddasdasfdsffsssssasdfsafsadfsfsafsafd");
		System.out.println(sb2);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());

	}

}
