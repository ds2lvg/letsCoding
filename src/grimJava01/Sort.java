package grimJava01;

public class Sort {
	public static void main(String[] args) {
		int arr[] = {210, 19, 72, 129, 34};
		
		System.out.println("* ������(before)");
		System.out.printf("arr[] = { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
		System.out.printf("}%n");
		
		// ***** �ø��������� ���� **** 
		for (int j = 0; j < arr.length-1; j++) { // length-1 = �迭�� �� index
			// ���ڰ� �� Ƚ���� �迭 �������� 1ȸ �� ���ƾ� �ϹǷ� -1 �ʿ����
			for (int k = j+1; k < arr.length; k++) {
				// ex) arr[0]�� arr[1]���� ������ �� ���ؼ� ũ�� ���� ���� �ٲ�
				if(arr[j]>arr[k]) {  // ���ڰ� ũ�ٸ� ���ڶ� �ٲ�鼭 ���� �ڷ� �и�
					int tempArr = arr[j];
					arr[j] = arr[k];
					arr[k] = tempArr;
				}
			}
		}
		System.out.println("* ������(after)");
		System.out.printf("arr[] = { ");
		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l]+" ");
		}
		System.out.printf("}%n");
	}
}


