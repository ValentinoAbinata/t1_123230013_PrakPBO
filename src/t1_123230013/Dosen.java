/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_123230013;

/**
 *
 * @author ASUS
 */
public class Dosen extends Orang implements AktivitasKampus {
    private String mataKuliah;

    public Dosen(String nama, int umur, String mataKuliah) {
        super(nama, umur);
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void perkenalan() {
        System.out.println("Halo, saya " + nama + ", seorang dosen");
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
        System.out.println(nama + " sedang mengajar mata kuliah " + mataKuliah);
    }
}
