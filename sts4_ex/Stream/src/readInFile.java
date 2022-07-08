import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readInFile {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/reader.txt");
			BufferedReader bf = new BufferedReader(fr);
			
//			1. 문자 하나씩(1바이트 기준) 읽기
//			int i;
//			while( (i = fr.read()) != -1 ) {
//				System.out.println((char)i);
//			}
			
//			2. 각 줄 기준으로 읽기
			String thisLine = "";
			while( (thisLine = bf.readLine() ) != null) {
				System.out.println(thisLine);
			}
			bf.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
