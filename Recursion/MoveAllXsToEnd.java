package Recursion;

public class MoveAllXsToEnd {
	public static void main(String[] args) {
		
		String s = "";
		String x = "abcxxxabcsdfsdfgabxx";
		System.out.println(move(x,0,s,0));
	}
	private static String move(String x,int idx, String s, int count) {
		if(idx==x.length()) {
			while(count>0) {
				s+='x';
				count--;
			}
			return s;
		}
		if(x.charAt(idx)=='x') {
			count++;
			return move(x,++idx,s,count);
		}
		else {
			s+=x.charAt(idx);
			return move(x,++idx,s,count);
		}
	}
}
