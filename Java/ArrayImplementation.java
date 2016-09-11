package com.salmaan.twoseventythree;

import java.util.Random;
import java.util.Scanner;

public class ArrayImplementation {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Range starts from?");
		int start = s1.nextInt();
		System.out.println("Range ends in?");
		int end = s1.nextInt();
		int size = end - start;
		int[] arr = new int[size];
		int j = 0;
		for(int i = start;i<end;i++){
			arr[j] = i;
			j++;
		}
		Random generator = new Random();
		int random = generator.nextInt(size);
		System.out.println("Randomly removed from index " + random + " Number :" + arr[random]);
		arr[random] = 0;
		Arrays arrclass = new Arrays();
		int missingno = arrclass.missingNo(arr, start, end);
		System.out.println("Finding missing number, missing number is : " + missingno);
		s1.close();

	}

}
