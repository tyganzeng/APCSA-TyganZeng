
public class LabAssessment1 {
	public static void main(String[] args) {
		System.out.println(Numbers.isGoofy(1));
		System.out.println(Numbers.isGoofy(10));
		System.out.println(Numbers.isGoofy(26));
		System.out.println(Numbers.isGoofy(8));
		System.out.println(Numbers.isGoofy(1234));
		
		int[] testArray = Numbers.getSomeGoofyNumbers(15);
		int[] testArray2 = Numbers.getSomeGoofyNumbers(3);
		for(int i = 0 ; i < testArray.length; i++){
			System.out.println(testArray[i]);
		}
		for(int i = 0 ; i < testArray.length; i++){
			System.out.println(testArray2[i]);
		}
		
	}
		

	
}
