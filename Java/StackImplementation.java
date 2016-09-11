package com.salmaan.twoseventythree;

import java.util.Scanner;
public class StackImplementation {

	public static void main(String[] args) {

		System.out.println("This program demonstrates broswer back button using stack");
		Stack stack = new Stack();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		boolean flag = true;
		
		while(flag){

			System.out.println();
			System.out.println("What would like to do?");
			System.out.println("Input 1 to go to url");
			System.out.println("Input 2 to go back");
			System.out.println("Input 3 to display all pages");
			System.out.println("Input 9 to exit");
			int choice = s1.nextInt();
			switch(choice){
			
			case 1:
				System.out.println("Enter url");
				String url = s2.nextLine();
				stack.pushStack(url);
				break;
				
			case 2:
				String back = stack.popStack();
				if(back!=null)
					System.out.println("You went back to: " + back);
				else
					System.out.println("There's nothing to go back to");
				break;
			
			case 3:
				System.out.println("Display all pages:");
				stack.displayStack();
				break;
			
			case 9:
				System.exit(0);
				
			}
		
		}
		s1.close();
		s2.close();

	}

}

