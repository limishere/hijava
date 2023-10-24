package hijava.oop;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	public static void eat(String food) {
		System.out.println("Dog eats " + food);
	}
	
	//toString 오버라이드
	//오른쪽마우스>source>generate toString으로도 작성가능(기본적인걸 만들어줌)
	@Override
	public String toString() {
		return "This is dog";
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d); 
		//d자리는 String이 오는 자리기 때문에 자동으로 toString을 부름
		
		String s = "Test : " + d;
		System.out.println(s);
		//에러안남. d는 String이므로 String타입과 연산 시 문제없음
	}
	
}
