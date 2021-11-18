package LinkedList;

public class AddNodeAtBegining {

int data;
AddNodeAtBegining next;
public AddNodeAtBegining() {
	
}

	public static void main(String[] args) {
		AddNodeAtBegining node1 = new AddNodeAtBegining();
		node1.data = 1;
		AddNodeAtBegining node2 = new AddNodeAtBegining();
		node2.data = 2;
		AddNodeAtBegining node3 = new AddNodeAtBegining();
		node3.data = 3;
		
		node1.next = node2;
		node2.next = node3;
		
		AddNodeAtBegining nodeToBeAtBegining = new AddNodeAtBegining();
		nodeToBeAtBegining.data = 0;
		
		nodeToBeAtBegining.next = node1;
		
		printer(nodeToBeAtBegining);
		
	}
	private static void printer(AddNodeAtBegining list) {
		AddNodeAtBegining pointer = list;
		while(pointer != null) {
			System.out.print(pointer.data +" ");
			pointer = pointer.next;
		}
	}
}
