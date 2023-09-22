package hijava.practice;

// ex1) 숫자 1 ~ 100을 배열에 담는 코드를 작성하시오.
// ex2) str1 ~ str100을 배열에 담는 코드를 작성하시오.
// ex3) Man 9명을 배열로 표현 해 보시오. (이름: 김1수 ~ 김9수)

public class Arr {

	public static void main(String[] args) {
//		ex1();
//		ex2(); // ex2(); 작성 후 ctrl+1 -> create method
//		ex3();
//		ex4(); // 배열 단순복사
//		ex5();
		ex6();
	}

	// 알파벳 대문자와 소문자를 2줄로, 2차원 배열을 이용하여 출력하시오.(2행 26열)
	// A B C D ...
	// a b c d ...
	private static void ex6() {
		int upperStart = 65; //대문자A 아스키코드
		int lowerStart = 97; //소문자a 아스키코드
		
		int[] starts = new int[] { upperStart, lowerStart };
		char[][] arr = new char[2][26];
		
		for(int start = 0; start < starts.length; start++) {
			for(int i = 0; i < 26; i++) {
				int x = starts[start] + i;
				arr[start][i] = (char)x;
			}
		}
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); //개행안함
			}
			System.out.println(); //대문자 돌고 개행
		}
		
	}

	
	// System.arraycopy(from, startIndex, to, startIndex, count)
	private static void ex5() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[]arr2 = { 1, 2, 3, 4, 5 };
		System.arraycopy(arr1, 0, arr2, 2, 3);
		
		for(int i : arr2) {
			System.out.println(i);
		}
	}

	private static void ex4() {
		Man[] people = new Man[9];
		
		int len = people.length;
		
		for(int i = 0; i < len; i++) {
			people[i] = new Man("김" + (i + 1) + "수"); 
		}
		
		//people배열을 people2배열에 복사
		Man[] people2 = new Man[len];
		
		for(int i = 0; i < len ; i++) {
//			people2[i] = people[i]; // shallow copy(얕은복사)/값이 전달된게 아니고 주소가 전달됨(call by reference)
			people2[i] = new Man(people[i].getName()); // deep copy(깊은복사,clone) 메모리 새로 생성
		}
		
		people[0].setName("김111111"); 
		// people의 값을 바꿨는데 아래에서 people2를 출력하면 값이 바뀐다
		// -> 왜? people2는 주소를 참조하고 있기 때문에
		
		System.out.println("people[0]=" + people[0].getName());
		System.out.println("people2[0]=" + people2[0].getName());
		
//		for(Man man : people2) {
//			System.out.println(man);
//		}
		
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
