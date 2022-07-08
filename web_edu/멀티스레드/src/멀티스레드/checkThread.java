package 멀티스레드;

public class checkThread implements Runnable{
	String name;
	
	public checkThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println(name);
				System.out.println("\t------------HUNGRY!!!!!");
				Thread.sleep(2000); // 1000 milliseconds = 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + ": Thread Terminated.");
	}
}
