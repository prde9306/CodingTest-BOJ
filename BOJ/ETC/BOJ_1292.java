package ETC;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {


    public int solution(int N, int M) {
        int answer = 0;
        int a = 1;
        int b = 1;

        int[] arr = new int[10000001];

        while (a <= M) {
            for (int i = a; i < a * 2; i++) {
                arr[b++] = a;
            }
            a++;
        }

        for (int i = N; i <= M; i++) {
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.print(T.solution(N, M));

    }
}