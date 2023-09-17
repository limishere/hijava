package hijava.practice;

public class Score {
	private String subject;
	private int score;
	
	// default 생성자 -> 작성하지 않아도 default로 만들어져있다.
	// 아무것도 작성하지 않으면 생성자 호출 시 디폴트 생성자가 호출됨
//	public Score() {
//		
//	}

	// 디폴트생성자를 직접 만들어 줌
	public Score() {
		
	}
	
	// 과목명, 점수를 받는 생성자메소드
	public Score(String subject, int score) {
//		this.subject = subject;
		this.setSubject(subject);
		this.score = score;
	}

	public Score(String subject) {
//		this.subject = subject; 둘다 가능
		this.setSubject(subject); 
	}

	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = "과목: " + subject; // setter는 그냥 세팅만 하는 것이 아니라 값을 변형시킬 수도 있다( 과목 : )
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Score [subject=" + subject + ", score=" + score + "]";
	}
	
	
	
}
