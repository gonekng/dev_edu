package 도형;

public class Main {

	public static void main(String[] args) {
		Figure tri = new Triangle(5);
		System.out.println("삼각형의 둘레 : " + tri.calcRound());
		System.out.println("삼각형의 넓이 : " + tri.calcArea());
		System.out.println();

		Figure rect = new Rectangle(9,7);
		System.out.println("사각형의 둘레 : " + rect.calcRound());
		System.out.println("사각형의 넓이 : " + rect.calcArea());
		System.out.println();

		Figure cir = new Circle(5);
		System.out.println("원의 둘레 : " + cir.calcRound());
		System.out.println("원의 넓이 : " + cir.calcArea());
		System.out.println();

	}

}
