import java.util.*;
abstract class GeometricObject
{
    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends GeometricObject
{
    Scanner sc=new Scanner(System.in);
    public double getArea()   
    {
        System.out.print("Enter the radius of circle : ");
        Double Radius = sc.nextDouble();
        double Area = 3.14*Radius*Radius;
        System.out.println("Area : "+Area);
        return Area;
    }
    public double getPerimeter()
    {
        System.out.print("Enter the radius of circle : ");
        Double Radius =sc.nextDouble();
        double Perimeter=2*3.14*Radius;
        System.out.println("Perimeter : "+Perimeter);
        return Perimeter;
    }
}
class Ractangle extends GeometricObject
{
    Scanner sc=new Scanner(System.in);
    public double getArea()
    {
        System.out.println("Enter hight and width of rectangle : ");
        System.out.print("a : ");
        double a=sc.nextDouble();
        System.out.print("b : ");
        double b=sc.nextDouble();
        double Area=a*b;
        System.out.println("Area : "+Area);
        return Area;
    }
    public double getPerimeter()
    {
        System.out.println("Enter hight and width of rectangle : ");
        System.out.print("a : ");
        double a=sc.nextDouble();
        System.out.print("b : ");
        double b=sc.nextDouble();
        double Perimeter=2*(a+b);
        System.out.println("Perimeter : "+Perimeter);
        return Perimeter;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Circle c= new Circle();
        // c.getArea();
        // c.getPerimeter();

        Ractangle r=new Ractangle();
        // r.getArea();
        // r.getPerimeter();

        double AreaOfCircle = c.getArea();
        double AreaOfRectangle= r.getArea();
        double PerimeterOfCircle = c.getPerimeter();
        double PerimeterOfRectangle = r.getPerimeter();
        if(AreaOfCircle > AreaOfRectangle)
        {
            System.out.println("Area of circle is greater than ractangle");
        }
        else
        {
            System.out.println("Area of rectangle is greater than circle");
        }
        if(PerimeterOfCircle>PerimeterOfRectangle)
        {
            System.out.println("Perimeter of circle is greater than ractangle");
        }
        else
        {
            System.out.println("Perimeter of rectangle is grater than circle");
        }
    }
}
