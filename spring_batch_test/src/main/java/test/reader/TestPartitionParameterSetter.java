package test.reader;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class TestPartitionParameterSetter implements PreparedStatementSetter {
	private int startParam;
	private int endParam;
	
	public void setStartParam(int startParam) {
		this.startParam = startParam;
	}
	
	public void setEndParam(int endParam) {
		this.endParam = endParam;
	}	

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setInt(1, this.startParam);
		ps.setInt(2, this.endParam);
	}

}
