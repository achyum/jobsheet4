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
public class interfacesample {
    public static void main(String[] args) {
        interfacebujursangkar obyek1 = new interfacebujursangkar(10);
        System.out.println("luas bujur sangka dengan sisi 10 = "+obyek1.hitungluas());
        System.out.println("kelilingnya = "+ obyek1.hitungkeliling());
        System.out.println("\n");
        
        interfacebangundatar obyek2 = new interfacesegitiga(6,8);
        System.out.println("luas segitiga dengan alas 6 dan tinggi 8 = "+obyek2.hitungluas());
        System.out.println("kelilingnya = "+ obyek2.hitungkeliling());
        
    }
}
