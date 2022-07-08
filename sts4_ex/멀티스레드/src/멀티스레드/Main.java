package 멀티스레드;

public class Main {

	public static void main(String[] args) {
		Runnable d1 = new checkThread("hi_gorae"); //  다형성 활용
		Runnable d2 = new checkThread("fve_eun");
		Runnable d3 = new checkThread("gone_kng");
		Runnable d4 = new checkThread("se_yeon_0815");
		
		Thread thread1 = new Thread(d1);
		Thread thread2 = new Thread(d2);
		Thread thread3 = new Thread(d3);
		Thread thread4 = new Thread(d4);
		
		thread1.start(); // 각 thread의 run() 메소드가 실행됨
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
