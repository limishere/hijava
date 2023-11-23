package hijava.basic;

public class Outer {
	private int id;
	private String name;
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//Inner클래스는 Outer클래스를 통해서만 접근할 수 있다!!
	public void callIn() {
		Inner inner = new Inner();
		inner.in();
	}
	
	
	//Inner 클래스
	class Inner {
		String inStr; 
//		static String inStr; -> 불가
		//inner클래스에서도 멤버변수를 가질 수 있다.
		//하지만 static은 안됨! 
		//static을 붙이면 메서드 영역에 생기는데, inner클래스는 힙 영역에 생긴 outer클래스를 빠져나올 수 없음
		
		public void in() {
			System.out.println("in inner class >> name=" + name);
		}
	}
	
	//static Inner 클래스
	static class StaticInner {
		static String inStr = "Static Inner inStr"; //static inner클래스에서는 static멤버변수를 가질 수 있다.
		public static void in() {
			System.out.println("static inner class >> name=" + inStr);
		}
	}
	
	
	public static void main(String[] args) {
		Outer o = new Outer();
		o.setName("Hong");
		System.out.println("o.name=" + o.getName());
		o.callIn();
		
//		Inner i = new Inner(); 불가!!
//		->outer가 없이 밖에서 바로 inner를 만들게 되면 오류가 남, 바로 접근할 수 없다!
//		  outer가 먼저 생성되어야 한다.
		
		StaticInner.in();//static inner클래스는 바로 접근이 가능하다
		
	}
	
	
}
