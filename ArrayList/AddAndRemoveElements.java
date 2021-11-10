package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class AddAndRemoveElements {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("ajay");
		arr.add("ash");
		arr.add("ashw");
		arr.add("ashwin");
		//arr.add(25);
		System.out.println(arr.size());
		//arr.remove(new String("ashw"));
		//System.out.println(arr.size());
		arr.add(1,"comap");
		arr.set(4, "mouse");
		
		for(String s: arr) {
			System.out.println(s);
		}
	}
}
