package Homework;

import java.util.Scanner;

public class Day1106hw02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fName = sc.nextLine();
		fName = fName.trim();
		
		int dotIdx = fName.lastIndexOf(".");
		String result = fName.substring(dotIdx+1);
		System.out.println(result);
		
		sc.close();
	}
}
/*
과제2.
  파일명을 입력 받아 확장자를 구해보세요
  예) Test.java     => java 
      flower.jpg    => jpg
      ch11.ppt.txt  => txt
      
 */