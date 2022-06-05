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
}
