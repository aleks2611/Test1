package oop;

public class BankAccound {

    //getters and setters
    public int getAccoundNumber() {
        return accoundNumber;
    }

    public void setAccoundNumber(int accoundNumber) {
        this.accoundNumber = accoundNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //variables


    private int accoundNumber = 1;
    private int balance = 100000;
    private String customerName = "Aleksandra";
    private String customerEmail = "aglisic1717@gmail";
    private int phoneNumber = 33333;

    //Methods
    public void deposit(double depositAmout) {
        this.balance += depositAmout;
        System.out.println("Deposit" +depositAmout);


    }

    public void withrowal(double withrowal) {
        if (this.balance - withrowal <=0) {
            System.out.println("Only" + balance);
        } else {
            balance-=withrowal;
            System.out.println("Withrowal of "+ withrowal);

        }

    }
}
