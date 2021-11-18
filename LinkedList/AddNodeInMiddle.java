package LinkedList;

public class AddNodeInMiddle {
int val;
AddNodeInMiddle next;
	public static void main(String[] args) {
		int target = 4;
		AddNodeInMiddle node1 = new AddNodeInMiddle();
		node1.val = 1;
		AddNodeInMiddle node2 = new AddNodeInMiddle();
		node2.val = 2;
		AddNodeInMiddle node3 = new AddNodeInMiddle();
		node3.val = 3;
		AddNodeInMiddle node4 = new AddNodeInMiddle();
		node4.val = 4;
		AddNodeInMiddle node5 = new AddNodeInMiddle();
		node5.val = 5;
		AddNodeInMiddle node6 = new AddNodeInMiddle();
		node6.val = 6;
		AddNodeInMiddle node7 = new AddNodeInMiddle();
		node7.val = 7;
		
		AddNodeInMiddle newNodeToBeInserted = new AddNodeInMiddle();
		newNodeToBeInserted.val = 7;
		
		AddNodeInMiddle pointer = node1;
		while(pointer.val !=target) {
			pointer = pointer.next;
		}
		//create a new link to the remaining list
		newNodeToBeInserted.next = pointer.next;
		
		
		//and then break the link with the target node
		pointer.next=newNodeToBeInserted;
		
	}
}
