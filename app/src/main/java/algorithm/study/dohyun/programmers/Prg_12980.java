package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12980 {
    public static void main(String[] args) {

        Prg_12980 sol = new Prg_12980();

        System.out.println(sol.solution(5));
        System.out.println(sol.solution(6));
        System.out.println(sol.solution(5000));
    }

    private int solution(int n){
        int ans = 0;
        while( n != 0 ){
            if( n%2 == 0)
                n = n/2;
            else {
                ans++;
                n--;
            }
        }
        return ans;
    }
}
