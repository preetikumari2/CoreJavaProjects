package org.example.oops;

public class DataHiding {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) { // validation - data hiding benefit
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    public static void main(String[] args){
        DataHiding account = new DataHiding();
        account.setBalance(1000.0);
        System.out.println("Balance is " + account.getBalance());
        account.setBalance(-500); //blocked by validation
    }
}
