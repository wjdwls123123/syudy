package com.test.exercise;

public class EX04_2 {

	public static void main(String[] args) {

		// 4-2 1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		/*/ 2�� 3�� ������� ��� ���ְ� ������ ����
		int i = 0; // ������ �ʱ�ȭ

		for (int num = 1; num < 21; num++) { // 1���� 20������ ������ �ϴ� �ݺ���
			if (num % 2 != 0 && num % 3 != 0) // num�� ���� 2�� �������� ���������� 0�� �ƴϰų� 3���� �������� 0�� �ƴҶ� ����
				i += num; // true�� ���� i�� ��� �����Ͽ� �������� ���� ���߿� ���
		}
		System.out.println("���� :" + i); // �� ���
		*/
		
		int num=0;
		
		for(int i=1;i<21;i++){
			if(i % 2 != 0 && i % 3 != 0)
			num += i;
		}
		System.out.println("���� : " + num);
		
	}

}
//184
