import java.util.Arrays;

public class Main {
    /*
     * https://leetcode.com/problems/two-sum/
     * Given an array of integers nums and an integer target, return indices of the two
     * numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * */
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        Arrays.stream(twoSum(nums, 9))
                .forEach(System.out::println);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for(int i = 0; i < nums.length; i ++){
            for(int j = i +1; j < nums.length; j ++){
                int a = nums[i];
                int b = nums[j];
                int intTargetResult = a + b;
                if(intTargetResult == target){
                    result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (result != null) break;
        }
        return result;
    }
}
