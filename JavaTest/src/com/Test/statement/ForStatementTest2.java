package com.Test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {

		// 1~10������ �ִ� ¦���� ���Ͻÿ�
		System.out.println("1~10������ ¦���� ���Ͻÿ�.");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("������ ������ : " + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 2�� �������� �ۼ��Ͻÿ�.
		System.out.println("2�� �������� �ۼ��Ͻÿ�.");
		int dan = 2;
		for (int gop = 1; gop < 10; gop++) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
		}

		// *������*
		// �ܼ��ݺ�
		for (int dann = 2; dann < 10; dann++) {
		}
		// �����ݺ�
		for (int gopp = 1; gopp < 10; gopp++) {
		}
		
		// ������ �ϼ�
		for (int dann = 2; dann < 10; dann++) { //
			System.out.println(dann + "���Դϴ�.");
			for (int gopp = 1; gopp < 10; gopp++)
				System.out.println(dann + "*" + gopp + "=" + dann * gopp);
		}
		// �����
		char symbol = '*';
		for (int row = 1; row < 11; row++) {
			for (int num = 1; num < row + 1; num++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

		// ����� ���ﰢ��
		int rows = 10;
		for (int roww = 1; roww < rows + 1; roww++) {
			for (int numm = 1; numm < rows - roww + 2; numm++) {
				System.out.print(symbol);
			}
			System.out.println();
	
		}
		
		
	}

}
