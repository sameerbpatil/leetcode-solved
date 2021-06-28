package easy_problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			int x = target - curr;
			if(map.containsKey(x)) {
				return new int[] {map.get(x), i};
			}
			map.put(curr, i);
		}

		return null;
	}

	public static void main(String[] args) {

		int nums[] = { 2, 7, 11, 15 };
		int target = 9;

		TwoSum obj = new TwoSum();
		obj.twoSum(nums, target);
	}

}
