package com.dewitt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
	private static final int NUM_WELLS = 1000;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<Well> wells = new ArrayList<Well>();
		for(int i = 0; i < NUM_WELLS; i++){
			wells.add(new Well(100, 21));
		}
		
		ExecutorService executorService = Executors.newCachedThreadPool();
//		ExecutorService executorService = Executors.newFixedThreadPool(1000);
		
		Set<Future<Float>> futures = new HashSet<Future<Float>>();
		for(Well well: wells){
			Callable<Float> callable = () -> {
				return well.analyze();
			};
			futures.add(executorService.submit(callable));
		}
		
		for(Future<Float> future: futures){
			try {
				System.out.println(future.get()+"");
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - start);
		
	}

}
