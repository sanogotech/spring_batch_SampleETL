package test.reader;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;


public class DayOfWeekPartitioner implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
 		if(gridSize >= 7) {
			gridSize = 7;
		}
 		int [] slots = calcSlotSize(gridSize);
 		int startIdx = 1;
 		Map<String, ExecutionContext> partitionMap = new HashMap<String, ExecutionContext>();
 		for(int i = 0; i < slots.length; i++) {
 			ExecutionContext context = new ExecutionContext();
 			context.put("StartDay", startIdx);
 			context.put("EndDay", startIdx + slots[i] - 1);
 			partitionMap.put("Partition-" + i, context);
 			startIdx += slots[i];
 		}
		return partitionMap;
	}
	
	private int [] calcSlotSize(int gridSize) {
		int [] slots = new int[gridSize];
		int totalSlot = 7;
		for(int i = 0; i < slots.length; i++) {
			slots[i] = 0;
		}
		int idx = 0;
		while(true) {
			if(totalSlot == 0) break;
			slots[idx % slots.length]++;
			idx++;
			totalSlot--;
		}
		return slots;
	}
	
}
