package hijava.basic;

import java.util.ArrayList;
import java.util.List;

public class StackQueue {
	final static String[] strs = new String[] {"aaa", "bbb", "ccc"};
	
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		
		pushStack_enQueue(lst);
		System.out.println(lst);
		
//		pop(lst, 2);//2를 꺼내라고 정함
		dequeue(lst,2);
		
		System.out.println("---------------");
		System.out.println(lst);
	}

	//Queue 구현
	private static void dequeue(List<String> lst, int cnt) {
		for (int i = 0; i < cnt; i++) {
			String dequeueValue = lst.remove(0);//deQueue는 앞에서부터 빠져나가야 하니까 무조건 인덱스0으로
			System.out.println(i + "-> dequeueValue = " + dequeueValue);
		}
	}

	//Stack 구현
	private static void pop(List<String> lst, int cnt) {
		for (int i = 0; i < cnt; i++) {
			String popValue = lst.remove(lst.size() - 1);
			System.out.println(i + "-> popValue = " + popValue);
		}
	}

	//List에 strs배열에 있는 값을 추가함
	private static void pushStack_enQueue(List<String> lst) {
		for (int i = 0; i < strs.length; i++) {
			lst.add(strs[i]);
		}
		
	}

}
