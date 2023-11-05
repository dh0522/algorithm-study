package algorithm.study.dohyun.programmers;

import java.util.Arrays;

public class Prg_87390 {
    public static void main(String[] args) {

        Prg_87390 sol = new Prg_87390();

        int[] result = sol.solution(3,2,5);
        for(int i: result)
            System.out.print(i+" ");
        System.out.println();

        int[] result2 = sol.solution(4,7,14);
        for(int i: result2)
            System.out.print(i +" ");
        System.out.println();


    }
    private int[] solution( int n, long left, long right ) {


        int[] ans = new int[(int)(right-left)+1];
        int num = 0;
        for ( long i =  left; i<= right; i++){
            long x = i / n;
            long y = i % n;

            ans[num++]  = Math.max((int)x,(int)y) +1;
        }
        return ans;

    }
}

