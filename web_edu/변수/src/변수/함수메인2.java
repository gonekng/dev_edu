package 변수;

public class 함수메인2 {

	public static void main(String[] args) {
		함수연습 func = new 함수연습();
		func.printFunc1();
		System.out.println("\n");
		
		func.printFunc2();
		System.out.println("\n");
		
		func.printFunc3();
		System.out.println("\n");
		
		func.printFunc4("집가고싶다 ", 10);
		System.out.println("\n");
		
		System.out.println(func.getSeason(7));
		System.out.println("\n");
		
		System.out.println(func.isInclude("정의의 사도 장민지", "장민지"));
		System.out.println("\n");
		
		System.out.println(func.getCountInclude("엄태현엄태현엄태현엄태현", "엄"));
		System.out.println("\n");
		
		System.out.println(func.isOverNum("엄태현", 5));
		System.out.println("\n");
		
		func.basicWhile();
	}

}
