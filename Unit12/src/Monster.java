//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		setWeight(0);
		setHeight(0);
		setAge(0);
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setWeight(0);
		setHeight(ht);
		setAge(0);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setWeight(wt);
		setHeight(ht);
		setAge(0);
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setWeight(wt);
		setHeight(ht);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age
	public void setWeight(int weight){
		myWeight = weight;
	}
	public void setHeight(int height){
		myHeight = height;
	}
	public void setAge(int age){
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getWeight(){
		return myWeight;
	}
	public int getHeight(){
		return myHeight;
	}
	public int getAge(){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getHeight(), getWeight(), getAge());
	}

	public boolean equals( Object obj )
	{
		if(getHeight() == ((Monster) obj).getHeight() && getWeight() == ((Monster) obj).getWeight() && getAge() == ((Monster) obj).getAge())
			return true;
		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(getHeight() > rhs.getHeight()){
			return 1;
		}
		if(getHeight() < rhs.getHeight()){
			return -1;
		}
		if(getHeight() == rhs.getHeight()){
			if(getWeight() > rhs.getWeight()){
				return 1;
			}
			if(getWeight() < rhs.getWeight()){
				return -1;
			}
			if(getWeight() == rhs.getWeight()){
				if(getAge() > rhs.getAge()){
					return 1;
				}
				if(getAge() < rhs.getAge()){
					return -1;
				}
			}
		}
		return 0;
	}

	//write a toString() method
	public String toString(){
		String output = "";
		output = output + getHeight() + " " + getWeight() + " " + getAge() + " ";
		return output;
		}
	
}