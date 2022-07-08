
public class Pocketmon {
	String name;
	String[][] nameList;
	int randomInt;
	int hp;
	int max_hp;
	int damage;
	int exp;
	int max_exp;
	int level;
	String type;
	Location location;
	boolean on = false;

	public Pocketmon() {
		this.exp = 0;
		this.level = 1;
		this.max_exp = 10;
	}

	public void attack(Pocketmon obj) {
		int damage2 = this.damage;
		if (this.type == "GrassType" && obj.type == "ElectricType"
				|| this.type == "FireType" && obj.type == "GrassType"
				|| this.type == "WaterType" && obj.type == "FireType"
				|| this.type == "ElectricType" && obj.type == "WaterType") {
			damage2 *= 2;
		}

		if (obj.hp <= 0) {
			System.out.println(obj.name + "은(는) 이미 죽은상태라 공격할수 없습니다");
			return;
		}

		int afterhp = obj.hp - damage2;
		System.out.printf("%s이(가) %s를 %d의 데미지로 공격합니다.\n", this.name, obj.name, damage2);

		if (afterhp < 0) { // 적이 이번공격에 죽은경우
			afterhp = 0;
			System.out.printf("적이 이번공격에 죽었습니다.\n");
			this.exp += obj.damage;
			System.out.printf("경험치가 %d만큼 증가하였습니다.\n", obj.damage);
			while (this.exp >= this.max_exp) {
				this.exp -= this.max_exp;
				this.levelUp();
			}
			obj.hp = afterhp;
			return;
		}
		System.out.printf("%s의 체력이 %d에서 %d가 되었습니다.\n", obj.name, obj.hp, afterhp);
		obj.hp = afterhp;
	}

	public void recover() {
		int afterhp = hp + damage;
		if (afterhp > max_hp) {
			afterhp = max_hp;
		}
		System.out.printf("%s의 체력이 %d에서 %d가 되었습니다.\n", name, hp, afterhp);
		hp = afterhp;
	}

	public void escape() {
		this.location = Location.town;
	}

	public void levelUp() {
		int afterLevel = this.level + 1;
		System.out.printf("%s의 레벨이 %d에서 %d로 올랐습니다.\n", this.name, this.level, afterLevel);
		this.level = afterLevel;
		this.max_exp = level * 10;
		this.name = nameList[randomInt][level-1];
	}
}