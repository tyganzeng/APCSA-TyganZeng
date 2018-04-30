//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,4);
	}

	public Ammo(int x, int y)
	{
		this(x,y,4);
	}

	public Ammo(int x, int y, int s)
	{
		super(x, y);
		speed=s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
		window.fillRect(getX(), getY(), 10,10);
	}

	public void move(String direction) {
		if (direction.equals("UP")) {
			setY(getY() - speed);
		}
		if(direction.equals("LEFTDIAGONAL")){
			setY(getY() - speed);
			setX(getX() - speed/2);
		}
		
		if(direction.equals("RIGHTDIAGONAL")){
			setY(getY() - speed);
			setX(getX() + speed/2);
		}
	}
	
	

	public String toString()
	{
		return "";
	}
}
