package Thread;

/* 쓰레드가 가질 수 있는 우선순위의 범위는 1~10 이며 숫자가 높을수록 우선순위가 높다.
쓰레드의 우선순위는 쓰레드를 생성한 쓰레드로부터 상속받는다. main메서드를 수행하는 쓰레드는 우선순위가 5이므로
main메서드 내에서 생성하는 쓰레드의 우선순위는 자동적으로 5가 된다.

th1과 th2모두 main메서드 내에서 생성하였기 때문에 main메서드를 실행하는 쓰레드의 우선순위인 5를 상속받았다.
그 다음에 th2.setPriority(7)로 th2의 우선순위를 7로 변경한 다음에 start()를 호출해서 쓰레드를 실행시켰다.
쓰레드를 실행하기 전에만 우선순위를 변경 할 수 있다.


* */

public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th2.setPriority(7);

        System.out.print("Priority of th1(-): "+ th1.getPriority());
        System.out.print("Priority of th2(-): "+ th2.getPriority());

        th1.start();
        th2.start();


    }
}
class ThreadEx8_1 extends Thread {
    public void run() {
        for(int i = 0 ; i < 300; i++) {
            System.out.print("-");
            for(int x= 0; x< 10000000; x++);
        }
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for(int i = 0 ; i<300; i++) {
            System.out.print("|");
        for(int x= 0 ; x<10000000; x++);
        }
    }
}