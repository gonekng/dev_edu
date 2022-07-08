package 상수;

public class RainbowTest {
	Rainbow rainbow;
	
	public void printRainbow() {
		Rainbow[] arr = Rainbow.values();
		System.out.print("Rainbow : { ");
		for(Rainbow color : arr) {
			System.out.print(color + " ");
		}
		System.out.println("}");
	}
	
	public void printOneColor(int n) {
		Rainbow[] arr = Rainbow.values();
		System.out.printf("%dth Color : %s", n, arr[n-1]);
	}
}
