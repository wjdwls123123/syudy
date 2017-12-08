package com.test.exercise;

public class EX04_4 {

	public static void main(String[] args) {
		
		//1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때,몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int num=0; // 변수 num에 0 초기화
		int sum=0; // 변수 sum에 0 초기화
		
		while(sum<=100){ 	// 문제로 만들기위해 일단 100 이랑 같거나 높을때까지 반복문 사용
			num++;			// num의 값을 후증가 시켜줌
			if(num%2==0){	// 조건반복을 사용하여 num의 변수값을 2로 나눈 나머지가 0이랑 같을경우 다음행 시행
				sum-=num;	// sum 과 num 값을 뺄셈함
			}else{			// else if 문이 false 로 나올경우 시행
				sum+=num;	// sum 과 num 값을 덧셈함
			}
		}
		System.out.println("num="+num);	// num 값 출력
		System.out.println("sum="+sum); // sum 값 출력
		
		//위 예제 간단화
//		while(sum<100){
//			num++;
//			sum+=(num%2==0)?num*(-1):num;
//		}
//		System.out.println("num="+num);
//		System.out.println("sum="+sum);
//		
	}

}
