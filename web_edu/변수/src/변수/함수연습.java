package 변수;

public class 함수연습 {
	// 1. 2개의 정수를 입력받아 합을 리턴하는 함수 add
	public int add(int a, int b) {
		return a+b;
	}
	
	// 2. 2개의 정수를 입력받아 앞에서 뒤를 뺀 값을 리턴하는 함수 minus
	public int minus(int a, int b) {
		return a-b;
	}
	
	// 3. 2개의 정수를 입력받아 큰 수에서 작은 수를 뺀 값을 리턴하는 함수 minus
	public int minus2(int a, int b) {
		return (a>=b)? a-b: b-a;
	}
	
	// 4. 3개의 정수를 입력받아 가장 큰 수를 리턴하는 함수 getMaxNum
	public int getMaxNum(int a, int b, int c) {
		int result1 = (a>=b)? a: b;
		int result2 = (result1>=c)? result1: c;
		return result2;
	}
	
	// 5. 정수 하나를 인자로 받아 논리값 리턴하는 함수 isOverHundred
	public boolean isOverHundred(int a) {
		return (a>100)? true: false;
	}
	
	// 6. 1부터 100까지의 정수 중 짝수만 콘솔로 찍어보시오.
	public void printFunc1() {
		System.out.println("1에서 100 사이의 짝수 :");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			} 
		}
	}

	// 7. 1부터 100까지의 정수 중 3의 배수만 콘솔로 찍어보시오.
	public void printFunc2() {
		System.out.println("1에서 100 사이의 3의 배수 :");
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
	}

	// 8. 1부터 100까지의 정수 중 5의 배수만 콘솔로 찍어보시오. (10의 배수는 제외)
	public void printFunc3() {
		System.out.println("1에서 100 사이의 5의 배수 (10의 배수 제외) :");
		for(int i=1; i<=100; i++) {
			if(i%5==0 & i%10!=0) {
				System.out.print(i + " ");
			}
		}
	}

	// 9. 문자열 하나, 자연수 하나를 받아서 문자열을 그 횟수만큼 출력하는 함수
	public void printFunc4(String str, int cnt) {
		if(cnt<0) System.out.print("잘못된 값을 입력하였습니다.");
		for(int i=0; i<cnt; i++) {
			System.out.print(str);
		}
	}

	// 10. 달을 입력받아서 해당 달이 어느 계절인지 리턴하는 함수
	// 3,4,5 : 봄
	// 6,7,8 : 여름
	// 9,10,11 : 가을
	// 12,1,2 : 겨울
	public String getSeason(int month) {
		int quotient = (int)(month/3);
		if(month>=1 & month<=12) {
			switch(quotient) {
			case 1: return "봄";
			case 2: return "여름";
			case 3: return "가을";
			default: return "겨울";
			}
		} else {
			return "잘못된 값을 입력하였습니다.";
		}
	}

	// 11. 문자열 2개를 입력받아 첫번째 문자열 안에 두번째 문자열이 있는지 판단하는 함수
	public String isInclude(String str1, String str2){
		boolean include = str1.contains(str2);
		String result = "";
		if(include) {
			result = "'" + str1 + "'에는 '" + str2 + "'이 포함되어 있습니다.";
		} else {
			result = "'" + str1 + "'에는 '" + str2 + "'이 포함되어 있지 않습니다.";
		}
		return result;
	}

	// 12. 문자열 2개를 입력받아 첫번째 문자열 안에 두번째 문자열의 개수를 리턴하는 함수
	public int getCountInclude(String str1, String str2){
		boolean include = true;
		int count = 0;
		include = str1.contains(str2);
		while(include) {
			count++;
			int where = str1.indexOf(str2);
			str1 = str1.substring(where+str2.length());
			include = str1.contains(str2);
		}
		return count;
	}

	// 13. 100글자 이하면 허용, 넘으면 허용X
	public boolean isOverHundred(String str){
		boolean result = (str.length() <=100 )? true: false;
		return result;
	}

	// 14. 글자수가 인자로 받은 수 이하면 허용, 넘으면 허용X
	public boolean isOverNum(String str, int num){
		boolean result = (str.length() <=num )? true: false;
		return result;
	}

	// 15. 1부터 100까지의 자연수 출력
	public void basicWhile(){
		int i =1;
		while(i<100) {
			System.out.print(i++ + " ");
		};
	}
}
