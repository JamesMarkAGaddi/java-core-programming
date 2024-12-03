package org.acumen.training.codes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {

	public static void main(String[] args) {
		Stream<Object> data = Stream.empty();
        
		int[] arrData = {10, 20, 30 , 50, 11};
		double[] grades = {99.5, 100.0, 55.6};
		
		IntStream intStreams = IntStream.of(arrData);
		int total = intStreams.sum();
		
		intStreams = IntStream.of(arrData);
		double avg  = intStreams.average().orElse(0.0);
		
		// add all even
		intStreams = IntStream.of(arrData);
		double avgEven = intStreams.filter((num) -> {
			if (num % 2 == 0) {
				return true;
			}
			return false;
		}).average().orElse(0.0);
		System.out.println(total);
		System.out.println(avg);
		System.out.println(avgEven);
		
		DoubleStream gradesStreams = DoubleStream.of(grades);
		
		// if filter 80, add bonus 5 , get the mean
		double gradeMean = gradesStreams
		  .filter((g) -> {
				if (g >= 80) {
					return true;
				}
				return false;
		   })
          .map((g) -> { return g + 5;}).average().orElse(0.0);
		System.out.println(gradeMean);
		
		// Stream operators 
		// creators
		// non-terminating operators
		// terminal operators
		
		List<String> names = new ArrayList<>();
		names.add("Anna");
		names.add("Lorna");
		names.add("Fe");
		
		Stream<String> namesStream = names.stream();
		
		Predicate<String> isNamesMoreThreeLetter = (t) -> {
		      if (t.length() > 3) {
		    	  return true;
		      }
			  return false;
		};
		
		// 3 letter, all caps, merging => String
		
		String allName = namesStream.filter(isNamesMoreThreeLetter)
		           .map((n) -> {return n.toUpperCase();})
		           .reduce((cn, n) -> { return String.join(" ", cn, n);}).get();
		System.out.println(allName);
		
		
		// 3 letter, print all names 
		namesStream = names.stream();
		namesStream.filter(isNamesMoreThreeLetter).forEach((n) -> {
			System.out.println(n);
		});
		
		// 3 letter, HashSet
		namesStream = names.stream();
		Set<String> namesSet = namesStream.filter(isNamesMoreThreeLetter)
		           .collect(Collectors.toUnmodifiableSet());
				
		Optional<Integer> isodd = Optional.of(10);
		
		// Built-in functional interfaces
		
		
		
		Consumer<String> printMessage = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		};
		
		Supplier<String> sayWelcome = () -> {
				return "Welcome";
		};
		
		Function<Integer, Double> convertGrade = (t) -> {
				return t * 1.0;
		};
		
		Comparator<String> compareNames = (o1, o2) -> {
				return o1.compareTo(o2);
		};
		
	}

}
