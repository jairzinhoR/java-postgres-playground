package com.example.teoria;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void testTwoSum() {
        Solution testSolution = new Solution();
        int[] nums = {2,34,11,1};
        int target = 45;
        int[] resultExpect = {1,2};
        int [] resultTest = testSolution.twoSum(nums, target);
        Assertions.assertEquals(Arrays.toString(resultExpect), Arrays.toString(resultTest));
    }
}
