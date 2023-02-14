package Exception.ch08;

public class ExceptionEx3 {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        for(int i = 0; i< 10; i++) {
            try {
                result = number / (int)(Math.random() * 10);
                System.out.println(result);
            }catch(ArithmeticException e) {
                System.out.println("ArithmeticException이 발생하여 실행되는 코드 : 0"); // ArithmeticException이 발생하면 실행되는 코드
            }//try- catch의 끝.
        }
        //for 의 끝.

    }
}
