package day7;

public class class3 implements interface1
{
public void method1(){
	System.out.println("body given by child class");
}
public void method2(){
	System.out.println("body given");
}
public static void main(String[] args) {
	class3 obj = new class3();
	obj.method1();
	obj.method2();
}

	
	
	
	
}
