//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   public int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		String[] r = line.split(" ");
		int[] x = new int[r.length];
		for(int i = 0; i < r.length; i++){
			x[i] = Integer.parseInt(r[i]);
		}
		maze = new int[size][size];
		for(int i = 0; i < x.length; i++){
			maze[i/size][i%size] = x[i];
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		if(r > -1 && r < maze.length && c > -1 && c < maze[0].length && maze[r][c] == 1){
			maze[r][c] = 0;
			if(c == maze.length - 1){
				return true;
			} else if(hasExitPath(r+1,c) || hasExitPath(r-1,c) || hasExitPath(r,c+1) || hasExitPath(r,c-1) ){
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < maze.length; r++){

			for(int c = 0; c < maze[0].length; c++){

				output = output + maze[r][c] + " ";
			}
			output = output + "\n";
		}

		return output;
	}
}