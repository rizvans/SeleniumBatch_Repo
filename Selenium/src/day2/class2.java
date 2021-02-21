package day2;

public class class2 {
public int sum (int a, int b){
int c =a+b;
return c;
}

public int sub(int a, int b){
int c= a-b;
return c;
}

public int mul(int a, int b){
int c= a*b;
return c;
}

public int div(int a, int b){
int c= a/b;
return c;
}

public static void main(String[] args) {
class2 riz = new class2();
int sum_result = riz.sum(10, 2);
int sum_result2 = riz.sum(sum_result, 2);
int sub_result = riz.sub(sum_result2, 2);
int mul_result = riz.mul(sub_result, 2);
int div_result = riz.div(mul_result, 2);
System.out.println("Result of ((((10+2)+2)-2)*2)/2 is " + div_result);

class2 riz1= new class2();
int sub_result1= riz1.sub(10, 2);
int mul_result1= riz1.mul(sub_result1, 2);
int sub_result2= riz1.sub(mul_result1, 2);
int sum_result3= riz1.sum(sub_result2, 2);
int div_result1= riz1.div(sum_result3, 2);
System.out.println("Result of ((((10-2)*2)-2)+2)/2 is " + div_result1);
}
}




