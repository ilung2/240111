import java.util.ArrayList;

public class DeleteInloop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cat");
		list.add("dog");
		list.add("eagle");
		
		// 위 리스트에서 길이가 3인 문자열을 모두 삭제하기
		// 1. 삭제가 발생하는경우 인덱스 -1해주기 (논리적으로 복잡함)
		for (int i = 0; i < list.size(); i++) {
			String elem = list.get(i);
			if (elem.length() == 3) {
				list.remove(i);
			}
		}
		// 2. 역순으로 접근
		
		
		
		
		
//		System.out.println(list); // 인덱스 2일때 cat인데 사라지고 dog가 내려와서 dog가 2가되어서 인덱스 3은 eagle이라 안사라짐.
	}
}
