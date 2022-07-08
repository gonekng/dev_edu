import java.util.ArrayList;
import java.util.Random;

public class Player {
	String name;
	int count_ball = 5;
	Location location = Location.town;
	ArrayList<Pocketmon> mon_list = new ArrayList<Pocketmon>();

	public Player(String name) {
		this.name = name;
	}

	public void move(int num) {
		if (num == 1)
			this.location = Location.center;
		if (num == 2)
			this.location = Location.forest;
		if (num == 3)
			this.location = Location.town;
		else
			return;
	}

	public void escape() {
		this.location = Location.town;
	}

	public void recoverAll() {
		System.out.println(name + "의 포켓몬들을 치료합니다.");
		for (int i = 0; i < mon_list.size(); i++) {
			this.mon_list.get(i).hp = 100;
		}
		System.out.println("\n치료가 완료되었습니다.");
		this.printAll();
	}

	public void getBall() {
		this.count_ball = count_ball + 5;
		System.out.println("몬스터볼 5개를 받았습니다.");
		System.out.println("현재 보유한 몬스터볼의 개수 : " + count_ball);
	}

	public void printAll() {
		System.out.println(name + "의 현재 포켓몬 리스트");
		for (int i = 0; i < mon_list.size(); i++) {
			System.out.printf("%d. %s(%s, %d) : hp %d, damage %d, exp %d, max exp %d\n", i + 1, mon_list.get(i).name,
					mon_list.get(i).type, mon_list.get(i).level, mon_list.get(i).hp, mon_list.get(i).damage,
					mon_list.get(i).exp, mon_list.get(i).max_exp);
		}
		System.out.println("");
	}

	public void catchMon(Pocketmon mon) {
		Random rd = new Random();
		int num = rd.nextInt(10);
		if (count_ball > 0) {
			this.count_ball = count_ball - 1;
			System.out.println("몬스터볼을 던졌습니다.");
			if (num < ((100 - mon.hp) / 10) && mon.on) {
				mon_list.add(mon);
				System.out.println(mon.name + "을/를 잡았습니다.");
				mon.on = false;
			} else {
				System.out.println(mon.name + "을/를 잡는데 실패하였습니다.");
			}
			System.out.println("남은 몬스터볼은 " + count_ball + "개입니다.");
		} else {
			System.out.println("몬스터볼이 부족합니다.");
		}
	}
}
