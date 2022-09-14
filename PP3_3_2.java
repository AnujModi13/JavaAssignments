import java.util.Scanner;
import java.util.Vector;

interface IPrinter
{
default void print()
{
    System.out.println("Default Method");
}
}
interface IScanner
{
void scanner();
}
class student implements IPrinter,IScanner
{ 
    Scanner sc=new Scanner(System.in);
    String id;
public void print()
{
    System.out.println("Id Of the student "+this.id);
}
public void scanner()
{
    System.out.println("Enter the id");
 id=sc.next(); 
 
}
}

public class PP3_3_2 {
    public static void main(String[] args) {
        student a1=new student();
        student a2=new student();
        student a3=new student();
        student a4=new student();
        student a5=new student();


        Vector v=new Vector();
        a1.scanner();
        a2.scanner();
        a3.scanner();
        a4.scanner();
        a5.scanner();


v.add(a1);
v.add(a2);
v.add(a3);
v.add(a4);
v.add(a5);


student s1=(student)v.get(0);
student s2=(student)v.get(1);
student s3=(student)v.get(2);
student s4=(student)v.get(3);
student s5=(student)v.get(4);

       
s1.print();
s2.print();
s3.print();
s4.print();
s5.print();
    }
}
