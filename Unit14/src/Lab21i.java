//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit14\\src\\lab21i.dat"));
		int size = file.nextInt();
		file.nextLine();
		String line = file.nextLine();
		Maze tester = new Maze(size,line);
		//Maze tester = new Maze(3,"0 0 0 1 1 1 0 1 0");
		//System.out.println(tester.maze[0].length);
		System.out.println(tester);
		if(tester.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		
		size = file.nextInt();
		System.out.println(size);
		file.nextLine();
		line = file.nextLine();
		Maze tester2 = new Maze(size,line);
		System.out.println(tester2);
		if(tester2.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		
		size = file.nextInt();
		System.out.println(size);
		file.nextLine();
		line = file.nextLine();
		Maze tester3 = new Maze(size,line);
		System.out.println(tester3);
		if(tester3.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		
		size = file.nextInt();
		System.out.println(size);
		file.nextLine();
		line = file.nextLine();
		Maze tester4 = new Maze(size,line);
		System.out.println(tester4);
		if(tester4.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		
		size = file.nextInt();
		System.out.println(size);
		file.nextLine();
		line = file.nextLine();
		Maze tester5 = new Maze(size,line);
		System.out.println(tester5);
		if(tester5.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		size = file.nextInt();
		System.out.println(size);
		file.nextLine();
		line = file.nextLine();
		Maze tester6 = new Maze(size,line);
		System.out.println(tester6);
		if(tester6.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		
		/*Maze tester3 = new Maze(3, "1 0 0 1 1 0 1 1 1");
		System.out.println(tester3);
		if(tester3.hasExitPath(0, 0)){
			System.out.println("Exit found!");
		} else {
			System.out.println("No Exit found.");
		}
		System.out.println(tester3);*/
	}
}