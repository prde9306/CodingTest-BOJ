import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

////https://woongsios.tistory.com/234?category=710020
class island implements Comparable<island>{

    int S, E, L;

    public island(int S, int E, int L){
        this.S = S;
        this.E = E;
        this.L = L;
    }
    @Override
    public int compareTo(island ob){
        return this.S - ob.S ;
    }
}
class Main{

    public int solution(int N, int M, ArrayList<island> arr, int S1, int S2){
        int max = Integer.MIN_VALUE;
        Collections.sort(arr);
        for(int i=0; i<arr.size(); i++){
            // 앞에서 뒤로 돌리고 , 뒤에서 앞으로 돌려야 할 듯
            if(arr.get(i).S ==S1&& arr.get(i).E==S2){
                max = Math.max(arr.get(i).L, max);
            }
            if(arr.get(i).E ==S1&& arr.get(i).S==S2){
                max = Math.max(arr.get(i).L, max);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        ArrayList<island> arr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0; i<M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            int L = sc.nextInt();
            arr.add(new island(S, E, L));
        }
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();

        System.out.print(T.solution(N, M, arr, S1, S2));


        // 같은 섬사이 여러개 다리 있을 수 있고
        // 항삼 두섬이 연결되지 않고 건너서 연결될 때 그 때의 최솟값
    }
}