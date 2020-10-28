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

  public double getbalance() {
    return (balance);
  }

  public int getaccountID() {
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
    return (Integer.toString(getaccountID()) + "\t" + String.valueOf(getbalance()));
  }

}
