package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class AddElementsAndRemoveElementAtSpecificIndex {
	public static void main (String...args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Before Replacing");
		System.out.println(list);
		
		list.set(3, 500);
		
		System.out.println("After Replacing");
		System.out.println(list);
	}
}
