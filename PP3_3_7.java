interface work
{
   public void check(int a);
   default void show()
   {
       System.out.println("Program Executed");
   }
}
class fast implements work
{
    public void check(int a)
    {
        if(a>15)
            System.out.println("Fast");
        else
            System.out.println("Slow");
    }

}
public class PP3_3_7 {
    public static void main(String[] args) {
fast f= new fast ();
f.check(20);
f.show();
    }
}
