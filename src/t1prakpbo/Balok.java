/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1prakpbo;

/**
 *
 * @author Lenovo
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    
    private int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double hitungvolume(){
        double volume  = super.hitungluas()*tinggi;
        return volume;
    }
    
    public double hitungluaspermukaan(){
        double luasper  = 2*(getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi());
        return luasper;
    }
}
