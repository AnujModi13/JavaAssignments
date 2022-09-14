public package mypack;
public class Mypac {

    public static void peli(String s)
    {
        int r,sum=0,temp;    
        int n=454; 
        
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("Yes");    
        else    
         System.out.println("No");    
      }  
      
}
 