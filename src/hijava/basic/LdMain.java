package hijava.basic;

public class LdMain {

	public static void main(String[] args) {
		//인터페이스는 실행을 못하니까, Ld 인터페이스를 implements한 구현체에서 실행이 되어야하는데
		//그 구현체가 바로 람다!
		
//		ld1();
//		ld2();
		ldCalc();
		
	}

	
	
	private static void ldCalc() {
		LdCalc add = (x, y) -> x + y;
		LdCalc sub = (x, y) -> x - y;
		LdCalc mul = (x, y) -> x * y;
		LdCalc div = (x, y) -> x / y; //y가 0이면 안된다는 제약은 설정하지 않음
		
		//람다식은 구현체와 실행이 같이 되어서 편리하다-> 가독성도 좋아지고 코드도 간결
		//실제 람다의 활용도는 stream~!
		System.out.println("add=" + add.oper(10, 20));
		System.out.println("sub=" + sub.oper(10, 20));
		System.out.println("mul=" + mul.oper(10, 20));
		System.out.println("div=" + div.oper(10, 20));
		
	}



	private static void ld2() {
		//아래처럼 구현체를 몇개든지 계속 만들어 나갈 수 있다.
		LdStudent ls1 = (i, s) -> new Student(i, s);
		LdStudent ls2 = (i, s) -> new Student(i * 1000, s + "님");
		
		stufn(ls1, 100, "Hong");
		stufn(ls2, 200, "Kim");
	}

	//위의 ls1과 ls2는 구현체가 다르지만 부르는 함수를 하나로 통일함
	private static void stufn(LdStudent ls, int id, String name) {
		Student stu = ls.makeStudent(id, name);
		System.out.println(stu);
	}



	private static void ld1() {
		Ld ld = (x, y) -> x * y; //구현체=>람다식(아래 3줄을 람다식으로 표현)
//		public int fn(int x, int y) {
//			return x * y;
//		}
		
		int result = ld.mul(10, 20);
		System.out.println("result=" + result);
	}

}
