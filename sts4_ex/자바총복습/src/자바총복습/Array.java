package 자바총복습;

public class Array {
//	9개의 서로 다른 자연수가 주어질 때,
//	이들 중 최대값을 찾고
//	그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//	
	public void printMaxValIdx(int[] arr) {
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.printf("최대값은 %d 이고, 이 값은 %d 번째 수입니다.", max, index+1);
	}
	
	
}
