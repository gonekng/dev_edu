import java.io.IOException;

// 키보드로 입력받은 것을 정수로 변환
public class ex1 {

	public static void main(String[] args) {

		try {
			System.out.println("입력해주세요.");
			int i = System.in.read();
				// 입력되는 값의 첫 1바이트만 읽어오기 때문에
				// 알파벳 1개는 정상적으로 읽어오지만, 한글은 초성 하나만 반영된다.
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// A = 65, B = 66, Z = 90, a = 97, z = 122
		// 0 = 48, 1 = 49, \n = 13
		// 가 = 234, 나 = 235

	}

}
