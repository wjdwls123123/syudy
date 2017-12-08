package com.test.exercise;

import java.util.Scanner;

public class EX04_6 {

	public static void sumResult(int sum ) {

		Scanner scan = new Scanner(System.in);

		sum = Integer.parseInt(scan.nextLine());

		sumResult(sum);

		// 간략화
		for (int num1 = 1; num1 < 7; num1++) {
			if (sum - num1 > 0) { // 0은 경우의 수에 없어서 if문으로 (6.0)을 배제할려고 넣음
				System.out.println("(" + num1 + "," + (sum - num1) + ")");
			}
		}

		for (int num1 = 1; num1 < 7; num1++) {
			for (int num2 = 1; num2 < 7; num2++) {
				if (num1 + num2 == 6) {
					System.out.println("(" + num1 + "," + num2 + ")");

				}

			}

		}
	}
}
