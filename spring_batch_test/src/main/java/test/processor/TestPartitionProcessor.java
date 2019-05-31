package test.processor;

import org.springframework.batch.item.ItemProcessor;
import test.vo.PartitionSourceVO;
import test.vo.PartitionTargetVO;

public class TestPartitionProcessor implements ItemProcessor<PartitionSourceVO, PartitionTargetVO> {

	@Override
	public PartitionTargetVO process(PartitionSourceVO item) throws Exception {
		PartitionTargetVO targetVO = new PartitionTargetVO();
		targetVO.new_col1 = item.col1;
		targetVO.new_col2 = item.col2;
		return targetVO;
	}

}
