public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(5213452, "supersecurepassword");
    BankAccount ba2 = new BankAccount(1234567, "beep");
    System.out.println(ba.toString());
    ba.deposit(500);
    ba.withdraw(99.99);
    ba.deposit(-5000);
    ba.withdraw(678765);
    ba.withdraw(-675);
    System.out.println(ba.toString());
    ba.setPassword("b3tt3rP@ssW0rd");
    ba.transferTo(ba2, 5, "b3tt3rP@ssW0rd");
    System.out.println(ba.toString());
    System.out.println(ba2.toString());
    ba.transferTo(ba2, 10, "wrong");
    System.out.println(ba.toString());
    System.out.println(ba2.toString());
    ba.transferTo(ba2, 50000, "b3tt3rP@ssW0rd");
    System.out.println(ba.toString());
    System.out.println(ba2.toString());
    ba2.transferTo(ba, -2, "beep");
    System.out.println(ba.toString());
    System.out.println(ba2.toString());
  }
}
