package hijava.practice;

// ex1) 숫자 1 ~ 100을 배열에 담는 코드를 작성하시오.
// ex2) str1 ~ str100을 배열에 담는 코드를 작성하시오.
// ex3) Man 9명을 배열로 표현 해 보시오. (이름: 김1수 ~ 김9수)

public class Arr {

	public static void main(String[] args) {
//		ex1();
//		ex2(); // ex2(); 작성 후 ctrl+1 -> create method
		ex3();
	}

	private static void ex3() {
		Man[] people = new Man[9];
		
		int len = people.length;
		
		for(int i = 0; i < len; i++) {
//			Man m = new Man("김" + (i + 1) + "수"); // 레퍼런스 타입의 오브젝트를 넣을 때에는 새로 만들어야 함
//			people[i] = m;
			people[i] = new Man("김" + (i + 1) + "수"); 
			// -> m을 따로 쓸곳이 없으므로 Man 인스턴스를 생성해서 바로 집어넣는 것으로 변경함.
		}
		
		// for each 문
		for(Man man : people) {
			System.out.println(man);
		}
		
	}

	private static void ex2() {
		String[] strs = new String[100];
		
		int len = strs.length;
		for(int i = 0; i < len; i++) {
			strs[i] = "str" + (i + 1);
		}
		
		printArray(strs);
		
	}

	private static void ex1() {
		int[] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		printArray(nums);
	}

	
	// 값을 출력만 해주는 메소드 생성
	private static void printArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	private static void printArray(String[] strs) {
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	
	

}
