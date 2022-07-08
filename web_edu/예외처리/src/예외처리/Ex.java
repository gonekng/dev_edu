package 예외처리;

public class Ex {
	int [] arr = {1,2,3,4,5};
	
	public void printAllElement() {
		System.out.print("arr : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void printOneElement(int index) {
		try {
			System.out.println(arr[index-1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("범위에서 벗어난 값입니다.");
			System.out.println(arr.length + "이하의 수를 입력하세요.");
		} finally {
			System.out.println("finally 실행!");
		}
		System.out.println("printOneElement 끝!");
	}
	
}
