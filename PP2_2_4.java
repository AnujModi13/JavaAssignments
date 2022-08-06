/* 21CE072_AnujModi 
Que 4 : (Subclasses of Account) In Programming Exercise 2, the Account class was defined to model a bank account. 
An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit
and withdraw funds. Create two subclasses for checking and saving accounts. A checking account has an overdraft limit,
but a savings account cannot be overdrawn. Draw the UML diagram for the classes and then implement them. Write a test 
program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.

*/

import java.util.Scanner;

public class PP2_2_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Account c=new Account();
        Account b=new Account(2145,700);
        System.out.println("Enter the Id no");
        int ID=sc.nextInt();
        b.setId(ID);
        System.out.println("Enter the Balance of Account");
        double Balance=sc.nextDouble();
        b.setBal(Balance);
        System.out.println("Enter Interest Rate of Bank");
        double Rate=sc.nextDouble();
        b.setItr(Rate);
        System.out.println("Enter the Date of Creation of Account ");
        String Date1=sc.next();
        /*System.out.println("Enter 1 to know monthly rate of interset\n" +
                "Enter 2 to Know Amount added as interset\n" +
                "Enter 3 to Withdraw Money\n" +
                "Enter 4 to Deposite Money\n" +
                "Enter 5 to View Account Balance\n");
        int k=sc.nextInt();

        if(k==1)
        System.out.println("Monthly Interset Rate is :"+b.getMonthlyInterestRate());
         else if(k==2)
        System.out.println("Monthly Interset Deposited is :"+b.getMonthlyInterest());
        else if(k==3){
    System.out.println("Enter the amount to be withdraw");
    double with=sc.nextDouble();
    b.withdraw(with);
    System.out.println("Your current Balance is "+b.getBal());
        }
        else if(k==4)
        {
            System.out.println("Enter the amount to be Deposited");
            double dep=sc.nextDouble();
            b.deposit(dep);
            System.out.println("Your current Balance is "+b.getBal());
        }
        else if(k==5)
        {
            System.out.println("The Amount of Balance is "+b.getBal());
        }*/
    }
    }

class Account
{
    private int id=0;
    private double bal=500;
    private double itr=7;
    private String date;
    double rate;
    public Account() {
    }

    public Account(int id, double bal) {
        this.id = id;
        this.bal = bal;
    }

    public int getId() {
        return id;
    }

    public double getBal() {
        return bal;
    }

    public double getItr() {
        return itr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public void setItr(double itr) {
        this.itr = itr;
    }

    public String getDate() {
        return date;
    }
    public double getMonthlyInterestRate()
    {
         rate=itr/12;
        return rate;
    }
    public double getMonthlyInterest()
    {getMonthlyInterestRate();
        double interest=rate*bal/100;
        return interest;
    }
    public void withdraw(double with)
    {
        bal-=with;
    }
    public double deposit(double dep)
    {
        bal+=dep;
        return bal;
    }
}
