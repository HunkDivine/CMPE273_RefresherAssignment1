package com.salmaan.twoseventythree;

public class Queue {
	
	queueNode front = null;
	queueNode rear = null;
	
	private class queueNode {
		
		private String firstName;
		private String lastName;
		private String passportNumber;
		queueNode link;
	}
	
	public void display(){
		
		queueNode temp = new queueNode();
		temp = front;
		while(temp != null){
			
			System.out.println(temp.firstName);
			System.out.println(temp.lastName);
			System.out.println(temp.passportNumber);
			System.out.println();
			temp = temp.link;
			
		}
		
		
	}
	
	public boolean isNull(){
		
		return front == null;
		
	}
	
	public void ncopy(queueNode q1, queueNode q2){
		
		q1.firstName = q2.firstName;
		q1.lastName = q2.lastName;
		q1.passportNumber = q2.passportNumber;
		q1.link = q2.link;
		
	}
	
	public String enqueue(String fname, String lname, String pnum) {
		
		queueNode temp = rear;
		rear = new queueNode();
		rear.firstName = fname;
		rear.lastName = lname;
		rear.passportNumber = pnum;
		if(isNull())
			front = rear;
		else
			temp.link = rear;
		//String message = rear.firstName + " " + rear.lastName + " with passport number " + rear.passportNumber + " has been added to the queue";
		return rear.firstName;
		
	}
	
	public String dequeue() {
		
		if(isNull())
			return null;
		
		queueNode temp = new queueNode(); 
		ncopy(temp, front);
		
		if(rear == front)
			rear = rear.link;
		
		front = front.link;
		//String message = temp.firstName + " " temp.lastName + "with passport number " + temp.passportNumber + " has been processed and removed from the queue.";
		return temp.firstName;
		
	}
	
	
}
