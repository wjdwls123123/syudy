package com.Test.Quiz;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("* ����(1) ����(2) ��(3) ���� *");
		System.out.println("���ڸ� �Է����ּ��� :");
		int user = sc.nextInt();
		int com =(int)(Math.random()*3+1);
		
		System.out.println("�����" + " " + user);
		System.out.println("COM" + " " + com);
		System.out.println();

		switch (user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("����� �����ϴ�.");
			break;
			
		 }
			System.out.println("����Ͻðڽ��ϱ�? (y/n)");
			int x = sc.nextInt();
			
		
	
	}
}
