package Exception.ch08;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        //이 코드는 예외가 발생하지 않으므로, catch문 내부에 있는 코드를 실행하지 않고 빠져나간다.

        try{
            System.out.println(3);
            System.out.println(4);
        }catch(Exception e) {
            System.out.println(5);
        }// try - catch의 끝.
        System.out.println(6);

    }//main메서드의 끝.
}
