/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1prakpbo;

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang implements MenghitungBidang{
    
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungluas() {
        double luas = panjang*lebar;
        return luas;
    }
    
    @Override
    public double hitungkeliling() {
        double keliling = 2*(panjang+lebar);
        return keliling;
    }

}
