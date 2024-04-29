
public class Main {
    public static void main(String[] args) {
       DebitAccount d1 = new DebitAccount("A-000-002","Me",5000.0);
       d1.deposit(+500);


        CreditAccount c1 = new CreditAccount("A-100-000", "Maaz", 2000, 100);
        c1.deposit(100);
        c1.withdraw(1100);

    }
}