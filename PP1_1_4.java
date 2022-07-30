/*21CE072_AnujModi
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
  */
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int a=sc.nextInt();
        int[] b=new int[a];
        System.out.println("Enter array :");
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        boolean c=array123(b);
        System.out.println(c);
    }
    static boolean array123(int b[])
    {   int count1=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==1 && b[i+1]==2 && b[i+2]==3)
            {
                count1++;
            }
            if(i==b.length-2)
            {
                break;
            }
        }
        if(count1>=1)
        return true;
        else
            return false;
    }
}
