/* 21CE072_AnujModi 

Q-2 Design a class named Account that contains: 
• A private int data field named id for the account (default 0). 
• A private double data field named balance for the account (default 500₹). 
• A private double data field named annualInterestRate that stores the current interest rate (default 7%). Assume all accounts have the same interest rate.
 • A private Date data field named dateCreated that stores the date when the account was created. • A no-arg constructor that creates a default account. 
• A constructor that creates an account with the specified id and initial balance. 
• The accessor and mutator methods for id, balance, and annualInterestRate. 
• The accessor method for dateCreated. 
• A method named getMonthlyInterestRate() that returns the monthly interest rate. 
• A method named getMonthlyInterest() that returns the monthly interest.
 • A method named withdraw that withdraws a specified amount from the account. 
• A method named deposit that deposits a specified amount to the account.
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
    public double withdraw(double with)
    {
        bal-=with;
        return bal;
    }
    public double deposit(double dep)
    {
        bal+=dep;
        return bal;
    }
}
