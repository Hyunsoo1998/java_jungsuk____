package Exception.ch08;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {

            }catch(Exception e) {

            }

        }catch(Exception e) {
//            try {
//
//            }catch (Exception e) {  <- 에러 . 변수 e가 중복 선언되었다.
//
//            }
        }
        try {

        }catch(Exception e) {

        }//try- catch의 끝.
    } // main메서드의 끝.

    /*try블럭 또는 catch 블럭에 또 다른 try- catch문이 포함될 수 있다. catch 블럭 내의 코드에서도 예외가 발생할 수 있기 때문이다.
    catch블럭의 괄호 내에 선언된 변수는 catch블럭 내에서만 유효하기 때문에, 위의 모든 catch블럭에 참조변수 e 하나 만을 사용해도 된다.

    그러나 catch블럭 내에서 또 하나의 try-catch문이 포함된 경우, 같은 이름의 참조변수를 사용해서는 안된다.
    각 catch블럭에 선언된 두 참조변수의 영역이 서로 겹치므로 다른 이름을 사용해야만 서로 구별되기 때문이다.

    따라서 위의 예제에서 catch블럭 내의 try-catch문에 선언되어 있는 참조변수의 이름을 'e'가 아닌 다른 것으로 바꿔야 한다.

    * */
}
