import java.util.Scanner;
public class karyawanMain
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		/*
		String p ,r, s;
		
		karyawan Karyawan=new 	karyawan("p", "r", "s");
		
		System.out.printf("Masukan NIP Karyawan : "); p=input.nextLine();
		System.out.printf("Masukan Nama Depan : "); r=input.nextLine();
		System.out.printf("Masukan Nama Belakang : "); s=input.nextLine();
		
		Karyawan.setNIP(p);
		Karyawan.setNamaDepan(r);
		Karyawan.setNamaBelakang(s);
		
		System.out.printf("\nNIP : %s",Karyawan.getNIP());
		System.out.printf("\nNama Depan : %s",Karyawan.getNamaDepan());
		System.out.printf("\nNama Belakang    : %s",Karyawan.getNamaBelakang());

		*/
		karyawan[] KK = new karyawan[100];
		System.out.print("Masukan Batas Pengulangan : ");
		double jml = input.nextInt();
		
	
		
		for(int i=0; i<jml; i++)
		{
			KK[i] = new karyawan();
			System.out.print("NIP : ");
			KK[i].setNIP(input.next());
			System.out.print("Nama Depan : ");
			KK[i].setNamaDepan(input.next());
			System.out.print("Nama Belakang : ");
			KK[i].setNamaBelakang(input.next());
		}
		System.out.println("Output : ");
		System.out.println("=========Pembatas==========");
		
		for(int i=0; i<jml; i++)
		{
			System.out.println(KK[i].getNIP());
			System.out.println(KK[i].getNamaDepan());
			System.out.println(KK[i].getNamaBelakang());
			System.out.println("=========Pembatas==========");
		}
		
	} 
}
	