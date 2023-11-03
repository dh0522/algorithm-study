package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12973 {
    public static void main(String[] args) {

        Prg_12973 sol = new Prg_12973();
        System.out.println(sol.solution("baabaa"));
        System.out.println(sol.solution("cdcd"));
    }

    private int solution(String s){

        Stack<Character> stk = new Stack<>();
        for(int i = 0; i< s.length(); i++ ){

            if( !stk.isEmpty() &&stk.peek() == s.charAt(i) )
                stk.pop();
            else stk.push(s.charAt(i));
        }
        if( stk.isEmpty() )
            return 1;
        else return 0;
    }
}
