package Homework;

import java.util.Scanner;

public class Day1024hw02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int temp;
		System.out.println("5개의 정수를 입력하세요.");

		// 입력받은 정수로 배열 생성
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
		}
		
		// 앞뒤값 비교(버블정렬)
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
		
		// 정렬된 배열 출력
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]+" ");			
		}
		sc.close();
		
	}
}
/*
2. 다음 점수를 입력받고 큰 수부터 작은 수로 정렬해서 출력해 보세요.
  
   출력결과)
   5개의 정수를 입력하세요.
   10 20 30 40 50
   정렬결과 : 50 40 30 20 10
   힌트) 버블 정렬, 선택 정렬 방법을 찾아보세요. 
*/