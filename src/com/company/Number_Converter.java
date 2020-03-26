package com.company;

public class Number_Converter {
    public static int[] convert(int num){
if (num == 1)
                return new int[]{2, 0};
else if (num == 2)
    return new int[]{2, 1};
else if (num == 3)
                return new int[]{2, 2};
else if (num == 4)
                return new int[]{1, 0};
else if (num == 5)
                return new int[]{1, 1};
else if (num == 6)
                return new int[]{1, 2};
else if (num == 7)
                return new int[]{0, 0};
else if (num == 8)
                return new int[]{0, 1};
else if (num == 9)
                return new int[]{0, 2};
return new int[] {0,0};
    }
}
