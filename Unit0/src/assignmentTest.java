import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class assignmentTest {
	//� A+ Computer Science  -  www.apluscompsci.com
	//Name - 
	//Date -
	//Class -
	//Lab  -

		public static void main ( String[] args )
		{
			char[][] x = new char[5][6];
			for(char[] row : x){
				Arrays.fill(row, 'a');
			}
			System.out.println(x[3][4]);
			/*int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};
			 
	        // To fill complete array with a particular
	        // value
	        Arrays.fill(ar, 10);
	        System.out.println("Array completely filled" +
	                  " with 10\n" + Arrays.toString(ar));*/
		}
		
		public static String test(){
			char j = 'A';
			String x  = "";
			for(int i = 0; i < 5; i++){
				x = x + j;
			}
			return x;
		}
	
}
