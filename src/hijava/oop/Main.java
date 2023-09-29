package hijava.oop;

import java.util.ArrayList;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) {
//		al();
		
//		momAndSon();
	
		koreanAndAmerican();
	}
	
	
	//Man 클래스를 상속한 우리나라 사람(Korean)과 미국사람(American)을 정의하고,
	//각각의 인사말(sayHello) 함수를 정의하시오.
	private static void koreanAndAmerican() {
//		Korean korean = new Korean("홍길동");
//		American american = new American("John");
		
		// 다형성
		Man korean = new Korean("홍길동");
		Man american = new American("John");
		
		korean.sayHello();
		american.sayHello();
	}


	// 상속
	private static void momAndSon() {
		Mom mom = new Mom(); // Mom 객체(인스턴스) 생성
		Son son = new Son();
		
		mom.eat();
		son.eat(); //-> 에러안남! Son은 Mom을 상속했기 때문에 모두 사용가능
		
		mom.say();
		son.say();
	}

	
	// ArrayList
	//9명의 Man(이름: 김1수 ~ 김9수)을 ArrayList에 담고,
	//9명 모두 커피 1잔씩을 사먹게 한 후,
	//9명의 잔액을 출력하는 코드를 작성하시오.
	private static void al() {
		ArrayList<Man> people = new ArrayList<>(9); //뒤의 <>에 Man 생략 가능
		
		for(int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");

			m.buyCoffee(1);
			
			people.add(m);
		}
		
		int size = people.size();
		for(int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}

	
}
