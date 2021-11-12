package Recursion;

public class ForwardAndBackwardRecursion {
	public static void main(String[] args) {
		Fprint(5);
		Bprint(5);
	}
	static void Fprint(int n) {
		if(n==0) return;
		Fprint(n-1);
		System.out.println(n);
	}
	static void Bprint(int n) {
		if(n==0) return;
		System.out.println(n);
		Bprint(n-1);
	}
}

