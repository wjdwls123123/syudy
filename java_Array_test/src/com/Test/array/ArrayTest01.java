package com.Test.array;

public class ArrayTest01 {
	int x=30;; // 메모리의 영역이 틀림 (전역변수)
	
	{
		int x=100000000; // (지역 변수 설정)
		//int x;
		System.out.println(x); // 먼저 같은 (지역)구역에있는 것을 찾아 출력하고 없으면 밖에(전역 변수) 에서 찾아서 출력함
		{
			//int x;	// 같은 지역변수에 설정된 변수라 에러 
			int y;		// 지역변수 안에있지만 그 안에서 나눠진 구역에 선언된 변수라 밑에 y랑은 겹치지 않음
			{
				//int x; // 같은 지역변수 내에 선언된 변수라 에러
			}
		}
		
		{
			int y;	// 같은지역변수 안에서 선언된 y가 있지만 그 안에 나눠진 구역에있기때문에 겹치지않음 
			
		}
	}
	
	
	public static void main(String[] args) {
	
		// 1차원 배열 (행)
		int[] intArray = new int[5]; //5개의 공간 할당
		intArray[0]=1;	// intArray 할당된 변수 0에 1값 초기화 
		intArray[1]=2;	// intArray 할당된 변수 0에 2값 초기화
		intArray[2]=3;	// intArray 할당된 변수 0에 3값 초기화
		intArray[3]=4;	// intArray 할당된 변수 0에 4값 초기화
		intArray[4]=5;	// intArray 할당된 변수 0에 5값 초기화
		
		int[] intArray2={1,2,3,4,5}; // 공간할당 동시에 값 할당
		
		int[] intArray3=new int[]{1,2,3,4,5}; //새로운 배열 할당
		
		intArray=new int[]{1,2,3,4,5,6,7,7,8,9,10}; //[재정] 새로운 intArray에 값을 할당
	
		int[] intArray4=new int[100]; //공간을 할당시킴 [0~100까지]

			//int index; // 같은 영역에 있어서 에러
		
		for(int index=0; index<intArray4.length;index++){ //0값을 초기화 하고 index 가 intArray4 (0~100까지 할당된 공간) 보다 작은 값을 index를 후증가
			intArray4[index]=index+1; // 배열에 할당된 공간에 index 를 변수로 지정하고 반복문이 돌때마다 1씩 증가
			System.out.print(intArray4[index] +	(intArray4[index] % 10 != 0 ? "," : "\n"));
		}	//intArray4[index] + intArray4[index] 더한 값을 10하고 나눈 나머지가 0이 맞을경우 부정이므로 ture (",") 맞을경우 false ("\n")

		//			System.out.print(intArray4[index]);
//			if(intArray4[index]%10!=0){
//				System.out.print(",");
//			}else{
//				System.out.println();
			
			
		
		//2차원 배열 (행 X 열) → 배열 안에 배열
		int[][] intArrays=new int[3][3]; // 3열에 3행을 할당함
		
		int[][] intArrays2={						// 배열속에 열 과 행을 할당할수있는 공간생성
								{ 1, 2, 3},			// 0.0 0.1 0.2 열 과 행 할당
								{ 4, 5, 6},			// 1.0 1.1 1.2 열 과 행 할당
								{ 7, 8, 9}			// 2.0 2.1 2.2 열 과 행 할당
						  	};
		int[][] scoreTable={						// 배열속에 열 과 행을 할당할수있는 공간생성
								{ 100, 100, 100},	// 0.0 0.1 0.2 열 과 행 할당
								{ 20, 20, 20},		// 1.0 1.1 1.2 열 과 행 할당
								{ 30, 30, 30},		// 2.0 2.1 2.2 열 과 행 할당
								{ 40, 40, 40},		// 3.0 3.1 3.2 열 과 행 할당
								{ 50, 50, 50}		// 4.0 4.1 4.2 열 과 행 할당
						   };
		int[][] scoreTable2={						// 배열속에 열 과 행을 할당할수있는 공간생성
				{ 100, 100, 100},	// 0.0 0.1 0.2 열 과 행 할당
				{ 20, 20, 20},		// 1.0 1.1 1.2 열 과 행 할당
				{ 30, 30, 30},		// 2.0 2.1 2.2 열 과 행 할당
				{ 40, 40, 40},		// 3.0 3.1 3.2 열 과 행 할당
				{ 50, 50, 50}		// 4.0 4.1 4.2 열 과 행 할당
		   };
	
//		int total=0;
//		for(int row=0; roww<scoreTable.length;roww++){
//			total=0;
//			for(int) col=0; col<scoreTable.length;col++){
//				total+scoreTable[row][col];
//			}
//			System.out.println((row+1)+"번 학생 평균 :"+(total*1f/scoreTable{row}.length) );
//		}
		int korTotal=0;		// 변수선언
		int engTotal=0;		// 변수선언
		int mathTotal=0;	// 변수선언
		for(int row=0; row<scoreTable.length;row++){		//row 가 scoreTable 보다 클때까지 후증가
			korTotal+=scoreTable[row][0];					//반복문의 조건을 달성할때까지 지정된 배열에 row 값 초기화 행값은 고정
			engTotal+=scoreTable[row][1];					//반복문의 조건을 달성할때까지 지정된 배열에 row 값 초기화 행값은 고정
			mathTotal+=scoreTable[row][2];					//반복문의 조건을 달성할때까지 지정된 배열에 row 값 초기화 행값은 고정
		}
		System.out.println("전체 학생의 국어평균 : "+korTotal/3f);	//변수에 3을 나눈값을 출력 실수형이므로 뒤에 f를 붙여 실수로 만듬
		System.out.println("전체 학생의 영어평균 : "+korTotal/3f);	//변수에 3을 나눈값을 출력 실수형이므로 뒤에 f를 붙여 실수로 만듬
		System.out.println("전체 학생의 수학평균 : "+mathTotal/3f);//변수에 3을 나눈값을 출력 실수형이므로 뒤에 f를 붙여 실수로 만듬
		

	}
			
} 


	




