package LinkedList;

public class FindWhetherTheListIsCyclic {
int data;
FindWhetherTheListIsCyclic next;
private FindWhetherTheListIsCyclic(int x) {
	data = x;
}
private FindWhetherTheListIsCyclic() {
}
	public static void main(String[] args) {
		FindWhetherTheListIsCyclic node1 = new FindWhetherTheListIsCyclic();
		node1.data = 1;
		FindWhetherTheListIsCyclic node2 = new FindWhetherTheListIsCyclic();
		node2.data = 2;
		FindWhetherTheListIsCyclic node3 = new FindWhetherTheListIsCyclic();
		node3.data = 3;
		FindWhetherTheListIsCyclic node4 = new FindWhetherTheListIsCyclic();
		node4.data = 4;
		FindWhetherTheListIsCyclic node5 = new FindWhetherTheListIsCyclic();
		node5.data = 5;
		FindWhetherTheListIsCyclic node6 = new FindWhetherTheListIsCyclic();
		node6.data = 6;
		FindWhetherTheListIsCyclic node7 = new FindWhetherTheListIsCyclic();
		node7.data = 7;
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node7;
		node7.next=node2;
		
		FindWhetherTheListIsCyclic slowPointer = node1;
		FindWhetherTheListIsCyclic fastPointer = node1;
		
		
		boolean flag = false;
		while(fastPointer!=null && fastPointer.next!=null) {//to return the list is not cyclic
			
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer==fastPointer) {
				//address comparing and it should
				//not be equal to head
				flag = true;
				break;
			}
			
		}
		if(flag) System.out.println("True");
		else System.out.println("False");
	}
}
