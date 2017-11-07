package Homework;

public class Day1024hw01 {
	public static void main(String[] args) {
		String[] name = {"�輳��", "������", "�����", "���̸�", "�����"};
		String[] sub_name = {"����", "����", "����"};
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

		// ������ ��ձ��ϱ�
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i] = sum[i] + score[i][j];
				avg[i] = sum[i] / score[0].length;
			}
			
		}
		
		// ��� ���ϱ�
		nth[0]=1;
		for (int i = 0; i < 5; i++) {
			int stat=1; // �ʱ� ����� 1��
			for (int j = 1; j < 5; j++) {
				if(sum[i]<sum[j]) { // �ڿ� �ִ� ������ Ŭ������ 1�� ����
					stat++; 
				}
				nth[i] = stat;				
			}
//			System.out.println("nth["+i+"]"+nth[i]); ��� ����� ���� Ȯ��
		}		
		
		// ����ϱ�
		System.out.println("=================== �л��� / ���� ���� ================");
		for (int k = 0; k < sub_name.length; k++) {
			System.out.print("\t "+sub_name[k]); // ���� �̸� ���
		}
		System.out.println("\t ����\t ���\t ���");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t "); // �̸� ���
			for (int j = 0; j < score[1].length; j++) {
				System.out.print(score[i][j]+"\t "); // ���� ���� ���	
			}
			System.out.print(sum[i]+"\t ");
			System.out.print(avg[i]+"\t ");
			System.out.print(nth[i]+"\t ");
			System.out.println();
		}
		
		System.out.println("===================================================");
		System.out.print("����");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				sbjSum[i] = sbjSum[i] + score[j][i];		
			}
			System.out.print("\t "+sbjSum[i]); // ���� ���
		}
		
	}
}
/*
1. TwoArr01.java�� �̿��ؼ� ����� ���غ�����.
========== �л���   /  ���� �������ϱ�  ==========
	       ����	����	����	����	���   ���
��ȣ��	85	60	70	215	71	5
�̽±�	90	95	80	265	88	1
���缮	75	80	100	255	85	2 
����	    80	70	95	245	81	3
�̱���	100	65	80	245	81	3
====================================================
����	430	370	425	
*/