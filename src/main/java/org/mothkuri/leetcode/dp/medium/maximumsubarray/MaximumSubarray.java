package org.mothkuri.leetcode.dp.medium.maximumsubarray;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println("START");
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(nums));
        System.out.println("END");
    }

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndPos = nums[0];

        for(int i=1; i<nums.length; i++){
            maxEndPos = Math.max(maxEndPos+nums[i], nums[i]);
            maxSoFar = Math.max(maxEndPos, maxSoFar);
            //System.out.println(maxEndPos+"\t"+maxSoFar);
        }

        return maxSoFar;
    }
}
