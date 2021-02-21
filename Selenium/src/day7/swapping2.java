package day7;

import java.util.Scanner;

public class swapping2 {  // Swapping of two number without using third variable
public static void main(String[] args) {
int x,y;
System.out.println("Enter the value of X and Y");
Scanner S=new Scanner(System.in);
x=S.nextInt();
y=S.nextInt();

System.out.println("Before swapping number "+x +" "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swapping number "+x + " " +y);
}
}
