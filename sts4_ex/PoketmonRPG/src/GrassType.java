import java.util.Random;

public class GrassType extends Pocketmon {
	String[][] nameList = { { "치코리타", "치코리타", "치코리타", "베이리프", "베이리프", "베이리프", "메가니움", "메가니움", "메가니움", "메가니움" },
			{ "이상해씨", "이상해씨", "이상해씨", "이상해풀", "이상해풀", "이상해풀", "이상해꽃", "이상해꽃", "이상해꽃", "이상해꽃" },
			{ "해너츠", "해너츠", "해너츠", "해너츠", "해너츠", "해루미", "해루미", "해루미", "해루미", "해루미" },
			{ "모다피", "모다피", "모다피", "우츠동", "우츠동", "우츠동", "우츠보트", "우츠보트", "우츠보트", "우츠보트" },
			{ "모부기", "모부기", "모부기", "수풀부기", "수풀부기", "수풀부기", "토대부기", "토대부기", "토대부기", "토대부기" } };

	public GrassType() {
		Random rd = new Random();
		int randomInt = rd.nextInt(5);
		super.max_hp = 85;
		super.hp = max_hp;
		super.damage = 15;
		super.level = 1;
		super.nameList = nameList;
		super.name = nameList[randomInt][level - 1];
		super.type = "GrassType";
	}

}
