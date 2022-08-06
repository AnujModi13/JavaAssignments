/* 21CE072_AnujModi 
Que 4 : (Subclasses of Account) In Programming Exercise 2, the Account class was defined to model a bank account. 
An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit
and withdraw funds. Create two subclasses for checking and saving accounts. A checking account has an overdraft limit,
but a savings account cannot be overdrawn. Draw the UML diagram for the classes and then implement them. Write a test 
program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.

*/

public class PP2_2_4 {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount(15, 1500);
        CheckingAccount checking = new CheckingAccount(14, 1500);

        System.out.println(savings.getBalance());
        System.out.println(checking.getBalance());

        savings.withdraw(2000);
        checking.checking(3000);

        System.out.println(savings.getBalance());
        System.out.println(checking.getBalance());
    }
}
public class SavingAccount extends Account{
    double overdraftLimit = 0;

    public SavingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void withdraw (double w) {
        double balance = getBalance();
        if (balance - w < overdraftLimit)
            System.out.println("Insufficient Funds");
        else
            balance = balance - w;
    }
}
public class CheckingAccount extends Account {
    double overDraft = -1000;

    public CheckingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }

    public void checking(double i) {

        double balance = getBalance();
        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than            Rs1,000. A 50 ruppes +"
                    + "overdraft fee will be issued to your account. ");
            balance = balance - 50; }
        else
            balance = balance - i;
    }
}
