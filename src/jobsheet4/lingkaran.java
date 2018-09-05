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
public class lingkaran extends bangundatar {
    private double r;
    public lingkaran(double r){
    this.r = r;
    }
    
    @Override
    public double hitungkeliling(){
    return 2 * 3.14 * r;
    }
    
    @Override
    public double hitungluas(){
    return 3.14 *r*r;
    }
}
