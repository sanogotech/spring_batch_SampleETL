package test.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import test.vo.PartitionSourceVO;

public class TbPartitionSourceMapper implements RowMapper<PartitionSourceVO> {

	@Override
	public PartitionSourceVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PartitionSourceVO vo = new PartitionSourceVO();
		vo.col1 = rs.getInt(1);
		vo.col2 = rs.getString(2);
		return vo;
	}

}
