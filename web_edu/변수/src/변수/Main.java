package 변수;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int a = 5;
		int b = (int)(a+5.5);
		double c = 7.5;
		System.out.println(b);
		System.out.println(a+c);
		
		// call by value (기본형 데이터타입)
		char x = 'a';
		String y = "hello";
		System.out.println(x+y);
		
		int myNum = a;
		myNum = myNum + 10;
		a += 5; // a의 값 수정이 myNum에는 반영되지 않음
		System.out.println("myNum : " + myNum);
		System.out.println("a : " + a);
		
		// call by reference (참조형 데이터타입)
		String[] img_arr = {"🍕", "🍗", "🍔"};
		String[] str_arr = {"피자", "치킨", "햄버거"};
		img_arr = str_arr;
		str_arr[2] = "아이스크림"; // str_arr의 값을 수정했는데 img_arr에서도 수정됨
		for(int i=0; i<img_arr.length; i++) {
			System.out.println(img_arr[i]);
		}
		
	}

}
