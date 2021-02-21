package day8;

import java.util.Scanner;

public class class5 {  // number is palindrome or not

	public static void main(String[] args) 
	{
	Scanner S= new Scanner(System.in);
	System.out.println("Enter the value");
	int number=S.nextInt();
	int temp= number;
	int rev=0,rem;
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if (number==rev)
	{
		System.out.println(number+ " is palindrome number");
	}
	else
	{
		System.out.println(number+ " is not a palindrome number");
	}
	}
}
