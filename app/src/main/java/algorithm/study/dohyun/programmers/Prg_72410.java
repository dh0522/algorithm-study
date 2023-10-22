package algorithm.study.dohyun.programmers;

public class Prg_72410 {
    public static void main(String[] args) {

        Prg_72410 sol = new Prg_72410();

        System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(sol.solution("z-+.^."));
        System.out.println(sol.solution("=.="));
        System.out.println(sol.solution("abcdefghijklmn.p"));

    }
    public String solution(String new_id){

        new_id = new_id.toLowerCase(); // 1
        new_id = new_id.replaceAll("[^a-z0-9-_.]",""); //2
        new_id = new_id.replaceAll("[.]{2,}","."); //3

        if( new_id.charAt(0) == '.') //4
            new_id = new_id.substring(1,new_id.length());
        if( new_id.length() > 0 &&  new_id.charAt(new_id.length()-1) == '.' )
            new_id = new_id.substring(0,new_id.length()-1);

        if( new_id.length() == 0 ) //5
            new_id = "a";
        else if( new_id.length() >= 16 ){
            new_id = new_id.substring(0,15);
            if( new_id.charAt(new_id.length()-1) == '.' )
                new_id = new_id.substring(0,14);
        }

        if( new_id.length() <3 ){

            char tmp = new_id.charAt( new_id.length()-1 );
            while( new_id.length() != 3)
                new_id += tmp;
        }
        return new_id;

    }
}
