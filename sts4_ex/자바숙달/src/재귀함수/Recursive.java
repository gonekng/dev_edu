package 재귀함수;

public class Recursive {
	public int sigmaFun(int num) {
		if(num>=1)	return num + sigmaFun(num-1);
		else return 0;
	}

	public int factorialFun(int num) {
		if(num>=1)	return num * factorialFun(num-1);
		else return 1;
	}
}