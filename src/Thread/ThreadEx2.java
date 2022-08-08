package Thread;

public class ThreadEx2 {
    public static void main(String[] args) {

        ThreadEx2_1 t1 = new ThreadEx2_1();

        //main메서드에서 run()을 호출하는 것은 생성된 쓰레드를 실행시키는 것이 아니라 단순히 클래스에 선언된 메서드를 호출하는 것.

        t1.start();

    }
}

class ThreadEx2_1 extends Thread  {
    public void run () {
        throwException();
    }
    public void throwException() {
        try {
            throw new Exception();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
