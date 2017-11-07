package algorithm;

public class code6 {
	public static void main(String[] args) {
		int result1 = euclid1(16, 4);
		System.out.println(result1);
		int result2 = euclid2(4, 16);
		System.out.println(result2);
	}
	// Euclid Method
	public static int euclid1(int m, int n) {
		int tmp;
		if(m<n) { // 뒤의 수가 더 크면 swap m and n
			tmp=m; m=n; n=tmp;			
		}
		// m이 n의 배수이면 euclid1(m, n) = n
		if(m%n==0) 
			return n;
		// 그렇지 않으면 euclid1(m, n) = euclid1(n, m%n)
		else
			return euclid1(n, m%n);		
	}
	// Euclid Method 간소화 버젼
	public static int euclid2(int p, int q) {
		if(q==0) 
			return p;
		else
			return euclid2(q, p%q);
	}
}


