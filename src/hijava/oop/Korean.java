package hijava.oop;

import hijava.practice.Man;

public class Korean extends Man{

	public Korean(String name) {
//		this.name = name; -> this.name은 접근 못함
		this.setName(name);
	}

}
