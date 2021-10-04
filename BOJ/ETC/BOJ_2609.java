package ETC;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main{

    public void solution(int N, int K){
        ArrayList<Integer> arr = new ArrayList<>();

        int len = Math.max(N, K);

        for(int i=1; i<=len; i++){
            if(N%i==0&& K%i==0){
                arr.add(i);
            }
        }
        //최대 공약수
        int maxCo = arr.get(arr.size()-1);
        System.out.println(maxCo);

        int nx = N/maxCo;
        int kx = K/maxCo;
        //최소 공배수
        System.out.println(nx*kx*maxCo);

    }

    public static void main(String[] args)throws IOException{
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        T.solution(N, K);

    }
}
//알고리즘으로 풀어 ** 유클리드 호제법
/**
 * GCD
 *
 *
 **/

// 최대공약수 반복문 방식
    int gcd(int a, int b) {

    while(b != 0) {
        int r = a % b;	// 나머지를 구해준다.
        // GCD(a, b) = GCD(b, r)이므로 변환한다.
        a = b;
        b = r;

    }
    return a;
    }

    // 최대공약수 재귀 방식
    int gcd(int a, int b) {
        if(b == 0) return a;
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }

    // 최소공배수 : Least Common mulitple
    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

