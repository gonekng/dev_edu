package 객체;

public class Main {

	public static void main(String[] args) {
		Cat mycat1 = new Cat();
		System.out.println("My cat's name is " + mycat1.name + ".");
		mycat1.walk();
		mycat1.run();
		
		Dog mydog1 = new Dog();
		System.out.println("My dog's name is " + mydog1.name + ".");
		mydog1.walk();
		mydog1.run();
		
		Human person1 = new Human();
		System.out.println("His name is " + person1.name + ".");
		person1.taming(mycat1);
		
		Human person2 = new Human();
		person2.name("Ohseungeun");
		System.out.println("Her name is " + person2.name + ".");
		person2.taming(mycat1);
	}

}
