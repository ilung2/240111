package Teacher;

import java.util.ArrayList;
import java.util.Scanner;

// 사용자가 정수를 계속 입력함.

// 매 3회의 입력이 있을 때
// 입력한 정수를 나열하고 합을 출력

// 음수를 입력하면 종료
// 모든 정수 입력 기록을 출력

public class NumbersSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> current = new ArrayList<>(); // 현재리스트
		ArrayList<Integer> total = new ArrayList<>(); // 종합리스트

		while (true) {
			while (current.size() < 3) {
				int num = scan.nextInt();
				current.add(num);

				if (num < 0) {
					System.out.println("total 확인 :" + total);
					System.exit(0);
				}
			}
			total.addAll(current); // addAll() ()안에 리스트를 추가하는데 추가한 리스트에 모든 원소들을 추가함.
			int a = current.remove(0); 
			int b = current.remove(0);
			int c = current.remove(0);
			System.out.printf("%d + %d + %d = %d\n", a, b, c, (a + b + c));
		}
	}
}
