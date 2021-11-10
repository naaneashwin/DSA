package ArrayList;
import Sorting.BubbleSort;

public class FindTheDifference {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
	public static char findTheDifference(String s, String t) {
        boolean flag = false;
        char[] i = s.toCharArray();
        char[] j = t.toCharArray();
        char c ='\0';
       
        BubbleSort.sort(i);//locally defined method(sort) in Sorting package and BubbleSort class
        BubbleSort.sort(j); 
        for(int x=0; x<i.length; x++){
            if((i[x]^j[x])!=0){
                flag = true;
                return j[x];
            }
        }
        if(!flag) c=j[j.length-1];
        return c;
    }
}
