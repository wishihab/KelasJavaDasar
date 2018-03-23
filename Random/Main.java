/**
 *
 * @author Taeyeon
 */
 
import java.util.*;
import java.io.*;

public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
	{
     
		int fibonacciDeret =10;
		int a=0;
		int b=1;
		for ( int i=1; i<= fibonacciDeret; i++)
		{
			System.out.println("Fibonacci :" +a);
			a=a+b;
			b=a-b;
		}
    }

}