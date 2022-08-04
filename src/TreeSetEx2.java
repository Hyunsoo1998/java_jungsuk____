import java.util.*;
public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        int [] scores = {80,95,50,35,45,65,10,100};

        for(int i = 0; i<scores.length; i ++) {
            set.add(new Integer(scores[i]));

        }
        System.out.println("50보다 작은값: " + set.headSet(new Integer(50)));
        System.out.println("50보다 큰값: "+set.tailSet(new Integer(50)));

    }
}
