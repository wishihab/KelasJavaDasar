import java.util.Scanner;

public class BilanganPrima
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		System.out.println("Program Menentukan Bilangan Prima!!");
        System.out.println("Masukan Angka Di Bawah Ini :");
        int x=input.nextInt();
        int temp=0;
        
		for (int i=1;i<x;i++){
            if (x%i==0)
			{
                temp=temp+1;
            }
        }
        if (temp==1)
		{
            System.out.println("Termasuk Bilangan Prima");
        }
		else{
            System.out.println("Bukan Bilangan prima");
        }
    }
    
}
