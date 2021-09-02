package BOJ.BaseDatastructure;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
//200804 복습
//x번째 어떻게 꺼내는지 - 새로운 변수 선언하는 메커니즘 기억
public class BOJ_1158 {

    public static void main(String[] args) {
        //queue를 써서 원돌리는 효과 메커니즘 이해 & 암기 사용

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Queue<Integer> jo = new LinkedList<Integer>();
        Queue<Integer> jos = new LinkedList<Integer>();
        int m = input.nextInt();

        for(int i=0; i<n; i++){
            jo.offer(i+1);
        }

        int count =1;

        while(!jo.isEmpty()){
            if(count%m==0){
                jos.offer(jo.poll());
            }
            if(count%m!=0){
                jo.offer(jo.poll()); // 뺏다가 다시 넣으면 원처럼 돌아간다.
            }
            count++;
        }

        System.out.print("<"+jos.poll());

        while(!jos.isEmpty()){
            System.out.print(", "+jos.poll());
        }

        System.out.print(">");
    }

}

