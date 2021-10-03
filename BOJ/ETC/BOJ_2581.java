package ETC;

import java.io.IOException;
import java.util.Scanner;

class Main {

    public boolean isPrime(int X) {
        boolean answer = true;
        if (X == 1) return false;

        for (int i = 2; i < X; i++) {
            if (X % i == 0) answer = false;
        }
        return answer;
    }

    public void solution(int M, int N) {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if (sum == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        T.solution(M, N);

    }
}


/**
 * 에라토스 테네스의 체 이걸로 꼭 풀줄 알아야 된다.
 */

public class Main {

    public static boolean prime[];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        prime = new boolean[N + 1];	// 배열 생성
        get_prime();


        // 소수 합 및 최솟값
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = M; i <= N; i++) {
            if(prime[i] == false) {	// false = 소수
                sum += i;
                if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임
                    min = i;
                }
            }
        }

        if(sum == 0) {	// 소수가 없다면
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }

    }


    // 에라토스테네스 체 알고리즘
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}

