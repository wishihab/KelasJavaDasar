
import java.util.*;
import java.io.*;

public class InputNilaiMahasiswa{
 public static void main(String[] args){
  String nama; 												
  double rata; 												

  int[] nilai = new int[100]; 								
  Scanner input = new Scanner(System.in); 					


  System.out.print("Jumlah Mahasiswa Yang Ingin Di Input: ");
  double jml = input.nextInt();

  int sum = 0; 												
  for (int i=1; i<= jml ;i++ ) {
   try{
    System.out.print("Nilai Mahasiswa ke-"+i+": "); 		
    nilai[i] = input.nextInt(); 							
    sum += nilai[i]; 										
   } catch (Exception e){
    e.printStackTrace();
    break;
   }
  }

  rata = sum/jml; 											
  int jmls = (int)(jml); 									

 
  System.out.println("Nilai Rata-Rata Mahasiswa Adalah = "+rata); 
 }
}