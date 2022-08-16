package Thread;

import javax.swing.*;

/*Interrupt()가 호출되면 interrupted()의 결과가 false에서 true로 바뀌어 while문을 벗어나게 된다. while문의 조건식에 !가 포함되어 있는것에
주의하자. isInterrupted()도 쓰레드의 interrupt()가 호출되었는지 확인하는데 사용할 수 있지만, interrupted()와 달리 isInterrupted()는
쓰레드의 interrupted 상태를 fals로 초기화 하지않는다.

void interrupted() : 쓰레드의 interrupted상태를 false에서 true로 변경
boolean isInterrupted() 쓰레드의 interrupted상태를 반환.
static boolean interrupted() 현재 쓰레드의 interrupted상태를 반환 후 false로 변경.

* */

public class ThreadEx13 {
    public static void main(String[] args) {
     ThreadEx13_1 th1 = new ThreadEx13_1();

     th1.start();

     String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신값은 "+ input +"입니다.");
        th1.interrupt(); //interrupt()를 호출하면 ,interrupted상태가 true가 된다.
        System.out.println("isInterrupted():" + th1.isInterrupted()); //true
    }
}
class ThreadEx13_1 extends Thread {
    public void run () {
        int i = 10;

        while(i!=0 && !isInterrupted() ) {
            System.out.println(i--);
            for(long x = 0 ; x<25000000000L; x++) { //시간지연.

            }
            System.out.println("카운트가 종료되었습니다.");
        }
    }
}
