
class segitiga3
{
   public static void main(String [] args)
   {
		System.out.println("Soal C");
      for( int i=1; i<=5; i++)
	  {
         for(int j=2;j<=i;j++)
		 {
            System.out.print(" ");
         }
         for(int k=5; k>=i; k--)
		 {
            System.out.print("*");
         }
         System.out.println();
      }
}
}