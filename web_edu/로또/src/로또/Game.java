package 로또;

public class Game {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		lotto.makeLotto();
		System.out.println(lotto);
		
		int rank = 0;
		int buynum = 5;
		Player p1 = new Player("hi_gorae", 500000);
		p1.buyLotto(buynum);
		
		int [] winNum = {3,7,12,25,30,33};
		for(int i=0; i<5; i++) {
			rank = judge(p1.lottoList[i].num_arr, winNum);
			System.out.println(rank + "개 일치합니다.");
		}
		
	}
	public static int judge(int[] challenge, int answer[]) {
		 int count = 0;
		 for(int i=0; i<challenge.length; i++ ) {
			 for(int j=0; j<challenge.length; j++) {
				 if(challenge[i] == answer[j]) {
					 count++;
				 }
			 }
		 }
		 return count;
	}

}
