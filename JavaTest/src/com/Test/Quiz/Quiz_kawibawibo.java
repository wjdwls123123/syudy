package com.Test.Quiz;

import java.util.Scanner;

public class Quiz_kawibawibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kawebawebo = { "가위", "바위", "보" };
		int kawebaweboNum = 0;
		String menu = null;
		while (true) {
			int comKawebawebo = (int) (Math.random() * 3);

			System.out.println("[1]가위");
			System.out.println("[2]바위");
			System.out.println("[3]보");			
			System.out.print("선택하세요. 종료[Q] : ");

			menu = scan.nextLine();
			switch (menu.toLowerCase()) {
			case "1":
			case "2":
			case "3":
				kawebaweboNum = Integer.parseInt(menu) - 1;
				break;
			case "q":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("정확하게 선택하시기 바랍니다.");
				continue;
			}
			System.out.println("당신은 : " + kawebawebo[kawebaweboNum]);
			System.out.println("컴퓨터 : " + kawebawebo[comKawebawebo]);
			if ((kawebaweboNum + 1) % 3 == comKawebawebo) {
				System.out.println("졌네요...");
			} else if (kawebaweboNum == comKawebawebo) {
				System.out.println("비겼어요...");
			}else{
				System.out.println("이기셨네요..축하합니다....");
			}
			System.out.println("\n");
		}

	}
}
