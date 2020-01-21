import java.text.DecimalFormat;
public class BankAccount implements Lockable {
    private String account;
    private double balance;
    private String balanceString;
    private String currency;
    private DecimalFormat money = new DecimalFormat("0.00");
    private double yearlyInt;
    private int key;
    private boolean locked;

    public BankAccount(String name, int key, String type, double intDeposit){
        account = name;
        currency = type;
        balance = intDeposit;
        balanceString = money.format(intDeposit);
        System.out.println(account + " account was created with and initial deposit of " + balanceString + " " + currency + " dollars.");
        this.key = key;
        yearlyInt = .04;
        locked = true;
    }

    public void deposit(int key, double amount) {
        if((this.key == key) && (!locked)) {
            balance = balance + amount;
            balanceString = money.format(balance);
            System.out.println(amount + " " + currency + " dollars was deposited to " + account + " account.\nNew balance is " + balanceString + " " + currency + " dollars.");
        }
    }

    public void withdrawal(int key, double amount) {
        if((this.key == key) && (!locked)) {
            if ((balance - amount) >= 0) {
                balance = balance - amount;
                balanceString = money.format(balance);
                System.out.println(amount + " " + currency + " dollars was withdrawn from " + account + " account.\nNew balance is " + balanceString + " " + currency + " dollars.");
            } else {
                System.out.println("Error: Insufficient funds.\nPlease withdrawal a smaller amount.");
            }
        }
    }

    public void fiscalYear() {
        balance = balance + (balance * yearlyInt);
        balanceString = money.format(balance);
        System.out.println("Your balance increased by 4%!\nYour new balance is: " + balanceString + " " + currency + " dollars.");
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public boolean locked() {
        return locked;
    }

}
