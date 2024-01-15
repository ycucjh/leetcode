/**
 * @Auther: chenjiaheng
 * @Date: 2024/1/13 18:17
 * @Description: 26删除有序数组中的重复项
 */
public class Solution {

    /**
     * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
     * 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums
     * 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     * 返回 k 。
     */

    /**
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
     */

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        //返回去重后的数组长度，
        //返回nums 数组前 几位为不重复的数字
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                //j = 0
                //temp = j++ : 先赋值 temp=j 在运算 j=j+1     返回temp = 0  j = 1
                //temp = ++j : 先运算 i=i+1  在赋值 temp = j  返回temp = 1  j = 1
                int temp = ++j;
                nums[temp] = nums[i];
            }
        }
        return j + 1;
    }
}
