import java.util.*;
import java.math.*;

public class Arithmetic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter meal cost: ");
		double mealCost = sc.nextDouble(); //original meal price

		System.out.print("Enter tip percentage: ");
		int tipPercent = sc.nextInt(); //tip percentage

		System.out.print("Enter tax percentage: ");
		int taxPercent = sc.nextInt(); // tax percentage
		sc.close();

		double tip = mealCost * tipPercent/100;
		double tax = mealCost * taxPercent/100;
		double cost = mealCost + tip + tax;

		//cast the result of the rounding operation to an int
		int totalCost = (int) Math.round(cost);

		//Prints the result
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}
}
