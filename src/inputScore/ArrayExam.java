package inputScore;

import java.util.Scanner;

public class ArrayExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrScore = new int[3];
		int[] tempArr = new int[6];
		int sum=0, div=0, i=0;

		while(true) { 
			System.out.println("������ �Է����ּ���. 0������ �Է��� �������� �հ�� ����� ����մϴ�");
			int iptNum = sc.nextInt();
			if(iptNum == 0) {
				break;
			}
			arrScore[i] = iptNum;
			if(i==arrScore.length-1) { // �迭 ��á����
//				System.out.printf("arrScore"); // ���� �迭 Ȯ��
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
	
		System.out.println("�հ�"+sum);
		System.out.println("���"+div);
		
		sc.close();
	}
}

