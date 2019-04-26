package test.reader;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class TestParameterSetter implements PreparedStatementSetter {
	private String param;
	
	public void setParam(String param) {
		this.param = param;
	}

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setString(1, this.param);
	}

}
