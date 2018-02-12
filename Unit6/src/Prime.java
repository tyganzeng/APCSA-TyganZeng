//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{

	}

	public Prime(int num)
	{
		number = num;
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		double square = number;
		for (int i = 2; i <= Math.sqrt(square); i++){
			if (number % i == 0){
				return false;
			}
		} 
		
		return true;
		
	}

	public String toString()
	{
		String output = "";
		if(isPrime()){
			output = number + " is prime.";
		} else{
			output = number + " is not prime.";
		}
		return output;
	}
}