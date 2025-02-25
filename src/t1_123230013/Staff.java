/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_123230013;

/**
 *
 * @author ASUS
 */
public class Staff extends Orang implements AktivitasKampus {
    private String posisi;

    public Staff(String nama, int umur, String posisi) {
        super(nama, umur);
        this.posisi = posisi;
    }

    @Override
    public void perkenalan() {
        System.out.println("Halo, saya " + nama + ", seorang staff kampus");
    }

    @Override
    public void masukKampus() {
        System.out.println(nama + " masuk ke lingkungan kampus");
    }

    @Override
    public void keluarKampus() {
        System.out.println(nama + " keluar dari lingkungan kampus");
    }

    @Override
    public void aktivitasUtama() {
        System.out.println(nama + " sedang bekerja di bagian " + posisi);
    }
}

