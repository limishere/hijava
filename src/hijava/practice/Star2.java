package hijava.practice;

public class Star2 {
	
	/*아래와 같이 출력하시오.
	 * 
	 *     *
	 *    ***
	 *   *****
	 *  *******
	 * 
	 */
	
	public static void main(String[] args) {
		
		int line = 4;
		
		for(int i = 1; i <= line; i++) { // 행
			
			for(int j = 1; j <= (line - i); j++) { // 공백
				System.out.print(' ');
			}
			for(int k = 1; k <= (i * 2 - 1); k++) { // 별
				System.out.print('*');
			}
				
			System.out.println();
		}
		
	}

}
