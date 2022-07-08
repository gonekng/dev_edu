package 자바총복습;

import java.util.Arrays;

public class Number3 {
	public void divideArrbyNum(int[] arr, int cutNum) {
		Arrays.sort(arr);
		int[] sub_arr1 = new int[arr.length];
		int[] sub_arr2 = new int[arr.length];
		int index = 0;
		int index1 = 0;
		int index2 = 0;
		while(arr[index]<cutNum) {
			sub_arr1[index1] =arr[index];
			index++;
			index1++;
		}
		while(index<arr.length) {
			sub_arr2[index2] = arr[index];
			index++;
			index2++;
		}
		System.out.printf("%d보다 작은 요소 출력 : ", cutNum);
		for(int i=0; i<index1; i++) {
			System.out.print(sub_arr1[i] + " ");
		}
		System.out.printf("\n%d보다 크거나 같은 요소 출력 : ", cutNum);
		for(int i=0; i<index2; i++) {
			System.out.print(sub_arr2[i] + " ");
		}
	}
}
