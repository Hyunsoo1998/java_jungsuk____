package Thread;

/* 1.Thread클래스를 상속
    class MyThead extends Thread {
    public void run() {
        작업내용  //thread클래스의 run()을 오버라이딩.
    }

    2.Runnable인터페이스를 구현

    class MyThread implements Runnable {
    public void run() {
        작업내용 //Runnable인터페이스의 Run()을 구현.
    }
    }

    Runnable인터페이스는 오로지 run()만 정의되어 있는 간단한 인터페이스이다.
    Runnable 인터페이스를 구현하기 위해서 해야 할 일을 추상메서드인 run() 의 몸통을 만들어주는것 뿐이다.
    public interface Runnable {
    public abstract void run();
    }

* */


public class ThreadEx1 {
    public static void main(String[] args) {

        ThreadEx1_1 t1 = new ThreadEx1_1() ; //Thread의 자손 클래스의 인스턴스를 생성.

        Runnable r  = new ThreadEx1_2(); //Runnable을 구현한 클래스의 인스턴스를 생성.
        Thread t2 = new Thread(r); // 생성자 Thread(Runnable Target)

        //위의 두줄을 한줄로 간단히 표현하면
        //-> Thread t2 = new Thread(new ThreadEx1_2());


        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for(int i = 0; i< 5; i ++) {
            System.out.println("첫번째 실행 "+getName()+i+"번"); // 조상인 Thread의 getName()을 호출.

        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run () {
        for(int i = 0 ; i<5; i ++) {
            //Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
            System.out.println(Thread.currentThread().getName());
        }
    }
}
