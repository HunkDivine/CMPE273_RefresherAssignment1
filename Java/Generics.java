package com.salmaan.twoseventythree;

public class Generics {

	public <T> int display( T[] arr){
	
		try{
			
			for(T item : arr)
				System.out.println(item);
		}
		catch(Exception e){
			return 0;
		}
		return 1;
	}
	
	public static void main(String args[]){
		
		Generics g = new Generics();
		
		Double[] arr1 = {1.55,2.14,23.18,-86.1};
		String[] arr2 = {"John","Jane","Johnny"};
		
		g.display(arr1);
		g.display(arr2);
		
	}
}
	

