public class BankAccount {
  // Instance Variables
  private double balance;
  private int accountID;
  private String password;
  // Constructor
  public BankAccount(int id, String pass) {
    balance = 0;
    accountID = id;
    password = pass;
  }

  public double getBalance() {
    return (balance);
  }

  public int getAccountID() {
    return (accountID);
  }

  public void setPassword(String pass) {
    password = pass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance+=amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount) {
    if (amount >= 0) {
      if (amount <= balance) {
        balance-=amount;
        return true;
      }
    }
    return false;
  }

  public String toString() {
    return ("#" + Integer.toString(getAccountID()) + "\t$" + String.valueOf(getBalance()));
  }

}
