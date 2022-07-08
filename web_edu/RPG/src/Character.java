
public class Character {
	String name;
	int hp = 100;
	int mana = 100;
	int damage = 10;
	
	public Character(String name) {
		this.name = name;
	}
	
	public void attack(Character character) {
		if(character.hp ==0 ) {
			System.out.printf("%s 을 더 이상 공격할 수 없습니다.\n", character.name);
			System.out.println("");
			return;
		}
		int after_hp =  character.hp - this.damage;
		if(after_hp<0) {
			after_hp = 0;
		}
		System.out.printf("%s 가 %s 을 %d의 데미지로 공격합니다.\n", this.name, character.name, this.damage);
		System.out.printf("%s 의 체력이 %d에서 %d이 되었습니다.\n", character.name, character.hp, after_hp);
		character.hp = after_hp;
		
		if(character.hp ==0 ) {
			System.out.printf("%s 이 죽었습니다.\n", character.name);
			System.out.printf("%s 을 더 이상 공격할 수 없습니다.\n", character.name);
			System.out.println("");
			return;
		}
		System.out.println("");
	}

}
