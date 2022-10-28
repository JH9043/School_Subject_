package Subject;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String chulsu = sc.next();
		System.out.print("영희 >> ");
		String younghe = sc.next();
		if (chulsu.equals("가위")) {
			if (younghe.equals("가위")) {
				System.out.println("비겼습니다.");
			} else if (younghe.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			} else if (younghe.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} else if (chulsu.equals("바위")) {
			if (younghe.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			} else if (younghe.equals("바위")) {
				System.out.println("비겼습니다.");
			} else if (younghe.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} else if (chulsu.equals("보")) {
			if (younghe.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			} else if (younghe.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			} else if (younghe.equals("보")) {
				System.out.println("비겼습니다.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
}
