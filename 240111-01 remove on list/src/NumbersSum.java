import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

// 사용자가 정수를 계속 입력함

// 매 3회의 입력이 있을 때
// 입력한 정수를 나열하고 합을 출력

// 음수를 입력하면 종료
// 모든 정수 입력 기록을 출력

public class NumbersSum {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("정수를 입력하세요 -수를 입력하면 종료");
			int userInput = scan.nextInt();
			
			
			
			if (userInput < 0) {
				System.exit(userInput);
				System.out.println("프로그램 종료");
			}
		}

	}
}
