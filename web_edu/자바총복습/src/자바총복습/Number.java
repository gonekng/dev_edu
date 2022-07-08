package 자바총복습;

public class Number {
	
	public void countNumber(int a, int b, int c) {
		int num = a * b * c;
		int[] count = new int[10];
		while(num > 0) {
			int i = 0;
			i = num % 10;
			count[i]++;
			num = num / 10;
		}
		
		System.out.println("세 자연수의 곱 : " + a*b*c);
		for(int i=0; i<count.length; i++) {
			if(count[i]==0) continue;
			System.out.printf("%d은 %d번 사용되었음\n", i, count[i]);
		}
	}
	
//	public void countNumber(int a, int b, int c) {
//		int num = a * b * c;
//		String targetStr = Integer.toString(num);
//		for(int i=0; i<10; i++) {
//			int count = 0;
//			for(int j=0; j<targetStr.length(); j++) {
//				if((targetStr.charAt(j)+"" ).equals(Integer.toString(i))) {
//					count++;
//				}
//			}
//			if(count>0) {
//				System.out.printf("%d는 %d번 사용됨\n", i, count);
//			}
//		}
//		
}
