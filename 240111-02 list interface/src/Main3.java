import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(
					Arrays.asList(100, 5, 3, 22, 46)
				);
		List<Integer> origin = new ArrayList<>(list);
		Collections.sort(list); // Collections.reverseOrder()); 역순
//		list.sort(null);
		
		System.out.println(list);
		System.out.println(origin);
		
		int index = Collections.binarySearch(list, 100); // binarySearch >> 정렬이 되어있고 원소들이 고유해야한다
		System.out.println(index);
	}
}
