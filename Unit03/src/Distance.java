//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	Scanner keyboard = new Scanner(System.in);
	
	public Distance()
	{
		System.out.print("Enter x1 ::");
		int intOne = keyboard.nextInt();
		System.out.print("Enter y1 ::");
		int intTwo = keyboard.nextInt();
		System.out.print("Enter x2 ::");
		int intThree = keyboard.nextInt();
		System.out.print("Enter y2 ::");
		int intFour = keyboard.nextInt();
		
		setCoordinates(intOne, intTwo, intThree, intFour);
	}

	public Distance(int x1, int y1, int x2, int y2)
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

	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
	}

	public void print( )
	{
		System.out.printf("The distance is %.3f \n\n", distance);

	}
}