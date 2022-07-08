package 부동소수점;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		// 컴퓨터는 십진수로 된 0.1이라는 값을 정확하게 저장할 수 없음 (부동소수점을 쓰기 때문)
		// 부동소수점 : 정확도를 살짝 낮추는 대신에 넓은 범위의 값을 표현할 수 있음	
		
		// 부동소수점 연산의 오차 해결 방법 : 자바의 부동소수점 타입을 쓰지 않고 BigDecimal을 사용한다.
		// 사용 가능한 메소드 : add, subtract, multiply, divide, remainder, compareTo, max, min 등
		
		double total = 0.0;
		BigDecimal total2 = new BigDecimal(0.0);
		
		for(int i=0; i<100; i++) {
			total += 0.1;
			total2 = total2.add(new BigDecimal("0.1"));
		}
		System.out.println("double을 사용할 경우 : " + total);
		System.out.println("BigDecimal을 사용할 경우 : " + total2);
		
	}

}
