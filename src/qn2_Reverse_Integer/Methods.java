package qn2_Reverse_Integer;

import java.util.HashMap;
import java.util.Map;

public class Methods {

    //  Method to reverse an integer
    public int reverseInt(int num) {

        long out = 0;

        while (num != 0) {

            //  Append the last digit of num
            out = out * 10 + num % 10;
            //  Remove the last digit
            num = num / 10;
        }

        if (out > Integer.MAX_VALUE || out < Integer.MIN_VALUE) {return 0;}

        return (int) out;
    }

    public int reverseInt2(int x) {

        //  Convert the integer to a string
        String s = String.valueOf(x);
        //  Convert the string to an array of characters
        char[] chars = s.toCharArray();

        //  Create an empty String to hold the reversed number
        StringBuilder reversedNum = new StringBuilder();

        //  Loop through the characters as you append them to the reversedString
        for (int i = chars.length - 1; i >= 0; i--) {

            //  Append the digits from the last one
            reversedNum.append(chars[i]);
        }

        //  Convert the String builder to string then to an integer
        return Integer.parseInt(reversedNum.toString());
    }
}
