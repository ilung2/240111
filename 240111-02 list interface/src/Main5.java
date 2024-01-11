import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> origin = new ArrayList<>(
					Arrays.asList(10, 20, 30, 40)
				);
		
		List<Integer> target = new ArrayList<>(
					Arrays.asList(60, 70, 80, 90, 100)
				);
		
		// 0칸에서 복사가 되는게 아니라 덮어쓰기가되어서 복사할려는 인덱스사이즈가 최소 가지고 있어야함.
		Collections.copy(target, origin); 
		
		System.out.println(target);
		
//		Collections.fill(target, 999);
//		System.out.println(target);
		
		Collections.swap(target, 0, 3); // 
		System.out.println(target);
		
		Collections.shuffle(target);
		System.out.println(target);
		
		List<Integer> nums = Collections.nCopies(5, 99);
		System.out.println(nums);
		
		List<Integer> empty = Collections.emptyList();
		System.out.println(empty);
		
		List<Integer> unmod = Collections.unmodifiableList(target);
		System.out.println(unmod); // 불변 추가 삭제가 안됨.
		
		int count = Collections.frequency(target, 100);
		System.out.println(count);
	}
}
