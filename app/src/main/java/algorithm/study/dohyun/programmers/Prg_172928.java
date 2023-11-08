package algorithm.study.dohyun.programmers;

public class Prg_172928 {

    public static void main(String[] args) {
        Prg_172928 sol = new Prg_172928();

        int[] ans1 = sol.solution(new String[]{"SOO","OOO","OOO"},new String[]{"E 2","S 2","W 1"});
        for( int i: ans1)
            System.out.print(i+" ");
        System.out.println();

        int[] ans2 = sol.solution(new String[]{"SOO","OXX","OOO"},new String[]{"E 2","S 2","W 1"});
        for( int i: ans2)
            System.out.print(i+" ");
        System.out.println();


        int[] ans3 = sol.solution(new String[]{"OSO","OOO","OXO","OOO"},new String[]{"E 2","S 3","W 1"});
        for( int i: ans3)
            System.out.print(i+" ");
        System.out.println();

    }

    static int[] ans;
    static int[][] map ;
    static String dir;

    public int[] solution(String[] park, String[] routes){

        int garo = park.length;
        int sero = park[0].length();
        ans = new int[2];
        map = new int[garo][sero];


        for( int i = 0; i < garo; i++ ){
            String tmp = park[i];
            for( int j = 0; j< sero ; j++ ){
                if( tmp.charAt(j) == 'O')   map[i][j] = 1;
                else if( tmp.charAt(j) == 'X' ) map[i][j] = 0;
                else {
                    map[i][j] = 1;
                    ans = new int[]{i,j};
                }
            }
        }


        for( int i = 0; i< routes.length; i++) {

            dir = routes[i].split(" ")[0]; // dir[0] = 북동남서 dir[1] = 몇번
            int num = Integer.parseInt(routes[i].split(" ")[1]);

            if (dir.equals("E")) {
                if (ans[1] + num < sero && route(num)) {
                    ans[1] += num;
                }
            } else if (dir.equals("W")) {
                if (0 <= ans[1] - num && route(num)) {
                    ans[1] -= num;
                }
            } else if (dir.equals("S")) {
                if (ans[0] + num < garo && route(num)) {
                    ans[0] += num;
                }
            } else if (dir.equals("N")) {
                if (0 <= ans[0] - num && route(num)) {
                    ans[0] -= num;
                }
            }
        }

        return ans;
    }
    boolean route(  int num ){ // num = 얼마만큼 이동


        if(dir.equals("E")) {
            for (int i = 1; i <= num; i++) {
                if (map[ans[0]][ans[1] + i] == 0)
                    return false;
            }
        }
        else if(dir.equals("W")) {
            for (int i = 1; i <= num; i++) {
                if (map[ans[0]][ans[1]-i] == 0)
                    return false;
            }
        }
        else if(dir.equals("S")) {
            for (int i = 1; i <= num; i++) {
                if (map[ ans[0]+i ][ ans[1] ] == 0) {

                    return false;

                }
            }
        }
        else if(dir.equals("N")){
            for (int i = 1; i <= num; i++) {
                if (map[ans[0] - i ][ans[1] ] == 0)
                    return false;
            }
        }
        return true;
    }
}
