package com.salmaan.twoseventythree;



public class Stack {
	
	StackNode top = null;

	private class StackNode{
		
		String url;
		StackNode next;
		
	}
	
	public String popStack(){
		
		if(top == null)
			return null;
		StackNode temp = top;
		top = top.next;
		return temp.url;
		
	}
	
	public String pushStack(String url){
		
		StackNode temp = top;
		top = new StackNode();
		top.url = url;
		top.next = temp;
		return top.url;
		
	}
	
	public void displayStack(){
		
		StackNode ltop = top;
		while(ltop != null){
			System.out.println(ltop.url);
			ltop = ltop.next;
		}
		
	}

}
