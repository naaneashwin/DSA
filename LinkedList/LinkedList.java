package LinkedList;

public class LinkedList {
	
	//instance variable storing int
	public int data;
	//instance variable of type class LinkeList, which has stored data and next, because it is a n object of 
	//class Linked List
	public LinkedList next;
	
	//parameterized constructor
	public LinkedList(int data) {
		this.data = data;
	}
	
	//default constructor
	public LinkedList() {
		
	}
	
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(3);
		LinkedList node4 = new LinkedList(4);
		LinkedList node5 = new LinkedList(5);
		LinkedList node6 = new LinkedList(6);
		LinkedList node7 = new LinkedList(7);
		LinkedList node8 = new LinkedList();
		LinkedList node9 = new LinkedList();
		LinkedList node10 = new LinkedList();
		node8.data=8;
		node9.data=9;
		node10.data = 10;
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		node9.next=node10;
		
		//remove node 5 form link
		//to do that just delete the link from previous node(node4) and link it to the next of node5(node6)
		
		node4.next=node6;
		
		
		//Iterate through the nodes
		//create a new pointer , class variable
		
		//this pointer points to object nodex
		//just like String s = "hndh";
		LinkedList pointer = node1;
		while(pointer.next !=null) {
			System.out.println(pointer.data);
			pointer=pointer.next;
		}
	}
}
