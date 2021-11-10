package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyElementsFromOnetoOtherList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//inbuilt
		//List<Integer> list2 = new ArrayList<>(list);
		
		List<Integer> list2 = new ArrayList<>();
		for(int i: list) {
			list2.add(i);
		}
		System.out.println(list2);
	}
	
}
