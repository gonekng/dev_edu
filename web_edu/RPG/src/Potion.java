
public class Potion {
	
	String name;
	int recovery; // 회복량
	String color;
	String type;
	
	public Potion(String name) {
		this.name = name;
		this.recovery = 30;
		this.color = "Pure";
		this.type = "Unknown";
	}
	
	public Potion(String name, int recovery, String color, String type) {
		this.name = name;
		this.recovery = recovery;
		this.color = color;
		this.type = type;
	}
	
}
