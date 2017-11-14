package make_lotto;

import java.util.Arrays;
import java.util.Random;
// 결과 배열, 공의 배열을 만들어서 한번 공의 뽑을 때 마다 배열을 축소시킨다. => 여섯번만 추첨
public class LottoMachine2 {
	public int[] selectBalls() {
		// 로또 공 45개 생성
		int[] balls = new int[45];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i+1;
		}

		// 결과를 저장할 숫자의 배열
		int[] result = new int[6];
		
		/*
		 * 루프를 한번 돌때 마다 하나씩 작은 임시배열 tempArr을 만들어서
		 * 선택한 공을 제외한 공을 복사한다 45, 44, 43
		 * 하나 줄어든 배열을 원본 배열로 삼아서 특정한 번호의 값을 뽑는다.
		 */
		
		// 루프는 6번만 돈다
		for (int i = 0; i < result.length; i++) {
			int selectBallIndex = (int)(Math.random() * balls.length);
			// 공의 배열의 순번이 나온다.
			// 같은 값이 발생해도 공의 배열 자체가 중복이 없기 때문에 상관없다.
			result[i] = balls[selectBallIndex];
			
			//임시배열을 하나 만들어서 뽑힌공의 앞까지를 한번 복사, 뒤로 한번 복사해서 작은 배열을 만든다
			int[] tempArr = new int[balls.length-1];
			System.arraycopy(balls, 0, tempArr, 0, selectBallIndex);
			
			//뒤에 복사해야 하는 갯수 파악
			int odd = balls.length - (selectBallIndex+1);
			System.arraycopy(balls, selectBallIndex+1, tempArr, selectBallIndex, odd);
			
			//임시 배열이 두번의 복사를 통해서 원본 배열보다 하나 작아졌고, 값은 중복이 제거 되었다.
			//다음에 루프가 돌때는 임시 배열이 원본 배열로 간주되도록 한다.
			balls = tempArr;
		}
		// 나온 결과를 정렬해서 보내자
		Arrays.sort(result);
		return result;
	}

	public static void main(String[] args) {
		LottoMachine2 m2 = new LottoMachine2();
		int[] result = m2.selectBalls();
		System.out.println(Arrays.toString(result));

	}
}
