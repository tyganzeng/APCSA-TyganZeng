//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	//instance variables
	int numGrades;
	Scanner keyboard = new Scanner(System.in);
	double[] gradesList;

	//constructor
	public Grades(){
		System.out.print("How many grades?");
		numGrades = keyboard.nextInt();
		gradesList = new double[numGrades];
		for (int i = 0; i < numGrades; i++){
			System.out.println("Enter grade " + i + ": ");
			gradesList[i] = keyboard.nextDouble();	
		}
		Arrays.sort(gradesList);
	}

	//set method
	public void setGrades(){
		System.out.print("How many grades?");
		numGrades = keyboard.nextInt();
		gradesList = new double[numGrades];
		for (int i = 0; i < numGrades; i++){
			System.out.println("Enter grade " + i + ": ");
			gradesList[i] = keyboard.nextDouble();	
		}
	}

	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < gradesList.length; i++){
			sum = sum + gradesList[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / gradesList.length;
		return Math.round(average * 100.0) / 100.0;
	}


	//toString method
	public String toString(){
		String output = "";
		for (int i = 0; i < gradesList.length; i++){
			output = output + "Grade " + i + " is " + gradesList[i] + "%\n";
		}
		output = output + "average = " + getAverage() + "%";
		return output;
	}


}