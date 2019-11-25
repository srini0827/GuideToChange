package com.concurrent.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchExample {

	int count = 0;
	public static void main(String[] args) {
		SynchExample sychExample = new SynchExample();
		sychExample.execute();
	}

	public void execute() {
		try {
			ExecutorService executor = Executors.newFixedThreadPool(2);
			IntStream.range(0, 10000).forEach(i -> executor.submit(this::incrementSync));
			ConcurrentUtils.stop(executor);
			System.out.println(count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public synchronized void incrementSync() {
		count = count + 1;
	}

}
