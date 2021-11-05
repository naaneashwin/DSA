package Sorting;
import java.util.Arrays;

public class ValidAnagram {
	public static void main(String args[]) {
		String s = "ashiwn";
		String t = "ashwin";
		if(s.length() != t.length()) System.out.println("Not a valid Anagram");
		char[] aChar = s.toCharArray();
		char[] bChar = t.toCharArray();
		BubbleSort.sort(aChar);
		BubbleSort.sort(bChar);
		if(Arrays.equals(aChar, bChar)) System.out.println("Valid Anagram");
		else System.out.println("Not a valid Anagram");
	}
}
