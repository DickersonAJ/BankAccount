public class BankAccount {
  // Instance Variables
  private double balance;
  private int accountID;
  private String password;
  // Constructor
  public Bank(int id, String pass) {
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

  public void setpassword(String pass) {
    password = pass;
  }
  
}
