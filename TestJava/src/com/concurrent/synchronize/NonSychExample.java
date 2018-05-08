package com.concurrent.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class NonSychExample {

	int count = 0;
	public static void main(String[] args) {
		NonSychExample nonSychExample = new NonSychExample();
		nonSychExample.execute();
	}
	
	public void execute() {
		try {
			ExecutorService executor = Executors.newFixedThreadPool(2);
			IntStream.range(0, 10000).forEach(i -> executor.submit(this::incrementCount));
			executor.shutdown();
			System.out.println(count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void incrementCount() {
		count = count + 1;
	}

}
