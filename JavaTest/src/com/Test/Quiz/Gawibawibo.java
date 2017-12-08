package com.Test.Quiz;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("* 가위(1) 바위(2) 보(3) 게임 *");
		System.out.println("숫자를 입력해주세요 :");
		int user = sc.nextInt();
		int com =(int)(Math.random()*3+1);
		
		System.out.println("당신은" + " " + user);
		System.out.println("COM" + " " + com);
		System.out.println();

		switch (user-com) {
		case 2: case -1:
			System.out.println("당신은 졋습니다.");
			break;
		case 1: case -2:
			System.out.println("당신은 이겻습니다.");
			break;
		case 0:
			System.out.println("당신은 비겻습니다.");
			break;
			
		 }
			System.out.println("계속하시겠습니까? (y/n)");
			int x = sc.nextInt();
			
		
	
	}
}
