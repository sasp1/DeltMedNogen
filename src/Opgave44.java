import java.util.Scanner;

public class Opgave44 {

	public static void main(String[] args) 
	{
		
		System.out.println(TjekOmTal());
	}
	public static String TjekOmTal()
	{
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		
		try {
			Double.parseDouble(input);
		} catch (NumberFormatException e) {
			return "no";
		} 
		
		//Random comment :) (for at teste Git)
		//Endnu en kommentar for at teste Git (denne gang med den hurtigere commit kommando) 
		
		return "yes"; 
	}
	
	

}
