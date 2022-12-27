package org.mothkuri.leetcode.dp.medium.maximumsubarray;

public class MaximumProductSubarray {

    public static void main(String[] args) {
        System.out.println("START");
        MaximumProductSubarray mps = new MaximumProductSubarray();
        int[] nums = {-2,0,-1,-3};
        System.out.println(mps.maxProduct(nums));
        System.out.println("END");
    }

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            System.out.println("before :"+imin+"\t"+imax+"\t"+max);
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);
            max = Math.max(max, imax);
            System.out.println("after :"+imin+"\t"+imax+"\t"+max);
        }
        return max;
    }
}
