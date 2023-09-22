package hijava.practice;

import java.util.ArrayList;

public class Prime {

	// 1) 1 ~ 100 사이에 존재하는 소수의 합을 구하시오.
	// 2) 지난 시간에 작성한 소수의 합을 ArrayList를 사용하여 작성하시오.
	//    (힌트: 자신보다 작은 소수로 나누어 떨어지지 않는다!)


	public static void main(String[] args) {
		
		int total = 0;
		for(int num = 2; num <= 100; num++) { // 1은 소수가 아님. 2부터 시작
		
			if(isPrime(num)) { // true일때 소수만 더함
				total = total + num; // total += num;
//				primeList.add(num); // 소수를 ArrayList에 담음
			}
					
		}
		System.out.println("total is " + total);
		
	}

	// 소수를 판별하라! -> 소수여부를 판별하는 함수를 따로 생성함
	
	private static ArrayList<Integer> primeList = new ArrayList<>(); // static을 붙이면 메모리에 1개만 생김
	
	private static boolean isPrime(int num) { //함수는 항상 boolean자리에 리턴타입이 있음(리턴값 아무것도 없을땐 void)
		
//		for(int j = 2; j < num; j++) {
		for(Integer j : primeList) { // 자신보다 작은 소수로만 나누어서 판별가능
			if(num % j == 0) {
				return false; // 소수가 아님
			}
		}
		primeList.add(num);
		return true;
	}
	

	// void 예시 - void는 return;으로 끝나게 됨
//	private static void fn() {
//		dkfdlfkdgjskljfk...
//		if ( 1 == 2 ) {
//			 return;
//		}
//	}
	

}
