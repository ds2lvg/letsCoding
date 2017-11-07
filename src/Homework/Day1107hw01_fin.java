package Homework;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Day1107hw01_fin {
	public static void main(String[] args) {
		showCalendar();
	}
	
	/*** 입력받는 메서드 ***/
	static void showCalendar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("출력할 년도를 입력하세요>");
		int iptY = sc.nextInt();
		System.out.println("출력할 달을 입력하세요>");
		int iptM = sc.nextInt()-1;
		sc.close();

		int[] resultCD = calcDay(iptY ,iptM);
		printCalendar(iptY, iptM, resultCD);		
	}
	
	/*** 입력받은 연도와 달로 현재 월의 마지막 일수와 1일의 요일 구해오는 메서드 ***/
	static int[] calcDay(int iptY, int iptM) {
		Calendar cal = new GregorianCalendar(iptY,iptM,1);
		int[] calcReturn = new int[2];
		
		// 해당월 1일의 요일(firstDow) : calcReturn[0]
		calcReturn[0] = cal.get(Calendar.DAY_OF_WEEK);
		
		// 해당 월의 마지막일(lastDay) : calcReturn[1]
		calcReturn[1] = cal.getActualMaximum(Calendar.DATE);
		
		return calcReturn;
	}
	
	/*** 화면 출력하는 메서드 ***/
	static void printCalendar(int iptY, int iptM, int[] calcLp) {
		System.out.println("\t"+ "\t" + iptY + "년 " + (iptM+1) + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 해당 월의 1일의 요일 자리를 구함
		for (int i = 1; i < calcLp[0]; i++) {
			System.out.print("\t");
		}
		
		// 날짜 출력하다가 토요일에서 개행처리 : 스위치문 속에서 공식 발견!!
		for (int i = 1; i <= calcLp[1]; i++) {
			System.out.print(i+"\t");
			if(i == (calcLp[0]-8)*-1 || (i+calcLp[0]-1) % 7==0){
				System.out.println();
			}
		}		
	}
}
