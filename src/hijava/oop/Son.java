package hijava.oop;

public class Son extends Mom { // extends로 상속
	
	//생성자
	public Son() {
//		this("아들"); ->오류. 아들이라는 이름을 받는 생성자가 없음,부모의 생성자에만 존재
		super("아들");// super()로 부모의 생성자를 호출
	}
	
	public Son(String name) { //생성자는 상속이 안되므로 직접 만들어준다.
		super(name);
	}
	
	
	public void say() { // Mom클래스의 say메소드를 오버라이딩 함(가져와서 재정의)
		System.out.println("Son said ...");
	}
	
	public void ttt() {
		System.out.println("Son에만 있는 메소드!");
	}
}
