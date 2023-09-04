package hijava.practice;

public class Casting {
	public static void main(String[] args) {
		byte b = 1;
		int i = b; // b가 1바이트 int 4바이트이므로 에러없이 형변환 가능
		long l = 1234567;
		
//		b = i; // 에러남. 큰 자료형이 작아져서
		System.out.println(i + l); // 1234568
		
	}
}
