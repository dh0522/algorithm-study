package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12941 {
    public static void main(String[] args) {
        Prg_12941 sol = new Prg_12941();

        System.out.println(sol.solution(new int[]{1,4,2},new int[]{5,4,4}));
        System.out.println(sol.solution(new int[]{1,2},new int[]{3,4}));

    }
    private int solution(int[] A, int[] B){

        Arrays.sort(A);
        Arrays.sort(B);
        int ans = 0;
        for( int i = 0; i< A.length; i++ ){
            ans += A[i]*B[B.length-1-i];
        }
        return ans;

    }
}
