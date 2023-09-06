package hijava.practice;

public class Oper {

	public static void main(String[] args) {
		int i = 0;
		i += 1; // = (i = i + 1)  =  i++
		i *= 10; // = (i = i * 10)
		
		System.out.println(i);
		
		int k = (i > 0) ? 100 : 1000;
//		int k = !(i > 0) ? 100 : 1000;
		System.out.println("k=" + k);
		
		i++; // i = i + 1
//		i--; // i = i - 1
		int j = i++; 
		System.out.println(j); // i가 j에 대입된 후 증가됨. 따라서 j=1
		
//		System.out.println(++i);
		System.out.println(i++);
	}

}
