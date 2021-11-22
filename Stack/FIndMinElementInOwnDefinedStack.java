package Stack;

public class FIndMinElementInOwnDefinedStack {
	//time and space complexity of O(N);
	
	public static void main(String[] args) {
		stack stk = new stack();
		int[] arr = {10,2,6,3,7,1,5};
		
		
		//push code
		for(int i=0; i<arr.length; i++){
			if(stk.size==0) {
				node n = new node(arr[i],arr[i]);
				stk.push(n);
			}
			else {
				int x = stk.peek().min;
				if(arr[i]<x) {
					node n = new node(arr[i], arr[i]);
					stk.push(n);
				}
				else {
					node n = new node(arr[i], x);
					stk.push(n);
				}
			}
		}
		//to print the minimum value so far
		for(int i=0; i<arr.length; i++) {
			stk.pop();
		}
	}
}
class node{
	int elem;
	int min;
	node(int x, int y){
		this.elem=x;
		this.min=y;
	}
}
class stack{
	node[] arr=new node[10];
	int size=0;
	void push(node x) {
		if(size<arr.length) {
			arr[size++]=x;
		}
		else System.out.println("Overflow");
	}
	void pop() {
		if(size<1) System.out.println("Underflow");
		else {
			System.out.println("Element is : " +arr[--size].elem);
			System.out.println("Minimum element so far is : "+arr[size].min);
		}
	}
	node peek() {
		if(size<1) System.out.println("No elements present");
		return arr[size-1];
	}
	int getMin() {
		if(size<1)System.out.println("Underflow");
		return arr[--size].min;
	}
}
