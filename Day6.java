import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();
		
		for(int i=0;i< n;i++){//for reading array
			String str = sc.next();
			char arr[] = str.toCharArray();
			
			for(int j = 0; j < arr.length; j++){
				if(j%2 == 0){
					System.out.print(arr[j]);
				}
			}			
		
			System.out.print(" ");
		
			for(int j = 0; j < arr.length; j++){
				if(j%2 != 0){
					System.out.print(arr[j]);
				}
			}
			
			System.out.println();
		}
		sc.close();
	}
}