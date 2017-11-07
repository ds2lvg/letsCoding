package Homework;

import java.util.Scanner;

public class Day1026hw01 {
	// 특이하게 만들어본거 (argument로 max 구할지 min 구할지 분기처리함)
	public static int CalcNum(String type, int[] numArr, int[] max_min) {
		int max, min;
		max = min = numArr[0];
		if(type.equals("max")) {
			for (int i = 0; i < 5; i++) {
				max = (max < numArr[i])? numArr[i] : max;			
			}
			max_min[0] = max;
			return max_min[0];
		} else if(type.equals("min")) {
			for (int i = 0; i < 5; i++) {
				min = (min > numArr[i])? numArr[i] : min;			
			}
			max_min[1] = min;
			return max_min[1];
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return 0;
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];  // 숫자들 담을 배열
		int[] max_min = new int[2]; // 최대값, 최소값 담을 배열

 
		System.out.println("정수 5개를 입력하세요?");
		// 입력 받은 숫자들로 배열 만듬
		for (int i = 0; i < 5; i++) {
			numArr[i] = sc.nextInt();
		}

		System.out.println("최대값 "+CalcNum("max", numArr, max_min));
		System.out.println("최소값 "+CalcNum("min", numArr, max_min));
		sc.close();
	}
}