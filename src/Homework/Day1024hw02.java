package Homework;

import java.util.Scanner;

public class Day1024hw02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int temp;
		System.out.println("5���� ������ �Է��ϼ���.");

		// �Է¹��� ������ �迭 ����
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
		}
		
		// �յڰ� ��(��������)
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
		
		// ���ĵ� �迭 ���
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]+" ");			
		}
		sc.close();
		
	}
}
/*
2. ���� ������ �Է¹ް� ū ������ ���� ���� �����ؼ� ����� ������.
  
   ��°��)
   5���� ������ �Է��ϼ���.
   10 20 30 40 50
   ���İ�� : 50 40 30 20 10
   ��Ʈ) ���� ����, ���� ���� ����� ã�ƺ�����. 
*/