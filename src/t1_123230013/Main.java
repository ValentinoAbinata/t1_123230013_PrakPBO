/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_123230013;

/**
 *
 * @author ASUS
 */

public class Main {
    
    public static void main(String[] args) {
        try {
            // Membuat objek
            Mahasiswa m = new Mahasiswa("Valentino Abinata", 20, 3.8);
            Dosen d = new Dosen("Dr. Charles", 52, "Pemrograman Berorientasi Objek");
            Staff s = new Staff("Pak Gundul", 31, "Administrasi");

            // polymorphic
            m.perkenalan();
            d.perkenalan();
            s.perkenalan();

            // Memanggil aktivitas kampus
            m.masukKampus();
            d.keluarKampus();
            s.aktivitasUtama();

            // Memanggil tampilkan IPK mahasiswa
            m.tampilkanIPK();

            // Contoh Exception
            Mahasiswa m2 = new Mahasiswa("Anomali", 88, 4.5);
        } catch (IPKException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
