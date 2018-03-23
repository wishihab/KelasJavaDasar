import java.util.*;
import java.io.*;

public class Fibonnaci 
{

    public static void main(String[] args) 
	{
		int x=0;
		int z=1;
		int banyakfibonnaci =35;
		
		for ( int i=1; i<=banyakfibonnaci; i++)
		{
			System.out.println("Fibonacci :" +x);
			x=x+z;
			z=x-z;
		}
    }

}