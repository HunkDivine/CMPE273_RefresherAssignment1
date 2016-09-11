package com.salmaan.twoseventythree;

import java.util.Scanner;

public class CollectionsImplementation {
	
	public static void main(String args[]){
	
		Collections map = new Collections();
	
		System.out.println("This is an implementation of a collection in a student directory");
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			
			System.out.println();
			System.out.println("Input 1 to add student");
			System.out.println("Input 2 to remove student");
			System.out.println("Input 3 to diplay student");
			System.out.println("Input 9 to exit");
			
			

			int input = s1.nextInt();
			
			switch(input){
			
			case 1:
				System.out.println("Enter Details to add student");
				System.out.println("Student Id");
				int id = s2.nextInt();
				System.out.println("Student Name");
				String name = s2.next();
				map.add(id, name);
				System.out.println("Student added successfully.");
				System.out.println("What would you like to next?");
				break;
				
			case 2:
				System.out.println("Enter Details to remove student");
				System.out.println("Student Id");
				int removeid = s2.nextInt();
				if(map.remove(removeid) == null){
					System.out.println("no such student exists");
					break;
				}
				System.out.println("Student removed successfully.");
				System.out.println("What would you like to next?");
				break;
				
			case 3:
				System.out.println("Enter Details to display student");
				System.out.println("Student Id");
				int displayid = s2.nextInt();
				if(map.display(displayid) == null){
					System.out.println("no such student exists");
					break;
				}
				System.out.println(map.display(displayid));
				System.out.println("Student displayed successfully.");
				System.out.println("What would you like to next?");
				break;
				
			case 9:
				System.out.println("Program Terminated");
				System.exit(0);
				
			default:
				System.out.println("Thats an invalid input, try again");
				break;
			
			}
		}
		s1.close();
		s2.close();
		
	}
	

}
