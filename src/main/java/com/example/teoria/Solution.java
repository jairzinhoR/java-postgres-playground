package com.example.teoria;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultado = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; i < nums.length; j++){
                if (nums[i]+nums[j]==target){
                    resultado[0] = nums[i];
                    resultado[1] = nums[j];
                }
            }
        }
   
        return resultado; }
}
