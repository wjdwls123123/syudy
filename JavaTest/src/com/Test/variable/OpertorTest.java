package com.Test.variable;

public class OpertorTest {

	public static void main(String[] args) {

		//���׿�����
		int i=0; // ���� 'i'����� 0�� �ʱ�ȭ
				
				
		//System.out.println("i="+i); 1�� ������ �� �ٷ����� ���̾��¹��
		System.out.println("i+1="+(i++)); 	// ����� ����
		System.out.println("i="+i); 		// ����� �� ���
		
		
		i=i-1; // ������ i�� -1�� ����
		System.out.println("i-1="+i); //����� �� ���
		
		
		//���������
		int x = 10, y = 20;			// �������� x=10, y=2 ���� �����ϰ� �ʱ�ȭ
		char ch = 'A';				// �������� ch�� ������ �����ϰ� A�� �ʱ�ȭ ('A' �ƽ�Ű�ڵ� 65)
		ch = 65;					// ���� ch�� �ʱ�ȭ�� 65�� ���������� �ʱ�ȭ�� 'A'�� �ƽ�Ű�ڵ� ���̹Ƿ� 'A'�� �״�� ����

		int sum = x + y;			// ������ ��������� (+)���� �ʱ�ȭ
		int sub = x - y;			// ������ ��������� (-)���� �ʱ�ȭ
		int multi = x * y;			// ������ ��������� (*)���� �ʱ�ȭ
		float div = x / (y * 1.0f);	// x�� y�� ������ �̹Ƿ� �Ҽ����� ��Ÿ�������� �Ǽ��� float �ϰ�
									// 1.0 �� �Ǽ��� �����ϱ����� �޺κп� float�� ���� f��  ����
		int mock = x / y;			// ������ ��������� (/)�������� �ְ� int �ڷ��������� ������ ����
		int namuji = x % y;			// x �� y�� ���� ���������� �����ϴ� ��������� (%)

		int chSumInt = ch + 3; 		// �ʱ�ȭ���ִ� ���� ch�� ���������(+)3 ����
		char chSumInt2 = (char) chSumInt; 	// chSumInt �� �ʱ�ȭ���ִ� 68�� ������(char)���� �ٲ�

		System.out.println("x+y=" + sum);	// sum �� ����� �� ���
		System.out.println("x-y=" + sub);	// sub �� ����� �� ���
		System.out.println("x*y=" + multi);	// multi �� ����� �� ���
		System.out.println("x/y=" + div);	// div �� ����� �� ���
		System.out.println("mock:x/y=" + mock);	// mock �� ����� �� ���
		System.out.println("namuji : x/y=" + namuji); // namuji �� ����� �� ���
		System.out.println("chSumInt3 : char + int =" + chSumInt2); //chSumInt2 �� ����� �� ���
		
		System.out.println("x > y :" + (x > y)); // x �� ũ�� true ������ false
		System.out.println("x >= y :" + (x >= y)); // x �� ũ�ų� ������ true ������ false
		System.out.println("x < y :" + (x < y)); // y �� ũ�� true ������ false
		System.out.println("x <= y :" + (x <= y)); // y �� ũ�ų� ������ true ������ false
		System.out.println("x == y :" + (x == y)); // x �� y �� ������ true Ʋ���� false
		System.out.println("x != y :" + (x != y)); // x �� y �� ���������� true ������ false

		// ���׿�����
		// (���ǽ�) ? A(true) : B(false)
		int kor = 92; // �ڷ����� kor ���� ����� 92�� �ʱ�ȭ

		System.out.println("�������� ���� : " + ((kor >= 90) ? "A" : "F")); // for �� 90���� ũ�ų� ������ A ��� Ʋ���� F ���

		// ��������
		int k = 9; 	// �ڷ����� k �������� 9 �ʱ�ȭ
		int l = 10; // �ڷ����� l �������� 10 �ʱ�ȭ

		System.out.println(k > 9 && (l = 11) > 10); // ���ؼ� true �Ѵ�Ʋ���� false
		System.out.println(l); // k�� false�� �ڸ� �Ⱥ��� 10���γ���
		System.out.println(k >= 9 && (l = 11) > 10); // ���ؼ� true �Ѵ�Ʋ���� false
		System.out.println(l); // k�� true�� 11�� �״�� ������ �ڸ� ��

		l = 10; // ���� 'l'�� 10 �ʱ�ȭ

		System.out.println(k >= 9 || (l = 11) > 10); // ���߿� �ϳ��� true�� true �Ѵ� �ƴϸ� false
		System.out.println(l); // ����� ���� 'l'�� ���
		System.out.println(k > 9 || (l = 11) > 10); // ���߿� �ϳ��� true�� true �Ѵ� �ƴϸ� false
		System.out.println(l); // ����� ���� 'l'�� ���

		// ���Կ�����

		int m = 0; // �ڷ����� m ��������� 0 �ʱ�ȭ
		m = m + 1; // ���� m�� +1 �ʱ�ȭ
		m = m + 1; // ���� m�� +1 �ʱ�ȭ
		m = m + 1; // ���� m�� +1 �ʱ�ȭ
		m = m + 1; // ���� m�� +1 �ʱ�ȭ
		System.out.println("m=m+1 : " + m); // ������ ���� m ���� ���
	}

}