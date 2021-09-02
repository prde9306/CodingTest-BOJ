package BOJ.DynamicProgramming;

import java.util.Scanner;

public class Main {

    static long[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        arr = new long[N + 1];

        for(int i = 0; i < N + 1; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(Fib(N));
    }

    public static long Fib(int N) {
        if(arr[N] == -1) {
            arr[N] = Fib(N - 1) + Fib(N - 2);
        }
        return arr[N];
    }


    static Long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new Long[N + 1];
        arr[0] = 0L;
        arr[1] = 1L;
        System.out.println(Fib(N));
    }

    public static long Fib(int N) {
        if(arr[N] == null) {
            arr[N] = Fib(N - 1) + Fib(N - 2);
        }
        return arr[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        long sum = 1;
        long f1 = 0;
        long f2 = 1;

        for(int i = 1 ; i < N ; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }

        System.out.println(sum);
    }



}