package LinkedList;

public class CyclicCheckUsingBoolean {
int data;
boolean flag = true;
int count=1;


CyclicCheckUsingBoolean next;

	public static void main(String[] args) {
		CyclicCheckUsingBoolean n1 = new CyclicCheckUsingBoolean();
		n1.data=1;
		n1.count++;
		CyclicCheckUsingBoolean n2 = new CyclicCheckUsingBoolean();
		n2.count++;
		n2.data=2;
		CyclicCheckUsingBoolean n3 = new CyclicCheckUsingBoolean();
		n3.data=3;
		n3.count++;
		CyclicCheckUsingBoolean n4 = new CyclicCheckUsingBoolean();
		n4.data=4;
		n4.count++;
		CyclicCheckUsingBoolean n5 = new CyclicCheckUsingBoolean();
		n5.data=5;
		n5.count++;
		CyclicCheckUsingBoolean n6 = new CyclicCheckUsingBoolean();
		n6.data=6;
		n6.count++;
		CyclicCheckUsingBoolean n7 = new CyclicCheckUsingBoolean();
		n7.data=7;
		n7.count++;
		CyclicCheckUsingBoolean n8 = new CyclicCheckUsingBoolean();
		n8.data=8;
		n8.count++;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n2;
		
		CyclicCheckUsingBoolean pointer = n1;
		boolean f = true;
		while(pointer!=null) {
			if(pointer.flag!=true) {
				System.out.println("Cyclic at node "+pointer.count);
				f = false;
				break;
			}
			else {
				pointer.flag = false;
			}
			
			pointer = pointer.next;
		}
		if(f) System.out.println("No cycle");
	}
}
