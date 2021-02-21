package day8;

public class class3 {     // Fibnocci series up to 12

	
public static void main(String[] args) {
 int a1=0;
 int a2=1;
 int sum;
 System.out.println(a1);
 System.out.println(a2);
 
 for (int i=1; i<=10; i++)
 {
  sum= a1+a2;
  System.out.println(sum);
  a1=a2;
  a2=sum;

 }	

}
}