//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private int hp;
	private Image image;

	public Alien()
	{
		this(100,100,1);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		hp = 1;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("alien not found");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	public int getHp(){
		return hp;
	}
	
	public void loseHp(){
		hp = hp - 1;
	}

	public void move(String direction){
		super.move(direction);
	}

	
	public void draw( Graphics window )
	{
		window.drawImage(image, getX(), getY(), 40, 40, null);
	}

	public String toString()
	{
		return super.toString() + " Speed is " + getSpeed();
	}
}