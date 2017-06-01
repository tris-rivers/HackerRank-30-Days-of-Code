import java.io.*;
import java.util.*;
import java.text.*;

public class Day0{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //gets input string from user
	System.out.println("Enter a string: ");
    String inputString = scan.nextLine();
    
    scan.close();
    
	//prints out the default string and input string
    System.out.println("Hello, World.");
    System.out.println(inputString);
  }
}
