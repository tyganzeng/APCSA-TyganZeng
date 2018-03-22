//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		FancyWords x = new FancyWords("");
		Scanner file = new Scanner(new File("C:\\Users\\zengt9949\\Desktop\\APCSA-Tygan\\Unit13\\src\\lab15d.dat"));
		file.nextLine();
		int counter = 0;
		while(file.hasNext()){
			x.setWords(file.nextLine());
			System.out.println(x);
			counter++;
		}
	}
}