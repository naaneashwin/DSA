package Recursion;

public class FibonacciSequence {
	static int n1 = 1, n2 = 1, n3 = 0;
	public static void main(String[] args) {
		System.out.println(fibonacciSpecific(5));
		System.out.print(n1 + " "+ n2+ " ");
		fibonacciUpto(10-2);
		System.out.println();
		fibo(0,1,10);
	}
	private static int fibonacciSpecific(int n) {
		if(n<=1) return n;
		return fibonacciSpecific(n-1)+fibonacciSpecific(n-2);
	}
	private static void fibonacciUpto(int n) {
		if(n>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+ " ");
			fibonacciUpto(n-1);
		}
	}
	private static void fibo(int prev, int current, int last) {
		if(current>last) return;
		if(prev == 0) System.out.print(1 + " ");
		int x = prev+current;
		System.out.print(x+" ");
		prev = current;
		current = x;
		fibo(prev,current, last);
	}
}
