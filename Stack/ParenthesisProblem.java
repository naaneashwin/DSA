package Stack;

import java.util.Stack;

public class ParenthesisProblem {
//return true if the parenthesis are matched otherwise false;
	public static void main(String[] args) {
		Stack <Character> stk = new Stack<>();
		int x = 0;
		String s = "()()((()))())((()))";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				stk.push(s.charAt(i));
				x++;
			}
			else {
				x--;
				if(x<0) break;
				stk.pop();
			}
		}
		if(x==0) System.out.println("True");
		else System.out.println("False");
	}
}
