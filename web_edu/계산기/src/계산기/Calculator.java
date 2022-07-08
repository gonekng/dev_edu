package 계산기;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	public double minus(double a, double b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	
	public double devide(int a, int b) {
		double result = 0;
		try {
			result = (double)(a/b);
		} catch (Exception e) {
			System.out.println("※ 0으로 나눌 수 없습니다.");
		}
		return result;
	}
	public double devide(double a, double b) {
		double result = 0;
		try {
			result = (double)(a/b);
		} catch (Exception e) {
			System.out.println("※ 0으로 나눌 수 없습니다.");
		}
		return result;
	}
	
	public int getOnlyQuotient(int a, int b) {
		int result = 0;
		try {
			result = a/b;
		} catch (Exception e) {
			System.out.println("※ 0으로 나눌 수 없습니다.");
		}
		return result;
	}
	public int getOnlyQuotient(double a, double b) {
		int result = 0;
		try {
			result = (int)(a/b);
		} catch (Exception e) {
			System.out.println("※ 0으로 나눌 수 없습니다.");
		}
		return result;
	}
}
