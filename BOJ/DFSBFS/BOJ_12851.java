package DFSBFS;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_12851 {
    //가장 빠른 시간으로 찾는 방법 몇 가지인지 추가로
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

    class Main{

        static int S, E;
        int []checked = new int[100001];
        Queue<Integer> qu = new LinkedList<>();
        int next =0;
        static int answer =0;
        public void BFS(int S){

            qu.offer(S);

            checked[S]=1;

            while(!qu.isEmpty()){

                int temp = qu.poll();

                for(int i=0; i<3; i++){

                    if(i==0){
                        next = temp +1;
                    }else if(i==1){
                        next = temp -1;
                    }else{
                        next = temp*2;
                    }

                    if(next == E){
                        answer++;
                        System.out.println(checked[temp]);
                    }

                    if(next>=0 && next<=100000 && checked[next]==0){
                        qu.offer(next);
                        checked[next]= checked[temp]+1;
                    }
                }
            }
            System.out.println(answer);
        }

        public static void main(String[] args) throws IOException {
            Main T = new Main();
            Scanner sc = new Scanner(System.in);

            S = sc.nextInt();
            E = sc.nextInt();

            if(S==E){
                System.out.print(0);
            }else{
                T.BFS(S);
            }

        }
    }

}
