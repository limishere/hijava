package hijava.oop;

public class Mom {
	 private String name;
	
	//생성자
	public Mom(String name) {
		this.name = name;
	}
	
	public Mom() {
		this("엄마");
//		this.name = "엄마";
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	
	public void eat() {
		System.out.println("EAT !!");
	}
	
//	protected void say() {
//		System.out.println("Mom said ...");
//	}
	
	public void say() {
		System.out.println("Mom said ...");
	}
	
}
