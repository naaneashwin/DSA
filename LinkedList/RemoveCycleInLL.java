package LinkedList;

public class RemoveCycleInLL {
	int data;
	boolean flag = true;
	RemoveCycleInLL next;
	
	public static void main(String[] args) {
		RemoveCycleInLL n1 = new RemoveCycleInLL ();
		n1.data=1;
		RemoveCycleInLL n2 = new RemoveCycleInLL ();
		n2.data=2;
		RemoveCycleInLL n3 = new RemoveCycleInLL ();
		n3.data=3;
		RemoveCycleInLL n4 = new RemoveCycleInLL ();
		n4.data=4;
		RemoveCycleInLL n5 = new RemoveCycleInLL ();
		n5.data=5;
		RemoveCycleInLL n6 = new RemoveCycleInLL ();
		n6.data=6;
		RemoveCycleInLL n7 = new RemoveCycleInLL ();
		n7.data=7;
		RemoveCycleInLL n8 = new RemoveCycleInLL ();
		n8.data=8;
		RemoveCycleInLL n9 = new RemoveCycleInLL ();
		n9.data=9;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=n9;
		n9.next=n6;
		
		RemoveCycleInLL slow = n1, superSlow = n1;
		int count =0;
		
		while(slow!=null) {
			
			if(slow.flag==true) {
				 slow.flag=false;
				 count++;
			}
			else {
				superSlow.next = null;
				break;
			}
			slow = slow.next;
			if(count>1) superSlow=superSlow.next;
		}
		slow = n1;
		while(slow!=null) {
			System.out.print(slow.data+" ");
			slow = slow.next;
		}
	}
	
}
