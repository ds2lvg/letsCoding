package diceGame;

import java.util.Random;
import java.util.Scanner;

public class Logic {
	public static void main(String[] args) {
		int userNum, compNum ;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("enter�� �����ø� ����� �ֻ����� �����ϴ�");
		sc.nextLine(); // enter �Է½ñ��� blocked ��Ŵ
		userNum = rd.nextInt(6) + 1; // 1~6���� �������� ����
		System.out.println("����� ���ڴ� " + userNum);
		
		System.out.println("enter�� �����ø� ��ǻ�Ͱ� �ֻ����� �����ϴ�.");
		sc.nextLine(); 
		compNum = rd.nextInt(6) + 1;
		System.out.println("��ǻ���� ���ڴ� " + compNum);
		
		if( userNum > compNum)
			System.out.println("You Win");
		else if(userNum < compNum)
			System.out.println("Wou Lose");
		else
			System.out.println("Draw");
		
		sc.close();
	}
}

