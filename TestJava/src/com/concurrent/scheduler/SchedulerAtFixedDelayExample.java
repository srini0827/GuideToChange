package com.concurrent.scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerAtFixedDelayExample {

	public static void main(String[] args) {
		try {
			ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

			Runnable task = () -> {
			    try {
			        TimeUnit.SECONDS.sleep(2);
			        System.out.println("Scheduling: " + System.nanoTime());
			    }
			    catch (InterruptedException e) {
			        System.err.println("task interrupted");
			    }
			};

			executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
