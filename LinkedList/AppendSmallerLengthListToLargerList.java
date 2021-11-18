package LinkedList;

public class AppendSmallerLengthListToLargerList {
	public static void main(String[] args) {
		LinkedList nodeA1 = new LinkedList(1);
		LinkedList nodeA2 = new LinkedList(2);
		LinkedList nodeA3 = new LinkedList(3);
		LinkedList nodeA4 = new LinkedList(4);
		LinkedList nodeA5 = new LinkedList(5);
		LinkedList nodeA6 = new LinkedList(6);
		nodeA1.next=nodeA2;
		nodeA2.next=nodeA3;
		nodeA3.next=nodeA4;
		nodeA4.next=nodeA5;
		nodeA5.next=nodeA6;
		
	
		LinkedList nodeB1 = new LinkedList(11);
		LinkedList nodeB2 = new LinkedList(12);
		LinkedList nodeB3 = new LinkedList(13);
		LinkedList nodeB4 = new LinkedList(14);
		LinkedList nodeB5 = new LinkedList(15);
		nodeB1.next=nodeB2;
		nodeB2.next=nodeB3;
		nodeB3.next=nodeB4;
		nodeB4.next=nodeB5;
		
		LinkedList APointer = nodeA1;
		LinkedList BPointer = nodeB1;
		
		while(APointer != null && BPointer != null) {
			APointer = APointer.next;
			BPointer = BPointer.next;
		}
		if(APointer == null) {
			while(BPointer.next != null) {
				BPointer = BPointer.next;
			}
			BPointer.next = nodeA1;
			LinkedList pointer = nodeB1;
			while(pointer!=null) {
				System.out.println(pointer.data);
				pointer = pointer.next;
			}
		}
		else {
			while(APointer.next != null) {
				APointer = APointer.next;
			}
			APointer.next = nodeB1;
			LinkedList pointer = nodeA1;
			while(pointer!=null) {
				System.out.println(pointer.data);
				pointer = pointer.next;
			}
		}
	}
}
