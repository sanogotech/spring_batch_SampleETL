package test.processor;

import org.springframework.batch.item.ItemProcessor;
import test.vo.SourceVO;
import test.vo.TargetVO;

public class TestProcessor implements ItemProcessor<SourceVO, TargetVO> {

	@Override
	public TargetVO process(SourceVO item) throws Exception {
		TargetVO targetVO = new TargetVO();
		targetVO.new_col1 = item.col1;
		targetVO.new_col2 = item.col2;
		targetVO.new_col3 = item.col3;
		return targetVO;
	}

}
