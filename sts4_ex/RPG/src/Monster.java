
public abstract class Monster extends Character {
	int hp;
	int mana = 50;
	int damage = 30;
	String kind;
	
	public Monster(String name, int hp) {
		super(name);
		this.hp = hp;
	}
	
	abstract public void powerUp();
}
