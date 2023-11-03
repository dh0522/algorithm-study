package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12981 {
    public static void main(String[] args) {
        Prg_12981 sol = new Prg_12981();
        int[] ans = sol.solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        for( int i : ans)
            System.out.print(i+" ");
        System.out.println();


        int[] ans2 = sol.solution(5,new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage",
                "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        for( int i : ans2)
            System.out.print(i+" ");
        System.out.println();

        int[] ans3 = sol.solution(4,new String[]{"hello", "one", "even", "even", "now", "draw"});
        for( int i : ans3)
            System.out.print(i+" ");
        System.out.println();
    }

    private int[] solution(int n, String[] words){

        Stack<String> stk = new Stack<String>();

        int man = 0;
        int wordnum = 0;
        for( int i = 1; i<= words.length; i++ ){

            if( i == 1 ) {
                stk.push(words[i-1]);
                continue;
            }

            if( stk.contains(words[i-1]) || stk.peek().charAt( stk.peek().length() -1 ) != words[i-1].charAt(0) ){

                if( i%n == 0 ){
                    man = n;
                    wordnum = i/n;
                }
                else{ // i = 5 n =2 => man = 1, wor = 3;
                    man = i%n;
                    wordnum = i/n +1 ; // 2-1
                }

                return new int[]{man,wordnum};
            }


            stk.push(words[i-1]);



        }
        return new int[]{0,0};

    }
}
