package test.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import test.vo.SourceVO;

public class TbSourceMapper implements RowMapper<SourceVO> {

	@Override
	public SourceVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		SourceVO vo = new SourceVO();
		vo.col1 = rs.getString(1);
		vo.col2 = rs.getString(2);
		vo.col3 = rs.getString(3);
		return vo;
	}

}
