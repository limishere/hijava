package hijava.practice;

public class Star1 {

	//아래와 같이 출력하시오.
	/*  *              
	    **             
	    ***				
	    ****         
	    *****        
	    ******       
	    *******  */
	
//	public static void main(String[] args) {
//		
//		int line = 7; // 라인을 변수화 -> 변할 수 있는 값이므로
//		
//		for(int i = 1; i <= line; i++) {
//	
//			for(int j = 1; j <= i; j++) {
//				System.out.print('*');
//			}
//	
//			System.out.println();
//		}
//
//	}
	
	//아래와 같이 출력하시오.
		/*       *              
		        **             
		       ***				
		      ****         
		     *****        
		    ******       
		   *******  */
	
	public static void main(String[] args) {
		
		int line = 7;
		
		for(int i = 1; i <= line; i++) {
			
			for(int j = 1; j <= (line - i); j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			
			System.out.println();
		}
	}

}
