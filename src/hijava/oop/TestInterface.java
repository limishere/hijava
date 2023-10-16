package hijava.oop;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface TestInterface {
	
	//interface에서 정의만 해줌->TestImpl클래스에서 구현
	public ResultSet select(String sql) throws SQLException, IOException;
	
	//default
	default void print(String str) {
		System.out.println(str);
	}
	
	//static
	//static은 메모리에 하나만 존재하고 메소드영역에 생김
	//주로 유틸리티클래스에 사용
	static void out(int ii) {
		System.out.println("ii=" + ii);
	}
	
	
}
