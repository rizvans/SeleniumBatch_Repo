package day8;

public class class1 { //  A number is prime or not

public static void main(String[] args) {

int number=26;
int rizwan=0;

for (int i= 2; i<=number/2; i++)
{
if (number%i==0)
{ 
	System.out.println("Its not a prime number : "+ number);
	rizwan=1;
	break;
}
}
if (rizwan==0)
{
	System.out.println("Its a prime number " +number);
}
}
}