package BOJ.SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2751 {

    public static void main(String[]args) throws IOException {
        //Java기준 Arrays.sort 로 쓰면 시간초과가 난다.   (2021.01.11 Java → Java8 명칭이 변경됨)

        //sol1. Scanner + Collection.sort()
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }

    //sol2.
        public static void main2(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());

            // list 계열 중 하나를 쓰면 된다.
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);

            for(int value : list) {
                sb.append(value).append('\n');
            }
            System.out.println(sb);
        }


    }