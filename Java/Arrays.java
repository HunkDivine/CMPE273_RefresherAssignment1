package com.salmaan.twoseventythree;

public class Arrays {

	public int missingNo(int[] arr,int n1, int n2){
		
		int sum=0,nsum=0,missingno=0;
		for(int i=0;i<arr.length;i++)
			sum = sum + arr[i];			
		
		for(int i=n1;i<n2;i++)
			nsum = nsum + i;
		
		missingno = nsum - sum;
		
		return missingno;
	}
	
	
}
