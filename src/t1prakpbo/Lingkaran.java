/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1prakpbo;

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements MenghitungBidang {

    public static final double PI = 3.14159265359;
    private int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }

    @Override
    public double hitungluas() {
        double luas = PI*jari*jari;
        return luas;
        
    }

    @Override
    public double hitungkeliling() {
        double keliling = 2*PI*jari; 
        return keliling;
        
    }
    
}
