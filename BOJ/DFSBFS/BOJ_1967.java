package DFSBFS;

import java.io.IOException;
import java.util.Scanner;

class Main{
    static int N;
    static int[]arr;
    static int summ =0;

    public void DFS(int L, int sum){
        if(summ==2*sum){
            System.out.print("YES");
        }else{

            DFS(L+1, sum+arr[L]);

            DFS(L+1, sum);
        }

    }

    public static void main(String[] args)throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         arr = new int[N];

         for(int i=0; i<N; i++){
             arr[i]=sc.nextInt();
             summ+=arr[i];
         }

         T.DFS(0, 0);

    }
}