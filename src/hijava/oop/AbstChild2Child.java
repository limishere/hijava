package hijava.oop;

public class AbstChild2Child extends AbstChild2 {

	// 추상클래스가 아니므로 부모클래스의 추상메소드를 구현해야 한다.
	// AbstSuper클래스의 추상메소드를 구현해야 함
	@Override
	public int max(int i, int j) {
		return i > j ? i + 100 : j + 1000;
	}
	
	// Abstract 상속이 깊어지면 어디에 구현되어 있는지 알기 힘들다!
	// 메소드에 커서를 두고 ctrl + t 하면 어디에 구현되어 있는지 확인 할 수 있다!
}
