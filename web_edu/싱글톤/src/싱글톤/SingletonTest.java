package 싱글톤;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton singleton1 = new Singleton();
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		System.out.println(singleton1 == singleton2);
		System.out.println(singleton1 == singleton3);
		System.out.println(singleton2 == singleton3);
			// 이미 인스턴스가 존재하는 경우 그 인스턴스를 리턴하기 때문에 모두 같은 객체
			// 인스턴스의 존재 유무를 파악하기 어려울 때 유일한 인스턴스를 가리키기 위한 방식
	}

}
