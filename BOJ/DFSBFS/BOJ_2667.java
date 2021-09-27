package BOJ.DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2667 {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] aparts = new int[25*25];
    private static int n;
    private static int apartNum = 0; //아파트 단지 번호의 수
    private static boolean[][] visited = new boolean[25][25]; //방문여부
    private static int[][] map = new int[25][25]; //지도

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        //전체 사각형 입력 받기
        for(int i=0; i<n; i++){
            String input = sc.next();

            //next(), nextLine(), nextInt()

            for(int j=0; j<n; j++){
                map[i][j] = input.charAt(j)-'0';
                //String끼리 사칙연산?
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apartNum++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }else{
                System.out.println(aparts[i]);
            }
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }
}
/**
 * 손보기
 * class Main{
 *     static int [][]board;
 *     static int [][]check;
 *     static ind []dx = {-1, 0, 1, 0};
 *     static int []dy = {0, 1, 0, -1};
 *     static ArrayList<Integer> arr = new ArrayList<>();
 *     static int cnt;
 *
 *     public static void DFS(int x, int y){
 *         if(x==7 &&y==7){
 *             return;
 *         }else{
 *             for(int i=0; i<4; i++){
 *                 int nx = x + dx[i];
 *                 int ny = y + dy[i];
 *                 if(nx>=1 && nx<=7 & ny>=1 &&ny<=7 && board[nx][ny]==1 &&check[nx][ny]==0){
 *                     cnt++;
 *                     check[nx][ny]=1;
 *                     DFS(nx, ny);
 *                     check[nx][ny]=0;
 *                 }else{
 *                     arr.add(cnt);
 *                     cnt=0;
 *                 }
 *             }
 *         }
 *     }
 *
 *     public static void main(String[] args)throws IOException{
 *
 *         Scanner sc = new Scanner(System.in);
 *         int N = sc.nextInt();
 *         board = new int [N+1][N+1];
 *
 *         for(int i=1; i<=N; i++){
 *             for(int j=1; j<=N; j++){
 *                 board[i][j]=sc.nextInt();
 *             }
 *         }
 *
 *         check = new int [N+1][N+1];
 *
 *         DFS(1,1);
 *
 *         Collections.sort(arr);
 *         System.out.println(arr.size());
 *
 *         for(int x : arr){
 *             System.out.println(x+" ");
 *         }
 *
 *     }
 * }
 */

