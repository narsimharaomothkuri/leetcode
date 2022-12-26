package org.mothkuri.leetcode.dp.medium.jumpgame;

public class JumpGame {

    public static void main(String[] args) {
        System.out.println("START");

        JumpGame jg = new JumpGame();
        int[] nums = {3,2,1,0,4};
        System.out.println(jg.canJump(nums));
        System.out.println("END");
    }

    public boolean canJump(int[] nums) {

        if(nums.length == 1 && nums[0] < 1)
            return false;

        boolean[] used = new boolean[nums.length];

        int start=nums[0];
        int end = nums.length-1;

        while (start<=end){

            if(used[start])
                return false;

            used[start] = true;
            start += nums[start];
        }
        if(start >= end)
            return  true;

        return canJump(nums, 0, used);
    }

    public boolean canJump(int[] nums, int index, boolean[] used) {
        System.out.println(index);
        if(index >= nums.length-1)
            return true;

        if(used[index]){
            return false;
        }

        used[index] = true;

        return canJump(nums, index+nums[index], used);

    }

}
