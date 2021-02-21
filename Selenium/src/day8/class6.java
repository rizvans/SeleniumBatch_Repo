package day8;

import java.util.Scanner;

public class class6 {   // table of a number

public static void main(String[] args) 
{
Scanner S=new Scanner(System.in);
System.out.println("Enter the number you want to print table : ");
int t=S.nextInt();

for (int i=1; i<=10;i++)
{
System.out.println(t+ "*" +i+ "=" +t*i);	
}
		
}
}
