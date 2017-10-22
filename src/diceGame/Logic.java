package diceGame;

import java.util.Random;
import java.util.Scanner;

public class Logic {
	public static void main(String[] args) {
		int userNum, compNum ;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("enter를 누르시면 당신의 주사위를 던집니다");
		sc.nextLine(); // enter 입력시까지 blocked 시킴
		userNum = rd.nextInt(6) + 1; // 1~6까지 램덤값을 받음
		System.out.println("당신의 숫자는 " + userNum);
		
		System.out.println("enter를 누르시면 컴퓨터가 주사위를 던집니다.");
		sc.nextLine(); 
		compNum = rd.nextInt(6) + 1;
		System.out.println("컴퓨터의 숫자는 " + compNum);
		
		if( userNum > compNum)
			System.out.println("You Win");
		else if(userNum < compNum)
			System.out.println("Wou Lose");
		else
			System.out.println("Draw");
		
		sc.close();
	}
}

