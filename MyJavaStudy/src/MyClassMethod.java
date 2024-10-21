class iPhone{
    // 클래스 내부에 있는 변수 : 멤버 변수 == 속성
    static String 제조사 = "애플";
    String 기종;

    // static 메서드에서는 static 변수밖에 사용할 수 없다
    static void turn_on(){
        System.out.println("전원을 켭니다");
    }

    // 현재 휴대폰의 정보를 출력할거야
    void print_information(){
        // 현재 객체가 가지고 있는 제조사와 기종을 출력
        System.out.println(제조사);
        System.out.println(기종);
        System.out.println(iPhone.제조사);
        iPhone.turn_on();
    }
}

public class MyClassMethod {
    public static void main(String[] args) {
        iPhone iPhone14 = new iPhone();
        iPhone14.기종 = "iPhone14";
        iPhone.turn_on();
        iPhone14.print_information();

        iPhone iPhone15 = new iPhone();
        iPhone15.기종 = "iPhone15";
        iPhone.turn_on();
    }
}
