package com.test.exercise;

public class EX04_4 {

	public static void main(String[] args) {
		
		//1+(-2)+3+(-4)+... , �� ���� ������ ��� ���س����� ��,����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
		int num=0; // ���� num�� 0 �ʱ�ȭ
		int sum=0; // ���� sum�� 0 �ʱ�ȭ
		
		while(sum<=100){ 	// ������ ��������� �ϴ� 100 �̶� ���ų� ���������� �ݺ��� ���
			num++;			// num�� ���� ������ ������
			if(num%2==0){	// ���ǹݺ��� ����Ͽ� num�� �������� 2�� ���� �������� 0�̶� ������� ������ ����
				sum-=num;	// sum �� num ���� ������
			}else{			// else if ���� false �� ���ð�� ����
				sum+=num;	// sum �� num ���� ������
			}
		}
		System.out.println("num="+num);	// num �� ���
		System.out.println("sum="+sum); // sum �� ���
		
		//�� ���� ����ȭ
//		while(sum<100){
//			num++;
//			sum+=(num%2==0)?num*(-1):num;
//		}
//		System.out.println("num="+num);
//		System.out.println("sum="+sum);
//		
	}

}
