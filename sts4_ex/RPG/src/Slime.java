
public class Slime extends Monster implements transformable{

	public Slime(String name, int hp) {
		super(name, hp);
		this.kind = "Slime";
	}
	public void attack(Character character) {
		System.out.printf("%s 이 %s 를 공격합니다.\n", this.name, character.name);
		super.attack(character);
	}
	@Override
	public void powerUp() {
		this.damage *= 2;
	}
	@Override
	public void transform() {
		System.out.println("Slime 변신!");
	}
}