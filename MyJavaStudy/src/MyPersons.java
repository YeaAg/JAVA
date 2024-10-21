class Person {
    static int population;

    Person(String name) {
        System.out.println(name + " is born.");
        population++;
    }

    static int get_population() {
        return population;
    }
}

public class MyPersons {
    public static void main(String[] args) {
        Person man = new Person("james");
        Person woman = new Person("emily");
        System.out.println("전체 인구 수: " + Person.get_population());

        /***************************************************/

//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
    }
}

/***********************************************************/

class Outer {
    private int num = 100;
    private Inner inner;

    Outer(){
        this.inner = new Inner();
    }

    class Inner {
        void print_outer_var(){
            System.out.println(num);
        }
    }
}