package 도형;

public class Rectangle extends Figure{

	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	public double calcRound() {
		return 2 * (width + height);
	}

	@Override
	public double calcArea() {
		return width * height;
	}
	
}
