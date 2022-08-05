/* 21CE072_AnujModi

Q-1 Design a class named Circle containing following attributes and behavior. 
• One double data field named radius. The default value is 1. 
• A no-argument constructor that creates a default circle. 
• A Single argument constructor that creates a Circle with the specified radius.
 • A method named getArea() that returns area of the Circle. 
• A method named getPerimeter() that returns perimeter of it.
*/
import java.util.Scanner;

public class PP2_2_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
Circle c=new Circle();
double r1;
        System.out.println("Enter the value of the radius");
        r1=sc.nextDouble();
Circle c1=new Circle(r1);
double a=c1.getArea();
        System.out.println(a);
double b=c1.getPerimeter();
        System.out.println(b);
    }
}
class Circle
{
    double radius=1;
    Circle()
    {
    }
    Circle (double r)
    {
        radius=r;
    }
    double getArea()
    {
        double area=3.14*radius*radius;
        return area;
    }
    double getPerimeter()
    {
        double perimeter=2*3.14*radius;
        return perimeter;
    }
}
