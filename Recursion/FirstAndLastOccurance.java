package Recursion;

public class FirstAndLastOccurance{
	static int first = -1;//-1 because we have zeroth index and -1 yields in non occurrence of the target
	static int last = -1;
	public static void main(String[] args) {
		String s = "cccbabcdefahj";
		char target = 'a';
		firstAndLast(s, target, 0);
		System.out.println(first);
		System.out.println(last);
		System.out.println(first(s, target , 0));
		System.out.println(last(s, target , s.length()-1));
	}
	private static void firstAndLast(String s, char target, int idx) {
		if(idx==s.length()) return;
		if(s.charAt(idx)==target) {
			if(first==-1) first = idx;
			else last = idx;
		}
		firstAndLast(s, target, ++idx);
	}
	private static int first(String s, char target, int idx) {
		
		if(idx==s.length()) return -1;
		if(s.charAt(idx)!=target) {
			return first(s, target , ++idx);
		}
		
		return idx;
	}
	private static int last(String s, char target, int idx) {
		
		if(idx<0) return -1;
		if(s.charAt(idx)!=target) {
			return last(s, target , --idx);
		}
		
		return idx;
	}
}
