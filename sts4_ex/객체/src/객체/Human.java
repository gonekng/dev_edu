package 객체;

public class Human {
	String name = "EomTaeHyeon";
	int age = 30;
	String gender = "Male";
	
	public void name(String str_name) {
		this.name = str_name;
	}
	
	public void taming(Cat mycat) {
		System.out.println(this.name + " tames " + mycat.name + ".");
	}
	
	public void taming(Dog mydog) {
		System.out.println(this.name + " tames " + mydog.name + ".");
	}
}
