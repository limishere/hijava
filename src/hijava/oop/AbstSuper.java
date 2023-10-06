package hijava.oop;

public abstract class AbstSuper {
	public abstract int max(int i, int j); //구현없이 선언만한 추상메소드(자식이 구현하도록)
	// 메소드에 커서를 두고 ctrl + t 하면 어디에 구현되어 있는지 확인 할 수 있다!
	
	public int min(int i, int j) {
		return i > j ? j : i;
	}

}
