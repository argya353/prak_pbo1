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
public class Keramik {
    float size1;
    float size2;
    int box;
    int hBox;
    
    void hitungHarga(){
        float jml;
        float hrg;
        jml=this.box*this.size1*this.size2;
        hrg=100/jml*this.hBox;
        System.out.println("Harga total keramik adalah Rp"+hrg);
    }
}