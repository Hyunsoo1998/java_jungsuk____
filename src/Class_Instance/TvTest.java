package Class_Instance;

/*인스턴스는 참조변수를 통해서만 다룰 수 있다.
참조변수의 타입은 인스턴스의 타입과 일치해야한다.

* */
class TV {
    //Tv의 속성
    String color;
    boolean power;
    int channel;

    //TV의 기능.
    void power() {power = !power;} //TV를 켜거나 끄는 행위를 하는 메서드
    void channelUp() {++channel;} //channel을 올리는 메소드
    void channelDown() {--channel;} // channel을 내리는 메서드
}


public class TvTest {
    public static void main(String[] args) {
        TV t = new TV();

        System.out.println("t의 채널 값은 "+t.channel+"입니다.");
        t.channel = 9;
        System.out.println("t의 채널 값은 "+t.channel+"입니다.");

    }
}
