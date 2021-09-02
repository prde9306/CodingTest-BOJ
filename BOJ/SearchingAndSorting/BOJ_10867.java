package BOJ.SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_10867 {
   //sol1.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> numbers = new HashSet();

        for(int i=0; i<n; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        List list = new ArrayList(numbers);
        Collections.sort(list);

        String result = list.toString().replace("[", "").replace(",", "").replace("]", "");
        System.out.println(result);
    }

    //sol2. TreeSet이용
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //TreeSet 은 데이터 중복저장 불가, nature ordering으로 정렬
        //
        Set<Integer> set = new TreeSet<Integer>();
        while(n-->0) {
            set.add(sc.nextInt());
        }

        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}