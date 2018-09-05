/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet4;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;
public class tes_kalkulator {
    public static void main (String [] args){
     interfacekalkulator k = new interfacekalkulator(0,0);
     Scanner m = new Scanner(System.in);
     System.out.print("Masukan Bilangan Pertama = ");
     k.Bil1 = m.nextDouble();
     System.out.print("Masukan Bilangan Kedua = ");
     k.Bil2 = m.nextDouble();
     System.out.println();
     System.out.println("Hasil penjumlahan = "+k.penjumlahan());
     System.out.println("Hasil pengurangan = "+k.pengurangan());
     System.out.println("Hasil perkalian = "+k.perkalian());
System.out.println("Hasil pembagian = "+k.pembagian());
}
}
