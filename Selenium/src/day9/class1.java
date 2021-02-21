package day9;   // File Reading Topic

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class class1 {

public static void main(String[] args) throws IOException
{
 File F= new File("../Selenium/Riz.txt");
 FileReader fr= new FileReader(F);
 BufferedReader b= new BufferedReader(fr);
 String s;
 while((s= b.readLine())!=null)
 {
	 System.out.println(s);	 
 }
 		
}	
}
