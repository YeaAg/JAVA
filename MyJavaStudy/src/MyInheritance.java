class Parent{
    String name = "부모";
    int age;
    void run(){
        System.out.println("달린다");
    }
}

class Child extends Parent{
    String name = "자식";

    void walk(){
        System.out.println("걷는다");
    }

    // 1) Override가 되었다고 명시함으로서, 인식을 쉽게
    // 2) Override가 제대로 되었는지 체크 가능
    @Override
    void run() {
        System.out.println("빨리 달린다");
    }
}

class ChildChild extends Child{

}

/********************************************************/

class Annony{
    int num = 100;
    void test(){
        System.out.println("안녕");
    }
}
class Annony_A extends Annony{
    @Override
    void test(){
        System.out.println("하이!");
    }
}
class Annony_B extends Annony{
    @Override
    void test(){
        System.out.println("헬로!");
    }
}

/********************************************************/

public class MyInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
//        p.run();
//        p.name = "부모";
        System.out.println(p.name);

        Child c = new Child();
//        c.run();
        System.out.println(c.name);

        ChildChild cc = new ChildChild();

        /***********************************************/

        int number = 300;
        // Annony의 자식 객체를 만들었다 (일회용)
        Annony a = new Annony(){
            int f = 10000; // a.f로 호출 불가
            @Override
            void test(){
                System.out.println(f); // 가능
                System.out.println(number); // 가능
                System.out.println("ㅋㅋㅋㅋ");
            }
        };
        a.test();
    }
}
