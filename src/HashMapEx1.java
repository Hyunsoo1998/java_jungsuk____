import java.util.*;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("MyID" , "1234");
        map.put("asdf" , "1111");
        map.put("asdf" , "1234");

        Scanner scan = new Scanner(System.in);


        while(true) {
            System.out.println("id 와 패스워드를 입력해주세요: ");
            System.out.println("ID: ");
            String id = scan.next().trim();

            System.out.println("passwd: ");
            String pw = scan.next().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지않습니다. 다시 입력해주세요 ");
                continue;
            }
            if(!(map.get(id)).equals(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요  ");
                continue;
            } else{
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }

        }

    }
}
