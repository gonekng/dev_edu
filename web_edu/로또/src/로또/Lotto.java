package 로또;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	// 1부터 45까지 랜덤 번호 생성
	int [] num_arr = new int[6];
	
	public int getRandomNum(int startNum, int endNum) {
		Random rd = new Random();
		int num;
		num = rd.nextInt(endNum) + startNum; // nextInt(a)는 0부터 a미만의 랜덤 정수를 리턴
		return num;
	}

	// 배열에 넣기
	public Lotto makeLotto() {
		Lotto lotto = new Lotto();
		int[] newNumberList = new int[6];
		for(int i=0; i<6; i++) {
			int target = getRandomNum(1,45);
			boolean isdup = findDup(newNumberList, target);
			while(isdup == true) {
				System.out.printf("%d는 이미 존재하는 숫자이므로 재추첨합니다.\n", target);
				target = getRandomNum(1,45);
				isdup = findDup(num_arr, target);
			}
			newNumberList[i] = target;
		}
		sort(newNumberList);
		lotto.num_arr = newNumberList;
		return lotto;
	}

	// 중복이 있으면 다시 뽑기
	public boolean findDup(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public void sort(int[] arr) {
		Arrays.sort(arr);
	}

	@Override
	public String toString() {
		return "Lotto [num=" + Arrays.toString(num_arr) + "]";
	}
	
}
