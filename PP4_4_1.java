public class PP4_4_1 {
    public static void main(String[] args) {
        int a[]=new int [2];

        try
        {
            System.out.println(27/3/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured");
        }
        try
        {
            a[3]=45;
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
        try {
            
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
