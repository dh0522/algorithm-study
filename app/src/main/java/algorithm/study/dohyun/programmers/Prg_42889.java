package algorithm.study.dohyun.programmers;

import java.util.*;
public class Prg_42889 {
    public static void main(String[] args){
        Prg_42889 sol = new Prg_42889();

        int[] ans = sol.solution(5, new int[]{2,1,2,6,2,4,3,3});
        for( int i : ans)
            System.out.print(i+" ");
        System.out.println();

        int[] ans2 = sol.solution(4,new int[]{4,4,4,4});
        for( int i: ans2 )
            System.out.print(i+" ");
        System.out.println();

    }
    public int[] solution( int N, int[] stages ){

        Map<Integer, Double> map = new HashMap<>();
        for( int i =1; i<N+1; i++){
            int denom = 0 , numer =0;
            for( int j = 0; j< stages.length; j++ ){

                if( i < stages[j] ) denom++;
                else if( i == stages[j] ){
                    denom++;
                    numer++;
                }
            }
            double fail = numer/(double)denom;
            if( denom == 0 )
                fail = 0;

            map.put(i, fail );
        }

        List< Integer > keyset = new ArrayList<>(map.keySet());
        Collections.sort( keyset , (v1,v2)->map.get(v2).compareTo(map.get(v1)) );

        int[] ans = new int[N];
        int j = 0;
        for( int i: keyset){
            ans[j] = i;
            j++;
        }
        return ans;
    }
}
