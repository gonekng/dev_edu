import java.util.Random;

public class FireType extends Pocketmon {
	String[][] nameList = { { "파이리", "파이리", "파이리", "리자드", "리자드", "리자드", "리자몽", "리자몽", "리자몽", "리자몽" },
			{ "가디", "가디", "가디", "가디", "가디", "윈디", "윈디", "윈디", "윈디", "윈디" },
			{ "브케인", "브케인", "브케인", "마그케인", "마그케인", "마그케인", "블레이범", "블레이범", "블레이범", "블레이범" },
			{ "아차모", "아차모", "아차모", "영치코", "영치코", "영치코", "번치코", "번치코", "번치코", "번치코" },
			{ "식스테일", "식스테일", "식스테일", "식스테일", "식스테일", "나인테일", "나인테일", "나인테일", "나인테일", "나인테일" } };

	public FireType() {
		Random rd = new Random();
		int randomInt = rd.nextInt(5);
		super.max_hp = 75;
		super.hp = max_hp;
		super.damage = 25;
		super.level = 1;
		super.nameList = nameList;
		super.name = nameList[randomInt][level - 1];
		super.type = "FireType";
	}

}
