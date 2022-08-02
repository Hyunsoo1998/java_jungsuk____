import java.util.*;
public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack() ;
        Queue q = new LinkedList() ; //Queue 인터페이스의 구현체인 LinkedList를 사용,

        st.push("0");
        st.push("1");
        st.push("2");


        //bollean offer() :  Queue에 객체를 저장, 성공하면 true, 실패하면 false를 반환.
        // Object poll() : Queue에서 객체를 꺼내서 반환. 비어있으면 null을 반환.
        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack");
        while(!st.empty()) {
            System.out.println(st.pop());
        }
        System.out.println(" Queue=");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }




    }
}
