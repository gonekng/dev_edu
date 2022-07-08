package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
//		int intArr2[] = {1,2,3,4,5,6,7,8,9,10};
//		int[] intArr3;
//		System.out.println(intArr.length);
//		System.out.println(intArr[9]);
////		System.out.println(intArr[10]);	
//		
//		intArr3 = new int[]{1,2,3,4,5,6,7,8,9,10};
//		if(intArr == intArr3) {
//			System.out.println("같음");
//		} else System.out.println("다름");
//				
//		int demensionTwo [][] = {{1,2,3},{5,10,15}};
//		System.out.println(demensionTwo.length);
//		System.out.println(demensionTwo[1]);
//		for(int i : demensionTwo[1]) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		
//
//		int demensionThree [][][] = new int[2][4][6];
//		System.out.println(demensionThree.length);
//
//		String[] seasons = {"봄", "여름", "가을", "겨울"};
//		String[] seasons_shallow = seasons;
//		String[] seasons_deep = seasons.clone();
//		String[] seasons_deep2 = new String [seasons.length];
//		
//		boolean result = Arrays.asList(seasons).contains("겨울");
//		System.out.println(result);
//		
//		if(seasons == seasons_shallow) {
//			System.out.println("얕은 복사 : 같음");
//		} else 	System.out.println("얕은 복사 : 다름");
//		
//		if(seasons == seasons_deep) {
//			System.out.println("깊은 복사 : 같음");
//		} else 	System.out.println("깊은 복사 : 다름");
//		
//		// 배열의 얕은 복사 : = 연산자로 대입
//		// 배열의 깊은 복사 : System.arraycopy() 메소드나 clone 메소드 이용
//
//		System.arraycopy(seasons, 0, seasons_deep2, 0, seasons.length);
//		if(seasons == seasons_deep2) {
//			System.out.println("깊은 복사2 : 같음");
//		} else 	System.out.println("깊은 복사2 : 다름");
//		
//		// 영단어가 저장된 배열, 크기는 5, endDic
//		// 한글단어가 저장된 배열, 크기는 5, korDic
//		
//		String[] engDic = {"apple", "banana", "peach", "watermelon", "pineapple"};
//		String[] korDic = {"사과", "바나나", "복숭아", "수박", "파인애플"};
//		
		Random rd = new Random();
//		int randomInt = rd.nextInt(5);
//		System.out.println(randomInt);
//		
//		System.out.printf("다음 단어에 맞는 영단어를 입력하시오.\n %s : ", korDic[randomInt]);
		Scanner sc = new Scanner(System.in);  // 키보드로 입력받기 위한 객체 생성
//		String input = sc.next();
//		
//		if(input.equals(engDic[randomInt])) { // 문자열의 값을 비교하기 위해서는 equals() 메소드 이용
//			System.out.println("정답입니다.");
//		} else {
//			System.out.println("오답입니다.");
//			System.out.printf("정답은 %s 입니다.\n", engDic[randomInt]);
//		}
		
		// 1에서 100까지 중 하나의 랜덤 숫자를 저장하고
		// 5번의 기회 동안 그 숫자를 찾는 게임 (Up and down)
		int answerInt = rd.nextInt(100) + 1;
		int[] input_arr = new int[5];
		int life = 5;

		int ind =0;
		while(life>0) {
			System.out.println("1에서 100까지의 숫자 중 하나를 입력하세요.");
			int guessInt = sc.nextInt();
			
			if(guessInt == answerInt) {
				System.out.println("정답입니다.");
				input_arr[ind] = guessInt;
				break;
			} else if(guessInt < answerInt) {
				System.out.println("정답보다 더 큰 수입니다.");
				input_arr[ind] = guessInt;
				ind++;
				life--;
			} else {
				System.out.println("정답보다 더 작은 수입니다.");	
				input_arr[ind] = guessInt;	
				ind++;		
				life--;
			}
		}
		
		System.out.println("게임이 종료되었습니다.\n");
		System.out.print("제출한 답 : ");
		for(int i=0; i<input_arr.length; i++) {
			if(input_arr[i] == 0) break;
			System.out.print(input_arr[i] + " ");
		}
		System.out.printf("\n정답은 %d 입니다.\n", answerInt);
		sc.close();
	}

}
