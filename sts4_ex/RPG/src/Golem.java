
public class Golem extends Monster{
	boolean defenceYn = false;

	public Golem(String name, int hp) {
		super(name, hp);
		this.kind = "Golem";
	}
	
	public void defenceOn() {
		defenceYn = true;
	}	
	public void defenceOff() {
		defenceYn = false;
	}

	@Override
	public void powerUp() {
		this.damage *= 4;
	}
	
}
