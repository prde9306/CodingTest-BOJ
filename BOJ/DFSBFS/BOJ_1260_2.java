package DFSBFS;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
    static int[][] board;
    static boolean [] checked;
    static int N, M, S;

    public static void DFS(int j){
        checked[j]=true;
        System.out.print(j+" ");

        for(int i=1; i<=N; i++){

            if(board[j][i]==1 && checked[i]==false){
                DFS(i);
            }
        }
    }
    public static void BFS(){
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(S);
        checked[S]=true;
        System.out.print(S +" ");

        while(!qu.isEmpty()){
            int nx = qu.poll();

            for(int i=1; i<=N; i++){
                if(board[nx][i]==1&&checked[i]==false){
                    qu.offer(i);
                    checked[i] = true;
                    System.out.print(i +" ");

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        S = sc.nextInt();

        board = new int[1001][1001];
        checked = new boolean[1001];

        for(int i=0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            board[x][y]=board[y][x]=1;
        }

        DFS(S);
        //checked 배열 초기화
        checked = new boolean[1001];
        System.out.println();

        BFS();
    }
}

