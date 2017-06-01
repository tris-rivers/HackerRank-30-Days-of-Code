import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1{
	public static void main(String[] args){
		int i = 4;
		double d = 4.0;
		String s = "HackerRank";

		Scanner scan = new Scanner(System.in);
		/*gets integer, double, and string inputs from user*/
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		
		System.out.println("Enter a decimal number: ");
		double dec = scan.nextDouble();
		
		System.out.println("Enter a sentence: ");
		String str = scan.next();
		str += scan.nextLine();

		//prints sum of both integers
		System.out.println(num+i);

		//prints sum of both doubles
		System.out.println(dec+d);

		//concatenates both strings
		System.out.println(s + " " + str);

		scan.close();
	}
}