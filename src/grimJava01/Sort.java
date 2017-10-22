package grimJava01;

public class Sort {
	public static void main(String[] args) {
		int arr[] = {210, 19, 72, 129, 34};
		
		System.out.println("* 정렬전(before)");
		System.out.printf("arr[] = { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
		System.out.printf("}%n");
		
		// ***** 올림차순으로 정렬 **** 
		for (int j = 0; j < arr.length-1; j++) { // length-1 = 배열의 총 index
			// 후자값 비교 횟수는 배열 갯수보다 1회 더 많아야 하므로 -1 필요없음
			for (int k = j+1; k < arr.length; k++) {
				// ex) arr[0]과 arr[1]부터 끝까지 값 비교해서 크면 서로 순서 바꿈
				if(arr[j]>arr[k]) {  // 전자가 크다면 후자랑 바뀌면서 점점 뒤로 밀림
					int tempArr = arr[j];
					arr[j] = arr[k];
					arr[k] = tempArr;
				}
			}
		}
		System.out.println("* 정렬후(after)");
		System.out.printf("arr[] = { ");
		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l]+" ");
		}
		System.out.printf("}%n");
	}
}


