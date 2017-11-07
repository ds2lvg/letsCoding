package algorithm;

// 무한루프 Recursion
public class code01 {
	public static void main(String[] args) {
		func();
	}
	public static void func() {
		System.out.println("hello Recursion");
		func();		
	}
}

