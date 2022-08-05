/* 21CE072_AnujModi

Q-3 Use the Account class created as above to simulate an ATM machine. Create 10 accounts with id AC001…..AC010 with initial balance 300₹. 
The system prompts the users to enter an id. If the id is entered incorrectly, ask the user to enter a correct id. 
Once an id is accepted, display menu with multiple choices. 
1. Balance inquiry 
2. Withdraw money [Maintain minimum balance 300₹] 
3. Deposit money 
4. Money Transfer 
5. Create Account 
6. Deactivate Account 
7. Exit 
Hint: Use ArrayList, which is can shrink and expand with compared to Array
*/
import java.util.ArrayList;
import java.util.Scanner;

public class PP2_2_3 {
    public static void main(String[] args) {
        ArrayList ac=new ArrayList();
        //Account AC[]=new Account[10];
        Scanner sc= new Scanner(System.in);

        for(int i=0;i<100;i++)
        {
            ac.add(new Account(i+1,300));
            //AC[i]  = new Account(i+1,300);
           // a.add(AC[i]);
        }
        int ac_no;
        int i=1;
        while(i!=0)
        {
            System.out.println("Enter Acccount Number : ");
            ac_no=sc.nextInt();
            Account a= (Account) ac.get(ac_no);
            if(ac_no<0 && ac_no>11)
            {
                ac_no=0;
                System.out.println("Enter Valid Account Number");
                break;
            }
            else
            {System.out.println("Enter your Choice : \n"
                        + "1. Balance inquiry\n"
                        + "2. Withdraw money \n"
                        + "3. Deposit money\r\n"
                        + "4. Money Transfer\r\n"
                        + "5. Create Account\r\n"
                        + "6. Deactivate Account\r\n"
                        + "7. Exit\r");

            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println(a.getBal());
                    break;
                case 2:
                    int amo;
                    System.out.println("Enter amount want to withdraw : ");
                    amo = sc.nextInt();
                    a.withdraw(amo);
                    System.out.println("Your current Balance is " + a.getBal());
                    break;
                case 3:
                    int amo2;
                    System.out.println("Enter amount want to Deposit : ");
                    amo2 = sc.nextInt();
                    a.deposit(amo2);
                    System.out.println("Your current Balance is " + a.getBal());
                    break;
                case 4:
                    int amo3;
                    System.out.println("Enter ammount want to Transfer : ");
                    amo3 = sc.nextInt();
                    System.out.println("Enter account no : ");
                    int ac_no2 = sc.nextInt();
                    if (ac_no2 < 0 && ac_no2 > 11) {
                        System.out.println("Account number is wrong plz enter proper account no\n Task Terminated");
                        break;
                    } else {
                        a.withdraw(amo3);
                        Account e = (Account) ac.get(ac_no2);
                        e.deposit(amo3);
                        System.out.println("Money tranfer Succefully");
                        System.out.println(a.getBal());
                    }
                    break;
                case 5:
                    ac.add(new Account(i+1,300));
                    System.out.println("Account created Succesfully\n Welcome to Our Bank");
                    break;
                case 6:
                    int ac_no3;
                    System.out.println("Enter the Account number,you want to Deactivate");
                    ac_no3 = sc.nextInt();
                    ac.remove(ac_no3);
                    System.out.println("Your Account Deactivated Succefully");
                    break;
                case 7:
                    break;
            }
            }
        }
    }
}
