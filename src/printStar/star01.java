package printStar;

import java.util.Scanner;

public class star01 {
	public static void main(String[] args) {
		System.out.println("����� ���� ����� ������ �Է�");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); // ���� �� ���� 
		int emp = row-1;
		
		// i�� ������ ���� �� ���
		for (int i = 1; i <= row; i++) {
			
			// ���� ���� for�� : j�� �ʱⰪ�� ù�� ������ ����
			for (int j = emp; j >= i; j--) {
				System.out.print(" ");
			}
			
			// �� ���� for�� : k�� �ʱⰪ�� i���� �۾ƾ���
			for (int k = 0; k < i; k++) {
				System.out.print("*");				
			}
			
			// �� ���� for�� : l�� �ʱⰪ�� k���� Ŀ����
			for (int l = 1; l < i; l++) {
				System.out.print("*");				
			}
			
			// ���� ���� for�� : j�� �ʱⰪ�� ù�� ������ ����
			for (int j = emp; j >= i; j--) {
				System.out.print(" ");
			}			
			
			System.out.println("");
		}
		
		sc.close();
	}
}

