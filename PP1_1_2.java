// 21CE072 _Anuj Modi

/*Given a string, return a string made of the first 2 chars (if present), however include 
first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"*/

import java.util.Scanner;

public class PP1_1_2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        if(a.charAt(0)=='o')
        {
            System.out.println('o');
        }
        if(a.charAt(1)=='z')
        {
            System.out.println('z');
        }

    }
}
