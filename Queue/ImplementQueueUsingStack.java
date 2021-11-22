package Queue;

import java.util.Stack;

public class ImplementQueueUsingStack {
	Stack<Integer> s1;
	Stack<Integer> s2;
	public ImplementQueueUsingStack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	
	public static void main(String[] args) {
		ImplementQueueUsingStack q1 = new ImplementQueueUsingStack();
		q1.push(1);
		q1.push(2);
		q1.push(3);
		q1.push(4);
		q1.push(5);
		q1.push(6);
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		q1.push(8);
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
		System.out.println(q1.pop());
		
		System.out.println(q1.empty());
		System.out.println(q1.peek());
	}
	private void push(int x) {
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		s1.push(x);
	}
	private int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.pop();
	}
	private int peek() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.empty()?-1:s2.peek();
	}
	private boolean empty() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.isEmpty();
	}
}