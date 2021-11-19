package Stack;

public class CreateArrayAndMakeItStack {
	
	
	int[] arr = new int[5];
	int size =0;
	
	public static void main(String[] args) {
		CreateArrayAndMakeItStack s = new CreateArrayAndMakeItStack();
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		s.push(8);
		
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
	}
	void push(int x) {
		if(size<arr.length) {
			arr[size++]=x;
		}
		else System.out.println("Overflow");
	}
	void pop() {
		if(size<1) System.out.println("Underflow");
		else System.out.println(arr[--size]);
	}
	void peek() {
		if(size<1) System.out.println("No elements present");
		else System.out.println(arr[size-1]);
	}
}
