package hijava.practice;

//N 이라는 클래스 속에는 x, y 두개의 변수가 있는데,
//swap() 함수를 호출하면 x, y의 값이 서로 치환되도록 코딩하시오.

public class N {
	int x = 10;
	int y = 20;
	
	public void swap() {
		int temp = x;
		x = y;
		y = temp; // ->메모리 속에서 변수들이 왔다갔다 한다는 것을 이해하기!
	}
									
	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		System.out.println("------------------------");
		n.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
	}
	
}
