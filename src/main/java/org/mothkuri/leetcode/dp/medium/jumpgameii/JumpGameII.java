package org.mothkuri.leetcode.dp.medium.jumpgameii;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class JumpGameII {

    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("START");
        JumpGameII jg2 = new JumpGameII();
        int[] nums = {2,3,1,1,4};
        System.out.println(jg2.jump(nums));
        System.out.println("END");
    }

    public int jump(int[] nums) {

        boolean[] used = new boolean[nums.length];
        used[0]=true;
        return jump(nums, used, 0, 0, Integer.MAX_VALUE);
    }

    public int jump(@NotNull int[] nums, boolean[] used, int index, int jumps, int min_jumps){

        if(index >= nums.length-1){
            min_jumps = jumps < min_jumps ? jumps : min_jumps;
            return min_jumps;
        }
        for(int i=1; i<=nums[index]; i++){
            if(used[index+i])
                continue;
            used[index+i] = true;
            min_jumps = jump(nums, used, index+i, jumps+1, min_jumps);
            used[index+i] = false;
        }
        return min_jumps;
    }
}
