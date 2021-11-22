package Stack;

import java.util.Stack;

public class ReverseWordsOfAString {
	public static void main(String[] args) {
		String s = "Hi I am Ashwin";
		String[] arr = s.split(" ");
		Stack<String> stk = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			stk.push(arr[i]);
		}
		String res ="";
		for(int i=0; i<arr.length-1; i++) {
			res += stk.pop() + " ";
		}
		res += stk.pop();
		System.out.println(res);
	}
}
