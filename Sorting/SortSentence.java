package Sorting;

public class SortSentence {
	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		String[] arr = s.split(" ");
        String res[] = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            StringBuffer x = new StringBuffer();
            x.append(arr[i]);
            char c = x.charAt(x.length()-1);
            int d = (int)c-49;
            x = x.deleteCharAt(x.length()-1);
            String z = x.toString();
            
            res[d]=z;
        }
        String result ="";
        for(int i=0; i<res.length-1; i++){
            result += res[i] + " ";
        }
        result += res[res.length-1];
        System.out.println(result);
	}
}
