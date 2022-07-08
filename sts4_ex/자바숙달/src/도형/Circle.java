package 도형;

public class Circle extends Figure{
	double radius;

	public Circle(double width) {
		super(width);
	}

	@Override
	public double calcRound() {
		return Math.PI * width;
	}

	@Override
	public double calcArea() {
		return Math.PI * Math.pow(0.5 * width, 2);
	}
	
}
