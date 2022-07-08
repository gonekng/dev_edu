package 상수;

public class DayTest {
	Day day;
	
	public DayTest(Day day) {
		this.day = day;
	}
	
	public void evalDay() {
		switch(day) {
		case MONDAY:
			System.out.println(day);
			System.out.println("MONDAY IS SO TERRIBLE!!!!");
			break;
		case FRIDAY:
			System.out.println(day);
			System.out.println("I'M SO TIRED ON EVERY FRIDAY");
			break;
		case SATURDAY:
			System.out.println(day);
			System.out.println("I LOVE SATURDAY :)");
			break;
		default:
			System.out.println(day);
			System.out.println("I HAVE NO IDEA,,,");
		}
	}
}
