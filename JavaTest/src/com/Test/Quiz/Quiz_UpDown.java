package com.Test.Quiz;

import java.util.Scanner;

public class Quiz_UpDown {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int comNum = 0;
		int MAX = 100;
		int MIN = 1;
		int count = 0;

		System.out.println("******** 업다운 게임 ********\n\n");
		boolean flagMenu1 = true;
		while (flagMenu1) {
			count=0;
			MIN=1;
			MAX=100;
			comNum = (int) (Math.random() * 100 + 1);
			System.out.println("컴퓨터는 숫자를 결정했습니다.\n");
			System.out.println("시작하겠습니다.");
			boolean flagMenu2 = true;
			while (flagMenu2) {
				System.out.println(MIN + "부터 " + MAX + "사이의 숫자를 입력하세요.");

				input = Integer.parseInt(scan.nextLine().trim());
				count++;

				if (input == comNum) {
					System.out.println("축하합니다. 정답입니다.");
					System.out.println(count + "번째 맞췄습니다.");
					boolean flagMenu3 = true;
					while (flagMenu3) {
						System.out.print("\n\n게임을 계속하시겠습니까? (y/n)");
						switch ("" + scan.nextLine().charAt(0)) {
						case "y":
							System.out.println("게임을 계속 진행합니다.\n\n");
							flagMenu2 = false;
							flagMenu3 = false;
							break;
						case "n":
							System.out.println("게임을 종료합니다.");
							flagMenu3 = false;
							flagMenu2 = false;
							flagMenu1 = false;
							break;
						default:
							System.out.println("메뉴선택이 잘못 되었습니다");
						}
					}
				} else {
					if (input >= MIN && input < comNum) {
						System.out.println("업!!!");
						MIN = input + 1;
					} else if (input <= MAX && input > comNum) {
						System.out.println("다운!!!");
						MAX = input - 1;
					} else {
						System.out.println("입력이 올바르지 않습니다.");
					}
				}
			}
		}
	}
}
