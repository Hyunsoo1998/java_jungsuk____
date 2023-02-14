package Exception.ch08;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1(); // 같은 클래스내의 static 멤버이므로 객체생성없이 직접 호출 가능.
        //main메서드 끝


    }
    static void method1() throws Exception {
        method2();
        //method1 의 끝
    }
    static void method2() throws Exception {
        throw new Exception();
        //method2 의 끝
    }
}
