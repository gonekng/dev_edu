import java.util.Random;

public class ElectricType extends Pocketmon {
	String[][] nameList = { { "피츄", "피츄", "피츄", "피카츄", "피카츄", "피카츄", "라이츄", "라이츄", "라이츄", "라이츄" },
			{ "코일", "코일", "코일", "레어코일", "레어코일", "레어코일", "자포코일", "자포코일", "자포코일", "자포코일" },
			{ "에케레드", "에케레드", "에케레드", "에레드", "에레드", "에레드", "에레키블", "에레키블", "에레키블", "에레키블" },
			{ "메리프", "메리프", "메리프", "보송송", "보송송", "보송송", "전룡", "전룡", "전룡", "전룡" },
			{ "저리어", "저리어", "저리어", "저리릴", "저리릴", "저리릴", "저리더프", "저리더프", "저리더프", "저리더프" } };

	public ElectricType() {
		Random rd = new Random();
		super.randomInt = rd.nextInt(5);
		super.max_hp = 70;
		super.hp = max_hp;
		super.damage = 30;
		super.level = 1;
		super.nameList = nameList;
		super.name = nameList[randomInt][level - 1];
		super.type = "ElectricType";
	}

}
