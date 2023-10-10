package hijava.oop;

public abstract class NetSport {
	
	public abstract void serve();
	public abstract void hit();
	public abstract void score();
	
	// Template method 템플릿 메소드
	public final void play() { //final을 썼기때문에 오버라이딩 못함
		serve();
		hit();
		score();
	}
	
}
