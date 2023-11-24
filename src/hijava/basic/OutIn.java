package hijava.basic;

public class OutIn {
	Runnable getRun(int cnt) {
		
		int start = 0;
		
		//스레드(thread)란 프로세스(process) 내에서 실제로 작업을 수행하는 주체
		//Runnable 인터페이스를 구현하여 스레드를 생성할 수 있음
		//스레드를 통해 작업하고 싶은 내용을 run() 메소드에 작성한다.
		
		return new Runnable() { //Runnable()클래스는 반드시 run()을 구현해야 한다
			
			@Override
			public void run() {
				int sum = 0;
				for (int i = start; i <= cnt; i++) {
					sum += i;
				}
				System.out.println("sum=" + sum);
			}
		};
	}
	
	public static void main(String[] args) {
		OutIn oi = new OutIn();
		Runnable r = oi.getRun(100);
		r.run();
	}

}
