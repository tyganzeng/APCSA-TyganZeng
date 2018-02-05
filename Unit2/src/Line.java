//© A+ Computer Science  -  www.apluscompsci.com
//Name - Tygan Zeng
//Date - 2/5/18
//Class - Period 1
//Lab  - Lab02f

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{
		slope = (double) (yTwo - yOne) / (xTwo - xOne);
	}

	public void print( )
	{
		System.out.print("the slope is :: " );
		System.out.printf("%.4f\n\n", slope);

	}
}