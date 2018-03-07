//© A+ Computer Science  -  www.apluscompsci.com
//Name - Tygan Zeng
//Date - 2/5/18
//Class - Period 1
//Lab  - Lab02e
import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public void calculateArea( )
	{
		area = Math.PI * (Math.pow(radius, 2));
	}

	public void print( )
	{
		System.out.println ("the area is :: " + area);
	}
}