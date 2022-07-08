package 변수;

public class 연산자 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 333;
		
		System.out.println(a++ + ++b);
		// 증감연산자가 뒤에 있는 경우 사용한 후 값이 증감되고
		// 증감연사자가 앞에 있는 경우 값이 증감된 후 사용한다.
		
		if(++a==101) {
			System.out.println("참");
		}
		
		char c = 'h';
		String d = "haha";
		
		System.out.println(c + d);
	}

}
