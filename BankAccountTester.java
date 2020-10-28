public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(5213452, "supersecurepassword");
    System.out.println(ba.toString());
    ba.deposit(500);
    ba.withdraw(99.99);
    ba.deposit(-5000);
    ba.withdraw(678765);
    ba.withdraw(-675);
    System.out.println(ba.toString());
    ba.setPassword("b3tt3rP@ssW0rd");
  }
}
