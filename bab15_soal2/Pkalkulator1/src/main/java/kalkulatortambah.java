/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import kalkulatorpack.kalkulator;
/**
 *
 * @author ADVAN
 */
public class kalkulatortambah {
    public static void main(String[] args) {
        // Membuat objek kalkulator
        kalkulator objek = new kalkulator();
        
        // Menggunakan method pertambahan
        int hasilTambah = objek.pertambahan(10, 30);
        System.out.println("Pertambahan: " + hasilTambah);
    }
}
