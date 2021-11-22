package LinkedList;
//Reverse the list upto the multiples of Kth element
//Sample i/p LL:1,5,3,6,7,9,4,63,6,8,5,5,6,7;, k=4;
//sample o/p : 6,3,5,1,63,4,9,7,5,5,8,6,7,6
//singly Linked list

class ListNode{
	int data;
	ListNode next;
	ListNode(int x){
		data = x;
	}
}
public class ReverseKthElement {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		ListNode n8 = new ListNode(8);
		ListNode n9 = new ListNode(9);
		ListNode n10 = new ListNode(10);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n9.next=n10;
		
		//___________________________________
		
		int length = 0;
		ListNode Pointer = n1;
		while(Pointer!=null) {
			length++;
			Pointer = Pointer.next;
		}
		ListNode x = reverse(n1, 5, length);
		ListNode pointer = x;
		while(pointer!=null) {
			System.out.print(pointer.data+ " ");
			pointer = pointer.next;
		}
		
		
	}
	private static ListNode reverse(ListNode head, int k, int length) {
		if(k==0 || k==1) return head;
		int count = 0;
		ListNode curr = head, prev = null, nextE = null;
		while(curr!=null && count<k) {
			nextE = curr.next;
			curr.next=prev;
			prev = curr;
			curr = nextE;
			count++;
		}
		//returning node
		ListNode returner = prev;
		
		//node to append next reversed grid to the previous grid
		ListNode returnerPointer = prev;
		
		//to move the pointer to the end
		int c = 0;
		while(c<k-1 && c<length) {
			returnerPointer = returnerPointer.next;
			c++;
		}
		if(curr!=null) {
			returnerPointer.next=reverse(curr,k,length-k);
		}
		return returner;
	}
}

