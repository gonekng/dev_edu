package 로또;

import java.util.Arrays;

public class Player {
	String name;
	int money;
	Lotto[] lottoList;
	
	public Player(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void buyLotto(int n) {
		// 로또 하나 뽑기
		lottoList = new Lotto[n];
		for(int i=0; i<n; i++) {
			Lotto lotto = new Lotto();
			lottoList[i] = lotto.makeLotto();
			System.out.println("로또 구매 : " + lottoList[i] );
		}
		// 뽑은 로또를 내가 보유하고 있는 리스트에 넣기
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", money=" + money + ", lottoList=" + Arrays.toString(lottoList) + "]";
	}
	
}
