package DFSBFS;

import java.util.ArrayList;

public class BOJ_1038 {

    public static ArrayList getDownNumber(long num, int digit, ArrayList downNumList) { // #1

        if(digit > 10) { // #2
            return downNumList;
        }

        downNumList.add(num); // #3

        for(int i=0; i<10; i++) {
            if(num%10 > i) { // #4
                getDownNumber((num*10) + i, digit+1, downNumList); // #5
            }
        }

        return downNumList;
    }
}
