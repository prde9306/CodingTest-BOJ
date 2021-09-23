package ETC;

import java.util.Scanner;

public class BOJ_1789 {
    //등차수열 합까지는 생각했으나

    public class Main {
        //주어진 범위 보고 long으로 해야하는 것 알아야
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long num = sc.nextLong();
            long sum = 0;
            int count = 0;

            for (int i = 1; ; i++) {
                if (sum > num) break;
                sum += i;
                count++;
            }
            System.out.println(count - 1);
            sc.close();
        }

    }
}
