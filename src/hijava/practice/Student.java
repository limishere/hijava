package hijava.practice;

/*
 * 아래 명세와 같은 학생 클래스를 작성하고, 
 * 3명의 학생(김일수, 김이수, 김삼수) instance를 생성하고,
 * 각 학생의 신상정보를 출력하는 코드를 작성하시오.
 * 
 * 멤버 변수 - 학번, 성명, 나이, 전화번호
 * 멤버 함수 
 * - 이름을 입력받는 생성자 함수 
 * - 각 멤버 변수의 getter, setter와 toString() 함수
 *   (단, 전화번호 getter에서는 끝번호 4자리를 마스킹(*) 할 것)
 * */

public class Student {
	
	public static void main(String[] args) {
		
	       Student s1 = new Student("김일수");
	       
			s1.setTelNo("010-9999-8888");
			
			System.out.println(s1.getTelNo());
	}
	
	// 멤버변수
	private String studentNo;
	private String name;
	private int age;
	private String telNo;

	// 멤버함수

	// 생성자 함수 만들기
	// 생성자 함수명은 클래스이름과 동일하다.
	public Student() { // -> default 생성자

	}

	// 이름을 입력받는 생성자 함수
	// 생성자이면서 setter를 동시에 하겠다는 의미(setter메소드까지 같이 구현하겠다)
	public Student(String name) {
		this.setName(name); // 앞의 name은 멤버변수, 뒤의 name은 입력 받은 것
	}

	// getter & setter : 오른쪽마우스-> Source-> generate getters and setters
	// getter
	public String getStudentNo() {
		return this.studentNo;
	}

	// setter
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 010-9999-8888 -> 010-9999-****
	public String getTelNo() {
		if(this.telNo == null || telNo.length() < 4) { // null체크(null에다 subString을 하면 에러나기 때문에 미리체크)
			return telNo;
		} else {
			return telNo.substring(0, telNo.length() - 4) + "****";
			// substring(시작인덱스, 작성한 인덱스 전까지)
		}
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	// toString : 오른쪽마우스-> Source-> generate toString
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", telNo=" + telNo + "]";
	}
	
	
}
