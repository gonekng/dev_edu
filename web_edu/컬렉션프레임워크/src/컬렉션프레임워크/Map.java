package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

// ------- 영단어 뜻 맞추기 게임 -------
public class Map {
	public static void main(String[] args) {
		// 1. 맵 만들기
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		// 2. 맵에 데이터 넣기
		dictionary.put("apple", "사과");
		dictionary.put("banana", "바나나");
		dictionary.put("peach", "복숭아");
		dictionary.put("melon", "메론");
		dictionary.put("watermelon", "수박");
		
		//	3. 하나의 키로 제대로 된 값 추출되는지 확인
		System.out.println(dictionary.get("watermelon"));
		System.out.println();
		
		
		//	4. 랜덤으로 문제 내기
		Random rd = new Random();
		int randNum = rd.nextInt(dictionary.size());
		
		Object[] keys = dictionary.keySet().toArray();
		Object question = keys[randNum];
		
		Object[] values = dictionary.values().toArray();
		Object answer = values[randNum];
		
		//	5. 사용자에게 입력값 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("다음에 해당하는 한글 단어를 입력하세요.");
		System.out.println(question);
		String input = sc.nextLine();
		
		// 6. 결과 판별하기
		while(!input.equals(answer)) {
			System.out.println("정답이 아닙니다.");
			System.out.println("다시 입력해주세요");
			input = sc.nextLine();
		}
		System.out.println("정답입니다.");
		
		sc.close();
	}
}
