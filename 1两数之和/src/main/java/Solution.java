/**
 * @Auther: chenjiaheng
 * @Date: 2024/1/6 18:15
 * @Description: 1两数之和
 */
public class Solution {


    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 1, 1, 5, 5};
        int[] twoSum = twoSum(nums1, 3);
        for (int i = 0; i < twoSum.length; i++) {
            System.out.println(String.valueOf(twoSum[i]));
        }
    }


    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     */
    public static int[] twoSum(int[] num1, int target) {
        //输入 数组和目标值
        //输出两数的下标

        int[] resultArray = new int[2];

        if (num1 == null || num1.length <= 2) {
            throw new RuntimeException("nums is empty");
        }

        for (int i = 0; i < num1.length - 1; i++) {
            for (int j = i + 1; j < num1.length; j++) {
                int result = num1[i] + num1[j];
                if (target == result) {
                    resultArray = new int[]{i, j};
                    return resultArray;
                }
            }
        }

        return resultArray;
    }
}
