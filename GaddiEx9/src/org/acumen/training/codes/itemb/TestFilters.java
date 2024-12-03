package org.acumen.training.codes.itemb;

public class TestFilters {
	
    public static void main(String[] args) {

        CharSequence[] testArray = { "bob", "radar", "hello", "world", "sos", "cs", "boss" };

        // Testing the ShortStringFilter
        IFilter<CharSequence> shortFilter = new ShortStringFilter();
        CharSequence[] shortFiltered = MyFilter.filter(testArray, shortFilter);
		MyFilter.displayResults(shortFiltered);

        // Testing the EndsWithSFilter
        IFilter<CharSequence> endsWithSFilter = new EndsWithSFilter();
        CharSequence[] endsWithSFiltered = MyFilter.filter(testArray, endsWithSFilter);
        MyFilter.displayResults(endsWithSFiltered);

        // Testing the PalindromeFilter5
        IFilter<CharSequence> palindromeFilter = new PalindromeFilter();
        CharSequence[] palindromeFiltered = MyFilter.filter(testArray, palindromeFilter);
        MyFilter.displayResults(palindromeFiltered);
        
    }
}
