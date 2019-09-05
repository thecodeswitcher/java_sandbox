import java.util.Scanner;


public class Cookies {

	public static void main(String[] args) {
		
		double sugar;
		sugar = 1.5;
		
		double butter;
		butter = 1;
		
		double flour;
		flour = 2.75;			
		
		Scanner keyboard = new Scanner( System.in);
		
		int cookies;
		
		System.out.print("How many cookies would you like to make?");
		
		cookies = keyboard.nextInt();
		
		String cookies2print = String.format("You would like to make %d cookies!", cookies); 
		
		System.out.print(cookies2print);
		
		double neededFraction;
		neededFraction = cookies/48.0;		
		
		double neededSugar;
		neededSugar = neededFraction*sugar;
		
		double neededButter;
		neededButter = neededFraction*butter;
		
		double neededFlour;
		neededFlour = neededFraction*flour;				
				
	
		String neededIngredients = String.format("You'll need: %.2f cups of sugar \n %.2f cups of butter \n %.2f cups of flour", 
												 neededSugar,
												 neededButter,
												 neededFlour
											    
				);
		
		System.out.print(neededIngredients);
		
		
	}
	
}
