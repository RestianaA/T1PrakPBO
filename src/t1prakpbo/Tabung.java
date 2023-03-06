/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1prakpbo;

/**
 *
 * @author Lenovo
 */
public class Tabung  extends Lingkaran implements MenghitungRuang {

    private int tinggi;

    public Tabung(int jari, int tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungvolume() {
        double volume = super.hitungluas()*tinggi;
        return volume;
    }

    @Override
    public double hitungluaspermukaan() {
        double luasper = (2*super.hitungluas())+(super.hitungkeliling()*tinggi);
        return luasper;
    }
    
}
