package Homework;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Day1107hw01 {
	public static void main(String[] args) {
		/*** 입력받는 메서드 ***/
		Scanner sc= new Scanner(System.in);
		System.out.println("출력할 년도를 입력하세요>");
		int iptY = sc.nextInt();
		System.out.println("출력할 달을 입력하세요>");
		int iptM = sc.nextInt()-1;
		sc.close();
		
		/*** 입력받은 연도와 달로 현재 월의 마지막 일수와 1일의 요일 구해오는 메서드 ***/
		Calendar cal = new GregorianCalendar(iptY,iptM,1);
//		Calendar cal = new GregorianCalendar(2017,10,7);
		
		// 해당월의 마지막일
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(iptM + 1 +"월의 마지막 일 :" + lastDay);
		
		// 해당월 1일의 요일을 구해야함
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("입력한 월의 첫번째 요일 : " + firstDay);
		String tab = "\t";
		
		/*** 화면 출력하는 메서드 ***/
		System.out.println(tab+tab + iptY + "년 " + (iptM+1) + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 해당 월의 1일의 요일 자리를 구함
		for (int i = 1; i < firstDay; i++) {
			System.out.print(tab);
		}
		// 날짜 출력하다가 토요일에서 개행처리
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i+tab);
			if(i == (firstDay-8)*-1 || (i+firstDay-1) % 7==0){
				System.out.println();
			}
//
//			switch (firstDay) {
//			case 1:
//				System.out.print(i+"\t");
//				if(i==7 || i%7==0)
//					System.out.println();
//				break;
//			case 2:
//				System.out.print(i+"\t");
//				if(i==6 || (i+1)%7==0)
//					System.out.println();
//				break;
//			case 3:
//				System.out.print(i+"\t");
//				if(i==5 || (i+2)%7==0)
//					System.out.println();
//				break;
//			case 4:
//				System.out.print(i+"\t");
//				if(i==4 || (i+3)%7==0)
//					System.out.println();
//				break;
//			case 5:
//				System.out.print(i+"\t");
//				if(i==3 || (i+4)%7==0)
//					System.out.println();
//				break;
//			case 6:
//				System.out.print(i+"\t");
//				if(i==2 || (i+5)%7==0)
//					System.out.println();
//				break;
//			case 7:
//				System.out.print(i+"\t");
//				if(i==1 || (i+6)%7==0)
//					System.out.println();
//				break;
//
//			default:
//				break;
//			}

		} // 날짜 출력하다가 토요일에서 개행처리
		
		
	}
}
/*
과제. 다음과 같이 입력 후 출력 결과를 얻는 프로그램을 작성해 보세요.
출력할 년도를 입력하세요>
2017
출력할 달을 입력하세요>
12
		2017년  12월
    일    월    화    수    목    금    토 
                                   1     2
     3     4     5     6     7     8     9
    10    11    12    13    14    15    16
    17    18    19    20    21    22    23
    24    25    26    27    28    29    30
    31                                    
 */