//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		for(int i = 0; i < 9; i++){
			mat[i/3][i%3] = game.charAt(i);
		}


	}

	public String getWinner()
	{
		for(int i = 0; i < 3 ; i++){
			if(mat[i][0] == mat[i][1] && mat[i][1] ==  mat[i][2]){
				return mat[i][0] + "";
			}
			if(mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]){
				return mat[0][i] + "";
			}
		}

		if((mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])){
			return mat[0][0] + "";
		}
		if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]){
			return mat[0][2] +"";
		}
		return "none";
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < mat.length; r++){

			for(int c = 0; c < mat[0].length; c++){

				output = output + mat[r][c] + " ";
			}
			output = output + "\n";
		}
		if(getWinner() == "none"){
			output = output + "cat's game - no winner!";
		} else {
			output = output + getWinner() + " won the game";
		}


		return output+"\n\n";
	}
}