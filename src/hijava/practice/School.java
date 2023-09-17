package hijava.practice;

public class School {

	public static void main(String[] args) {
		// 클래스 생성, 생성자 호출 -> 클래스이름 변수명 = new 클래스이름();
		Score korean = new Score(); 
//		-> 오류. 생성자가 전혀 없을때만 디폴트생성자가 만들어지는데, 과목,점수를 받는 생성자를 만들어서 디폴트생성자 만들어지지 않음
//		Score 클래스에 디폴트생성자를 직접 만들어줘서 해결
		korean.setSubject("국어");
		korean.setScore(90);
		
		Score math = new Score("수학",80);
		
		Score science = new Score("과학"); 
		
		
//		String k = korean; -> 오류 왜? korean의 타입은 Score라서 String타입에 담길 수 없음(casting도 안됨)
//		String k = korean.toString(); // -> .toString()을 사용하자
		System.out.println(korean);//korea.toString()으로 작성하지 않아도 println함수가 자동으로 해줌
		System.out.println(math);
		System.out.println(science);
	}

}
