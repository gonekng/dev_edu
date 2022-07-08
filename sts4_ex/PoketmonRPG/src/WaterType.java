import java.util.Random;

public class WaterType extends Pocketmon {
	String[][] nameList = { { "꼬부기", "꼬부기", "꼬부기", "어니부기", "어니부기", "어니부기", "거북왕", "거북왕", "거북왕", "거북왕" },
			{ "팽도리", "팽도리", "팽도리", "팽태자", "팽태자", "팽태자", "엠페르트", "엠페르트", "엠페르트", "엠페르트" },
			{ "고라파덕", "고라파덕", "고라파덕", "고라파덕", "고라파덕", "골덕", "골덕", "골덕", "골덕", "골덕" },
			{ "발챙이", "발챙이", "발챙이", "슈륙챙이", "슈륙챙이", "슈륙챙이", "강챙이", "강챙이", "강챙이", "강챙이" },
			{ "잉어킹", "잉어킹", "잉어킹", "잉어킹", "잉어킹", "가라도스", "가라도스", "가라도스", "가라도스", "가라도스" }

	};

	public WaterType() {
		Random rd = new Random();
		int randomInt = rd.nextInt(5);
		super.max_hp = 80;
		super.hp = max_hp;
		super.damage = 20;
		super.level = 1;
		super.nameList = nameList;
		super.name = nameList[randomInt][level - 1];
		super.type = "WaterType";
	}
}
