package com.Test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		// Quiz5)

		System.out.println("����� ��Ʈ ���� �Է��Ͻÿ�. ");
		int setNum = Integer.parseInt(new Scanner(System.in).nextLine());

		for (int k = 0; k < setNum; k++) {

			int[] lottoNum = new int[45];

			for (int i = 1; i < lottoNum.length; i++) {
				lottoNum[i] = i + 1;
			}

			int tempNum = 0;
			int changeIndex = 0;
			
			for (int i = 0; i < lottoNum.length * 2; i++) {
				changeIndex = (int) (Math.random() * lottoNum.length);
				tempNum = lottoNum[changeIndex];
				lottoNum[changeIndex] = lottoNum[0];
				lottoNum[0] = tempNum;
			}
			
			int[] output = new int[6];
			output=Arrays.copyOfRange(lottoNum, 0, 6);  // copyOfRange : �ε����� 0���� 5������ ���� ī���ѵ� Arrays �� �ش�
			Arrays.sort(output);  // sort : �������� ����
			System.out.println(Arrays.toString(output)); // toString : �ڵ����� ���һ����� [ ] , ���� �������
//			for (int i = 0; i < 6; i++) {
//				output[i]=lottoNum[i];
//				System.out.print(lottoNum[i]);
//				System.out.print(i == 5 ? "\n" : ",");
				
			}
			//Arrays.sort(output);
			
		}
	}


