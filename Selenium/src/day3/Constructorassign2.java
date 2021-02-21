package day3;

public class Constructorassign2 {

public void method(){
this.method3(1, 2, 3);
System.out.println("This is default method");
}

public void method1(int a){
this.method2(1, 2);
System.out.println("This is 1 parametrized method");
}	
public void method2(int a, int b){
this.method4(1, 2, 3, 4);
System.out.println("This is 2 parametrized method");	
}	
public void method3(int a, int b, int c){

System.out.println("This is 3 parametrized method");	
}		
public void method4(int a, int b, int c, int d){
this.method();
System.out.println("This is 4 parametrized method");	
}			
public static void main(String[] args) {
Constructorassign2 obj2 = new Constructorassign2();
obj2.method1(1);
}
}


