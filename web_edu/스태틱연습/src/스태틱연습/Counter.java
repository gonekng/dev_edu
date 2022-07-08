package 스태틱연습;

public class Counter {
	static int count = 0;
		// 정적화, 전역화 : 정의된 지역에 상관없이 프로그램(프로젝트 기준)이 실행된 후 종료될때까지 유지
		// 인스턴스를 생성할때가 아니라 클래스를 컴파일할 때 메모리에 올라감 (공유되는 성질)
	
	public Counter() {
		count++;
		System.out.println("생성되었습니다. Count : " + count);
	}
}
