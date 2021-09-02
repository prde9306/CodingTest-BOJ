package BOJ.SearchingAndSorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10815 {
   // sol1. 이중 포문 시간 초과 나올 거 같은 경우 이진 탐색
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 숫자 카드 오름차순 정렬
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 이분 탐색을 해서 해당 숫자가 있는 경우
            if(binarySearch(num))
                bw.write("1 ");
                // 이분 탐색을 해서 해당 숫자가 없는 경우
            else
                bw.write("0 ");
        }

        bw.close();
        br.close();
    }
    private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = n - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = arr[midIndex];

            if(num < mid)
                rightIndex = midIndex - 1;
            else if(num > mid)
                leftIndex = midIndex + 1;
            else
                return true;
        }
        return false;
    }
    //sol2 같은 풀이

      static int[] arr;
      static int[] comp;
        public static void main2(String[] args) throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = null;
            // 숫자 카드 개수 N
            int n = Integer.parseInt(br.readLine());
            arr = new int[n];

            // 상근이가 가지고 있는 숫자 카드들
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<n; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            // M 입력 받기
            int m = Integer.parseInt(br.readLine());

            // 이진탐색을 위한 오름차순 정렬
            Arrays.sort(arr);

            // 비교해야할 수 탐색
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<m; i++){
                int result = BinarySearch(Integer.parseInt(st.nextToken()));
                if(result != -1)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }

        }

        private static int BinarySearch(int target){
            int left = 0;
            int right = arr.length - 1;
            int mid;

            while(left <= right){
                mid = (left + right) / 2;
                if(arr[mid] < target)
                    left = mid + 1;
                else if(arr[mid] > target)
                    right = mid - 1;
                else
                    return mid;
            }
            return -1;
        }
    }