package inheritance;
abstract class Quadrilateral
{
   protected double side1,side2,side3,side4;
   public Quadrilateral(double side1,double side2,double side3,double side4)
   {
       this.side1=side1;
       this.side2=side2;
       this.side3=side3;
       this.side4=side4;
   }
   protected abstract double getArea();
   protected double getPerimeter()
   {
       return (side1+side2+side3+side4);
   }
}
class Parallelogram extends Quadrilateral
{
	private double height;
	public Parallelogram(double side1,double side2,double height)
	{
		super(side1,side2,side1,side2);
		this.height=height;
	}
	public double getArea()
	{
		return side1*height;
   	}
}
class Rhombus extends Parallelogram
{
	public Rhombus(double side,double height)
	{
		super(side,side,height);
	}
}
class Rectangle extends Parallelogram
{
	public Rectangle(double length,double breadth)
	{
		super(length,breadth,breadth);
	}
}
class Square extends Rhombus
{
	public Square(double side)
	{
		super(side,side);
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
	}
}
