package com.Test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest04 {

	/*
	 * Quiz 7) ������ ���� 7���� �Է¹޾� ���� ū���� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ������) 1��° ���� : 45 2��° ���� : 97 ...... 7��° ���� : 43 max num : 149 min num :
	 * 8
	 */
	public static void main(String[] args) {
		
		int [] intArray = new int [7];	// ������ ���� �� �ޱ����� 7���� �迭�� �ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<intArray.length;i++){	// for ���� ���� �迭�ӿ� �ִ� intArray �� length ��
			System.out.print((i+1)+"��°  ���� : "); // ��� �Ҷ� i���� 1�� +1 �������ν� ó�������� 0 �� �ƴ϶� 1 �� �ɼ��ֵ��� ��.
			intArray[i]=Integer.parseInt(scan.nextLine());	// 
		}
		
		Arrays.sort(intArray);
		
		System.out.println("max num : "+intArray[intArray.length-1]);
		System.out.println("max num : "+intArray[0]);
		
	
	}
	
}
