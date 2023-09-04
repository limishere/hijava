package hijava.practice;

public class Num {

	public static void main(String[] args) {
		 byte b = 1;
		 short s = 1;
		 
		 int i = 2147483647;
//		 int i = 2147483648; //int의 최대값 2147483647보다 크기 때문에 에러
//		 long l = 2147483648; // 이것도 에러. 왜? 자바는 오른쪽에 숫자가 있으면 무조건 int로 생각하기 때문에
		 long l = 2147483648L; 
		 
		 System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
		 
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(Long.MAX_VALUE); // Long은 클래스 타입이 됨
		 System.out.println(Long.MIN_VALUE);

	}

}
