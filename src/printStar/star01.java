package printStar;

import java.util.Scanner;

public class star01 {
	public static void main(String[] args) {
		System.out.println("출력할 별의 행수를 정수로 입력");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); // 별의 행 갯수 
		int emp = row-1;
		
		// i의 범위는 별의 총 행수
		for (int i = 1; i <= row; i++) {
			
			// 공백 삽입 for문 : j의 초기값은 첫줄 공백의 갯수
			for (int j = emp; j >= i; j--) {
				System.out.print(" ");
			}
			
			// 별 삽입 for문 : k의 초기값은 i보다 작아야함
			for (int k = 0; k < i; k++) {
				System.out.print("*");				
			}
			
			// 별 삽입 for문 : l의 초기값은 k보다 커야함
			for (int l = 1; l < i; l++) {
				System.out.print("*");				
			}
			
			// 공백 삽입 for문 : j의 초기값은 첫줄 공백의 갯수
			for (int j = emp; j >= i; j--) {
				System.out.print(" ");
			}			
			
			System.out.println("");
		}
		
		sc.close();
	}
}

