import javax.swing.JOptionPane;

//© A+ Computer Science  -  www.apluscompsci.com
//Name - Tygan Zeng
//Date - 2/1/2018
//Class - APCSA
//Lab  - 0b

public class Lab0b
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		String input= JOptionPane.showInputDialog("Enter a byte :: ");
		byte byteOne = Byte.parseByte(input);

		input= JOptionPane.showInputDialog("Enter a short :: ");
		short shortOne = Short.parseShort(input);
		
		input= JOptionPane.showInputDialog("Enter an integer :: ");
		int intOne = Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog("Enter a long :: ");
		long longOne = Long.parseLong(input);

		//decimal variables
		input= JOptionPane.showInputDialog("Enter a float :: ");
		float floatOne = Float.parseFloat(input);

		input= JOptionPane.showInputDialog("Enter a double :: ");
		double doubleOne = Double.parseDouble(input);

		//other integer types
		input= JOptionPane.showInputDialog("Enter a char :: ");
		char charOne = input.charAt(0);
		//other types
		input= JOptionPane.showInputDialog("Enter a boolean :: ");
		boolean booleanOne = Boolean.parseBoolean(input);
		input= JOptionPane.showInputDialog("Enter a String :: ");
		String stringOne = input;
		
		//output your information here
		
		JOptionPane.showMessageDialog(null, "Byte value :: " + byteOne);
		JOptionPane.showMessageDialog(null, "Short value :: " + shortOne);
		JOptionPane.showMessageDialog(null, "Integer value :: " + intOne);
		JOptionPane.showMessageDialog(null, "Long value :: " + longOne);
		JOptionPane.showMessageDialog(null, "Float value :: " + floatOne);
		JOptionPane.showMessageDialog(null, "Double value :: " + doubleOne);
		JOptionPane.showMessageDialog(null, "Char value :: " + charOne);
		JOptionPane.showMessageDialog(null, "Boolean value :: " + booleanOne);
		JOptionPane.showMessageDialog(null, "String value :: " + stringOne);
	/*	System.out.println("/////////////////////////////////");
		System.out.println("*Tygan Zeng                02/1/18*");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");		
		System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        real types          *");
		System.out.println("*                               *");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t\t*");	
		System.out.println("*                               *");
		System.out.println("*     other integer types          *");
		System.out.println("*                               *");
		System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        other types          *");
		System.out.println("*                               *");
		System.out.println("*booleanOne = "+booleanOne+"\t\t*");
		System.out.println("*stringOne = "+stringOne+"\t\t*");	
*/
	}
}