import java.util.Scanner;
public class GradeBookMain
{
	public static void main(String args[])
	{
		Scanner input = new Scanner (System.in);
		
		String p, r, s;
		
		GradeBookClass gbBaru=new 	GradeBookClass("s", "m", "2");
		
		System.out.printf("Nama Pengajar	: "); p=input.nextLine();
		System.out.printf("Mata Kuliah 	: "); r=input.nextLine();
		System.out.printf("Seksi       	: "); s=input.nextLine();
		
		gbBaru.setNamaPengajar(p);
		gbBaru.setNamaMatkul(r);
		gbBaru.setSeksi(s);
		
		System.out.printf("\nPengajar : %s",gbBaru.getNamaPengajar());
		System.out.printf("\nMengajar : %s",gbBaru.getNamaMatkul());
		System.out.printf("\nSeksi    : %s",gbBaru.getSeksi());
	} 
}
	