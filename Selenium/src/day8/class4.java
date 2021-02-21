package day8;

import java.util.Scanner;

public class class4 {  // Factorial of a number


public static void main(String[] args) 
{
 System.out.println("Enter the value of a Factorial number: ");
 Scanner s=new Scanner(System.in);
 int value = s.nextInt();
 int result = 1;
 for (int i=1; i<=value; i++)
 {
	 result= result*i;
 }
 System.out.println("Factorial of a number "+value+" is  "+ result );
}	
}
