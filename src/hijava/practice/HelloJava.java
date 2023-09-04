package hijava.practice;

/**
 * (클래스 주석 - 공식적인 코멘트 작성 시 사용)
 * 첫번째 자바 실습
 * @author Lim
 * @update say함수 추가 (2023-08-29 by KKK)
 */

public class HelloJava {
	String message = "Hello World";

	public static void main(String[] args) { // main함수는 JVM이 실행시키는 함수(JVM이 실행될 때 main함수 실행됨)
		
//		HelloJava에게 say라는 명령을 내림
		HelloJava.say("Hi~"); 
		
//		JVM이 스스로 화면에 출력
		System.out.println("Hello Java!!");
	}
	
	/* >여러줄 주석
	 * 
	 * ctrl + shift + l : 단축키 보기
	 * ctrl + f11 : 실행 단축키
	 * ctrl + d : 한 줄 삭제
	 * ctrl + / : comment 주석
	 * ctrl + shift + f : 코드 정리하기
	 * shift+enter : 어디에 커서가 있든지 다음줄로 가고 싶을 때
	 * 
	 * */
	
	public static void say(String msg) {
		System.out.println(msg);
	}

}
