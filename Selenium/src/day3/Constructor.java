package day3;

public class Constructor {

public Constructor(){
this(1,2,3,4);
System.out.println("This is a default constructor");	
}	

public Constructor (int a){	
this();
System.out.println("This is one parametrized constructor");	
}
	
public Constructor (int a, int b){
this(1,2,3);
System.out.println("This is second parametrized constructor");	
}

public Constructor (int a, int b, int c){
this(1);
System.out.println("This is third parametrized constructor");	
}

public Constructor (int a, int b, int c, int d){
System.out.println("This is fourth parametrized constructor");	
}

public static void main(String[] args) {
Constructor obj= new Constructor (1,2);

}

}
