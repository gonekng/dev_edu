package 계산기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 차례대로 입력하시오. :");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if(num1 != (int)num1) {
			System.out.println(cal1.add(num1, num2));
			System.out.println(cal1.minus(num1, num2));
			System.out.println(cal1.multiply(num1, num2));
			System.out.println(cal1.devide(num1, num2));
			System.out.println(cal1.getOnlyQuotient(num1, num2));
		} else {
			System.out.println(cal1.add((int)num1, (int)num2));
			System.out.println(cal1.minus((int)num1, (int)num2));
			System.out.println(cal1.multiply((int)num1, (int)num2));
			System.out.println(cal1.devide((int)num1, (int)num2));
			System.out.println(cal1.getOnlyQuotient((int)num1, (int)num2));
		}
		
		sc.close();
	}

}
