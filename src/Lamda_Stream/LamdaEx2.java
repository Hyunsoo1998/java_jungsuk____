package Lamda_Stream;

public class LamdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f= () -> {}; // MyFunction2 f = (MyFunction2) (()->{});
        Object obj = (MyFunction2) (()-> {}); // Object타입으로 형변환이 생략됨.
        String str = ((Object)(MyFunction2)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        //System.out.println(()->{}); 에러. 람다식은 Object타입으로 형변환이 안됨.
        System.out.println((MyFunction2)(()->{}));
        //System.out.println((MyFunction2)(()->{}).toString());
        System.out.println(((Object)(MyFunction2)(()->{})).toString());
    }
}
