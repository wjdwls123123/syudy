package com.Test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest04 {

	/*
	 * Quiz 7) 임의의 숫자 7개를 입력받아 가장 큰수와 가장 작은 수를 출력하는 프로그램을 작성하시오.
	 * 
	 * 실행결과) 1번째 숫자 : 45 2번째 숫자 : 97 ...... 7번째 숫자 : 43 max num : 149 min num :
	 * 8
	 */
	public static void main(String[] args) {
		
		int [] intArray = new int [7];	// 임의의 숫자 를 받기위해 7개를 배열에 초기화
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<intArray.length;i++){	// for 문을 통해 배열속에 있는 intArray 를 length 함
			System.out.print((i+1)+"번째  숫자 : "); // 출력 할때 i값에 1을 +1 해줌으로써 처음시작이 0 이 아니라 1 이 될수있도록 함.
			intArray[i]=Integer.parseInt(scan.nextLine());	// 
		}
		
		Arrays.sort(intArray);
		
		System.out.println("max num : "+intArray[intArray.length-1]);
		System.out.println("max num : "+intArray[0]);
		
	
	}
	
}
