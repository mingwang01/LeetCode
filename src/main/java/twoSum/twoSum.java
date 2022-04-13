package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 俩数之和
 * @author zhouxm
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();
        int numLength = nums.length;
        for (int i = 0; i < numLength; i++) {
            if (i == 0){
                map.put(nums[i],i);
            }else {
                if (map.containsKey(target-nums[i])){
                    return new int[]{i, Integer.valueOf(map.get(target - nums[i]).toString()).intValue()};
                }
                else {
                    map.put(nums[i],i);
                }
            }
        }
        return null;
    }
}
