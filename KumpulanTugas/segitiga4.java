

class segitiga4
{
	
	public static void main(String[]args)
	{
		System.out.println("Soal D");
		for (int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}