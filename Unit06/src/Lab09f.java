//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam", 'a');
		out.println(test);
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		out.println(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		out.println(test);
		
		test.setRemover("abababababa", 'b');
		out.println(test);
		
		test.setRemover("abababababa", 'x');
		out.println(test);		
	}
}