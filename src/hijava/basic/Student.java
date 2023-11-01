package hijava.basic;

import java.util.Objects;

public class Student implements Cloneable {
	private int id;
	private String name;
	
	//생성자
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}


	//멤버변수가 private이라 바로 접근 못하기때문에 getter,setter를 만들어준다.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return name + "(" + id + ")";
	}
	
	//학생(Student) 클래스를 복제(clone) 가능하게 clone() method를 override하시오.
	//(단, 복제시 학생명에 '복제본'이란 스트링 추가할 것)
	@Override
	public Object clone() throws CloneNotSupportedException{
		Student clobj = (Student)super.clone();
		clobj.name = clobj.name + "복제본";
		return clobj; //클래스를 복제하는 것이 아니라 인스턴스를 복제하는 것이다!
	}
	
	
	//오른쪽마우스>source>generate hashCode and equals
	//학생(Student) 클래스에 학번을 반환(return)하는 hashCode() method를 override하시오.
	@Override
	public int hashCode() {
		return this.id;
	}

	// s1.equals(s2)
	@Override
	public boolean equals(Object obj) {
		// ==는 같은 메모리주소인지 비교
		// 동일한 메모리 주소면 true
		if (this == obj) 
			return true;
		
		// this는 절대 null이 될 수 없으므로 obj가 null이면 false
		if (obj == null)
			return false;
		
		// 동일한 class타입이 아니면 false
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student st = new Student(921234, "홍길동");
		Student s2 = (Student)st.clone(); //복제(Clone하려면 클래스에 implements Cloneable 해줘야한다.)
		System.out.println(s2);
		
//		System.out.println(st);
//		String stt = new String("홍길동");
//		
//		//String.hashCode()  vs  Integer.hashCode()
//		Integer obj = new Integer(st.id); //Integer로 싸야 hashCode를 부를 수 있음. 클래스에만 있으니까
//		Integer obj2 = new Integer(921234); 
//		
//		System.out.println(st.name.hashCode() + "::" + stt.hashCode()); //54150062::54150062
//		System.out.println(obj.hashCode() + "::" + obj2.hashCode()); //921234::921234
//		//-> String과 Integer의 hashCode는 값이 같으면 메모리주소가 같기때문에 같은 값을 반환한다.
		
//		System.out.println(System.identityHashCode(obj2)); //실제 obj2의 메모리주소 604107971
//		
		
//		Student s1 = new Student(123, "Hong");
//		Student s2 = new Student(456, "Kim");
//		Student s3 = new Student(123, "Hong");
//		System.out.println("s1 equals s2 =" + s2.equals(s1)); // false
//		System.out.println("s1 equals s3 =" + s3.equals(s1)); // true
//		// s1,s2,s3는 모두 다른 메모리영역(다른 인스턴스)
//		// s1과 s3은 메모리주소는 다르지만 같은 학생이다. equals로 비교 가능

	}
	
	
}
