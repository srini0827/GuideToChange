package com.concurrent.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.concurrent.synchronize.ConcurrentUtils;

public class ReadWriteLock {

	public static void main(String[] args) {
		try {
			ExecutorService executor = Executors.newFixedThreadPool(2);
			Map<String, String> map = new HashMap<>();
			ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

			executor.submit(() -> {
			    lock.writeLock().lock();
			    try {
			        ConcurrentUtils.sleep(1);
			        map.put("foo", "bar");
			        System.out.println("write foo -> bar");
			    } finally {
			        lock.writeLock().unlock();
			    }
			});

			
			Runnable readTask = () -> {
			    lock.readLock().lock();
			    try {
			        System.out.println("read --> " + map.get("foo"));
			        ConcurrentUtils.sleep(1);
			    } finally {
			        lock.readLock().unlock();
			    }
			};

			executor.submit(readTask);
			executor.submit(readTask);

			ConcurrentUtils.stop(executor);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
