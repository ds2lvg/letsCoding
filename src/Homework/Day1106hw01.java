package Homework;

import java.util.Scanner;

public class Day1106hw01 {
	public static void main(String[] args) {
		total_length();
		System.out.println("주민등록번호가 제대로 입력되었습니다");
	}
	static void total_length() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String fName = sc.nextLine();
		fName.trim();
		if (fName.length()!=14) {
			System.out.println("주민등록번호는 14자리 입니다.");
			total_length();
		}
		each_length(fName);
		sc.close();
	}
	static void each_length(String fName) {
		String back = fName.substring(7);
		System.out.println(fName.indexOf("-"));
		if(fName.indexOf("-")==-1) {
			System.out.println("주민등록번호 7자리는 '-' 입니다.");
			total_length();			
		}else if(fName.indexOf("-")!=6){
			System.out.println("주민등록번호 앞자리는 6자리 입니다.");
			total_length();
		}else if(back.length()!=7) {
			System.out.println("주민등록번호 뒷자리는 7자리 입니다.");
			total_length();	
		} else {
			isDigit(fName);			
		}
	}
	static void isDigit (String fName) {

		for (int i = 0; i < fName.length(); i++) {
			int c = fName.charAt(i);
			if(i<6) {
				if(!(c>=48 && c<=57)) {
					System.out.println("주민등록번호 앞자리는 모두 숫자이어야 합니다.");
					total_length();
					break;
				} 
			}
			if(i>6) {
				if(!(c>=48 && c<=57)) {
					System.out.println("주민등록번호 뒷자리는 모두 숫자이어야 합니다.");
					total_length();	
					break;
				} 				
			}
		} 

	}
}