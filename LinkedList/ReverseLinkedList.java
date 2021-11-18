package LinkedList;

public class ReverseLinkedList {
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
		
		//LinkedList res = reverseList(nodeA1);
		LinkedList res = iterator(nodeA1);
		LinkedList pointer1 = res;
	
		while(pointer1 != null) {
			System.out.print(pointer1.data +" ");
			pointer1 = pointer1.next;
		}
	}
	public static LinkedList reverseList(LinkedList head) {
        if (head == null) return head;
        
        LinkedList pointer2 = head;
        int count = 0;
        while(pointer2 != null){
            count++;
            pointer2 = pointer2.next;
        }
        LinkedList rr = new LinkedList(-5001);
        //LinkedList rrPointer = rr;
        LinkedList res = reverse(head, count, rr);
        return res.next;
    }
    public static LinkedList reverse(LinkedList list, int totalCount, LinkedList rrPointer){
    	if(totalCount==0) return rrPointer;
    	LinkedList pointer3 = list;
        int idx=0;
        while(idx<totalCount-1){
            idx++;
            pointer3 = pointer3.next;
        }
        
        pointer3.next=null;
        rrPointer.next = pointer3;
        reverse(list, totalCount-1, rrPointer.next);
        return rrPointer;
    }
    public static LinkedList iterator(LinkedList head) {
    	
    	//using 4 pointer approach
    	//Imagination works here
    	LinkedList current = head;
    	LinkedList previous = null;
    	LinkedList nextElement = null;
    	LinkedList returnHead = head;
    	
    	while(current!=null) {
    		nextElement = current.next;
    		current.next = previous;
    		previous = current;
    		current = nextElement;
    	}
    	returnHead = previous;
    	
    	
    	return returnHead;
    }
	
}
