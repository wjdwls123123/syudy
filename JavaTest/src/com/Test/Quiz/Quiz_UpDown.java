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

		System.out.println("******** ���ٿ� ���� ********\n\n");
		boolean flagMenu1 = true;
		while (flagMenu1) {
			count=0;
			MIN=1;
			MAX=100;
			comNum = (int) (Math.random() * 100 + 1);
			System.out.println("��ǻ�ʹ� ���ڸ� �����߽��ϴ�.\n");
			System.out.println("�����ϰڽ��ϴ�.");
			boolean flagMenu2 = true;
			while (flagMenu2) {
				System.out.println(MIN + "���� " + MAX + "������ ���ڸ� �Է��ϼ���.");

				input = Integer.parseInt(scan.nextLine().trim());
				count++;

				if (input == comNum) {
					System.out.println("�����մϴ�. �����Դϴ�.");
					System.out.println(count + "��° ������ϴ�.");
					boolean flagMenu3 = true;
					while (flagMenu3) {
						System.out.print("\n\n������ ����Ͻðڽ��ϱ�? (y/n)");
						switch ("" + scan.nextLine().charAt(0)) {
						case "y":
							System.out.println("������ ��� �����մϴ�.\n\n");
							flagMenu2 = false;
							flagMenu3 = false;
							break;
						case "n":
							System.out.println("������ �����մϴ�.");
							flagMenu3 = false;
							flagMenu2 = false;
							flagMenu1 = false;
							break;
						default:
							System.out.println("�޴������� �߸� �Ǿ����ϴ�");
						}
					}
				} else {
					if (input >= MIN && input < comNum) {
						System.out.println("��!!!");
						MIN = input + 1;
					} else if (input <= MAX && input > comNum) {
						System.out.println("�ٿ�!!!");
						MAX = input - 1;
					} else {
						System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
					}
				}
			}
		}
	}
}
