package Homework;

public class Day1024hw01 {
	public static void main(String[] args) {
		String[] name = {"김설현", "아이유", "배수지", "아이린", "김수현"};
		String[] sub_name = {"국어", "수학", "영어"};
		int[][] score = { {85, 60, 70},
						  {90, 95, 80},
						  {75, 80, 100},
						  {80, 70, 95},
						  {100, 65, 80}
		};
		int[] sum = new int[5];
		int[] avg = new int[5];
		int[] nth = new int[5];
		int[] sbjSum = new int[3];

		// 총점과 평균구하기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i] = sum[i] + score[i][j];
				avg[i] = sum[i] / score[0].length;
			}
			
		}
		
		// 등수 구하기
		nth[0]=1;
		for (int i = 0; i < 5; i++) {
			int stat=1; // 초기 등수는 1등
			for (int j = 1; j < 5; j++) {
				if(sum[i]<sum[j]) { // 뒤에 있는 점수가 클때마다 1씩 더함
					stat++; 
				}
				nth[i] = stat;				
			}
//			System.out.println("nth["+i+"]"+nth[i]); 등수 제대로 들어가나 확인
		}		
		
		// 출력하기
		System.out.println("=================== 학생별 / 과목별 총점 ================");
		for (int k = 0; k < sub_name.length; k++) {
			System.out.print("\t "+sub_name[k]); // 과목 이름 출력
		}
		System.out.println("\t 총점\t 평균\t 등수");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t "); // 이름 출력
			for (int j = 0; j < score[1].length; j++) {
				System.out.print(score[i][j]+"\t "); // 개별 점수 출력	
			}
			System.out.print(sum[i]+"\t ");
			System.out.print(avg[i]+"\t ");
			System.out.print(nth[i]+"\t ");
			System.out.println();
		}
		
		System.out.println("===================================================");
		System.out.print("총점");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				sbjSum[i] = sbjSum[i] + score[j][i];		
			}
			System.out.print("\t "+sbjSum[i]); // 총점 출력
		}
		
	}
}
/*
1. TwoArr01.java를 이용해서 등수를 구해보세요.
========== 학생별   /  과목별 총점구하기  ==========
	       국어	수학	영어	총점	평균   등수
강호동	85	60	70	215	71	5
이승기	90	95	80	265	88	1
유재석	75	80	100	255	85	2 
하하	    80	70	95	245	81	3
이광수	100	65	80	245	81	3
====================================================
총점	430	370	425	
*/