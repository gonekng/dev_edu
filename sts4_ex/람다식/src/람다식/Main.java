package 람다식;

public class Main {

	public static void main(String[] args) {
		LambdaInterface lam1 = (x, y) -> {return x+y;};
			// 인터페이스에 만든 인스턴스에 람다식(익명함수) 전체를 대입
		
		System.out.println(lam1.add(2, 3));
		System.out.println(lam1.add(5, 7));

	}

}
