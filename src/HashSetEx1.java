import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {
        Object [] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
        Set set =new HashSet();

        int[][] board = new int [5][5];
        for(int i = 0; set.size() < 25; i++) {
            set.add((int)Math.random()*50+1+"");
        }
        Iterator it = set.iterator();

        for(int i = 0 ; i<board.length; i++) {
            for(int j = 0; j<board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.println((board[i][j]<10 ? " ": " ") +board[i][j]);
            }
            System.out.println();
        }
    }
}
