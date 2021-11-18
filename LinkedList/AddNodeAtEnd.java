package LinkedList;



public class AddNodeAtEnd {
int data;
LinkedList next;
public static void main(String[] args) {
	LinkedList node1 = new LinkedList(1);
	LinkedList node2 = new LinkedList(2);
	LinkedList node3 = new LinkedList(3);
	LinkedList node4 = new LinkedList(4);
	LinkedList node5 = new LinkedList(5);
	LinkedList node6 = new LinkedList(6);
	
	node1.next=node2;
	node2.next=node3;
	node3.next=node4;
	node4.next=node5;
	node5.next=node6;
	
	LinkedList pointer = node1;
	while(pointer.next != null) {
		pointer = pointer.next;
	}
	pointer.next = new LinkedList(7);
	
	System.out.println(pointer.next.data);
}
}
