
public class Player extends Character{
	
	public Player(String name) {
		super(name);
		this.name = name;
	}
	
	public void attack(Monster enemy) {
		if("Golem".equals(enemy.kind)) {
			if(this.damage <= 40) {
				this.damage = 0;
			} else {
				this.damage -= 10;
			}
			System.out.println("Golem은 10의 데미지를 덜 받습니다.");
		}
		super.attack(enemy);
	}
	public void setWeapon(Weapon weapon) {
		int after_damage = this.damage + weapon.damage;
		System.out.printf("%s 가 %s 을 장착했습니다\n", this.name, weapon.name);
		System.out.printf("%s 의 체력이 %d 에서 %d 이 되었습니다\n", this.name, this.damage, after_damage);
		this.damage = after_damage;
		System.out.println("");
	}
}
