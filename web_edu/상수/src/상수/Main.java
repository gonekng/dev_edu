package 상수;

public class Main {

	public static void main(String[] args) {
//		int a = 56;
//		a = 100;
//		System.out.println("a = " + a);
//		
//		final double PI = 3.141592;
////		PI = 3.14; -----> The final local variable cannot be reassigned.
//		System.out.println("pi = " + PI);
//		
//		Mathematics math1 = new Mathematics();
//		math1.printAll();
//		
//		String day1 = "TUESDAY";
//		DayTest t1 = new DayTest(Day.valueOf(day1));
//		t1.evalDay();
		
		RainbowTest t2 = new RainbowTest();
		t2.printRainbow();
		t2.printOneColor(5);
	}

}
