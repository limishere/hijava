package hijava.oop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {
		
//		netsport();
//		animal();
//		weight();
		
//		AbstSuper sp = new AbstSuper(); ->오류 왜? 추상클래스는 인스턴스화 할 수 없다. 자식클래스로 만들어야함
//		AbstSuper sp = new AbstChild(); //AbstChild클래스는 추상클래스가 아님. 생성가능
//		int i = 5;
//		int j = 10;
//		
//		System.out.println( "min=" + sp.min(i, j) + ", max=" + sp.max(i, j) );

		
//		al();
//		momAndSon();
//		koreanAndAmerican();
//		drinkTest();
//		eatTest();
		
		
//		Mom mom = new Mom();
//		Mom son = new Son();
//		
//		System.out.println(mom instanceof Mom); //true
//		System.out.println(son instanceof Mom); //true
//		System.out.println(mom instanceof Son); //false
//		System.out.println(son instanceof Son); //true
		
		
//		software();
		
//		calulator();
//		testinterface();
//		total();
		calcoper();
		
//		scanner();
//		scanner2();
		
		
		
	}
	
	
	private static void scanner2() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) { //무한루프 돌릴 때는 while(true)
			String ret = inputScan(scanner, "계산하시겠어요?(계산:Enter, 종료:quit)");
			
			if("quit".equalsIgnoreCase(ret)) { //대문자도 비교해줌
				break;
			}
			
			int x = inputScanNumber(scanner, "첫번째 숫자(x)를 입력하세요>>");
			int y = inputScanNumber(scanner, "두번째 숫자(y)를 입력하세요>>");
			
			scanner.nextLine(); // 개행문자 제거
			
//			System.out.print("연산자(* 또는 /)를 입력하세요>>");
			String op = inputScan(scanner, "연산자(* 또는 /)를 입력하세요>>");
			
			CalcOper co = new CalcOper();
			
			System.out.print(x + " " + op + " " + y + " = ");
			
			if("*".equals(op)) { //String비교를 할때는 ==가 아닌 equals를 사용한다!
				co.mul(x, y);
				
			}else if("/".equals(op)) {
				co.div(x, y);
				
			}else {
				System.out.println("연산자를 다시 입력하세요!");
			}
			
		}
		
		scanner.close();
		
	}
	
	//숫자받기
	private static int inputScanNumber(Scanner scanner, String msg) {
		System.out.print(msg);
		return scanner.nextInt();
	}
	//연산자받기
	private static String inputScan(Scanner scanner, String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}


	private static void scanner() {
		System.out.print("문자열을 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		System.out.println("msg= " + msg);
		
		System.out.print("숫자를 입력하세요>> ");
		double inputNum = scanner.nextDouble();
		System.out.println("Input Number is " + inputNum);
		
		scanner.close();
	}


	private static void calcoper() {
		int x = 10, y = 5;
		
		CalcOper op = new CalcOper();
		int a = op.add(x, y);
		int s = op.sub(x, y);
		System.out.println(a + ", " + s);
		
		op.mul(x, y);
		op.div(x, y); 
	}


	private static void total() {
		int[] arr = new int[] {1, 2, 5, 9};
//		SubTotal st = new SubTotal();
		Total ti = new TotalImpl();
		System.out.println("Total = " + ti.sum(arr));
	}


	private static void testinterface() throws SQLException, IOException {
		TestInterface ti = new TestImpl();
		
		ti.select("select * from Table");
		
//		ti.out(100); ->에러
		TestInterface.out(100);
		//직접 불러야한다(클래스이름을 바로 부른다)
		//static메소드는 heap영역이 아닌 정의부분(method area)에 생기기 때문에,
		//바로 클래스이름을 쓰고 불러야 한다.
		
		Dog.eat("Meat"); //eat메소드는 static이라서 new하지 않아도 바로 부를 수 있다.
//		Dog.bark(); ->에러. bark()는 heap영역에 존재하기 때문에 바로 부를 수 없다.
	}


	private static void calulator() {
		Calculator calc = new CalculatorImpl(); 
		//인터페이스는 new 불가! (객체를 생성할 수 없다)
		//추상클래스와 마찬가지로 정의만 있고 실행부분이 없기 때문에
		//new Calculator(); 하면 에러가 나게 된다.
		
		int x = 10;
		int y = 5;
		calc.add(x, y);
		calc.div(x, y);
		calc.div(x, 0);
	}


	private static void software() {
		
		SoftWare site = new WebSite();
		SoftWare app = new MobileApp();
		
		site.product();
		app.product();
	}


	private static void netsport() {
		
		NetSport pp = new PingPong();
		NetSport te = new Tennis();
		
		pp.play();
		System.out.println("-----------");
		te.play();
	}


	private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}

	private static void barkAnimal(Animal ani) {
		ani.bark();
	}


	private static void weight() {
		Weight guen = new Guen();
		Weight pound = new Pound();
		
		int cnt = 5; // 개수 = 5
		System.out.println("Guen=" + guen.getGram(cnt) + "g");
		System.out.println("Pound=" + pound.getGram(cnt) + "g");
	}


	private static void eatTest() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
		eat(korean);
//		eat(american);
	}

	private static void eat(Man m) {
		if(m instanceof Korean) {
			((Korean)m).eatRice();
			
		}else if(m instanceof American) {
			((American)m).eatBreand();
			
		}else {
			System.out.println("인스턴스가 존재하지 않습니다!");
		}
	}


	private static void drinkTest() {
		Mom mom = new Mom();
		Mom son = new Son();
		
		drink(mom);
		drink(son);
		
	}
	
	private static void drink(Mom m) {
		if (m instanceof Son) {
//			Son s = (Son)m;
//			s.drinkMilk();
			((Son)m).drinkMilk();
			
		} else {
			m.drinkBeer();
		}
	}


	//Man 클래스를 상속한 우리나라 사람(Korean)과 미국사람(American)을 정의하고,
	//각각의 인사말(sayHello) 함수를 정의하시오.
	private static void koreanAndAmerican() {
//		Korean korean = new Korean("홍길동");
//		American american = new American("John");
		
		// 다형성
//		Man korean = new Korean("홍길동");
//		Man american = new American("John");
//		
//		korean.sayHello();
//		american.sayHello();
		
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
		sayHi(korean);
		sayHi(american);
		
	}
		
	private static void sayHi(Man man) {
		man.sayHello();
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
