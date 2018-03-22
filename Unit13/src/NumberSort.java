//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	public static int getNumDigits(int number)
	{
		int count = 0;
		while(number >= 1){
			number = number / 10;
			count++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		sorted = new int[getNumDigits(number)];
		int count = 0;
		while(number >= 1){
			sorted[count] = number%10;
			number = number / 10;
			count++;
		}
		
		for(int i = 0; i < count; i++){
			for(int j = 0; j < count - 1; j++){
				if(sorted[j] > sorted[j+1]){
					int temp = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
				}
			}
		}
		


		return sorted;
	}
}