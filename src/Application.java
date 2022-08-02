
public class Application

{

	public static void main(String[] args)
    {
		//setting up the rational numbers
		RationalNumber r1 = new RationalNumber(12, 48);
		RationalNumber r2 = new RationalNumber(12, 48);
		RationalNumber r5 = new RationalNumber(5, 2);
		RationalNumber r6 = new RationalNumber(6, 9);
		
		//identifiers to make it easier to see in the console
		System.out.println("r1 is: " +r1);
		System.out.println("r2 is: " +r2);
		System.out.println("r5 is: " +r5);
		System.out.println("r6 is: " +r6);

		int compare = r1.compareTo(r2);
//using if statements to figure out which is bigger or equal
		if(compare == 0)
			System.out.println("They are equal");
		else if(compare < 0)
			System.out.println("R2 is greater");
		else 
			System.out.println("R1 is greater");
		
		//compare
		compare = r5.compareTo(r6);
//using if statements to figure out which is bigger or equal
		if(compare == 0)
			System.out.println("They are equal");
		else if(compare < 0)
			System.out.println("R6 is greater");
		else 
			System.out.println("R5 is greater");
        
    }//end main
	
}//end class
