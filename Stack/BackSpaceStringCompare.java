package Stack;
import java.util.Stack;

public class BackSpaceStringCompare {
	public static void main(String[] args) {
		String a = "a#b#cdf", b = "a#b#cdf";
		System.out.println(backspaceCompare(a,b));
	}
	 public static boolean backspaceCompare(String s, String t) {
	        Stack<Character> stk1 = new Stack<>();
	        Stack<Character> stk2 = new Stack<>();
	        
	        for(int i=0; i<s.length(); i++){
	            
	            if(s.charAt(i)=='#'){
	                if(!stk1.isEmpty()){
	                    stk1.pop();
	                }
	                else{
	                    continue;
	                }
	                
	            }else{
	                stk1.push(s.charAt(i));
	            }
	        }
	        for(int i=0; i<t.length(); i++){
	            
	            if(t.charAt(i)=='#'){
	                if(!stk2.isEmpty()){
	                    stk2.pop();
	                }
	                else{
	                    continue;
	                }
	                
	            }else{
	                stk2.push(t.charAt(i));
	            }
	        }
	        
	        String s1 = "", s2 = "";
	        
	        while(!stk1.isEmpty()){
	            s1 += stk1.pop();
	        }
	        while(!stk2.isEmpty()){
	            s2 += stk2.pop();
	        }
	        
	        return s1.equals(s2)?true:false;
	    }

}
