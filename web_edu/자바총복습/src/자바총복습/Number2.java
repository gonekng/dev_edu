package 자바총복습;

public class Number2 {
	public void printCuttedSum(int[] arr, int cut_num) {
		int sum = 0;
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0; i<cut_num; i++) {
			sum += arr[i];
			index = i;
		}
		System.out.printf("\n%d번째 요소까지의 총합 : %d", index+1, sum);
	}
}
