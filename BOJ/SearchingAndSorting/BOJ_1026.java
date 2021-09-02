package BOJ.SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1026 {

    /**
     * 문제풀이는 맞았는데 내림차순 정렬 내가 모를 다른 라이브러리 있을 거라 생각...
     * @param args
     * @throws Exception
     */

        public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);
            // 전채 갯수? default로 10?
            int n = sc.nextInt();

            int[] A = new int[n];
            int[] B = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();

            }
            Arrays.sort(A);
            //내림차순 정렬 다르게 @@@
            Arrays.sort(B);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += A[i] * B[n - 1 - i];
            }
            System.out.println(sum);

        }

    }


