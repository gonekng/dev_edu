import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("게임을 시작합니다.");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		Player player1 = new Player(name);
		Pocketmon mon;
		Random rd = new Random();
		int typeNum = rd.nextInt(4);
		if (typeNum == 0) {
			mon = new FireType();
		} else if (typeNum == 1) {
			mon = new ElectricType();
		} else if (typeNum == 2) {
			mon = new WaterType();
		} else {
			mon = new GrassType();
		}
		player1.mon_list.add(mon);
		while (true) {
			if (player1.location == Location.center) {

				System.out.println("포켓몬 센터로 이동하였습니다.");
				player1.recoverAll();
				player1.getBall();

				System.out.println("어디로 이동하시겠습니까? (1: 센터 / 2: 풀숲 / 3: 마을 / 0: 게임종료)");
				int where;
				try {
					where = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					where = 4;
				}
				while (true) {
					if (where == 1 && player1.location == Location.center) {
						System.out.println("현재 포켓몬 센터입니다. 다른 장소를 입력해주세요.");
					} else if (where != 1 && where != 2 && where != 3 && where != 0) {
						System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
					} else
						break;
					try {
						where = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						where = 4;
					}
				}
				if (where == 0)
					break;
				player1.move(where);
				continue;

			} else if (player1.location == Location.forest) {

				System.out.println("풀숲으로 이동하였습니다.");
				Pocketmon enemy1;
				Random rd2 = new Random();
				int typeNum2 = rd2.nextInt(4);
				if (typeNum2 == 0) {
					enemy1 = new FireType();
				} else if (typeNum2 == 1) {
					enemy1 = new ElectricType();
				} else if (typeNum2 == 2) {
					enemy1 = new WaterType();
				} else {
					enemy1 = new GrassType();
				}
				System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 등장하였습니다.");

				while (mon.hp > 0) {
					System.out.println("1: 대결 / 2: 도망 / 3: 포획");
					int fightEscapeCatch;
					try {
						fightEscapeCatch = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						fightEscapeCatch = 4;
					}
					while (fightEscapeCatch != 1 && fightEscapeCatch != 2 && fightEscapeCatch != 3) {
						System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
						try {
							fightEscapeCatch = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {
							fightEscapeCatch = 4;
						}
					}
					int fightRecoverEscape = rd.nextInt(10);

					if (fightEscapeCatch == 1) {
						System.out.println("1: 공격 / 2: 회복");
						int attackOrRecover;
						try {
							attackOrRecover = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {
							attackOrRecover = 4;
						}
						while (attackOrRecover != 1 && attackOrRecover != 2) {
							System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
							try {
								attackOrRecover = Integer.parseInt(sc.nextLine());
							} catch (NumberFormatException e) {
								attackOrRecover = 4;
							}
						}

						if (attackOrRecover == 1) {
							System.out.println(player1.name + "의 " + mon.name + "이(가) 공격합니다.");
							mon.attack(enemy1);
							if (enemy1.hp <= 0) {
								System.out.println(enemy1.name + "이/가 죽었습니다.");
								break;
		                     } else {
		                         if (fightRecoverEscape <= 7) {
		                            System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 공격합니다.");
		                            enemy1.attack(mon);
		                         } else if (7 < fightRecoverEscape && fightRecoverEscape < 10) {
		                            System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 회복합니다.");
		                            enemy1.recover();
		                         } else {
		                            enemy1.escape();
		                            System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 풀숲으로 도망갔습니다.");
		                         }
							}
						} else if (attackOrRecover == 2) {
							mon.recover();
							if (fightRecoverEscape <= 7) {
		                        System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 공격합니다.");
		                        enemy1.attack(mon);
		                     } else if (7 < fightRecoverEscape && fightRecoverEscape < 10) {
		                        System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 회복합니다.");
		                        enemy1.recover();
		                     } else {
		                        enemy1.escape();
		                        System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 풀숲으로 도망갔습니다.");
		                     }
						} else {
							System.out.println("다시 입력해주세요.");
						}
					} else if (fightEscapeCatch == 2) {
						player1.escape();
						break;
					} else if (fightEscapeCatch == 3) {
						player1.catchMon(enemy1);
						if (enemy1.on==false) {
		                      if (fightRecoverEscape <= 7) {
		                         System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 공격합니다.");
		                         enemy1.attack(mon);
		                      } else if (7 < fightRecoverEscape && fightRecoverEscape < 10) {
		                         System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 회복합니다.");
		                         enemy1.recover();
		                      } else {
		                         enemy1.escape();
		                         System.out.println("야생 포켓몬 " + enemy1.name + "이(가) 풀숲으로 도망갔습니다.");
		                      }
						}
					} else {
						System.out.println("올바르게 입력해주세요.");
					}

				}

				System.out.println("어디로 이동하시겠습니까? (1: 센터 / 2: 풀숲 / 3: 마을 / 0: 게임종료)");
				int where;
				try {
					where = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					where = 4;
				}
				while (true) {
					if (where == 1 && player1.location == Location.center) {
						System.out.println("현재 포켓몬 센터입니다. 다른 장소를 입력해주세요.");
					} else if (where != 1 && where != 2 && where != 3 && where != 0) {
						System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
					} else
						break;
					try {
						where = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						where = 4;
					}
				}
				if (where == 0)
					break;
				player1.move(where);
				continue;

			} else {

				System.out.println("마을로 이동하였습니다.");
				player1.printAll();

				System.out.println("어디로 이동하시겠습니까? (1: 센터 / 2: 풀숲 / 3: 마을 / 0: 게임종료)");
				int where;
				try {
					where = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					where = 4;
				}
				while (true) {
					if (where == 1 && player1.location == Location.center) {
						System.out.println("현재 포켓몬 센터입니다. 다른 장소를 입력해주세요.");
					} else if (where != 1 && where != 2 && where != 3 && where != 0) {
						System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
					} else
						break;
					try {
						where = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						where = 4;
					}
				}
				if (where == 0)
					break;
				player1.move(where);
				continue;

			}
		}
		System.out.println("게임이 종료되었습니다.");
		sc.close();
	}

}
