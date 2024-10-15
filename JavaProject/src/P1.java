class Problem1{
    private int number;
    private String name;

    public String getName(){
        return name;
    }
    public int getNumber() {
        return number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(int number){
        this.number = number;
    }
}
public class P1 {
    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.setName("Java");
        p.setNumber(2);

        int sum = p.getNumber() + 5;
        System.out.println(sum);
        System.out.println(p.getName());
    }
}
