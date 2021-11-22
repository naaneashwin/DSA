package Stack;

public class ImplementYourOwnStack {
	public static void main(String[] args) {
		Tack s = new Tack();
		int[] arr = {0,2,6,5,7,9,6,3,4};
		for(int i=0; i<arr.length; i++) {
			if(s.size==0) {
				Ode n = new Ode(arr[i],arr[i],arr[i]);
				s.push(n);
			}
			else {
				int min = s.getMin();
				int max = s.getMax();
				if(arr[i]<min) {
					if(arr[i]>max) {
						Ode n = new Ode(arr[i], arr[i], arr[i]);
						s.push(n);
					}
					else {
						Ode n = new Ode(arr[i], max, arr[i]);
						s.push(n);
					}
				}
				else {
					if(arr[i]>max) {
						Ode n = new Ode(arr[i], arr[i], min);
						s.push(n);
					}
					else {
						Ode n = new Ode(arr[i], max, min);
						s.push(n);
					}
				}
			}
		}
		System.out.println(s.getAvg());
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
		System.out.println(s.getAvg());
	}
}
class Ode{
	int element;
	int max;
	int min;
	Ode(int x, int y, int z){
		this.element = x;
		this.max = y;
		this.min = z;
	}
}
class Tack{
	Ode[] stk;
	int size=0;
	Tack(){
		stk = new Ode[10];
	}
	void push(Ode x) {
		if(size<stk.length) {
			stk[size++]=x;
		}
		else System.out.println("Overflow");
	}
	void pop() {
		if(size<1) System.out.println("Underflow");
		else {
			System.out.println("Element is : " +stk[--size].element);
			System.out.println("Max element so far is : "+stk[size].max);
			//System.out.println("Average of elements so far is : "+stk[size].avg);
			System.out.println("Minimum element so far is : "+stk[size].min);
		}
	}
	void peek() {
		if(size<1) System.out.println("Underflow");
		else {
			System.out.println("Element is : " +stk[size-1].element);
			System.out.println("Max element so far is : "+stk[size-1].max);
			//System.out.println("Average of elements so far is : "+stk[size-1].avg);
			System.out.println("Minimum element so far is : "+stk[size-1].min);
		}
	}
	int getMax() {
		if(size<1) return -1;
		else return stk[size-1].max;
	}
	int getAvg() {
		//not O(1) time complexity
		//O(n)
		if(size<1) return -1;
		else {
			int avg = 0;
			for(int i=0; i<size; i++) {
				avg = (avg + stk[i].element);
			}
			
			return avg/size;
		}
		//return avg;
	}
	int getMin() {
		if(size<1) return -1;
		else return stk[size-1].min;
	}
}
