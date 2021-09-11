package BOJ.SearchingAndSorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_11651 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[1] == e2[1])
                return e1[0] - e2[0];
            else
                return e1[1] - e2[1];
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }

    // 이방식 익숙 위에꺼도 알기
    class Point implements Comparable<Point>{
        int x, y;

        public Point(int x, int y){
            this.x =x;
            this.y =y;
        }

        @Override
        public int compareTo(Point ob){
            //이게 왜 오름차순인지 이해, compareTo안에 들여다 보기, override보기
            if(this.y==ob.y){
                return this.x -ob.x;
            }else{
                return this.y - ob.y;
            }
        }
    }
    class Main{



        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            ArrayList<Point> arr = new ArrayList<>();

            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                arr.add(new Point(x,y));
            }
            Collections.sort(arr);

            for(Point x : arr){
                System.out.println(x.x +" "+ x.y);
            }
        }
    }
}