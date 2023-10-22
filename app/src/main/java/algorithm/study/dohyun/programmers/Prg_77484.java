package algorithm.study.dohyun.programmers;

import java.util.Arrays;

public class Prg_77484 {
    public static void main(String[] args) {

        Prg_77484 sol = new Prg_77484();

        int[] result = sol.solution(new int[]{44, 1, 0, 0, 31, 25},new int[]{31, 10, 45, 1, 6, 19});
        for( int i: result )
            System.out.print(i+" ");
        System.out.println();

        int[] result2 = sol.solution(new int[]{0, 0, 0, 0, 0, 0},new int[]{38, 19, 20, 40, 15, 25});
        for( int i: result2 )
            System.out.print(i+" ");
        System.out.println();

        int[] result3 = sol.solution(new int[]{45, 4, 35, 20, 3, 9},new int[]{20, 9, 3, 45, 4, 35});
        for( int i: result3 )
            System.out.print(i+" ");
        System.out.println();
    }
    public int[] solution(int[] lottos, int[] win_nums){

        int[] ans = new int[2];
        int min = 0;
        int unknown = 0;
        for( int i =0; i< lottos.length; i++ ){
            if(lottos[i] == 0)    unknown++;
            for( int j= 0; j< win_nums.length; j++){
                if( lottos[i] == win_nums[j] )  min++;

            }

        }
        int max = min + unknown;
        
        if( max == 0)
            ans[0] = 6;
        else ans[0] = 7-min;

        if( min == 0)
            ans[1] = 6;
        else ans[1] = 7-min;
        return ans;
    }
}
