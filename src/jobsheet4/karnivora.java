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
public class karnivora {
    public static void main(String[] args) {
        System.out.println("===== HEWAN DEFAULT =====");
        hewan h = new hewan();
        h.setnama();
        h.setsuara();
        h.setberat();
        
         System.out.println("===== HEWAN KUCING =====");
        hewan k = new kucing();
        k.setnama();
        k.setsuara();
        k.setberat();
        
        System.out.println("===== HEWAN SINGA =====");
        hewan s = new hewan();
        s.setnama();
        s.setsuara();
        s.setberat();
    }
 
}
