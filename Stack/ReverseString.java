package Stack;
import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		Stack<Character> stk = new Stack<>();
		String s = "Ashwin";
		for(int i=0; i<s.length(); i++) {
			stk.push(s.charAt(i));
		}
		String res = "";
		for(int i=0; i<s.length(); i++) {
			res += stk.pop();
		}
		System.out.println(res);
	}
}
