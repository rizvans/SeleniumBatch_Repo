package day8;  

public class class2 {  //  A number is Armstrong or not
	
public static void main(String[] args) {
	
int number=153;
int old_number= number;
int sum=0;

while (number>0)
{
int r=number%10;   
sum = sum+r*r*r;   
number= number/10;	 
}	
 if (old_number== sum)
 {
     System.out.println("Its a armstrong number " + old_number);
 }
 else
 {
	 System.out.println("Its not a armstrong number " + old_number);
 }
 }
 }