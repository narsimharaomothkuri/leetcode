package org.mothkuri.leetcode.dp.medium.trappingrainwater;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println("START");

        TrappingRainWater trw = new TrappingRainWater();
        int[] height = {3,2,6,2,0,8,2,1,4};
        System.out.println(trw.trap(height));
        System.out.println("END");
    }

    public int trap(int[] height) {

        int length = height.length;

        if(length < 3)
            return 0;

        int i=0, j=length-1;
        int area =0, maxLeft=0, maxRight=0;

        while (i<j){

            if(height[i]<height[j]){

                if(maxLeft <= height[i]){
                    maxLeft=height[i];
                }else{
                    area = area - height[i] + maxLeft;
                }

                i++;
            }else{

                if(maxRight <= height[j]){
                    maxRight = height[j];
                }else{
                    area = area - height[j] + maxRight;
                }

                j--;
            }

        }

        return area;
    }

}
