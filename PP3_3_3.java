interface p
{
String id="21ce072";
void printp();
}

interface p1 extends p
{
 String name="Anuj";
 void printp1();
 }

interface p2 extends p
{
    String dept="C.S.P.I.T";
    void printp2();
}
interface p12 extends p1,p2
{
    String sem="Second";
    void printp12();
}

 class student1 implements p12
{
public void printp()
{
    System.out.println(this.id);
}

public void printp1()
{
    System.out.println(this.name);
}

public void printp2()
{
    System.out.println(this.dept);
}

public void printp12()
{
    System.out.println(this.sem);
}
}
public class PP3_3_3 {
    public static void main(String[] args) {
        student1 s=new student1();
        s.printp();
        s.printp1();
        s.printp2();
        s.printp12();

    }
}
