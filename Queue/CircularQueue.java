package Queue;


public class CircularQueue {
	public static void main(String[] args) {
		ArrayBasedQueue q = new ArrayBasedQueue(5);
		q.deQueue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(20);
		q.deQueue();
		q.deQueue();
		
		LinkedListBasedQueue l = new LinkedListBasedQueue(3);
		l.enQueueList(1);
		l.enQueueList(2);
		l.enQueueList(3);
		l.enQueueList(4);
		l.deQueueList();
		l.deQueueList();
		l.enQueueList(4);
		l.enQueueList(5);
		l.deQueueList();
		l.deQueueList();
		l.deQueueList();
	}
}
class ArrayBasedQueue{
	
	int[] arr;
	int f=-1,r=-1,size, acquiredPlaces = 0;
	
	ArrayBasedQueue(int x){
		size = x;
		arr = new int[size];
	}
	void enQueue(int x) {
		if((acquiredPlaces>=size)) {
			System.out.println("Queue is full");
		}
		else {
			//if(f==-1) f=0;
			if(r==-1) r=0;
			arr[r++]=x;
			r = r % arr.length;
			acquiredPlaces++;
		}
	}
	void deQueue() {
		if(acquiredPlaces==0) {
			System.out.println("Queue is empty");
		}
		else {
			if(f==-1) f=0;
			System.out.println(arr[f++]);
			f = f % arr.length;
			acquiredPlaces--;
			if(f==r) {
				f=-1;
				r=-1;
			}
		}
	}
}
class LinkedListBasedQueue{
	
	Linker lin;
	int size,acquiredPlaces = 0;
	Linker f = null, r = null;
	
	public LinkedListBasedQueue(int x){
		size = x;
	}
	
	void enQueueList(int x) {
		if(acquiredPlaces>=size) {
			System.out.println("Queue is full");
			return;
		}
		Linker temp = new Linker(x);
		if(f==null) {
			r = temp;
			f = temp;
			acquiredPlaces++;
			return;
		}
		r.next=temp;
		r = temp;
		acquiredPlaces++;
		
		if(acquiredPlaces==size) r.next = f;
	}
	void deQueueList() {
		if(acquiredPlaces==0) {
			System.out.println("Queue is empty");
			return;
		}
		if(f==null) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(f.data);
		f = f.next;
		acquiredPlaces--;
		//if not cyclic then next line is necessary
		//if(f==null) r = null;
		
	}
	
}
class Linker{
	int data;
	Linker next;
	
	Linker(int data){
		this.data = data;
	}
}
