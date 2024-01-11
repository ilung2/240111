import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		
		String[] arr = list.toArray(new String[0]); // 어떠한 타입에 배열의 참조
//		System.out.println("배열 변환 확인:" +Arrays.toString(arr));
		
		List<String> vec = new Vector<>();
		vec.add("원소1");
		vec.add("원소2");
		vec.add("원소3");
		vec.add("원소4"); 
		
//		System.out.println(list.containsAll(vec));
//		
//		System.out.println(list.equals(vec)); 
		// 리스트는 동등함을따질때 크기 와 각 원소들의 index가 같은지를 따진다
		
		list.removeAll(vec); 
		System.out.println(list.isEmpty());
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
//		System.out.println(list.size());
	}
}
