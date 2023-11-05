package algorithm.study.dohyun.programmers;

import java.util.Stack;

public class Prg_76502 {
    public static void main(String[] args) {
        Prg_76502 sol = new Prg_76502();

        System.out.println(sol.solution("[](){}"));
        System.out.println(sol.solution("}]()[{"));
        System.out.println(sol.solution("[)(]"));
        System.out.println(sol.solution("}}}"));

    }

    private int solution( String s ){

        int ans = 0;

        for( int i = 0; i< s.length(); i++ ){
            String tmp = "";
            // endindex-1까지 리턴 => \
            if( i== 0)
                tmp = s;
            else tmp = s.substring(i,s.length()) + s.substring(0,i);

            Stack<Character> stk = new Stack<>();
            for( int chr = 0; chr < tmp.length(); chr ++ ) {

                if ( stk.isEmpty() ) {
                    stk.push(tmp.charAt(chr));
                    continue;
                }

                if (stk.peek() == '{' && tmp.charAt(chr) == '}')
                    stk.pop();
                else if (stk.peek() == '(' && tmp.charAt(chr) == ')')
                    stk.pop();
                else if (stk.peek() == '[' && tmp.charAt(chr) == ']')
                    stk.pop();
                else stk.push(tmp.charAt(chr));
            }
            if( stk.isEmpty() )
                ans++;


        }

        return ans;

    }
}
