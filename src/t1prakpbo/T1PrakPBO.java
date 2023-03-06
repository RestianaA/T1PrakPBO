/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1prakpbo;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class T1PrakPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu, i, p, l, t, r;
        do {
            System.out.println("------------");
            System.out.println(" MENU UTAMA ");
            System.out.println("------------");
            System.out.println("1. Menghitung Balok");
            System.out.println("2. Menghitung Tabung");
            System.out.println("0. Exit");
            System.out.println("------------");
            System.out.print("Pilih : ");
            Scanner pilih = new Scanner(System.in);
            menu = pilih.nextInt();
            switch(menu)
            {
                case 1:
                    System.out.println("Menghitung Balok");
                    System.out.print("Input Panjang : ");
                    Scanner input1 = new Scanner(System.in);
                    p = input1.nextInt();
                    System.out.print("Input Lebar   : ");
                    Scanner input2 = new Scanner(System.in);
                    l = input2.nextInt();
                    System.out.print("Input Tinggi  : ");
                    Scanner input3 = new Scanner(System.in);
                    t = input3.nextInt();
                    PersegiPanjang pp = new PersegiPanjang(p, l);
                    System.out.println("Luas Persegi Panjang     = "+pp.hitungluas());
                    System.out.println("Keliling Persegi Panjang = "+pp.hitungkeliling());
                    Balok b = new Balok(p, l, t);
                    System.out.println("Volume Balok             = "+b.hitungvolume());
                    System.out.println("Luas Permukaan Balok     = "+b.hitungluaspermukaan());
                    break;

                case 2:
                    System.out.println("Menghitung Tabung");
                    System.out.print("Input Tinggi      : ");
                    Scanner input4 = new Scanner(System.in);
                    t = input4.nextInt();
                    System.out.print("Input Jari - Jari : ");
                    Scanner input5 = new Scanner(System.in);
                    r = input5.nextInt();
                    Lingkaran lk = new Lingkaran(r);
                    System.out.println("Luas Lingkaran        = "+lk.hitungluas());
                    System.out.println("Keliling Lingkaran    = "+lk.hitungkeliling());
                    Tabung tb = new Tabung(r, t);
                    System.out.println("Volume Tabung         = "+tb.hitungvolume());
                    System.out.println("Luas Permukaan Tabung = "+tb.hitungluaspermukaan());
                    break;
                case 0:
                    //
                    break;
                default:
                    System.out.println("Menu Tidak Ada");
                    break;
            }
            System.out.print("Ulangi? [Ya : 1 || Tidak : 0] ");
            Scanner kembali = new Scanner(System.in);
            i = kembali.nextInt();
        } while (i == 1);
    }
    
}
