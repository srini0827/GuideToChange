package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a","b", "c");
		
		strings.forEach(System.out::println);
		
		System.out.println(strings.stream().reduce("", (a,b) -> a + ";" +b));
		
		List<String> stringList = Arrays.asList("ueytytutryhghnbmvhjfdgfderw", "abcd", "abcde", "abcdef", "adsfdasfasfdas", "qwereqwrqewr", "adsfadgcxxv");
		
		System.out.println("Sequential Stream");
		stringList.stream().forEach(a -> System.out.println(a + "-" +a.length()));
		
		System.out.println("Parallel stream");
		
		stringList.parallelStream().forEach(a -> System.out.println(a + "-" +a.length()));
		
		
		
		

	}

}
