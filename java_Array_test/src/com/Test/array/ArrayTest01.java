package com.Test.array;

public class ArrayTest01 {
	int x=30;; // �޸��� ������ Ʋ�� (��������)
	
	{
		int x=100000000; // (���� ���� ����)
		//int x;
		System.out.println(x); // ���� ���� (����)�������ִ� ���� ã�� ����ϰ� ������ �ۿ�(���� ����) ���� ã�Ƽ� �����
		{
			//int x;	// ���� ���������� ������ ������ ���� 
			int y;		// �������� �ȿ������� �� �ȿ��� ������ ������ ����� ������ �ؿ� y���� ��ġ�� ����
			{
				//int x; // ���� �������� ���� ����� ������ ����
			}
		}
		
		{
			int y;	// ������������ �ȿ��� ����� y�� ������ �� �ȿ� ������ �������ֱ⶧���� ��ġ������ 
			
		}
	}
	
	
	public static void main(String[] args) {
	
		// 1���� �迭 (��)
		int[] intArray = new int[5]; //5���� ���� �Ҵ�
		intArray[0]=1;	// intArray �Ҵ�� ���� 0�� 1�� �ʱ�ȭ 
		intArray[1]=2;	// intArray �Ҵ�� ���� 0�� 2�� �ʱ�ȭ
		intArray[2]=3;	// intArray �Ҵ�� ���� 0�� 3�� �ʱ�ȭ
		intArray[3]=4;	// intArray �Ҵ�� ���� 0�� 4�� �ʱ�ȭ
		intArray[4]=5;	// intArray �Ҵ�� ���� 0�� 5�� �ʱ�ȭ
		
		int[] intArray2={1,2,3,4,5}; // �����Ҵ� ���ÿ� �� �Ҵ�
		
		int[] intArray3=new int[]{1,2,3,4,5}; //���ο� �迭 �Ҵ�
		
		intArray=new int[]{1,2,3,4,5,6,7,7,8,9,10}; //[����] ���ο� intArray�� ���� �Ҵ�
	
		int[] intArray4=new int[100]; //������ �Ҵ��Ŵ [0~100����]

			//int index; // ���� ������ �־ ����
		
		for(int index=0; index<intArray4.length;index++){ //0���� �ʱ�ȭ �ϰ� index �� intArray4 (0~100���� �Ҵ�� ����) ���� ���� ���� index�� ������
			intArray4[index]=index+1; // �迭�� �Ҵ�� ������ index �� ������ �����ϰ� �ݺ����� �������� 1�� ����
			System.out.print(intArray4[index] +	(intArray4[index] % 10 != 0 ? "," : "\n"));
		}	//intArray4[index] + intArray4[index] ���� ���� 10�ϰ� ���� �������� 0�� ������� �����̹Ƿ� ture (",") ������� false ("\n")

		//			System.out.print(intArray4[index]);
//			if(intArray4[index]%10!=0){
//				System.out.print(",");
//			}else{
//				System.out.println();
			
			
		
		//2���� �迭 (�� X ��) �� �迭 �ȿ� �迭
		int[][] intArrays=new int[3][3]; // 3���� 3���� �Ҵ���
		
		int[][] intArrays2={						// �迭�ӿ� �� �� ���� �Ҵ��Ҽ��ִ� ��������
								{ 1, 2, 3},			// 0.0 0.1 0.2 �� �� �� �Ҵ�
								{ 4, 5, 6},			// 1.0 1.1 1.2 �� �� �� �Ҵ�
								{ 7, 8, 9}			// 2.0 2.1 2.2 �� �� �� �Ҵ�
						  	};
		int[][] scoreTable={						// �迭�ӿ� �� �� ���� �Ҵ��Ҽ��ִ� ��������
								{ 100, 100, 100},	// 0.0 0.1 0.2 �� �� �� �Ҵ�
								{ 20, 20, 20},		// 1.0 1.1 1.2 �� �� �� �Ҵ�
								{ 30, 30, 30},		// 2.0 2.1 2.2 �� �� �� �Ҵ�
								{ 40, 40, 40},		// 3.0 3.1 3.2 �� �� �� �Ҵ�
								{ 50, 50, 50}		// 4.0 4.1 4.2 �� �� �� �Ҵ�
						   };
		int[][] scoreTable2={						// �迭�ӿ� �� �� ���� �Ҵ��Ҽ��ִ� ��������
				{ 100, 100, 100},	// 0.0 0.1 0.2 �� �� �� �Ҵ�
				{ 20, 20, 20},		// 1.0 1.1 1.2 �� �� �� �Ҵ�
				{ 30, 30, 30},		// 2.0 2.1 2.2 �� �� �� �Ҵ�
				{ 40, 40, 40},		// 3.0 3.1 3.2 �� �� �� �Ҵ�
				{ 50, 50, 50}		// 4.0 4.1 4.2 �� �� �� �Ҵ�
		   };
	
//		int total=0;
//		for(int row=0; roww<scoreTable.length;roww++){
//			total=0;
//			for(int) col=0; col<scoreTable.length;col++){
//				total+scoreTable[row][col];
//			}
//			System.out.println((row+1)+"�� �л� ��� :"+(total*1f/scoreTable{row}.length) );
//		}
		int korTotal=0;		// ��������
		int engTotal=0;		// ��������
		int mathTotal=0;	// ��������
		for(int row=0; row<scoreTable.length;row++){		//row �� scoreTable ���� Ŭ������ ������
			korTotal+=scoreTable[row][0];					//�ݺ����� ������ �޼��Ҷ����� ������ �迭�� row �� �ʱ�ȭ �ప�� ����
			engTotal+=scoreTable[row][1];					//�ݺ����� ������ �޼��Ҷ����� ������ �迭�� row �� �ʱ�ȭ �ప�� ����
			mathTotal+=scoreTable[row][2];					//�ݺ����� ������ �޼��Ҷ����� ������ �迭�� row �� �ʱ�ȭ �ప�� ����
		}
		System.out.println("��ü �л��� ������� : "+korTotal/3f);	//������ 3�� �������� ��� �Ǽ����̹Ƿ� �ڿ� f�� �ٿ� �Ǽ��� ����
		System.out.println("��ü �л��� ������� : "+korTotal/3f);	//������ 3�� �������� ��� �Ǽ����̹Ƿ� �ڿ� f�� �ٿ� �Ǽ��� ����
		System.out.println("��ü �л��� ������� : "+mathTotal/3f);//������ 3�� �������� ��� �Ǽ����̹Ƿ� �ڿ� f�� �ٿ� �Ǽ��� ����
		

	}
			
} 


	




