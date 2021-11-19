package LinkedList;

public class Palindrome {
//Check whether the given linked list is palindrome or not
	
	
	public static void main(String[] args) {
		LinkedList node1 = new LinkedList(1);
		LinkedList node2 = new LinkedList(2);
		LinkedList node3 = new LinkedList(3);
		LinkedList node4 = new LinkedList(3);
		LinkedList node5 = new LinkedList(2);
		LinkedList node6 = new LinkedList(1);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		
		if(palindromeChecker(node1)) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
	}
	private static LinkedList reverser(LinkedList list) {
		
		LinkedList current = list;
		LinkedList previous = null;
		LinkedList nextElement = null;
		LinkedList head = list;
		while(current!=null) {
			nextElement = current.next;
			current.next = previous;
			previous = current;
			current = nextElement;
		}
		head = previous;
		
		return head;
	}
	private static boolean palindromeChecker(LinkedList list) {
		LinkedList slowPointer = list;
		LinkedList mediumPointer = list;
		LinkedList fastPointer = list;
		
		while(fastPointer!=null ) {
			mediumPointer = mediumPointer.next;
			//for odd no of cases , this if condition
			if(fastPointer.next==null) break;
			fastPointer = fastPointer.next.next;
		}
		LinkedList reversedListHead = reverser(mediumPointer);
		LinkedList reversedListHeadPointer = reversedListHead;
		while(reversedListHeadPointer!=null) {
			if(slowPointer.data!=reversedListHeadPointer.data) {
				return false;
			}
			reversedListHeadPointer = reversedListHeadPointer.next;
			slowPointer = slowPointer.next;
		}
		
		return true;
	}
}
