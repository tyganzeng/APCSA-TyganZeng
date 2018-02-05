//© A+ Computer Science  -  www.apluscompsci.com
//Name - Tygan Zeng
//Date - 2/5/18
//Class - Period 1
//Lab  - Lab02g

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	public void print()
	{
		System.out.print(fahrenheit + " degrees fahrenheit == ");
		System.out.printf("%.2f", getCelsius());
		System.out.print(" degrees celsius \n\n");
	}
}