package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
	
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public ImplementStackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		ImplementStackUsingQueue s1 = new ImplementStackUsingQueue();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(6);
		
		System.out.println(s1.top());
		System.out.println(s1.empty());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.empty());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.empty());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.empty());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.empty());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.empty());
		System.out.println(s1.pop());
		System.out.println(s1.top());
		System.out.println(s1.empty());
		
		
	}
	private void push(int x) {
		q2.add(x);
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	private int pop() {
		if(!q1.isEmpty()) {
			return q1.poll();
		}
		return -1;
	}
	private int top() {
		if(!q1.isEmpty()) {
			return q1.peek();
		}
		return -1;
	}
	private boolean empty() {
		return q1.isEmpty();
	}
}
