package Code;

import java.util.Stack;

public class _33 {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (target == nums[mid]) return mid;
            if (nums[lo] <= nums[mid]) {    //左半段有序
                //target在这段里
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {    //右半段有序
                //target在这段里
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
