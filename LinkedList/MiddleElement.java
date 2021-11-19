package LinkedList;

public class MiddleElement {
//Find middle element of a given list
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(3);
		LinkedList node4 = new LinkedList(4);
		LinkedList node5 = new LinkedList(5);
		LinkedList node6 = new LinkedList(6);
		LinkedList node7 = new LinkedList(7);
		LinkedList node8 = new LinkedList(8);
		LinkedList node9 = new LinkedList(9);
		LinkedList node10 = new LinkedList(10);
		LinkedList node11 = new LinkedList(11);
		LinkedList node12 = new LinkedList(12);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		node9.next=node10;
		node10.next=node11;
		node11.next=node12;
		
		MiddleElement s = new MiddleElement();
		System.out.println(s.middleFinder(node1));
	}
	private int middleFinder(LinkedList list) {
		
		LinkedList slow = list;
		LinkedList fast = list;
		
		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
}
