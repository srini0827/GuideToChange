package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ConcurrencyEx {

	public static void main(String[] args) {
		
		List<Callable<String>> callables = new ArrayList<>();
		/*for(int i = 0; i < 10; i++) {
			Callable<String> callable = () -> {
				Thread.sleep(5);
				return "Callable #" + Thread.currentThread().getName();
			};
			
			callables.add(callable);
		}*/
		
		Callable<String> callable1 = () -> {
			Thread.sleep(5);
			return "callable1 " + Thread.currentThread().getName();
		};
		
		Callable<String> callable2 = () -> {
			Thread.sleep(2);
			return "callable2 " + Thread.currentThread().getName();
		};
		
		Callable<String> callable3 = () -> {
			Thread.sleep(1);
			return "callable3 " + Thread.currentThread().getName();
		}; 
		
		callables.add(callable1);
		callables.add(callable2);
		callables.add(callable3);
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		try {
			List<Future<String>> futures = executorService.invokeAll(callables);
			
			
			for(int i = 0; i < futures.size(); i++) {
				Future<String> future = futures.get(i);
				if(future.isDone()) {
					System.out.println(future.get());	
				}
				
			}
			
						
			CompletableFuture<Void> completableFuture  = CompletableFuture.runAsync(() -> {
				try {
			        TimeUnit.SECONDS.sleep(1);
			    } catch (InterruptedException e) {
			        throw new IllegalStateException(e);
			    }
				System.out.println("I'll run in a separate thread than the main thread.");
				
			}, executorService);
			
			System.out.println(completableFuture.get());
			
			
			CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->{
				try {
			    TimeUnit.SECONDS.sleep(1);
				} catch(InterruptedException e) {
					throw new IllegalStateException();
				}
			    return "I'll run in a separate thread than the main thread.";
			}, executorService);
			
			CompletableFuture<List<String>> completableFuture3 = completableFuture2.thenApply(str -> Arrays.stream(str.split(" ")).collect(Collectors.toList()));
			
			System.out.println(completableFuture3.get());
			
			
			CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
			    try {
			        TimeUnit.SECONDS.sleep(1);
			    } catch (InterruptedException e) {
			       throw new IllegalStateException(e);
			    }
			    return 65.0;
			});

			System.out.println("Retrieving height.");
			CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
			    try {
			        TimeUnit.SECONDS.sleep(1);
			    } catch (InterruptedException e) {
			       throw new IllegalStateException(e);
			    }
			    return 177.8;
			}).handle((res, ex) -> {
				if(ex != null) {
					return 1.0;
				}
				return res;
			});

			System.out.println("Calculating BMI.");
			CompletableFuture<Double> combinedFuture = weightInKgFuture
			        .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
			    Double heightInMeter = heightInCm/100;
			    return weightInKg/(heightInMeter*heightInMeter);
			}).exceptionally(ex -> {
				System.out.println("Oops! We have an exception - " + ex.getMessage());
			    return 1.0;
			});

			System.out.println("Your BMI is - " + combinedFuture.get());

			
			executorService.shutdown();
			executorService.awaitTermination(1, TimeUnit.SECONDS);
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}
