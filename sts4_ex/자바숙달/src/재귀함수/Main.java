package 재귀함수;

public class Main {

	public static void main(String[] args) {
		Recursive fun1 = new Recursive();
		System.out.println("1에서 5까지의 합 : " + fun1.sigmaFun(5));
		System.out.println("1에서 10까지의 합 : " + fun1.sigmaFun(10));
		System.out.println();
		
		System.out.println("1에서 3까지의 곱 : " + fun1.factorialFun(3));
		System.out.println("1에서 5까지의 곱 : " + fun1.factorialFun(5));
	}

}
