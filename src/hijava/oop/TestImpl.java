package hijava.oop;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestImpl implements TestInterface {

	
	@Override
	public ResultSet select(String sql) throws SQLException, IOException { //메소드 형태를 지켜서 구현해야 한다
		
		//TestInterface에 존재하는 default함수
		print(sql);
		
		return null;
	}
	
}
