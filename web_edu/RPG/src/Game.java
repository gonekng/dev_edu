
public class Game {

	public static void main(String[] args) {
		Player player1 = new Player("hi_gorae");
		Player player2 = new Player("fve_un");
		Slime enemy1 = new Slime("slime1", 100);
		Slime enemy2 = new Slime("slime2", 200);
		
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		player1.attack(enemy1);
		player2.attack(enemy2);
		
//		Weapon weapon1 = new Weapon();
//		weapon1.name = "창";
//		weapon1.damage = 20;
//		Weapon weapon2 = new Weapon();
//		weapon2.name = "총";
//		weapon2.damage = 30;
//		
//		player1.setWeapon(weapon1);
//		player2.setWeapon(weapon2);
		
//		Potion potion1 = new Potion("Potion1");
//		System.out.printf("%s : %d recovery, %s color, %s type\n", potion1.name, potion1.recovery, potion1.color, potion1.type);
//		
//		Potion potion2 = new Potion("Potion2", 50, "skyblue", "recover");
//		System.out.printf("%s : %d recovery, %s color, %s type\n", potion2.name, potion2.recovery, potion2.color, potion2.type);
//		
//		Golem golem1 = new Golem("golem1", 1000);
//		golem1.defenceOn();
//		player2.attack(golem1);
//		golem1.attack(player1);
		
		enemy1.attack(player1);
//		
//		enemy2.attack(player1);
//		enemy2.powerUp();
		enemy2.attack(player2);
	}

}
