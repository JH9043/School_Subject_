package Subject;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		if (score >= 95) {
			System.out.println("A학점입니다");
		} else if (score >= 90) {
			System.out.println("B학점입니다");
		} else if (score >= 85) {
			System.out.println("C학점입니다");
		} else if (score >= 80) {
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		sc.close();
	}
}
