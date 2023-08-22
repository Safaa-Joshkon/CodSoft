//Safaa Joshkon- Task3
package task3;
public class Task3 {
    public static void main(String[] args) {
        Account account = new Account(1000.0); 
        Atm atm = new Atm(account);
        atm.chooseOption();
    }  
}
