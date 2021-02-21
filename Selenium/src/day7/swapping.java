package day7;

import java.util.Scanner;

public class swapping {  //Swapping of two number using third variable

public static void main(String[] args) {
int x,y,z;
System.out.println("Enter the value of X and Y ");
Scanner S =new Scanner(System.in);
x= S.nextInt();
y=S.nextInt();

System.out.println("Before swapping number "+x +" "+y);

z=x;
x=y;
y=z;
System.out.println("After swapping number "+x +" "+y);

	
	
	
	
}	
	
	
}
