package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_17681 {
    static int[][] map1 , map2;
    static int n;
    public static void main(String[] args){

        Prg_17681 sol = new Prg_17681();

        n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = { 30,1,21,17,28};

        String[] ans = sol.solution(n,arr1,arr2);
        for( String i : ans)
            System.out.println(i);

    }
    public String[] solution( int n, int[] arr1, int[] arr2){

        String[] map = new String[n];

        for( int i = 0; i< n; i++ ){
            // (i+1) 번째 줄
            String tmp1 = binary(arr1[i]);
            String tmp2 = binary(arr2[i]);
            StringBuffer line = new StringBuffer();
            for( int j =0; j< n; j++){

                int t1 = tmp1.charAt(j) -'0';
                int t2 = tmp2.charAt(j)- '0';

                if( t1 + t2 == 0)
                    line.append(" ");
                else line.append("#");
            }

            map[i] = line.reverse().toString();


        }

        return map;
    }
    public String binary( int num ){

        String str = "";
        while( num >= 1 ){
            str += num%2 ;
            num /= 2;
        }
        while( str.length() != n)
            str += 0;

        return str;


    }
}