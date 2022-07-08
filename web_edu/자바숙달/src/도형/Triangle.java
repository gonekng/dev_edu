package 도형;

public class Triangle extends Figure{

	public Triangle(double width) {
		super(width);
	}

	@Override
	public double calcRound() {
		return 3 * width;
	}

	@Override
	public double calcArea() {
		return 0.25 * Math.sqrt(3) * Math.pow(width, 2);
	}
	
}
