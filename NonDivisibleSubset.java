

import java.util.*;

public class NonDivisibleSubset {
    public static void main(String[] args) {

        List<Integer> s = List.of(19,10,12,10,24,25,22);
        int k = 4;

        int[] remainderArr = new int[k];
        for (Integer each : s) {
            remainderArr[each % k]++;
        }

        int zeroRemainder = remainderArr[0];
        int maxNumberOfDivisibleSet = zeroRemainder > 0 ? 1 : 0;
        for (int i = 1; i <= (k / 2); i++) {
            if (i != k - i)
                maxNumberOfDivisibleSet += Math.max(remainderArr[i], remainderArr[k - i]);
            else
                maxNumberOfDivisibleSet ++;
        }
        System.out.println(maxNumberOfDivisibleSet);
        //return maxNumberOfDivisibleSet;
    }


        
    }

