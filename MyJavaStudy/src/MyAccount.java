import lombok.Getter;
import lombok.Setter;

// lombok
@Setter
@Getter
class Account {
    private String no; // 계좌번호
    private String password; // 계좌 비밀번호
    private int balance; // 잔액

    // 객체가 생성될 때 자동으로 실행된다
    Account(){
//        this(); // 여기서는 사용 불가
//        this("NONE", "NONE"); // 가능
        this("NONE", "NONE", 100); // 기본값 전달
        System.out.println("생성자 실행");
    }
    Account(String no, String password, int balance){
        this.no = no;
        this.password = password;
        this.balance = balance;
    }
    Account(String no, String password){
//        this(); // 내 객체의 생성자를 실행하라(생성자 안의 첫 줄만 가능)
        this(no, password, 100);
        System.out.println("계좌번호 / 비밀번호 생성자 실행");
    }

//    void sum(double a){}
//    void sum(int a){}
//    //    void sum(int b){}
//    void sum(double a, int b){}
//    int sum(int a, double b){
//        return 1;
//    }
}

public class MyAccount {
    public static void main(String[] args) {
        new Account();
        Account daeguBankAccount = new Account("11-555-456789", "1234");
    }
}
