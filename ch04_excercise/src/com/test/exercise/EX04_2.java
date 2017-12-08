package com.test.exercise;

public class EX04_2 {

	public static void main(String[] args) {

		// 4-2 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		/*/ 2와 3의 배수들을 모드 빼주고 나머지 덧셈
		int i = 0; // 변수에 초기화

		for (int num = 1; num < 21; num++) { // 1부터 20까지의 정수를 일단 반복함
			if (num % 2 != 0 && num % 3 != 0) // num의 값을 2로 나눴을때 나머지값이 0이 아니거나 3으로 나눈값이 0이 아닐때 진행
				i += num; // true인 값을 i에 계속 저장하여 빠져나온 값을 나중에 출력
		}
		System.out.println("총합 :" + i); // 값 출력
		*/
		
		int num=0;
		
		for(int i=1;i<21;i++){
			if(i % 2 != 0 && i % 3 != 0)
			num += i;
		}
		System.out.println("총합 : " + num);
		
	}

}
//184
