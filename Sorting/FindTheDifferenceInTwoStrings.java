package Sorting;

public class FindTheDifferenceInTwoStrings {
	public static void main(String[] args) {
		//s.length() is always t.length()-1
		String s = "aaaa";
		String t = "aaaba";
		boolean flag = false;
        char[] i = s.toCharArray();
        char[] j = t.toCharArray();
        char c ='\0';
        BubbleSort.sort(i);
        BubbleSort.sort(j);
        for(int x=0; x<i.length; x++){
            if((i[x]^j[x])!=0){
            	c=j[x];
                flag = true;
            }
        }
        if(!flag) c=j[j.length-1];
        System.out.println(c);
	}	
}
