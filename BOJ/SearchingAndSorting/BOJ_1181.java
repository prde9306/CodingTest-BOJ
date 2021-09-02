package BOJ.SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_1181 {
    /**
     * Arrays.sort 에서 Comparator사용하는 방법 !
     * @param args
     */
    //sol1. Scanner + System.out.println
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        sc.nextLine(); //개행 버림

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String s1, String s2) {
                //단어 길이가 같은 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                //
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(arr[0]);

        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }

        }
    }

        //sol2 BufferedReader + StringBuilder
        public static void main2(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            String[] arr = new String[N];

            for (int i = 0; i < N; i++) {
                arr[i] = br.readLine();
            }

            Arrays.sort(arr, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    // 단어 길이가 같을 경우
                    if (s1.length() == s2.length()) {
                        return s1.compareTo(s2);
                    }
                    // 그 외의 경우
                    else {
                        return s1.length() - s2.length();
                    }
                }
            });

            StringBuilder sb = new StringBuilder();

            sb.append(arr[0]).append('\n');

            for (int i = 1; i < N; i++) {
                // 중복되지 않는 단어만 출력
                if (!arr[i].equals(arr[i - 1])) {
                    sb.append(arr[i]).append('\n');
                }
            }
            System.out.println(sb);
        }


    }

