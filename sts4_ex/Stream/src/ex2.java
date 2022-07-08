import java.io.IOException;

// 엔터키를 입력할 때까지 계속되는 프로그램
public class ex2 {

	// 입력된 데이터에서 엔터키를 포함하여 전달된 상황
	public static void main(String[] args) {
		int key;
		System.out.println("입력해주세요. 엔터키를 입력할 때까지 계속됩니다.");
		try {
			while(true) {
				if((key = System.in.read()) != 13) {
					System.in.skip(2);
					System.out.print(key);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("코드 종료");
		
	} 

}
