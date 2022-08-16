package Thread;

import javax.swing.*;

public class ThreadEx14 {
    public static void main(String[] args) {

        ThreadEx14_1 th1 = new ThreadEx14_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 "+input+" 입니다.");
        th1.interrupt(); //interrupt()를 호출하면, interrupted상태가 true가 된다.
        System.out.println("isInterrupted(): "+th1.isInterrupted());

        //isInterrupted():현재 쓰레드의 상태를 반환함.
    }
}
class ThreadEx14_1 extends Thread {


    public void run () {
        int i = 10;
        while(i != 0 &&  !isInterrupted()) {
            System.out.println(i--);
            try{
                Thread.sleep(1000); //1초 지연.
            }catch(InterruptedException e) {

            }
        }
        System.out.println("카운트가 종료되었습니다. ");
    }
}
/*이전 예제에서 시간지연을 위해 for문을 사용했을때는 카운트가 종료되었지만 이번 에제에서는 Thread.sleep(1000);으로 변경했는데 카운트가 종료되지 않았다.
* isInterrupted()의 결과를 출력해보니 false()이다.
*
* 이전예제: for(long x= 0; x<25000000000L, x++); -> try{ Thread.sleep(1000); } catch(InterruptedException e) {}
*
* 그 이유는 Thread.sleep(1000)에서 InterruptedException이 발생했기 때문이다. sleep()에 의해 쓰레드가 잠시 멈춰있을 때, interrupt()를
* 호출하면 InterruptedException이 발생되고 쓰레드의 interrupted상태는 false로 자동 초기화 된다.
*
* */