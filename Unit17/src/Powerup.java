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

public class Powerup extends MovingThing
{
	private int speed;
	private String type;
	public Powerup()
	{
		this(0,0,1);
	}

	public Powerup(int x, int y)
	{
		this(x,y,1);
	}

	public Powerup(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		double random = Math.random() * 4.0;
		if(random < 1.8){
			type = "ATTACKSPEED";
		}
		else if(random < 3.6){
			type = "STUN";
		} else if(random < 4.0){
			type = "TRISHOT";
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

	public String getType(){
		return type;
	}
	public void draw( Graphics window )
	{
		if(type == "ATTACKSPEED"){
			window.setColor(Color.ORANGE);
		} 
		if(type == "STUN"){
			window.setColor(Color.BLUE);
		}
		if(type == "TRISHOT"){
			window.setColor(Color.darkGray);
		}
		window.fillRect(getX(), getY(), 20,20);
	}

	public void move(String direction) {
		if (direction.equals("DOWN")) {
			setY(getY() + speed);
		}
	}
	
	

	public String toString()
	{
		return "";
	}
}