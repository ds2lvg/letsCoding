package primeNumber;

public class Prime {
	public static void main(String[] args) {
		int max = 100; // 소수를 찾을 범위
		boolean[] isPrime = new boolean[max];
	
		// 소수인지 판단 배열의 값을 모두 true로 초기화
		for (int i = 0; i < max; i++) {
			isPrime[i] = true; 
		}
		
		// 소수 여부 판단식 : 0,1은 소수X => 초기값은 항상 2부터
		for (int j = 2; j < max; j++) {
			// 중복검사를 막기위해 이미 false인건 건너뛰고 true만 검사
			if(isPrime[j]) { 
				// 배수가 범위를 넘어서지 않게 한정( 2~9까지의 배수는 모두 false)
				for (int k = 2; j*k < max; k++) {
					// 소수의 배수는 소수가 아니므로 false
					isPrime[j*k] = false;
				}
			}else { 
				continue;				
			}
		}
		
		System.out.println("*** 1부터 "+max+"까지 정수중에 소수 구하기 ***");
		for (int l = 2; l < max; l++) {
			if(isPrime[l]) // true인 숫자만 출력
				System.out.print(l+" ");
		}

	}
}

