package com.concurrent.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableInvokeAllExample {

	public static void main(String[] args) {
		try {
			ExecutorService executor = Executors.newWorkStealingPool();

			List<Callable<String>> callables = Arrays.asList(
					() -> {
						System.out.println(Thread.currentThread().getName());
						 TimeUnit.SECONDS.sleep(1);
						return "task1";
					},
					() -> {
						System.out.println(Thread.currentThread().getName());
						 TimeUnit.SECONDS.sleep(2);
						return "task2";
					},
					() -> {
						System.out.println(Thread.currentThread().getName());
						 TimeUnit.SECONDS.sleep(3);
						return "task3";	
					});

			executor.invokeAll(callables)
			.stream()
			.map(future -> {
				try {
					return future.get();
				}
				catch (Exception e) {
					throw new IllegalStateException(e);
				}
			})
			.forEach(System.out::println);

			executor.shutdown();

		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
