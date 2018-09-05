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
class kucing extends hewan {
    
    @Override
void setnama(){
String kucing = "carberus";
System.out.println("nama kucing : "+kucing);
}

@Override
void setsuara(){
String suara = "miaw meow meong";
System.out.println("suara kucing : "+suara);
}

@Override
void setberat(){
double berat = 2.0;
System.out.println("berat kucing : "+berat+" kg");
}   
}
