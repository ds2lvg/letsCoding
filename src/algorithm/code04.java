package algorithm;

// Recursion과 수학적귀납법
public class code4 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	public static int func(int n) {
		// n이 0이면 0을 반환한다.
		if(n<=0) 
			return 0;
		// (n이 0보다 크다면) 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한것
		return n + func(n-1);		
	}
}


