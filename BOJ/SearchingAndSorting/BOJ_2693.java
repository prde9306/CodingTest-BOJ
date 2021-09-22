package SearchingAndSorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
    //쉽게맞음

    public static void main(String[] args) throws IOException{

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int size =10;
        ArrayList<Integer> answer = new ArrayList<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            while(size-- >0){
                answer.add(sc.nextInt());
            }
            size=10;
            Collections.sort(answer);
            System.out.println(answer.get(7));
            answer = new ArrayList<>();
        }
    }
}