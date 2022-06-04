package qn1_TwoSum;

import java.util.*;

public class Methods {

    public int[] method1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            //  Adding the number and its index to the map
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] method2(int[] nums, int target) {

        //  Creating our Map to hold our integers
        Map<Integer, Integer> map = new HashMap<>();

        //  Add the number and the index to our map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] method3(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
