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

public class Alien2 extends Alien
{
	private int speed;
	private int hp;
	private Image image;

	public Alien2()
	{
		super();
	}

	public Alien2(int x, int y)
	{
		super(x,y);
	}

	public Alien2(int x, int y, int s)
	{
		super(x, y);
		hp = 3;	
	}

	public void draw( Graphics window )
	{
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}

	public String toString()
	{
		return super.toString() + " Speed is " + getSpeed();
	}
}
