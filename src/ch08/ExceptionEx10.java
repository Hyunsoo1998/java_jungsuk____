package Exception.ch08;

public class ExceptionEx10 {
    public static void main(String[] args) {
        throw new Exception(); //Exception을 고의로 발생시킨다.

        //이 예제를 작성한 후에 컴파일 하면 에러가 발생하며 컴파일이 완료되지 않을것이다.
        //예외처리가 되어야할 부분에 예외처리가 되어 있지 않다는 에러이다.
        //위의 결과에서 알 수 있는 것처럼, 앞서 Exception클래스들이 발생할 가능성이 있는 문장들에 대해 예외처리를 해주지 않으면 컴파일조차 되지 않는다.


    }
}
