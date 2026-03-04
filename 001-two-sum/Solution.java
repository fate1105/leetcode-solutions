import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i =0; i < nums.length; i++){
            int sub = target - nums[i];
            if (maps.containsKey(sub)) {
                return new int[]{
                    maps.get(sub), i
                };
            }
            maps.put(nums[i], i);
        }
        return new int[]{};
    }
}