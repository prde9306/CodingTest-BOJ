package BOJ.BaseDatastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//핵심 메커니즘 : queue 에 int[]배열 선언
// 인덱스와 그에 해당하는 값 넣어주기(linkedList


public class BOJ_1966 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = in.nextInt();	// 테스트 케이스

        while (T-- > 0) {
            int N = in.nextInt();
            int M = in.nextInt();

            LinkedList<int[]> q = new LinkedList<>();	// Queue로 활용 할 연결리스트
            for (int i = 0; i < N; i++) {
                // {초기 위치, 중요도}
                q.offer(new int[] { i, in.nextInt() });
            }
            int count = 0;

            while (!q.isEmpty()) {	// 한 케이스에 대한 반복문
                int[] front = q.poll();	// 가장 첫 원소
                boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수
                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {
                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(i)[1]) {
                        // 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }
                        // front원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
                        isMax = false;
                        break;
                    }
                }
                // front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
                if(isMax == false) {
                    continue;
                }
                // front 원소가 가장 큰 원소였으므로 해당 원소는 출력해야하는 문서다.
                //front 0이뭐냐 - 인덱스역할 맞아
                count++;
                if(front[0] == M) {	// 찾고자 하는 문서라면 해당 테스트케이스 종료
                    break;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    //sol2
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, m, count;
        // m의 인덱스는 0부터
        for (int i = 0; i < t; i++) {

            LinkedList<int[]> queue = new LinkedList<>();
            count = 0;
            n = sc.nextInt();
            m = sc.nextInt();
            for (int j = 0; j < n; j++)

                queue.add(new int[]{j, sc.nextInt()});
            // 인덱스, 중요도 입력받기
            while (!queue.isEmpty()) {
                // 큐가 빌 때까지
                int[] now = queue.poll();
                boolean able = true;
                for (int[] q : queue) if (q[1] > now[1]) able = false;
                if (able) {
                    count++;
                    if (now[0] == m) break;
                } else queue.add(now);
            }
            System.out.println(count);
        }
    }

    /**
     * public class Main {
     *     //한 사례만 커버가능
     *     public int solution(int N, int M, int[]arr){
     *         Queue <Integer> qu = new LinkedList<>();
     *         int target = arr[M];
     *         int answer =0;
     *         for(int i=0; i<N; i++){
     *             qu.offer(arr[i]);
     *         }
     *
     *         for(int i=0; i<N-answer; i++){
     *             for(int j=i; j<N-answer; j++){
     *                 if(arr[i]>arr[j]) {
     *                     answer++;
     *                     if(qu.poll()==target) return  answer;
     *                     else qu.poll();
     *                 }else{
     *                     qu.offer(qu.poll());
     *                 }
     *             }
     *         }
     *         return 0;
     *     }
     *
     *
     *     public static void main(String[]args)throws IOException {
     *     //어떻게 반복되게 입력하지???
     *       //  for문 아니면 while인데
     *         Scanner sc = new Scanner(System.in);
     *         int total = sc.nextInt();
     *         int N = sc.nextInt();
     *         int M = sc.nextInt();
     *         int []arr = new int[N];
     *
     *         for(int i=0; i<N; i++){
     *             arr[i]=sc.nextInt();
     *         }
     *
     *
     *     }
     *
     * }
     */
}

