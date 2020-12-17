import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] numbs = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbs, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbs, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            int data = target - numbs[i];
            if (map.containsKey(data) && map.get(data) != i) {
                return new int[]{map.get(data), i};
            }
            map.put(numbs[i], i);
        }
        return null;
    }
}
