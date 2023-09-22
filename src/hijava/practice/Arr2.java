package hijava.practice;

//알파벳 대문자와 소문자를 2줄로, 2차원 배열을 이용하여 출력하시오.(2행 26열)
// A B C D ...
// a b c d ...

public class Arr2 {

	public static void main(String[] args) {
		
		int upperRow = 65;
		int lowerRow = 97;
		
		int[] rows = new int[] {upperRow, lowerRow};
		char[][] arr = new char[2][26];
		
		for(int row = 0; row < rows.length; row++) {
			for(int i = 0; i < 26; i++) {
				int num = rows[row] + i;
				arr[row][i] = (char)num;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
