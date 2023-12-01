package hijava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamMain {
	public static void main(String[] args) {
//		test1();
//		test2();
		tryThis();
		
	}
	
	private static void tryThis() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(90, "홍길동"));
		students.add(new Student(80, "김일수"));
		students.add(new Student(75, "김이수"));
		students.add(new Student(95, "김삼수"));
		
		//1.학생들의 이름을 출력하시오.
		students.forEach(s -> System.out.println("1=" + s.getName()));
		//-> list는 forEach를 바로 사용할 수 있다!
		
		
		//2.학번의 총점과 평균을 구하시오.(sum, average)
		Student[] arr = new Student[students.size()];
		students.toArray(arr); 
		//toArray(): List를 Array로 형변환
		//stream()에는 배열이 들어가야해서, list를 toArray를 사용해 강제로 형변환 해줌!
		
		//->stream을 사용해야 sum메서드를 부를 수 있다
		int sum = Arrays.stream(arr).mapToInt(s -> s.getId()).sum(); 
		double avg = Arrays.stream(arr).mapToInt(s -> s.getId()).average().getAsDouble();
		System.out.println("sum=" + sum + ", avg=" + avg);
		
		
		//3.학생 중 학번이 90번 이상인 학생의 이름을 정렬하여 출력하시오.
		//-> stream()을 만들어야 람다를 사용할 수 있다~!
		Arrays.stream(arr).filter(s -> s.getId() >= 90).sorted().forEach(s -> System.out.println(s));
		
	}	
	

	private static void test2() {
		int[] arr = new int[] { 2, 3, 1, 5, 3, 2 };
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("avg=" + avg);//avg=2.6666666666666665
		
		//forEach():하나씩달라
		Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort=" + n));
		
		//distinct():중복을 없애고 달라
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n));
		
		//sorted().distinct() 정렬시켜 중복없이 달라
		Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sort.distinct=" + n));
		
		//filter():true만 취한다
		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n));
		
		System.out.println("-------------------");
		//reduce(초기값, (이전결과, 현재값))
		//:2개씩 비교, 스트림의 원소들을 하나씩 소모해가며, 누적 계산을 수행하고 결과값을 리턴하는 메서드다.
		// p + n의 결과가 다시 p로 들어감 
		System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n)); //->결과값이 1개라 forEach 사용 불가
		
		
	}

	
	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(20, "Lim20"));
		students.add(new Student(5, "Lee5"));
		
		students.stream().map(s -> s.getName()).forEach(n -> System.out.println("s=" + n));
		
		students.stream().mapToInt(s -> s.getId()).sum();
		//mapToInt int로 캐스팅해야 sum()함수를 사용할 수 있다
		
		
		System.out.println(students); //[Hong100(100), Hong20(20), Hong5(5)]
		System.out.println("--------------------------------------");
		Collections.sort(students, new Sorting());//인스턴스 자체를 sorting하고 싶을 때
		System.out.println(students);
	}	
	
	
}
