package Thread;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();

        t1.run();
    }
}
class ThreadEx3_1 extends Thread {
    public void run() {
        throwException();
    }
    public void throwException() {
        try {
            throw new Exception() ;

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
//이전 예제와 달리 쓰레드가 새로 생성되지 않고, ThreadEx3_1클래스의 run()이 호출되었을 뿐이다.
//start()를 사용하지 않으면 새로운 CallStack이 생성되지 않고, run()만 호출할경우 메인 CallStack에서 run()만 호출 될 뿐이다.

