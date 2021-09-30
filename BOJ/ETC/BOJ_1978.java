package ETC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://st-lab.tistory.com/80 3개 방식 다 알기
//자꾸 1번으로 푸는데 (에라토스테네스의 체 확실히, squrt도 확실히

class Main {

    public boolean isPrime(int X){
        if(X==1) return false;
        if(X==2) return true;

        boolean answer = true;
        for(int i=2; i<X; i++){
            if(X%i==0){
                answer = false;
            }
        }
        return answer;
    }

    public int solution(int N, int[]arr){
        int answer =0;

        for(int i=0; i<N; i++){
            if(isPrime(arr[i])){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print(T.solution(N, arr));
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();	// N 은 쓰지 않음.
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()) {

            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if(num == 1) {
                continue;
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        System.out.println(count);
    }

}