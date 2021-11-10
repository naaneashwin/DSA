package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListInDecendingOrder {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(15);
		System.out.println(sort(li));
		
		//inbuilt
		Collections.sort(li);//for increasing order
		System.out.println(li);
		Collections.sort(li,Collections.reverseOrder()); //for reverse order
		System.out.println(li);
		

	}
	private static List<Integer> sort(List<Integer> li) {
		
		for(int i=1; i<li.size(); i++) {
			int key = li.get(i);
			int j = i-1;
			
			while(j>-1 && li.get(j)<key) {
				li.set(j+1, li.get(j));
				j--;
			}
			li.set(j+1, key);
		}
		
		return li;
	}
}
