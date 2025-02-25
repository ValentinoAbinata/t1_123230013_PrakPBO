/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_123230013;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Orang implements AktivitasKampus {
    private double ipk;

    public Mahasiswa(String nama, int umur, double ipk) throws IPKException {
        super(nama, umur);
        if (ipk < 0.0 || ipk >= 4.0) {
            throw new IPKException("IPK harus berada di antara 0.0 hingga 4.0");
        }
        this.ipk = ipk;
    }

    @Override
    public void perkenalan() {
        System.out.println("Halo, saya " + nama + ", seorang mahasiswa");
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
        System.out.println(nama + " sedang belajar dan mengerjakan tugas");
    }

    public void tampilkanIPK() {
        System.out.println(nama + " memiliki IPK: " + ipk);
    }
}
