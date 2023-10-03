package hijava.oop;

import hijava.practice.Man;

public class American extends Man{
	
	public American(String name) {
		this.setName(name);
	}

	// Man클래스의 sayHello()를 재정의
	public void sayHello() {
		System.out.println("Hello,");
		System.out.println("My name is " + this.getName() + ".");
	}

	public void eatBreand() {
		System.out.println("Eating Bread.");
	}
}
