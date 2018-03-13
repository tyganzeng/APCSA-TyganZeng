//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i = 0; i < word.length(); i++){
			for(int j = 0; j < vowels.length(); j++){
				if(vowels.charAt(j) == (word.charAt(i))){
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		if(numVowels() > rhs.numVowels()){
			return 1;
		}
		if(numVowels() < rhs.numVowels()){
			return -1;
		}
		if(numVowels() == rhs.numVowels()){
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) > rhs.word.charAt(i)){
					return 1;
				}
				if(word.charAt(i) < rhs.word.charAt(i)){
					return -1;
				}
			}
		}
		return -1;
	}

	public String toString()
	{
		return word;
	}
}