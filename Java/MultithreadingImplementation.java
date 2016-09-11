package com.salmaan.twoseventythree;

public class MultithreadingImplementation {

	static final int numThreads = 4;

    public static void main(String[] args) {
        final Multithreading[] threads = new Multithreading[numThreads];

        final double start = System.nanoTime();
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Multithreading();
            threads[i].start();
        }
        try {
            for (int i = 0; i < numThreads; i++)
                threads[i].join();
        } catch (InterruptedException e) {
        }
        final double end = System.nanoTime(); 

        System.out.println("Execution time:  " + ((end - start) / 1000000D) + " milliseconds");

        for (int i = 0; i < numThreads; i++)
            System.out.println("Thread " + i + "  Prime count: " + threads[i].count); 
        System.out.println("Total prime count: " + Multithreading.tcount.get()); 
        
        for (int i = 0; i < 10; i++)
            System.out.println(""+i+": "+Multithreading.prime[i]);
    }

}
