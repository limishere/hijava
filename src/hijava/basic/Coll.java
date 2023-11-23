package hijava.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Coll {
	
	public static void main(String[] args) {
//		lists();
		sets();
//		treesets();
//		maps();
		
	}
	
	
	private static void maps() {
		Map<Integer, Student> map = new HashMap<>();
		Student s1 = new Student(100, "Hong1");
		Student s2 = new Student(200, "Hong2");
		Student s3 = new Student(300, "Hong3");
		
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		System.out.println(map);
		
		//학번으로 학생의 이름 찾기
		//없으면 NullPointerException오류가 발생하므로 if문으로 처리한다.
//		if(map.containsKey(500)) { //->500번 학생은 없으므로 출력x
//			Student s200 =  map.get(500);
//			System.out.println(s200.getName());
//		}
		
		int searchId = 300;
		if(map.containsKey(searchId)) { 
			Student s200 =  map.get(searchId);
			System.out.println(s200.getName());
			
		}else {
			System.out.println(searchId + " 학생이 없습니다!");
		}
		
	}


	private static void treesets() {
		// TreeSet은 Comparable 인터페이스를 반드시 구현해야 한다!
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student(100, "Hong")); //1
		set.add(new Student(50, "Lee"));
		set.add(new Student(200, "Kim"));
		set.add(new Student(100, "Hong")); //4
		System.out.println(set);
	}


	private static void sets() {
		Set<Student> set = new HashSet<>();
		set.add(new Student(100, "Hong")); //1
		set.add(new Student(50, "Lee"));
		set.add(new Student(200, "Kim"));
		set.add(new Student(100, "Hong")); //4
		//첫번째 Hong과 같은학생으로 간주해서 별도로 들어가지 않음(덮어쓴다, 중복안됨)
		//1번과 4번은 인스턴스는 다르지만 같은 학생으로 봄.
		System.out.println(set);
		//Student클래스에서 HashCode의 return을 id로 했기때문에,
		//학번이 작은 Lee부터 순서대로 정렬된다.
	}


	private static void lists() {
		List<String> lst1 = new ArrayList<>();
		ArrayList<String> lst2 = new ArrayList<>();
		
		lst1.add("111");
		lst1.add("222");
		lst2.add("aaa");
		
		lst1.add(1, "100");//인덱스번호로 중간에 add
		System.out.println(lst2);//[aaa]
		
		lst1.add("333");
		lst1.add("444");
		System.out.println(lst1);//[111, 100, 222, 333, 444]

		boolean ispop = lst1.remove("100");//100이 잘 지워졌는지 확인(100 잘 지웠어?)
		System.out.println("ispop=" + ispop);//ispop=true
		System.out.println(lst1);//[111, 222, 333, 444]
		
		String pop = lst1.remove(1);
		System.out.println("pop=" + pop);//pop=222
		System.out.println(lst1);//[111, 333, 444]
		
		//->remove에 인덱스값을 줬을때는 현재 지워진 값을 주고,
		//값을 줬을때는 boolean으로 삭제유무 확인
		
		boolean ispop2 = lst1.remove("100");
		System.out.println("ispop2=" + ispop2);
		//ispop2=false 이미 위에서 100은 지워졌기 때문에 못지웠다,없다 false
		
		int size = lst1.size();
		System.out.println("size=" + size);//size=3 (현재 list안에 3개가 있다)
		
		//size -> for루프 돌릴때 주로 사용h
		for(int i = 0; i < size; i++) {
			System.out.println(i + "번째=" + lst1.get(i));
			//삭제할때는 remove지만, 값만 가지고 올때는 get사용
		}
		
	}
	
	

}
