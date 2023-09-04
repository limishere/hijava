package hijava.practice;

public class Cbvr {
	int m = 2;

	public static void main(String[] args) {
		int i = 1;
		System.out.println("i1=" + i);
		
		change1(i); // int는 값이 전달된다 그래서 i는 그대로 1 > 값이 전달 되는 것 (call by value 기본자료형)
		System.out.println("i2=" + i);
		
		System.out.println("---------");
		
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1=" + cb1.m);
		
		change2(cb1); // 메모리의 주소가 참조되는 것 (call by reference 참조자료형)
		System.out.println("cb2=" + cb1.m);
		
	}
	
	public static void change1(int x) {
		System.out.println("x=" + x);

		x = 100;
	}
	
	public static void change2(Cbvr cb) {
		cb.m = 100;
	}

}
