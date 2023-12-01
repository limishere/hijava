package hijava.basic;

import java.util.Comparator;

public class Sorting implements Comparator<Student>{
	
	//Comparator 인터페이스는 int compare(T t1, T t2)를 구현해주어야 한다.

	@Override
	public int compare(Student o1, Student o2) {
		//id로 sorting 하고 싶을 때
//		return o1.getId() - o2.getId(); 
		//ascending 오름차순 정렬
		//뺀 값이 0보다 크면-> 오른쪽(양수), 0보다 작으면-> 왼쪽(음수), 같다-> 0(동일하다) 
	
		//이름으로 sorting 하고 싶을 때
		//이름은 String이라서 -연산자 사용 불가 compareTo 사용
//		return o1.getName().compareTo(o2.getName());
		
		return o1.compareTo(o2); //->가장 전형적으로 쓰는 방법
		//Student에 정의되어있는대로
		//compareTo는 Comparable인터페이스를 상속받아 사용
		
	}
	
	

}
