package Subject;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int ar[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하세요");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] % 3 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
		sc.close();
	}
}
