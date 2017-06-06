import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		
		String ans = "";
		
		if(n%2 == 1){
			ans = "Weird";
		}else{
			if((n>=2 && n<=5)||(n>20))
				ans = "Not Weird";
			else if(n>=6 && n<=20)
				ans = "Weird";
		}
		System.out.println(ans);
	}
}