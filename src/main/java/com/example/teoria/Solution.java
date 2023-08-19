package com.example.teoria;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultado = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 2; j < nums.length; j++){ // Começa a partir do próximo elemento
                System.out.println(i + " " + j);
                if ((nums[i] + nums[j]) == target){
                    resultado[0] = nums[i];
                    resultado[1] = nums[j];
                    break;                    
                }
            }
        } 
        return resultado;
    }
    
     public static void main(String[] args) {
        Solution t1 = new Solution();
        int[] nums = {2,11,34,1};
        int target = 45;
        int [] result = t1.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
     } 
}
