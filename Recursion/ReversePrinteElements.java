package Recursion;

public class ReversePrinteElements {
	
	public static void main(String[] args) {
		reversePrinter("Chirag".toCharArray(), "Chirag".length());
	}
	private static void reversePrinter(char[] c, int l) {
		if(l==0) return;
		System.out.print(c[l-1]);
		reversePrinter(c,--l);
	}
}
