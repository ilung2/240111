import java.util.Deque;
import java.util.LinkedList;

public class Main3 {
	public static void main(String[] args) {
		// LIFo (Last-in First-Out) - Stack : 후입선출
		Deque<String> deque = new LinkedList<>();
		deque.push("원소1"); // push 는 가장 오래된 원소가 아래
		deque.add("원소2"); // 꺼낼때는 제일 위에서 
		deque.push("원소3");
		deque.push("원소4");
		
		System.out.println(deque.size());
		System.out.println(deque);
		
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}
}
