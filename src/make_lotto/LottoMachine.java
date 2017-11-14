package make_lotto;

import java.util.Arrays;
import java.util.Random;
// 결과만 배열로 선언해서 나온 값이 중복이 있으면 한번 더 추첨하게 하는 방식
public class LottoMachine {
	public int[] randomSelect() {
		int[] numArr = new int[6];
		
		// 숫자 발생기
		Random r = new Random();
		System.out.println("======무작위 출력======");
		for (int i = 0; i < numArr.length; i++) {
			int selectValue = r.nextInt(45)+1;
			System.out.println(selectValue);
			// 만일 기존에 뽑힌 값이라면 넣지 말고 뽑힌적이 없으면 넣는다
			if (checkValues(selectValue, numArr)==true) {
				System.out.println("중복 발생");
				i--;
			} else {
				numArr[i] = selectValue;
			}
		}
		return numArr;
	}
	
	public boolean checkValues(int selectNum, int[] values) {
		boolean result = false;
		
		for (int i = 0; i < values.length; i++) {
			if(values[i] == selectNum) {				
				result=true;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		LottoMachine m = new LottoMachine();
		int[] result = m.randomSelect();
		System.out.println("======정렬후 출력======");
		Arrays.sort(result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
