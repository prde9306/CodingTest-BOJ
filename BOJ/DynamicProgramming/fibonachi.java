package BOJ.DynamicProgramming;

import java.io.IOException;
import java.util.Scanner;
//sol1 - 시간초과 난다.
class Main{
    static int zero=0;
    static int one =0;

    public int solution(int s){
        if(s==0) zero++;
        else if(s==1) one++;
        else {
            return solution(s - 1) + solution(s - 2);
        }
    return 0;
    }

    public static void main(String[]args)throws IOException {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[]arr =new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
            T.solution(arr[i]);
            System.out.println(zero+" "+ one);
        }
    }

    //dinamicProgramming으로 풀기

}