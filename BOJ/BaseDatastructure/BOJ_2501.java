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

