//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Guessing game - how many numbers?");
		int userInput = keyboard.nextInt();
		GuessingGame newGame = new GuessingGame(userInput);
		newGame.playGame();
		
		System.out.println("Do you want to play again? (yes/no)");
		char response = keyboard.next().charAt(0);
		if(response == 'y'){
			System.out.println("Guessing game - how many numbers?");
			userInput = keyboard.nextInt();
			newGame.setUpperBound(userInput);
			newGame.playGame();
		} 
		




	}
}