package com.concurrent.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerAtFixedRateExample {

	public static void main(String[] args) {
		try {
			ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

			Runnable task = () -> {
				try {
					TimeUnit.SECONDS.sleep(3);
					System.out.println("Scheduling: " + System.nanoTime());
					String name = Thread.currentThread().getName();
					System.out.println("Foo " + name);					
					System.out.println("Bar " + name);	
				} catch(Exception ex) {
					ex.printStackTrace();
				}
				

			};

			int initialDelay = 0;
			int period = 1;
			executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);

		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
