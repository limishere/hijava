package hijava.oop;

public abstract class SoftWare {
	
	public abstract void plan();
	public abstract void develop();
	public abstract void release();
	
	void product() { //public을 주로 생략
		plan();
		develop();
		release();
	}
	
}
