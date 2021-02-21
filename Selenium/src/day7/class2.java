package day7;

public class class2 extends class1
{
public void method2(){
	System.out.println("Body given by child class");
}
public static void main(String[] args) {
class2 obj = new class2();
obj.method1();
obj.method2();
}
}
