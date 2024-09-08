interface Account {
    public void deposit(int amount);
    public void withdraw(int amount);
    static void aboutBank() {
        System.out.println("\nBank Name: PNB");
    }
}

class Saving implements Account{
    private int balance=0;

    @Override
    public void deposit(int amt) {
        balance += amt;
        System.out.printf("\n%d deposited in savings account!\n",amt);
    }

    @Override
    public void withdraw(int wth) {
        balance -= wth;
        System.out.printf("\n%d withdrawn from savings account!\n",wth);
    }

    public void displayBalance() {
        System.out.println("\nSavings account balance = " + this.balance);
    }
}

class Current implements Account{
    private int balance=0;

    @Override
    public void deposit(int amt) {
        balance += amt;
        System.out.printf("\n%d deposited in current account!\n",amt);
    }

    @Override
    public void withdraw(int wth) {
        balance -= wth;
        System.out.printf("\n%d withdrawn from current account!\n",wth);
    }

    public void displayBalance() {
        System.out.println("\nCurrent account balance = " + this.balance);
    }
}

public class W12Q1 {
    public static void main(String[] args) {
        Saving sv = new Saving();
        Account.aboutBank();

        sv.deposit(2000);
        sv.withdraw(12000);
        sv.displayBalance();

        Current ct = new Current();
        ct.deposit(10000);
        ct.withdraw(8000);
        ct.displayBalance();
    }
}
