
import java.util.Scanner;


public class Kalkulator{

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        /**Deklarasi Variabel atau penamaan variabel*/
            double hasil, tambah, kurang, bagi, kali, angka1, angka2 , jml;
            int perintah;
            
			
			Scanner input = new Scanner(System.in);
            System.out.println("Pilihan");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Pembagian");
            System.out.println("4. Perkalian");
			System.out.println("5. Keluar");
            
            System.out.print("Masukkan Angka Pertama : ");
				angka1 = input.nextDouble();
				       
            System.out.print("Masukkan Angka Kedua : ");
				angka2 = input.nextDouble();
            
			
			System.out.print("Masukkan Perintah : ");
            perintah = input.nextInt();
     
            if(perintah == 1)
			{	
                jml=angka1 + angka2;
				System.out.println("Hasilnya adalah  = "+ jml);
            }
			else if(perintah == 2)
			{
				jml = angka1 - angka2;
				System.out.println("Hasilnya adalah  = "+jml);
			} 
			else if (perintah == 3)
			{
				jml = angka1 / angka2;
				System.out.println("Hasilnya adalah  = "+jml);
			}	
			else  if(perintah == 4)
			{
				jml = angka1 * angka2;
				System.out.println("Hasilnya adalah  = "+jml);
			}
			else 
			{
				System.out.println("Tidak Ada Perintah");
			}
    }
}
