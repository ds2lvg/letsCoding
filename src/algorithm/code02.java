package algorithm;

// 무한루프에빠지지 않는 Recursion
public class code02 {
	public static void main(String[] args) {
		func(4);
	}
	public static void func(int n) {
		// Base case : 적어도 하나의 Recursion에 빠지지 않는 경우가 존재해야함
		if(n<=0) 
			return;

		System.out.println("hello Recursion");
		// Recursion case : Recursion을 반복하다 보면 Base case로 수렴해야함
		func(n-1);		
	}
}

