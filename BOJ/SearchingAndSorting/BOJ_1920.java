package BOJ.SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1920 {
    //BufferedReader와 Scanner차이 명확히 알기

    //sol1
    //출력초과
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i=0; i<N; i++){
            arr1[i]=sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int j =0; j<M; j++){
            arr2[j]=sc.nextInt();
        }

        for(int k=0; k<M; k++){
            for(int l=0; l<N; l++){
                if(arr2[k]==arr1[l]) {
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
        }
    }

    //sol2, hashSet이용
    public static void main3(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] a = br.readLine().split(" ");
        HashSet<String> hs = new HashSet<>(Arrays.asList(a));

        int m = Integer.parseInt(br.readLine());
        String[] arrM = br.readLine().split(" ");
        for (int i=0; i<m; i++) {
            //contains사용
            if (hs.contains(arrM[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    //sol3
    //bSearch많이 사용됨(이렇게 생각함)
    public static boolean bSearch(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;

            if(arr[mid] == target) {
                return true;
            }else if(arr[mid] > target) {
                max = mid - 1;
            }else if(arr[mid] < target) {
                min = mid + 1;
            }
        }
        return false;
    }

    //sol 4
    public static void main4(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if(bSearch(arr, target)) {
                sb.append("1\n");
            }else {
                sb.append("0\n");
            }
        }
        System.out.println(sb.toString());
    }
}
