package hijava.oop;

public class MobileApp extends SoftWare{

	@Override
	public void plan() {
		System.out.println("App 기획");
	}

	@Override
	public void develop() {
		System.out.println("App 개발");
	}

	@Override
	public void release() {
		System.out.println("App 출시(오픈)");
	}
	
}
