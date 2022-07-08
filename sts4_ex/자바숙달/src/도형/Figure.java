package 도형;

public abstract class Figure {
	double width;
	double height;

	public Figure(double width) {
		this.width = width;
	}
	
	public Figure(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	abstract public double calcRound();
	abstract public double calcArea();
}
