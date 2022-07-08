package 변수;

public class 함수 {
	
	public void printDan(int num) {
		for(int i=2; i<=9; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i);
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void helloworld() {
		System.out.println("hello");
		System.out.println("world");
	}
	
	public String home() {
		return "집에 가고 싶다.";
	}
	
	public String home2(String name) {
		String result = "";
		switch(name) {
			case "엄태현":
				result = "태현이형은 집에 가고 싶다.";
				break;
			case "오승은":
				result = "승은이는 집에 가고 싶다.";
				break;
			case "김영재":
				result = "영재는 집에 가고 싶다.";
				break;
		}
		return result;
	}
	
	public String home3(String name) {
		String result = name + "는\n";
		for(int j=0;j<5;j++) {
			for(int i=0; i<5; i++) {
				result = result + " 집에 가고 싶다.";
			}
			result = result + "\n";
		}
		return result;
	}
}
