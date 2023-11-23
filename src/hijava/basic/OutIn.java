package hijava.basic;

public class OutIn {
	Runnable getRun(int cnt) {
		
		int start = 0;
		
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
