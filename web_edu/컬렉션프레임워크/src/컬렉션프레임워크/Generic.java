package 컬렉션프레임워크;


public class Generic {
	public static void main(String[] args) {
				
		Box<String> strBox = new Box<String>("hello");
		Box<Integer> intBox = new Box<Integer>(5);
		
		String str1 = strBox.get();
		Integer num1 = intBox.get();
		
		System.out.println(str1);
		System.out.println(num1);
		
	}
}
