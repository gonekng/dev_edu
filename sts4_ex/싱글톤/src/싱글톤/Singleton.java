package 싱글톤;

public class Singleton {
	private static Singleton one;
		// static : 인스턴스가 만들어지기 전에 미리 메로리에 로드되어 공유됨
	private Singleton() {
		System.out.println("싱글톤을 생성합니다.");
	}
	// private 이기 때문에 외부에서 생성자 호출 못함
	
	public static Singleton getInstance() {
		if(one == null) {
			one = new Singleton();
			System.out.println("새로운 싱글톤이 생성되었습니다.");
		}
		return one;
	}
}
