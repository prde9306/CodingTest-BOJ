package BOJ.Backtracking;

import java.util.Scanner;

public class BOJ_1182 {
    static int N, S, count=0;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        S= sc.nextInt();
        arr = new int[N];

        for (int i = 0; i <N ; i++) {
            arr[i] =  sc.nextInt();
        }

        dfs(0,0);

        if(S==0){// count 합이 0인 경우 공집합도 포함되므로 그 수를 하나 빼주고 출력
            count--;
            System.out.println(count);
        }else {
            System.out.println(count);
        }
    }

    private static void dfs(int v , int su){
        if(v==N){// dfs로 돌며 누적시키다가 위치를 나타내는 v이 마지막 위치로 오면 원하는 값인지 아닌지 체크하여 count
            if(su == S){
                count++;
            }
            return;
        }
        // 부분수열, 지금 위치의 원소를 선택하거, 선택하지 않거나
        dfs(v+1, su+arr[v]); // 지금 위치의 원소를 선택
        dfs(v+1, su); // 선택하지 않음.
    }

    //sol2

    /**
      내풀이 왜 if에서 두번 확인해줘야 하는지, 공집합 고려해야하는지!!
     */
    class Main{

        static int N, M;
        static int []arr;
        static int answer=0;

        public void DFS(int Level, int sum){

            if(Level==N){
                if(sum==M){
                    answer++;
                }
            }
            else{
                DFS(Level+1, sum+arr[Level]);
                DFS(Level+1, sum);
            }

        }


        public static void main(String[] args) throws IOException{

            Main T = new Main();
            Scanner sc = new Scanner(System.in);

            N = sc.nextInt();
            M = sc.nextInt();

            arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i]=sc.nextInt();
            }
            T.DFS(0,0);
            if(M==0){ answer--;
                System.out.print(answer);}
            else System.out.print(answer);
        }
    }
}

