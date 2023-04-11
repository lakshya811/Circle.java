import java.util.Scanner;
public class Rectangle extends Shape
{
    public void calculateArea()
    {
        System.out.println("Enter length: ");
        Scanner sc= new Scanner(System.in);
        double L=sc.nextDouble();
        System.out.println("Enter breadth: ");
        Scanner sc1= new Scanner(System.in);
        double B=sc1.nextDouble();
        double area = L * B;
        System.out.println("Area of rectangle ="+area);
    }
}