package algorithm;

// Recursion과 수학적귀납법
public class code03 {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	public static int factorial(int n) {
		// n이 0이면 1을 반환
		if(n==0) 
			return 1;
		// (n이 0보다 크다면) 1부터 n까지의 곱은 1에서 n-1까지의 곱에 n을 곱한것
		return n * factorial(n-1);		
	}
}


