package BOJ.SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2750 {
    //입력을.., 출력은 Arrays.sort쓰면 안되나?
    public static void main(String[] args) throws IOException {
/**
 * Scanner in = new Scanner(System.in);
 *
 * 		int N = in.nextInt();
 * 		int[] arr = new int[N];
 *
 * 		for(int i = 0; i < N; i++) {
 * 			arr[i] = in.nextInt();
 *                }
 *
 */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // select sort
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int val : arr) {
            System.out.println(val);
        }

    }
}
