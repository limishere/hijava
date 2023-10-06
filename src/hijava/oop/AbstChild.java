package hijava.oop;

// 추상클래스를 상속받은 일반클래스(abstract가 없음)
public class AbstChild extends AbstSuper{

	// abstract클래스에 선언만 있는 메서드를 구현해줌
	// 추상클래스를 상속받는 클래스는 부모의 추상메소드를 모두 구현해야 한다.
	@Override
	public int max(int i, int j) {
		return i > j ? i : j; // 다항연산자
	}

}
