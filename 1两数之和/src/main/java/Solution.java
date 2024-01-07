import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: chenjiaheng
 * @Date: 2024/1/6 18:15
 * @Description: 1两数之和
 */
public class Solution {


    public static void main(String[] args) {
        int[] nums1 = {3, 2, 4, 1, 1, 5, 5};
        int[] twoSum = twoSum(nums1, 10);
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

        if (num1 == null || num1.length <= 2) {
            throw new RuntimeException("nums is empty");
        }

        /**
         * 20240106  暴力解法
         * 找target - x 的过程
         * 时间复杂度为o(n2)
         * 空间复杂度 o(1)
            for (int i = 0; i < num1.length; i++) {
                for (int j = i + 1; j < num1.length; j++) {
                    if (num1[i] + num1[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
         */


        /**
         * 使用hash解法
         * 时间复杂度 o(n)
         * 空间复杂度 o(1)
         * 但是有个问题，key 会将值一样的覆盖掉
         * 如果这个换成 第一次出现的i
         */
        //使用哈希
        Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();

        //key  value
        //key 不能重复，如果重复那数组中两个相同的，后一个会被前一个覆盖掉，但是没关系,如果不存在则就往哈希中插入数据
        //目的：从key
        for (int i = 0; i < num1.length; i++) {
            if (hashTable.containsKey(target - num1[i])) {
                return new int[]{hashTable.get(target - num1[i]), i};
            }
            hashTable.put(num1[i], i);
        }
        return new int[0];
    }
}
