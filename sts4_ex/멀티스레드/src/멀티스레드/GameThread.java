package 멀티스레드;

class GameThread extends Thread{
	int gameCount=0;
	
	public GameThread(int now) {
		super();
		this.gameCount = now;
	}
	
	@Override
	public void run() {
		for(int i=3; i>=1; i--){
			if(gameCount != Game.round){
				return;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("입력 시간이 초과되었으므로 게임이 종료되었습니다.");
		System.exit(0);
		
	}

}
