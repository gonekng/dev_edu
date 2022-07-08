package 컬렉션프레임워크;

public class lambda {
	public static void main(String[] args) {
		
		// 익명함수 (String타입의 name을 인자로 받아서 출력하는 함수)
		YourType you = (String name) -> {
			System.out.printf("내 이름은 %s입니다.", name);
			System.out.println();
		};
		you.talk("엄태현");
		you.talk("오승은");
		
	}
}
