package hijava.oop;

import java.util.ArrayList;

import hijava.practice.Man;

//9명의 Man(이름: 김1수 ~ 김9수)을 ArrayList에 담고,
//9명 모두 커피 1잔씩을 사먹게 한 후,
//9명의 잔액을 출력하는 코드를 작성하시오.

public class Main {

	public static void main(String[] args) {
		ArrayList<Man> people = new ArrayList<>(9); //뒤의 <>에 Man 생략 가능
		
		for(int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");

			m.buyCoffee(1);
			
			people.add(m);
		}
		
		int size = people.size();
		for(int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
		
	}

}
