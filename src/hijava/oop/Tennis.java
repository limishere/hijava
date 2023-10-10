package hijava.oop;

public class Tennis extends NetSport{
	
	@Override
	public void serve() {
		System.out.println("Service!");
	}

	@Override
	public void hit() {
		System.out.println("Stroke");
	}

	@Override
	public void score() {
		System.out.println("15");
	}
	
}
