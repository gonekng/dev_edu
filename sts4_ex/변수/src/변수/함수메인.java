package 변수;

public class 함수메인 {

	public static void main(String[] args) {
		
		함수 func1 = new 함수();
		func1.printDan(5);
		func1.helloworld();
		System.out.println(func1.home());
		System.out.println(func1.home2("오승은"));
		System.out.println(func1.home2("엄태현"));
		System.out.println(func1.home2("김영재"));
		System.out.println(func1.home3("장민지"));
		System.out.println("");
		
		
		함수연습 func2 = new 함수연습();
		System.out.println(func2.add(3, 6));
		System.out.println(func2.minus(3, 6));
		System.out.println(func2.minus2(3, 6));
		System.out.println(func2.getMaxNum(7, 6, 10));
		System.out.println(func2.isOverHundred(23));
	}

}
