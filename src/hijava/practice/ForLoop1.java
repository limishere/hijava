package hijava.practice;

public class ForLoop1 {

	public static void main(String[] args) {
		
		// 구구단 출력
		// 2 ~ 9 loop
		// 1 ~ 9 loop
		for(int i = 2; i <= 9; i++) {
		
//			if(i % 2 == 1) continue; // 짝수단만 출력하고 싶을 때
			
			System.out.println(i + " 단 ---------");
			for(int j = 1; j <= 9; j++) {
				 System.out.println(i + " x " + j + " = " + (i * j));
			}
		}
	}

}
