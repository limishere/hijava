package hijava.practice;

public class Prime {

	// 1 ~ 100 사이에 존재하는 소수의 합을 구하시오.

	public static void main(String[] args) {
		
		int total = 0;
		for(int num = 2; num <= 100; num++) { // 1은 소수가 아님. 2부터 시작
		
//			boolean isPrimeNum = true;
//			isPrimeNum = isPrime(num);
			boolean isPrimeNum = isPrime(num); // 위 두줄은 중복되므로 한줄로 줄임
			
			if(isPrimeNum) { // true , 소수만 더함 -> 14번 줄을 지우고 if(isPrime(num))도 가능.
//				System.out.println(i);
				total = total + num; // total += num;
				
			}else { // false
				System.out.println(num + "is not prime number!");
			}
					
		}
		
		System.out.println("total is " + total);
	}

	// 소수를 판별하라! -> 소수여부를 판별하는 함수를 따로 생성함
	private static boolean isPrime(int num) { //함수는 항상 boolean자리에 리턴타입이 있음(리턴값 아무것도 없을땐 void)
		for(int j = 2; j < num; j++) {
		
			if(num % j == 0) {
				return false; // 소수가 아님
			}
		}
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
