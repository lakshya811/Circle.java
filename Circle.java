public class Circle extends Shape
{
    @Override
    public void calculateArea() {
        double R = 21;
        double area = Math.PI * Math.pow(R,2);
        System.out.println("Area of circle ="+ area);
    }
}