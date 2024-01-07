/**
 * @Auther: chenjiaheng
 * @Date: 2024/1/6 15:58
 * @Description: 合并两个有序数组
 */
public class Solution {

    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，
     * nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //输入 int[2,1,3]nums1,int[2,0,4,5,1]nums2
        //输出 1,2,3,4,5
        if (nums1 == null || nums1.length <= 0) {
            throw new RuntimeException("nums1 is empty");
        }

        if (nums2 == null || nums2.length <= 0) {
            throw new RuntimeException("nums2 is empty");
        }

        //先去重在排序
        //创建数组需要首先确定数组的长度，但是怎么确定数组的呢？



    }
}
