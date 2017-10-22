package primeNumber;

public class Prime {
	public static void main(String[] args) {
		int max = 100; // �Ҽ��� ã�� ����
		boolean[] isPrime = new boolean[max];
	
		// �Ҽ����� �Ǵ� �迭�� ���� ��� true�� �ʱ�ȭ
		for (int i = 0; i < max; i++) {
			isPrime[i] = true; 
		}
		
		// �Ҽ� ���� �Ǵܽ� : 0,1�� �Ҽ�X => �ʱⰪ�� �׻� 2����
		for (int j = 2; j < max; j++) {
			// �ߺ��˻縦 �������� �̹� false�ΰ� �ǳʶٰ� true�� �˻�
			if(isPrime[j]) { 
				// ����� ������ �Ѿ�� �ʰ� ����( 2~9������ ����� ��� false)
				for (int k = 2; j*k < max; k++) {
					// �Ҽ��� ����� �Ҽ��� �ƴϹǷ� false
					isPrime[j*k] = false;
				}
			}else { 
				continue;				
			}
		}
		
		System.out.println("*** 1���� "+max+"���� �����߿� �Ҽ� ���ϱ� ***");
		for (int l = 2; l < max; l++) {
			if(isPrime[l]) // true�� ���ڸ� ���
				System.out.print(l+" ");
		}

	}
}

