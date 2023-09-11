package hijava.practice;

public class Prime {

	// 1 ~ 100 사이에 존재하는 소수의 합을 구하시오.

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 2; i <= 100; i++) { // 1은 소수가 아님. 2부터 시작
		
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
			
				if(i % j == 0) {
					isPrime = false; // 소수가 아님
					break;
				}
			}
			
			if(isPrime == true) { // 소수만 더함
//				System.out.println(i);
				sum = sum + i; // sum += i;
			}
					
		}
		
		System.out.println("Sum is " + 	sum);
	}
	

	

}
