package hijava.practice;

import java.util.Iterator;

// 피보나치 수열을 출력하는 프로그램을 작성하시오.

public class Fibonacci {

	public static void main(String[] args) {
//		int result = fibo(10); //*** fibo(10) 작성 후 ctrl + 1 -> create method(아래에 함수를 만듦)
		int inputNum = 10;
		for(int i = 0; i <= inputNum; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int num) {
//		if(num == 0) return 0; // 피보나치에서 0과 1 앞은 마이너스이므로 2부터 시작하기 위해
//		if(num == 1) return 1;
		// 탈출조건
//		if(num <= 1) return num; // 위 두줄을 한줄로 표현
		
		// 위의 탈출조건 없이 if문으로 쓸 경우
		if(num > 1) {
			return fibo(num - 1) + fibo(num - 2);
		}else {
			return num;
		}
	}

}
