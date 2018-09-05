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
public class abstractsample {
    public static void main(String[] args) {
        
        bangundatar obyek1 = new bujursangkar(10);
        
        System.out.println("luas bujur sangkar sisi 10 : "+obyek1.hitungluas());
        System.out.println("kelilingnya = "+obyek1.hitungkeliling());
        System.out.println("\n");
        
        bangundatar obyek2 = new lingkaran(7);
        System.out.println("luas lingkaran dengan jari jari 7 = "+obyek2.hitungluas());
        System.out.println("kelilingnya = " +obyek2.hitungkeliling());
    }
}
