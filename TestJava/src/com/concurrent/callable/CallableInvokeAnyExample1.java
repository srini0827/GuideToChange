package com.concurrent.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallableInvokeAnyExample1 {

	public static void main(String[] args) {
		try {
			ExecutorService executor = Executors.newWorkStealingPool();

			List<Callable<String>> callables = Arrays.asList(
			    callable("task1", 2),
			    callable("task2", 1),
			    callable("task3", 3));

			String result = executor.invokeAny(callables);
			System.out.println(result);
	
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	static Callable<String> callable(String result, long sleepSeconds) {
	    return () -> {
	        TimeUnit.SECONDS.sleep(sleepSeconds);
	        return result;
	    };
	}
}
