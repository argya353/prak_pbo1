/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejo;

/**
 *
 * @author ayaya
 */
public class PilihKeramik {
    public static void main(String args[]){
        Keramik k1=new Keramik();
        System.out.println("Keramik A:");
        k1.size1=(float) 0.3;
        k1.size2=(float) 0.3;
        k1.box=10;
        k1.hBox=54000;
        k1.hitungHarga();
        System.out.println("=============================================");
        
        System.out.println("Keramik B:");
        Keramik k2=new Keramik();
        k2.size1=(float) 0.4;
        k2.size2=(float) 0.4;
        k2.box=5;
        k2.hBox=65000;
        k2.hitungHarga();
        System.out.println("=============================================");
        
        System.out.println("Keramik C:");
        Keramik k3=new Keramik();
        k3.size1=(float) 0.3;
        k3.size2=(float) 0.4;
        k3.box=8;
        k3.hBox=60000;
        k3.hitungHarga();
        System.out.println("=============================================");
    }
}
