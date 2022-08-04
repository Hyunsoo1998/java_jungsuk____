import java.util.*;
public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc"); set.add("alien"); set.add("bat");
        set.add("car"); set.add("Car"); set.add("disc");
        set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
        set.add("elephant"); set.add("elevator"); set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search  :from " + from + " to " + to );
        System.out.println("result1 : "+set.subSet(from,to) );
        System.out.println("result2 : "+set.subSet(from, to+"zzz") );

        /*subSet()을 이용해서 범위검색 할 때 시작범위는 포함되지만 끝 범위는 포함되지 않으므로 result1에는 c로 시작하는 단어까지만
        검색 결과에 포함되어있다. 만일 끝 범위인 d로 시작하는 단어까지 포함시키고자 한다면, 아래와 같이 끝 범위에 'zzz'와 같은 문자열을 붙이면 된다.
       System.out.println("result2 : "+set.subSet(from, to+"zzz") );
       문자열의 경우 정렬순서는 문자의 코드값이 기준이 되므로, 오름차순 정렬의 경우 코드값의 크기가 작은 순서에서 큰 순서, 즉 공백 숫자 대문자
       소문자 순으로 정렬되고 내림차순의 경우 그 반대가 된다.
        * */
    }

}
