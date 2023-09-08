package hijava.practice;

public class Loop1 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i++ < 10) { // 조건자리에 true가 들어가면 무한반복함
			if(i % 2 == 0) {
				continue; // continue를 만나면 처음으로 간다, 뒷부분을 실행하지 않음(while로 돌아감)
			}
			
			if (i > 5) {
				break; // while문을 종료
			}
			
			if (i % 2 == 1) { //홀수
				System.out.println("pppp >> " + i);
			}
			
		}
		
	}

}
