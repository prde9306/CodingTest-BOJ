package BOJ.BaseDatastructure;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012 {
 // sol1 stack 매커니즘, 경우의 수 3가지(어떻게 꺼낼 것인가)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            System.out.println(solve(sc.next())); //nextLine()과 차이?
        }

    }

    public static String solve(String s){
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            //여는 괄호일 경우 스택에 넣기
            if(c=='('){
                stack.push(c);
            }
            //아래는 모두 닫는 괄호일 경우임
            //스택이 비어있을 경우 닫는 괄호를 입력받았으나 pop할 원소가 없을 경우
            else if(stack.empty()){
                return "NO";
            }
        //그 외의 경우 stack 원소를 pop한다
            else{
                stack.pop();
            }
        }

        /**
         * 모든 겸사 마치고 스택에 잔여 요소가 있으면 NO
         * 스택이 비어있으면 YES
         */
        if(stack.empty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
