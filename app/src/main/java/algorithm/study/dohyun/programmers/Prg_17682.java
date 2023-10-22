package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_17682 {
    public static void main(String[] args) {

        Prg_17682 sol = new Prg_17682();

        String dart1 = "1S2D*3T";
        System.out.println(sol.solution(dart1));

        String dart2 = "1D2S#10S";
        System.out.println(sol.solution(dart2));

        String dart3 = "1D2S0T";
        System.out.println(sol.solution(dart3));


    }
    static int solution( String dartResult ){

        int ans = 0 ;

        int[] arr = new int[3];
        int num = 0;
        for( int i=0; i< dartResult.length(); i++ ){
            char tmp = dartResult.charAt(i);
            if (tmp >= '0' && tmp <= '9') {

                arr[num] =  tmp  - '0';
                if( tmp == '1' && dartResult.charAt(i+1) == '0' ){
                    arr[num] = 10;
                    i = i+1 ;
                }
                num++;
                continue;
            }

            if( tmp == 'D' ){
                arr[num-1] = arr[num-1] * arr[num-1];
                continue;
            }else if( tmp == 'T'){
                arr[num-1] = arr[num-1] * arr[num-1]*arr[num-1];
                continue;
            }

            if( tmp == '*' ){
                if( num == 1 ){
                    arr[num-1] = arr[num-1]*2;
                }
                else{
                    arr[num-1] = arr[num-1]*2;
                    arr[num-2] = arr[num-2]*2;
                }
            }
            else if( tmp == '#' ){

                arr[num-1] = -arr[num-1];
            }


        }
        for(int i: arr)
            ans += i;
        return ans;
    }
}
