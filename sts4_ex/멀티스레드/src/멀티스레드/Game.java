package 멀티스레드;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static int round = 0;
	public static boolean flag = false;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("5판 3선승제 가위바위보 게임입니다.");
		System.out.println("당신의 이름을 입력하세요.");
		String name = sc.nextLine();
		
		int win_count = 0;
		int lose_count = 0;
		String[] arr = {"가위", "바위", "보"};
		String result = "";
		String input = "";
		Random rd = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println( (i+1) + "번째 라운드");
			System.out.println("3초 안에 가위, 바위, 보 중 하나를 입력하시오. : ");
//			same = false;
			flag = false;
			Runnable gt = new GameThread(round);
			Thread thread = new Thread(gt);
			thread.start();
			input = sc.nextLine();
			while(!input.equals("가위") && !input.equals("바위") && !input.equals("보")) {
				System.out.println("잘못된 값을 입력하였습니다.");
				System.out.println("3초 안에 가위, 바위, 보 중 하나를 입력하시오. : ");
				input = sc.nextLine();
			}
			flag = true;
			round++;
			
			result = arr[rd.nextInt(3)];
			boolean win = (input.equals("가위") && result.equals("보")) || (input.equals("바위") && result.equals("가위")) || (input.equals("보") && result.equals("바위")) ;
			if(input.equals(result)) {
				System.out.printf("%s로 비겼습니다. 재게임 진행합니다.\n", input);
				i--;
			} else if (win) {
				System.out.printf("%s로 %s를 이겼습니다. 다음 라운드 진행합니다.\n", input, result);
				win_count++;
			} else {
				System.out.printf("%s로 %s에게 졌습니다. 다음 라운드 진행합니다.\n", input, result);
				lose_count++;
			}
			if(win_count==3) {
				System.out.println(name + "의 승리로 게임이 종료되었습니다.");
				break;
			} else if(lose_count==3) {
				System.out.println(name + "의 패배로 게임이 종료되었습니다.");
				break;
			}
		}
		sc.close();

	}

}
