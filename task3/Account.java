package task3;
public class Account {
    private double balance;
    public Account(double initialBalance){
        this.balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposite(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount) 
            balance -= amount;
        else
            System.out.println("Withdraw failed. Not enough funds.");
    }
}
