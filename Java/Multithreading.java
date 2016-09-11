package com.salmaan.twoseventythree;

import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading extends Thread {
	
	
	final public static int[] prime = new int[100000];
	
	static{
		prime[0] = 2;
	};
	
	final static AtomicInteger next = new AtomicInteger(3);
	final static int max = 10000;
	
	
	public int count = 0;
	public static AtomicInteger tcount = new AtomicInteger();
	
	public void run() {
		
		int num;
		while((num = next.getAndAdd(2)) < max){
			if(getPrime(num)){
				prime[tcount.incrementAndGet()] = num;
				count++;
			}
		}
	}
	
	public static boolean getPrime(final int n) {
		
		final int limit = (int) Math.sqrt(n); 
		for (int i = 3; i <= limit; i++){
			if (n%i==0) 
				return false;
		}
		return true;
	}
		

}
