import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		list.add("원소4");
		list.add("원소5");
		
//		String deleted = list.remove(0); // 삭제된 참조를 보여줌.
//		System.out.println(deleted); // 삭제된것을 보여줌.
//		deleted = list.remove(0); // 삭제된 리스트에서 인덱스 0번을 삭제하는데 제일앞에껄보여줌.
//		System.out.println(deleted);
//		deleted = list.remove(0);

		
		while (list.size() > 0) {
			System.out.println(list.remove(0));
		}
		
		list.remove(5);
		
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.remove(i));
//		}
		
		
	}
}