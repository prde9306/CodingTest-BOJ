package ETC;

import java.io.IOException;
import java.util.Scanner;


//맞게 푼거 같은데 왜 안되나
class Main{
    static int sum2=0;

    public int solution(int N, int S, int[]arr){
        int cnt =0;
        int lt =0;
        int rt=0;
        int sum =0;
        int min = Integer.MAX_VALUE;

        if(sum2<S) return 0;

        while(lt<N){
            if(sum>=S){
                sum-=arr[rt++];
                cnt--;
            }else{
                sum+=arr[lt++];
                cnt++;
                min = Math.min(min, cnt);
                System.out.println(lt);
            }

        }
        return min;

    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int S = sc.nextInt();

        int[]arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
            sum2+=arr[i];
        }

        System.out.print(T.solution(N, S, arr));
    }

}

// 0처리하는 문제 때문에 위에 틀린 듯

class Main {
    private static int N; // 10 ≤ N < 100,000
    private static int S;
    private static int left = 0;
    private static int right = 0;
    private static int answer = 100001;
    private static int sum = 0;
    private static int[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        while (true) {
            if (sum >= S) { //조건 만족
                sum -= nums[left];
                answer = Math.min(answer, (right - left)); // 부분합 최소 길이 갱신
                left++; // 왼쪽 포인터 오른쪽으로 이동
            } else if (right == N) { //끝 도달
                break;
            } else { // right포인터 오른쪽으로 이동
                sum += nums[right++];
            }
        }
        if (answer == 100001) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}