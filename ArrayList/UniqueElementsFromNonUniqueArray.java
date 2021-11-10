package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class UniqueElementsFromNonUniqueArray {
//create an array which has multiple values (repeated)
//Remove duplicates and add it to an arrayList(Array list should not contains duplicates)
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,9,9,5,6,7,7,8,14,9,7,6};
		List<Integer> arrList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(!arrList.contains(arr[i])) arrList.add(arr[i]); 
		}
		for(int x: arrList) System.out.println(x);
	}
}
