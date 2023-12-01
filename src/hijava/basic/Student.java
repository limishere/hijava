package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Student implements Cloneable, Comparable<Student> {
	private int id;
	private String name;
	
	//default생성자
	public Student() {
		this.name = "Guest";
	}
	
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
	
	@Override
	public int compareTo(Student o) {
		System.out.println("comp=" + this.id + "-" + o.id);
		return (this.id - o.id) * -1; // -1을 곱해서 역순으로 sorting되게 함
	}
	
	

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
		
		Student st = new Student(921234, "홍길동");
//		Student s2 = (Student)st.clone(); //복제(Clone하려면 클래스에 implements Cloneable 해줘야한다.)
//		System.out.println(s2);
//		System.out.println(st.getClass() + ", " + st.getClass().getName() + ", " + st.getClass().getSimpleName()); 
		//인스턴스.getClass:클래스를 준다. class hijava.basic.Student
		//getName():클래스 이름을 준다. hijava.basic.Student(패키지명까지 같이줌)
		//getSimpleName():패키지명빼고 클래스이름만 줌 Student
		
		
		//reflection
		//String값만으로도 클래스와 인스턴스를 만들어 낼 수 있다.
		String inputStr = "hijava.basic.Student";
		Class cls = Class.forName(inputStr); 
		//forName():Class를 동적으로 로딩(Class Loading)
		//입력받은 String으로 클래스를 만들 수 있음
		
		Student s2 = (Student)cls.newInstance(); //newInstance는 Object타입이므로 Student로 캐스팅해야한다.
		Package pkg = cls.getPackage();
		System.out.println("pkg=" + pkg); //pkg=package hijava.basic
		
//		for (Constructor c : cls.getConstructors())
//			System.out.println("Constructor=" + c);
//		for (Field f : cls.getFields())
//			System.out.println("Field+" + f);
//		for (Method m : cls.getMethods())
//			System.out.println("method=" + m.getName());

		
		Student newStu = (Student)cls.newInstance();//Student newStu = new Student(); 와 같음
		System.out.println(newStu);
		
		Method setnameMethod = cls.getMethod("setName", String.class); //(메소드명,클래스타입)
		setnameMethod.invoke(newStu, "홍길동");
		// invoke는 함수를 실행시키는 것
		System.out.println(newStu);
		
		Method getnameMethod = cls.getMethod("getName");
		System.out.println("newStu.name=" + getnameMethod.invoke(newStu));
		
		Method setidMethod = cls.getMethod("setId", int.class);
		setidMethod.invoke(newStu, 100);
		
		
//		Student s2 = (Student)cls.newInstance(); //인스턴스 생성
		//-> newInstance는 Object타입이므로 Student로 캐스팅해야한다
		
		
		//StringBuilder 실사용 예
		boolean hasCondition = true; //검색 조건이 있으면,
		String s = "select * from Tbl";
		String searchStr = "홍길동";
		if(hasCondition) { // 검색조건이 없으면 전체를 다읽음
			s = s + "where name like '%" + searchStr + "%";
			s += " and ID > 0";
			s += " limit 10";
		} // ->효율이 좋지 않음
		
		StringBuilder sb = new StringBuilder();
		sb.append("select * from Tbl");
		// + 연산자보다 append가 더 가독성이 좋음
		if(hasCondition) { 
			sb.append("where name like '%").append(searchStr).append("%");
			sb.append(100).append('t'); //append는 숫자도 가능
		} //->이런면에서 StringBuilder를 String보다 많이 사용한다
		
		
		
//		sb.append("aaaaaaaa");
//		System.out.println("sb1=" + sb.toString()); // sb1=aaaaaaaa
//		sb.setLength(0); // char[]를 char[0]로 바꿈->char[]가 비워짐
//		System.out.println("sb2=" + sb.toString()); // sb2=
//		
//		StringBuffer sf = new StringBuffer();
//		sf.append("aaaaaaaa");
//		System.out.println("sf1=" + sf.toString()); // sf1=aaaaaaaa
//		sf.setLength(0); // char[]를 char[0]로 바꿈->char[]가 비워짐
//		System.out.println("sf2=" + sb.toString()); // sf2=
//		// StringBuilder와 StringBuffer은 실행되는 것은 똑같다
		
		
		
//		String s1 = new String("123abc");
//		String s2 = "123abc";
//		String s3 = "123abc";
//
//		System.out.println("s1==s2 :" + (s1 == s2) + ", " + s1.equals(s2)); //false, true
//		// ==은 주소를 비교하는데 s1은 인스턴스에 생기고, s2는 상수풀에 생기기 때문에 false
//		// s1.equals(s2)는 s1과 s2의 값이 같으므로 true. String을 정확하게 비교하려면 equals를 써야한다!
//		System.out.println(s3 == s2);
//		System.out.println(System.identityHashCode(s1) + ", " + System.identityHashCode(s2));
//		System.out.println(s1.hashCode() + " : " + s2.hashCode() + " : " + s3.hashCode());

		
		
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
