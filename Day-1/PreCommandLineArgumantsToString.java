import java.lang.String;
import java.lang.System;


public class PreCommandLineArgumantsToString{
	public static void main(String args[]){
	
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int sum = a + b;
	System.out.println("Addition of Two Arguments : " +sum);
	
}
}