package inputScore;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrScore = new int[3];
		int[] tempArr = new int[6];
		int sum=0, div=0, i=0;

		while(true) { 
			System.out.println("점수를 입력해주세요. 0누르면 입력한 점수들의 합계와 평균을 계산합니다");
			int iptNum = sc.nextInt();
			if(iptNum == 0) {
				break;
			}
			arrScore[i] = iptNum;
			if(i==arrScore.length-1) { // 배열 꽉찼을때
//				System.out.printf("arrScore"); // 현재 배열 확인
//				System.out.println(Arrays.toString(arrScore));					
				
				System.arraycopy(arrScore, 0, tempArr, 0, arrScore.length);			
				arrScore = new int[arrScore.length+1];

				System.arraycopy(tempArr, 0, arrScore, 0, arrScore.length);
				tempArr = new int[arrScore.length+1];
			}
						
			sum=sum+arrScore[i];
			div=sum/(arrScore.length-1);
			i++;
		}
	
		System.out.println("합계"+sum);
		System.out.println("평균"+div);
		
		sc.close();
	}
}

