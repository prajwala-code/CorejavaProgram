package com.tnsif.API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllIntermediateOps {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,2,3,4,5,5,6,7,8,9);
		List<Integer> doubled=numbers.stream()
				.map(n->n*2)
				.collect(Collectors.toList());
		System.out.println("Doubled  " +doubled );
		List<Integer> evens=numbers.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		System.out.println("Even :" +evens);
		List<Integer> uniqueNumbers =numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("uniqueNumbers" + uniqueNumbers);
		List<Integer> sortedNumbers =numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("sortedNumbers" + sortedNumbers);
		List<Integer> LimitedNumbers =numbers.stream()
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("LimitedNumbers" + LimitedNumbers);
		List<Integer> Skipumbers =numbers.stream()
				.skip(3)
				.collect(Collectors.toList());
		System.out.println("Skipumbers" + Skipumbers);
	}
}

				

