package Homework;

public class Day1028hw01 {
	public static void main(String[] args) {

		Student2[] st = new Student2[5];
		st[0] = new Student2("강호동", 85, 60, 70);
		st[1] = new Student2("이승기", 90, 95, 80);
		st[3] = new Student2("유재석", 75, 80, 100);
		st[2] = new Student2("하하", 80, 70, 95);
		st[4] = new Student2("이광수", 100, 65, 80);
	
		// 각 객체의 합계, 평균 구하기 (만들어놓은 메서드 실행)
		for (int i = 0; i < st.length; i++) {
			st[i].getTotal();
			st[i].getAverage();
		}
		
		// 앞뒤 비교해서 정렬하기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < st.length; j++) {
				Student2 temp;
				if(st[i].total > st[j].total) { 
					temp = st[i]; 
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		
		
		
		
		// 출력하기
		System.out.println("=====   학생별   /  과목별 총점구하기  =======");
		System.out.println("\t국어 \t수학 \t영어 \t총점 \t평균\t등수");
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i].name+"\t");
			System.out.print(st[i].kor+"\t");
			System.out.print(st[i].eng+"\t");
			System.out.print(st[i].math+"\t");
			System.out.print(st[i].total+"\t");
			System.out.printf("%.1f\t", st[i].avrg);
			
			// 등수 구하기
			int stat=1; // 초기 등수는 1등
			for (int j = 0; j < st.length; j++) {	
				if(st[i].getTotal() < st[j].total) {
					stat++;
				}
			}
			System.out.print(stat);
			System.out.println();
		}
		System.out.println("===================================================");

		
		int ko=0, en=0, mt=0;
		for (int i = 0; i < st.length; i++) {
			ko= ko + st[i].kor;
			en= en + st[i].eng;
			mt= mt + st[i].math;
		}
		System.out.print("총점\t"+ko+"\t"+en+"\t"+mt);

	}

}
class Student2{
    String name;  // 학생이름     
    int kor;      // 국어점수 
    int eng;      // 영어점수 
    int math;     // 수학점수
    int total;	  // getTotal()이 반환한 점수합계
    float avrg;   // getAverage()이 반환한 평균
    Student2(String name, int kor, int eng, int math){
    	this.name = name;
        this.kor=kor; 
        this.eng=eng; 
        this.math=math;    	
    }
    int getTotal() {
    	total = kor + eng + math;
    	return total;
    }
    float getAverage() {
    	avrg = total/3f;
    	return avrg;
    }
  
}
/*
과제

  1. Student 클래스를 이용해서 다음과 같이 출력되도록 작성해보세요.
  출력 결과)     
	========   학생별   /  과목별 총점구하기  ==========
	이름	국어	수학	영어	총점	평균	순위
	이승기	90	95	80	265	88.3	1
	유재석	75	80	100	255	85.0	2
	하하		80	70	95	245	81.7	3
	이광수	100	65	80	245	81.7	3
	강호동	85	60	70	215	71.7	5
	===================================================
	총점	430	370	425	
	
*/