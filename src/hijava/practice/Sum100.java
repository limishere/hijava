package hijava.practice;

// 1) 1 부터 100까지의 합을 구하시오.

public class Sum100 {

	public static void main(String[] args) {
		
//		int i = 1;
//		int sum = 0;
//		
//		while(i <= 100) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
		
		sumByWhile(); // ctrl+1 : 메소드 생성 단축키
		sumByFor();
	}

	// for문
	private static void sumByFor() {
		int total = 0;
		
		for(int i = 1; i <= 100 ; i++) {
//			System.out.println("i=" + i); //i=99로 끝남 왜? 조건이 만족하지 않으면 for문 종료
			total = total + i;
		}
		System.out.println("Result2 is " + total);
	}

	 
	// while문
	private static void sumByWhile() {
		int i = 0;
		int total = 0;
		
		while(++i <= 100) {
			
			// 홀수의 합만 구하라고 했을 때 if문 추가
//			if(i % 2 == 0) continue;
			
			total = total + i;
//			System.out.println("i=" + i + " total=" + total);
		}
		
		System.out.println("Result is " + total);
	}

}
