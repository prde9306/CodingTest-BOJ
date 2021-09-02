package BOJ.BaseDatastructure;

import java.io.IOError;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Main{

    public String solution(String str){
        Stack<Character> st = new LinkedList<>();
        String answer = "NO";
        for(char x : str.toCharArray()){
            if(x=='(') st.add(x);
            else{
                st.pop(x);
            }
        }
        if(st.isEmpty()) return "YES";
        return answer;
    }


    public static void main (String[]args)throws IOException{

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();



    }
}