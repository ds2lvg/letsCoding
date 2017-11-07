package oop;

public class KaupIndex {
	public String inspect(double koup) {
		String aswer;
		if(koup>22) 
			aswer = "고도비만";
		else if(koup>19)
			aswer = "비만";
		else if(koup>15)
			aswer = "보통";
		else if(koup>13)
			aswer = "체중미달";
		else
			aswer = "영양실조";

		return aswer;
	}
	
	public double calc(double h, double w) {

		h = h/100;
		double result = w/(h*h);

		return result;
	}
	
	public static void main(String[] args) {
		KaupIndex ki = new KaupIndex();
		double height = 71.4;
		double weight = 7.2;
		double koup = ki.calc(height, weight);
		System.out.printf("카우프지수 : %.2f \n" , koup);
		String statement  = ki.inspect(koup);
		System.out.printf("상태 : "+statement);
	}
}

