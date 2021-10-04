package BaseDatastructure;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 1; j <= N; j++) {
            if (N % j == 0) {
                arr.add(j);
            }
        }
        if(arr.size()<K){
            System.out.print(0);
        }else{
            System.out.println(arr.get(K-1));

        }
    }


}

/**
 *
 */

public class Main {

    static int N,K;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
        N = sc.nextInt();
        K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if(N % i == 0) K--;

            if(K == 0) {
                System.out.println(i);
                break;
            }
        }
        if(K != 0)
            System.out.println(0);
    }
}

