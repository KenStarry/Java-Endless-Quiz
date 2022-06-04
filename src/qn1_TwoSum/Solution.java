package qn1_TwoSum;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Methods m = new Methods();

        //  Our array of integers and our target to test the function
        int[] numbers = {3, 4, 12, 10, 8};
        int target = 22;

        //  Alter this line to use any method you want
        int[] new_nums = m.method1(numbers, target);

        //  The indexes of the two numbers that add up to 22
        System.out.println(Arrays.toString(new_nums));

    }

}
