package Recursion;

public class RemoveAllDuplicatesInAString {
	public static void main(String[] args) {
		boolean[] map = new boolean[26];
		String oldString = "aabcdeffgsdfggaeravbwezrh", newString = "";
		int idx=0;
		System.out.println(remove(oldString, idx, newString, map));
	}
	private static String remove(String oldString, int idx, String newString, boolean[] map) {
		if(idx==oldString.length()) {
			return newString;
		}
		if(map[oldString.charAt(idx)-'a']==false) {
			map[oldString.charAt(idx)-'a']=true;
			newString+=oldString.charAt(idx);
			return remove(oldString, ++idx, newString, map);
		}
		else {
			map[oldString.charAt(idx)-'a']=true;
			return remove(oldString, ++idx, newString, map);
		}
	}
}
