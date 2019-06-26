package pl.com.sda.javalon1.utils;


import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static int getStringLength(String input) {
        if(input == null)
        {
            return 0;
        }
        return input.length();
    }

    public static int getNumberCount(String input, int searchNumber) throws NumberNotSupported {

        if(searchNumber>9)
        {
            throw new NumberNotSupported();
        }

        int count =0;
        char[] chars = input.toCharArray();

        for(int i =0; i<chars.length; i++)
        {
            char c = chars[i];
            if(c == searchNumber)
            {
                count++;
            }

        }
        return count;
    }

}


