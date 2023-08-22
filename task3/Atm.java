package task3;
import java.util.Scanner;
public class Atm {
    Scanner scan = new Scanner(System.in);
    private Account account;
    public Atm(Account account) {
        this.account = account;
    }
    public void options(){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void chooseOption(){
        boolean exit=false;
        while (!exit) {
            options();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            if(choice==1) 
                System.out.println("Your balance is: " + account.getBalance());
            else if(choice==2){
                System.out.print("Enter deposite amount: ");
                double depositeAmount = scan.nextDouble();
                account.deposite(depositeAmount);
                System.out.println("Deposite successful.");
            } 
            else if(choice==3){
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scan.nextDouble();
                account.withdraw(withdrawalAmount);
                System.out.println("Withdraw successful.");
            } 
            else if(choice==4){
                exit = true;
                System.out.println("Exiting the ATM.");
            } 
            else 
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}
