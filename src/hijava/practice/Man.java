package hijava.practice;
/*
 * Man class의 instance인 hong과 john이 각각 10,000원이 있었다.
 * hong은 coffee(3,000원) 1잔과 도넛(2,500원) 2개를, john은 coffee(3,000원) 2잔과 도넛 1개를 사먹었다고 했을때,
 * hong과 john의 남은 돈은 각각 얼마인지 출력하시오. 
 * 
 * 멤버 변수 - name(이름), amount(잔액)
 * 멤버 함수 
 * - Man() : 생성자 함수 -> 초기 잔액을 10,000원으로 Set!! 
 * - buyCoffee(int count), buyDonut(int count)
 * */
public class Man {
	
	public static final int COFFEE = 3000; // 커피값 고정 & 1개만 존재
	public final static int DONUT = 2500; // 도넛값 고정 & 1개만 존재
	
	private String name;
	private int amount;

	// 생성자함수로 초기잔액 set -> Man을 생성할 때 무조건 10000원이 세팅되게 함
	public Man() {
		this.amount = 10000;
	}
	
	public Man(String name) {
//		this.amount = 10000; 위의 생성자함수와 중복됨.오류발생가능성 큼
		this(); // -> 생성자함수를 부르는 방법(this.amount = 10000;을 대체함)
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("안녕하세요");
		System.out.println("제 이름은 " + this.getName() + "입니다.");
	}
	
	public void buyCoffee(int count) {
//		this.amount = this.amount - 3000 * count;
//		this.amount -= COFFEE * count;
		this.subAmount(COFFEE, count);
	}
	
	public void buyDonut(int count) {
//		this.amount -= DONUT * count;
		this.subAmount(DONUT, count);
	}
	
	// 가격*수량에 대한 계산을 따로 작성, 리팩토링 -> 유지보수 용이
	// private로 해서 가격변경이 되지 않도록 함
	private void subAmount(int price, int count) {
		this.amount -= price * count;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String toString() {
		return this.name + "님의 잔액은 " + this.amount + "원 입니다.";
	}
	
	
	public static void main(String[] args) {
		Man hong = new Man("Hong");
		Man john = new Man("John");
		
		hong.buyCoffee(1);
		hong.buyDonut(2);
		
		john.buyCoffee(2);
		john.buyDonut(1);
		
		System.out.println(hong);
		System.out.println(john);
	}

}
