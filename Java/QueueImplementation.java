package com.salmaan.twoseventythree;

import java.util.Scanner;

public class QueueImplementation {

	public static void main(String[] args) {
		
		System.out.println("This is an implementation of a queue as a reservation system");
		Queue q1 = new Queue();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		boolean flag = true;
		while(flag){
			
			System.out.println();
			System.out.println("Input 1 to take reservation");
			System.out.println("Input 2 to attend next in queue");
			System.out.println("Input 3 to display queue");
			System.out.println("Input 9 to exit");
			
			

			int input = s1.nextInt();
			
			switch(input){
			
			case 1:
				System.out.println("Enter Details to take reservation");
				System.out.println("First Name: ");
				String fname = s2.next();
				System.out.println("Last Name: ");
				String lname = s2.next();
				System.out.println("Passport Number: ");
				String pnum = s2.next();
				q1.enqueue(fname, lname, pnum);
				System.out.println("Reservation taken successfully");
				System.out.println("What would you like to next?");
				break;
			
			case 2:
				String res = q1.dequeue();
				if(res != null)
					System.out.println("You are now attending " + res);
				else
					System.out.println("Reservation list is empty, take more reservations to continue");
				break;
				
			case 3:
				System.out.println("Queue is being displayed");
				q1.display();
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
